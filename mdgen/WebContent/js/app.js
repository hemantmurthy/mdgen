/**
 * The UI model and logic for the meter data generator tool.
 * @author Hamy (Wipro Technologies)
 */

(function() {

// A bunch of regular expressions used to validate input ...
let DECIMAL_RE = /^(\d*\.)?\d+$/;	
let NMI_RE = /^[a-z0-9]{10}$/i;
let NMI_SUFFIX_RE = /^[a-hj-np-z]{1}[0-9a-hj-np-z]{1}$/i;
let MTR_SRNO_RE = /^[a-z0-9]+$/i;
let REG_ID_RE = /^[a-z0-9]{1,2}$/i;
let DATE_RE = /^\d{4}\-\d{2}\-\d{2}$/;
let MULT_ENTRY_LINE_RE = /^\s*[a-z0-9]*\s*,\s*[a-z0-9]*\s*,\s*[a-z0-9]*\s*,\s*[a-z0-9]*\s*,\s*[0-9-]*\s*,\s*[0-9-]*\s*(,\s*[a-z]*\s*){0,1}$/i;
let MULT_ENTRY_LINE_WITH_MDP_RE = /^\s*[a-z0-9]*\s*,\s*[a-z0-9]*\s*,\s*[a-z0-9]*\s*,\s*[a-z0-9]*\s*,\s*[a-z0-9]*\s*,\s*[0-9-]*\s*,\s*[0-9-]*\s*(,\s*[a-z]*\s*){0,1}$/i;

// Add common components ...
// Modal Window ...
Vue.component("modal-popup", {
	template: "#modal-popup-template",
	props: ["containerClass"]
});

// Create Vue application ...
var app = new Vue({
	el: "#app",
	data: {
		config: {}, // Configuration for the application
		configLoaded: false, // Flag to indicate that configuration is loaded
		intervalSize: 0, // The size of interval data that will be generated
		intervalLabels: [], // Interval Labels
		channels: [], // The channel templates
		entries: [], // The NMIs, Meters and Channels for which data is to be generated
		showGeneratorStatus: false,
		generator: {
			status: null,
			id: null,
			numRecordsToProcess: 0,
			numRecordsProcessed: 0,
			errorMessage: null
		}
	},
	created: function() {
		loadConfig(this);
	},
	methods: {
		setSize: function(size) {
			// Set the interval size ...
			
			if(this.intervalSize != size) {
				this.intervalSize = size;
			           
		        // Setup the interval labels
		        this.intervalLabels = [];
		        let sttm = new Date(2020, 1, 1, 0, 0, 0, 0);
		        let delta = 0;
		        let intvl;
				while(delta < 1440) {
				    intvl = new Date(2020, 1, 1, 0, sttm.getMinutes() + delta, 0, 0);
				    this.intervalLabels.push({
				        label: String(intvl.getHours()).padStart(2, '0') + ":" + String(intvl.getMinutes()).padStart(2, '0')
				    });
				    delta += parseInt(this.intervalSize, 10);
				}
				
				// Reset channels (as interval size has changed)
				this.channels.splice(0, this.channels.length);
			}
		},
		addChannel: function(channelTemplate) {
			this.channels.push(channelTemplate);
		},
		deleteChannel: function(index) {
        	this.channels.splice(index, 1);
		},
		addEntries: function(entries) {
			entries.forEach(function(e) {
				this.entries.push(e);
			}, this);
		},
		updateEntry: function(entry) {
			this.entries.splice(entry.index, 1, entry.value);
		},
		deleteEntry: function(index) {
			this.entries.splice(index, 1);
		},
		emptyEntries: function() {
			this.entries.splice(0, this.entries.length);
		},
		generateImdViaJms: function(parms) {
			invokeAPI("api/generator/jms", parms, this)
		},
		generateImdViaXai: function(parms) {
			invokeAPI("api/generator/xai", parms, this)
		},
		generateNem12Csv: function(parms) {
			invokeAPI("api/generator/nem12csv", parms, this, function(response) {
				// If response contains generated data, then download file to client system ...
				if(response.generatedData) {
					downloadFile(response.generatedData, parms.nem12FileName + ".txt")
				}
			});
		},
		generateNem12AseXML: function(parms) {
			invokeAPI("api/generator/nem12asexml", parms, this, function(response) {
				// If response contains generated data, then download file to client system ...
				if(response.generatedData) {
					downloadFile(response.generatedData, parms.nem12FileName + ".xml");
				}
			});
		},
		startPollingGeneratorStatus: function(callback) {
			checkStatus(this, callback);
		},
		closeGeneratorStatus: function() {
			this.generator.status = null;
			this.showGeneratorStatus = false;
		}
	},
	computed: {
		numberOfEntries: function() {
			return this.entries.length;
		}
	},
	components: {
		"select-size": {
			template: "#select-option-template",
			props: ["config"],
			data: function() {
				return {
					size: "",
					error: ""
				};
			},
			methods: {
				setSize: function() {
					this.$emit("set-size", this.size);
				}
			}
		},
		"manage-channels": {
			template: "#manage-channels-template",
			props: [
				"config",
				"channels",
				"intervalSize",
				"intervalLabels"
			],
			data: function() {
				return {
					id : "",
					error: ""
				};
			},
			methods: {
		        addChannel: function(useProfile) {
		        	this.error = "";
		        	
		        	if(this.id == "") {
	        			this.error = "NMI Suffix cannot be empty";
	        			return;
		        	}
		        	
		        	let newId = this.id.toUpperCase();
		        	for(let i = 0; i < this.channels.length; ++i)
		        		if(this.channels[i].nmiSuffix == newId) {
		        			this.error = "NMI Suffix " + newId + " already exists";
		        			return;
		        		}
		        	
		            // Add a channel and fill values ...
		            let intVals = new Array(this.intervalLabels.length);
		            
		            // Check if profile found for suffix (and if not, then for first letter of suffix) ...
		            let profile = this.config.profiles[newId];
		            if(!profile)
		            	profile = this.config.profiles[newId.substring(0, 1)];
		            
		            if(useProfile && profile) {
		            	// If found, then fill values based on profile
		            	let nita = this.intervalSize / 5; // Number of intervals to add
		            	let v = 0;
			            for(let i = 0; i < intVals.length; ++i) {
			            	v = 0;
			            	for(let ni = 0; ni < nita; ++ni)
			            		v += profile.values[i * nita + ni];
			            	
			                intVals[i] = { value: v, quality: "A", valError: false, qualError: false };
			            }
		            } else {
			            for(let i = 0; i < intVals.length; ++i) 
			                intVals[i] = { value: 0, quality: "A", valError: false, qualError: false };
		            }
		
		            
		            this.$emit("add-channel", {
		                nmiSuffix: newId,
		                uom: this.config.nmiSuffixUom[newId.substring(0,1)],
		                intervals: intVals
		            });
		            
		            this.id = "";
		        },
		        
		        deleteChannel: function(index) {
		        	this.error = "";
		        	this.$emit("delete-channel", index);
		        },
		        
		        checkValue: function(chi, inti) {
		        	if(!DECIMAL_RE.test(this.channels[chi].intervals[inti].value))
		        		this.channels[chi].intervals[inti].valError = true;
		        	else
		        		this.channels[chi].intervals[inti].valError = false;

		        },
		        checkQuality: function(chi, inti) {
		        	if(!this.config.qualityFlags.includes(this.channels[chi].intervals[inti].quality.toUpperCase()))
		        		this.channels[chi].intervals[inti].qualError = true;
		        	else
		        		this.channels[chi].intervals[inti].qualError = false;
		        }
			}
		},
		"meter-entries": {
			template: "#meter-entries-template",
			props: ["config", "entries"],
			data: function() {
				return {
					showEntryMode: null,
					indexToEdit: null,
					viewAllEntriesVisible: false
				};
			},
			methods: {
				showAddSingleEntry: function() {
					this.indexToEdit = null;
					this.showEntryMode = "single";
				}, 
				showAddMultipleEntries: function() {
					this.showEntryMode = "multiple";
				},
				showViewAllEntries: function() {
					this.viewAllEntriesVisible = true;
				},
				closeViewAllEntries: function() {
					this.viewAllEntriesVisible = false;
				},
				cancel: function() {
					this.showEntryMode = null;
				},
				addEntries: function(entries) {
					this.showEntryMode = null;
					this.$emit("add-entries", entries);
				},
				editEntry: function(index) {
					this.indexToEdit = index;
					this.showEntryMode = "edit";
				},
				deleteEntry: function(index) {
					this.$emit("delete-entry", index);
				},
				updateEntry: function(entry) {
					this.showEntryMode = null;
					this.$emit("update-entry", entry);
				},
				emptyEntries: function() {
					this.$emit("empty-entries");				
				}
			},
			components: {
				"view-all-entries": {
					template: "#view-all-entries-template",
					props: ["config", "entries"],
					methods: {
						close: function() {
							this.$emit("close");
						},
						deleteEntry: function(entryIndex) {
							this.$emit("delete-entry", entryIndex);
						},
						editEntry: function(entryIndex) {
							this.$emit("edit-entry", entryIndex);
						},
						emptyEntries: function() {
							this.$emit("empty-entries");				
						}
					}
				},
				"add-single-entry": {
					template: "#add-single-entry-template",
					props: ["config", "mode", "actionLabel", "index", "entries"],
					data: function() {
						return {
							mdp: this.index != null ? this.entries[this.index].mdp : "",
							mdpError: null,
							nmi: this.index != null ? this.entries[this.index].nmi : "",
							nmiError: null,
							meterSerialNumber: this.index != null ? this.entries[this.index].meterSerialNumber : "",
							meterSerialNumberError: null,
							nmiSuffix: this.index != null ? this.entries[this.index].nmiSuffix : "",
							nmiSuffixError: null,
							registerId: this.index != null ? this.entries[this.index].registerId : "",
							registerIdError: null,
							startDate: this.index != null ? this.entries[this.index].startDate.trim() : "",
							startDateError: null,
							endDate: this.index != null ? this.entries[this.index].endDate.trim() : "",
							endDateError: null,
							overrideUom: this.index != null && this.entries[this.index].overrideUom != null ? this.entries[this.index].overrideUom.trim() : "",
							overrideUomError: null,
							transactionId: this.index != null && this.entries[this.index].transactionId != null  ? this.entries[this.index].transactionId.trim() : "",
							transactionIdError: null
						};
					},
					methods: {
						cancel: function() {
							this.$emit("cancel");
						},
						performAction: function() {
							this.mdpError = this.mdp.trim() == "" ? "Select an MDP" : null;
							this.nmiError = NMI_RE.test(this.nmi.trim()) ? null : "NMI invalid";
							this.meterSerialNumberError = this.meterSerialNumber.trim() == "" ? "Meter Serial Number is required" : null;
							this.nmiSuffixError = this.nmiSuffix.trim() == "" ? "NMI Suffix is required" :
								NMI_SUFFIX_RE.test(this.nmiSuffix.trim().toUpperCase()) ? null : "NMI Suffix is invalid";
							this.registerIdError = this.registerId.trim() == "" || REG_ID_RE.test(this.registerId.trim()) ? null : "Register ID is invalid"; 

							this.startDateError = null;
							let sd = null;
							let ed = null;
							if(this.startDate.trim() == "") 
								this.startDateError = "Date is required";
							else if(!DATE_RE.test(this.startDate.trim()))
								this.startDateError = "Date is invalid";
							else try {
								sd = new Date(this.startDate.substring(0, 4), this.startDate.substring(5, 7), this.startDate.substring(8, 10));
							} catch(err) {
								this.startDateError = "Date is invalid";
							}
							
							this.endDateError = null;
							if(this.endDate.trim() == "") 
								this.endDateError = "Date is required";
							else if(!DATE_RE.test(this.endDate.trim()))
								this.endDateError = "Date is invalid";
							else try {
								ed = new Date(this.endDate.substring(0, 4), this.endDate.substring(5, 7), this.endDate.substring(8, 10));
							} catch(err) {
								this.endDateError = "Date is invalid";
							}
							
							if(this.startDateError == null && this.endDateError == null && ed < sd)
								this.endDateError = "End Date must be on or after Start Date";
							
							if(this.mdpError != null
								|| this.nmiError != null
								|| this.meterSerialNumberError != null
								|| this.nmiSuffixError != null
								|| this.registerIdError != null
								|| this.startDateError != null
								|| this.endDateError != null
								|| this.overrideUomError != null
								|| this.transactionIdError != null
							) return;
							
							let entry = {
								mdp: this.mdp,
								nmi: this.nmi.toUpperCase(),
								meterSerialNumber: this.meterSerialNumber.toUpperCase(),
								nmiSuffix:this.nmiSuffix.toUpperCase(),
								registerId: this.registerId.toUpperCase(),
								startDate: this.startDate,
								endDate: this.endDate,
								overrideUom: this.overrideUom,
								transactionId: this.transactionId
							};
							
							if(this.mode == "edit")
								this.$emit("update-entry", {index: this.index, value : entry});
							else {
								let entries = [entry];
								this.$emit("add-entries", entries);
							}
						}
						
					}
				},
				"add-multiple-entries": {
					template: "#add-multiple-entries-template",
					props: ["config"],
					data: function() {
						return {
							mdp: "",
							mdpError: null,
							entriesText: "",
							entriesTextError: null
						};
					},
					methods: {
						cancel: function() {
							this.$emit("cancel");
						},
						add: function() {
							this.entriesTextError = null;
							if(this.entriesText.trim() == "") {
								this.entriesTextError = "Oye!! Nothing to add here my friend!"
								return;
							}
							
							// Split entries text by newline
							let entries = [];
							let lines = this.entriesText.trim().split(/\r?\n/g);
							
							for(let i = 0; i < lines.length; ++i) {
								let l = lines[i];
								if(l.trim() == "") continue; // Skip blank lines
								
								let lmdp = "";
								let lnmi = "";
								let lmeterSerialNumber = "";
								let lnmiSuffix = "";
								let lregisterId = "";
								let lstartDate = "";
								let lendDate = "";
								let loverrideUom = "";
								
								if(MULT_ENTRY_LINE_RE.test(l)) {
									// Retrieve fields from each line (comma-separated) ...
									let v = l.trim().split(",");
									lmdp = this.mdp;
									lnmi = v[0].trim();
									lmeterSerialNumber = v[1].trim();
									lnmiSuffix = v[2].trim();
									lregisterId = v[3].trim();
									lstartDate = v[4].trim();
									lendDate = v[5].trim();
									if(v[6] != null) loverrideUom = v[6].trim();
								} else if(MULT_ENTRY_LINE_WITH_MDP_RE.test(l)) {
									// Retrieve fields from each line (comma-separated) ...
									let v = l.trim().split(",");
									lmdp = v[0].trim();
									lnmi = v[1].trim();
									lmeterSerialNumber = v[2].trim();
									lnmiSuffix = v[3].trim();
									lregisterId = v[4].trim();
									lstartDate = v[5].trim();
									lendDate = v[6].trim();
									if(v[7] != null) loverrideUom = v[7].trim();
								} else {
									this.entriesTextError = "Entry on line " + (i  + 1) + " is of the wrong format";
									break;
								}
								
								if(!NMI_RE.test(lnmi)) {
									this.entriesTextError = "NMI specified on line " + (i + 1) + " is invalid or missing";
									break;
								}

								if(!MTR_SRNO_RE.test(lmeterSerialNumber)) {
									this.entriesTextError = "Meter Serial Number specified on line " + (i + 1) + " is invalid or missing";
									break;
								}
								
								if(!NMI_SUFFIX_RE.test(lnmiSuffix)) {
									this.entriesTextError = "NMI Suffix specified on line " + (i + 1) + " is invalid or missing";
									break;
								}
								
								if(lregisterId != "" && !REG_ID_RE.test(lregisterId)) {
									this.entriesTextError = "Register ID specified on line " + (i + 1) + " is invalid or missing";
									break;
								}
								
								let sd = null;
								let ed = null;
								if(!DATE_RE.test(lstartDate)) {
									this.entriesTextError = "Start Date specified on line " + (i + 1) + " is invalid or missing";
									break;
								}
								else try {
									sd = new Date(lstartDate.substring(0, 4), lstartDate.substring(5, 7), lstartDate.substring(8, 10));
								} catch(err) {
									this.entriesTextError = "Start Date specified on line " + (i + 1) + " is invalid or missing";
									break;
								}
								
								if(!DATE_RE.test(lendDate)) {
									this.entriesTextError = "End Date specified on line " + (i + 1) + " is invalid or missing";
									break;
								}
								else try {
									ed = new Date(lendDate.substring(0, 4), lendDate.substring(5, 7), lendDate.substring(8, 10));
								} catch(err) {
									this.entriesTextError = "End Date specified on line " + (i + 1) + " is invalid or missing";
									break;
								}
								
								if(this.entriesTextError == null && ed < sd) {
									this.entriesTextError = "End Date specified on line " + (i + 1) + " must be on or after Start Date";
									break;
								}

								if(loverrideUom != "" && !this.config.uoms.includes(loverrideUom)) {
									this.entriesTextError = "Unit of Measure specified on line " + (i + 1) + " is invalid";
									break;
								}
								let entry = {
										mdp: lmdp.toUpperCase(),
										nmi: lnmi.toUpperCase(),
										meterSerialNumber: lmeterSerialNumber.toUpperCase(),
										nmiSuffix: lnmiSuffix.toUpperCase(),
										registerId: lregisterId.toUpperCase(),
										startDate: lstartDate,
										endDate: lendDate,
										overrideUom: loverrideUom
								};
								
								entries.push(entry);
							}
							
							if(this.entriesTextError != null) return;
							this.$emit("add-entries", entries);
						}
					}
				}
			}
		},
		"delivery-method": {
			template: "#delivery-method-template",
			props: ["config", "entries"],
			data: function() {
				return {
					nem12UpdateDateTime: new Date().toISOString().substring(0, 16),
					nem12FileName: deriveFileName("MDGEN_"),
					showDeliveryMethods: false,
					deliveryMethods: {
						"imd-via-jms": {label: "IMD via JMS", component: "imd-via-jms-delivery" },
						"imd-via-xai": {label: "IMD via XAI", component: "imd-via-xai-delivery" },
						"nem12": {label: "NEM12 File", component: "nem12-delivery" }
					},
					selectedMethod: null
				} 
			},
			methods: {
				show: function() {
					this.showDeliveryMethods = true;
					this.select("imd-via-jms");
				},
				select: function(method) {
					this.selectedMethod = method;
				},
				cancel: function() {
					this.selectedMethod = null;
					this.showDeliveryMethods = false;
				},
				generateImdViaJms: function(parms) 
				{
					this.emitGenerateRequest("generate-imd-via-jms", parms);
				},
				generateImdViaXai: function(parms) {
					this.emitGenerateRequest("generate-imd-via-xai", parms);
				},
				generateNem12Csv: function(parms) {
					this.emitGenerateRequest("generate-nem12-csv", parms);
				},
				generateNem12AseXML: function(parms) {
					this.emitGenerateRequest("generate-nem12-asexml", parms);
				},
				emitGenerateRequest(event, parms) {
					this.selectedMethod = null;
					this.showDeliveryMethods = false;
					parms.nem12FileName = this.nem12FileName;
					parms.nem12UpdateDateTime = this.nem12UpdateDateTime + ":00.000Z";
					this.$emit(event, parms);
				}
			},
			computed: {
				deliveryMethodComponent: function() {
					return this.deliveryMethods[this.selectedMethod] === undefined ? "" : this.deliveryMethods[this.selectedMethod].component;
				}
			},
			components: {
				"imd-via-jms-delivery": {
					template: "#imd-via-jms-template",
					props: ["config", "entries"],						
					data: function() {
						return {
							servers: this.config.jmsDestinations,
							server: "",
							jmsUsername: "",
							jmsPassword: ""
						};
					},
					computed: {
						serverUrl: function() {
							return this.servers[this.server] === undefined ? "" : this.servers[this.server].url;
						},
						serverQueues: function() {
							return this.servers[this.server] === undefined ? "" : this.servers[this.server].queues;
						}
					},
					methods: {
						generate: function() {
							let parms = {};
							parms.server = this.server;
							if(this.jmsUsername.trim() != "") parms.username = this.jmsUsername.trim();
							if(this.jmsPassword.trim() != "") parms.password = this.jmsPassword.trim();
							
							this.$emit("generate-imd-via-jms", parms);
						},
						cancel: function() {
							this.$emit("cancel");
						}
					}
				},
				"imd-via-xai-delivery": {
					template: "#imd-via-xai-template",
					props: ["config", "entries"],						
					data: function() {
						return {
							servers: this.config.xaiDestinations,
							server: "",
							xaiUsername: "",
							xaiPassword: ""
						};
					},
					computed: {
						serverUrl: function() {
							return this.servers[this.server] === undefined ? "" : this.servers[this.server].url;
						},
					},
					methods: {
						generate: function() {
							let parms = {};
							parms.server = this.server;
							if(this.xaiUsername.trim() != "") parms.username = this.xaiUsername.trim();
							if(this.xaiPassword.trim() != "") parms.password = this.xaiPassword.trim();
							
							this.$emit("generate-imd-via-xai", parms);
						},
						cancel: function() {
							this.$emit("cancel");
						}
					}
				},
				"nem12-delivery": {
					template: "#nem12-template",
					props: ["config", "entries"],						
					data: function() {
						return {
							mdp: "",
							targetParticipant: this.config.frmps[0],
							targetRole: this.config.participantRoles[0]
						};
					},
					created: function() {
						this.mdp = determineMdp(this.entries);
					},
					methods: {
						/*mdpChanged: function() {
							if(this.mdp != "")
								this.nem12FileName = deriveFileName(this.mdp);
						},*/
						downloadNem12: function() {
							this.$emit("generate-nem12-csv", {
								mdp: this.mdp,
								mdpError: "",
								targetParticipant: this.targetParticipant,
								targetRole: this.targetRole
							});
						},
						downloadNem12AseXML: function() {
							this.$emit("generate-nem12-asexml", {
								mdp: this.mdp,
								targetParticipant: this.targetParticipant,
								targetRole: this.targetRole
							});
						},
						cancel: function() {
							this.$emit("cancel");
						}
					}
				}
			}
		},
		"generator-status": {
			template: "#generator-status-template",
			props: ["generator"],
			methods: {
				close: function() {
					this.$emit("close");
				}
			}
		}
	}
});

// Helper functions for the application ...

function loadConfig(vm) {
	// Load configuration for this application.
	// Configuration is stored in a JSON file. This JSON object is loaded into the vm.config
	
	let configLoader = new XMLHttpRequest();
	configLoader.onreadystatechange = function() {
		if(this.readyState == 4) {
			if(this.status == 200) {
				vm.config = JSON.parse(this.responseText);
				vm.configLoaded = true; 
				vm.config.jmsDestinationsLoaded = false;
				loadJMSDestinations(vm);
				vm.config.xaiDestinationsLoaded = false;
				loadXAIDestinations(vm);
			}
		}
	};
	configLoader.open("GET", "js/config.json", true);
	configLoader.send();
}

function loadJMSDestinations(vm) {
	let configLoader = new XMLHttpRequest();
	configLoader.onreadystatechange = function() {
		if(this.readyState == 4) {
			if(this.status == 200) {
				let jds = JSON.parse(this.responseText);
				if(jds.errors == null) {
					vm.config.jmsDestinations = jds.destinations;
					vm.config.jmsDestinationsLoaded = true;
					console.log(jds);
				}
			}
		}
	};
	configLoader.open("GET", "api/config/jms_destinations", true);
	configLoader.send();
}

function loadXAIDestinations(vm) {
	let configLoader = new XMLHttpRequest();
	configLoader.onreadystatechange = function() {
		if(this.readyState == 4) {
			if(this.status == 200) {
				let xds = JSON.parse(this.responseText);
				if(xds.errors == null) {
					vm.config.xaiDestinations = xds.destinations;
					vm.config.xaiDestinationsLoaded = true;
					console.log(xds);
				}
			}
		}
	};
	configLoader.open("GET", "api/config/xai_destinations", true);
	configLoader.send();
}

// Create a base request object for a generator ...
function createBaseRequestObject(data) {
	let req = {};
	
	// Add channel templates from data ...
	req.channelTemplates = [];
	data.channels.forEach(function(ch) {
		let ct = {};
		ct.nmiSuffix = ch.nmiSuffix.trim();
		ct.uom = ch.uom.trim();
		ct.intervalSize = Number(data.intervalSize);
		ct.reads = [];
		
		ch.intervals.forEach(function(int) {
			ct.reads.push({rd: Number(int.value.toString().trim()).toFixed(6), qual: int.quality.trim().toUpperCase() });
		});
		
		req.channelTemplates.push(ct);
	});
	
	// Add meter channels for which data needs to be generated ...
	req.requestedChannels = [];
	data.entries.forEach(function(e) {
		let rc = {};
		rc.mdp = e.mdp.trim();
		rc.nmi = e.nmi.trim();
		rc.meterSerialNumber = e.meterSerialNumber.trim();
		rc.nmiSuffix = e.nmiSuffix.trim();
		rc.registerId = e.registerId.trim();
		rc.startDate = e.startDate.trim();
		rc.endDate = e.endDate.trim();
		
		if(e.overrideUom != null && e.overrideUom.trim() != "")
			rc.overrideUom = e.overrideUom.trim();
		if(e.transactionId != null && e.transactionId.trim() != "")
			rc.transactionId = e.transactionId.trim();
		
		req.requestedChannels.push(rc);
	});
	
	return req;
}

// Invoke generator API ...
function invokeAPI(apiUri, additionalParms, vm, callback) {
	if(vm.generator.status != null) return "Generator already in progress";
	
	vm.generator.id = null;
	vm.generator.numRecordsToProcess = 0;
	vm.generator.numRecordsProcessed = 0;
	vm.generator.errorMessage = null;
	vm.showGeneratorStatus = true;
	
	vm.generator.status = "Building request";
	let request = createBaseRequestObject(vm);
	
	// Merge additional parameters into request ...
	Object.assign(request, additionalParms);
	console.log("Request:");
	console.log(request);
	
	// Invoke generator API ...
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if(this.readyState == 4) {
			if(this.status == 200) {
				// Response received successfully ...
				let response = JSON.parse(this.response)
				console.log("Response:");
				console.log(response);
				
				// Check if generator ID available ...
				if(response.id) {
					vm.generator.id = response.id;
					vm.generator.status = "Request submitted";
					vm.startPollingGeneratorStatus(callback);
				} else {
					vm.generator.id = null;
					vm.generator.status = "Error";
					vm.generator.errorMessage = response.errorMessage;
				}
			} else {
				vm.generator.id = null;
				vm.generator.status = "Error";
				vm.generator.errorMessage = "Service call failed with status " + this.status;
			}
		}
	};
	
	xhr.open("POST", apiUri, true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.send(JSON.stringify(request));
	
	return null;
}

// Check status of a Generator
function checkStatus(vm, callback) {
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if(this.readyState == 4) {
			if(this.status == 200) {
				// Response received successfully ...
				let response = JSON.parse(this.response)
				console.log("Status Response:");
				console.log(response);
				
				// Check if generator status available ...
				if(response.status) {
					if(response.status == "COMPLETED") {
						vm.generator.status = "Completed";
						vm.generator.errorMessage = null;
						vm.generator.numRecordsToProcess = response.numberOfRecordsToProcess;
						vm.generator.numRecordsProcessed = response.numberOfRecordsProcessed;
						
						// Invoke the callback function if it's provided, passing the response ... 
						if(typeof callback === "function") {
							callback(response);
						}
					}
					
					if(response.status == "ERROR" || response.status == "VALIDATION_ERROR") {
						vm.generator.status = "Error";
						vm.generator.errorMessage = response.errorMessage;
					}
					
					if(response.status == "RUNNING") {
						vm.generator.status = "In Progress"
						vm.generator.numRecordsToProcess = response.numberOfRecordsToProcess;
						vm.generator.numRecordsProcessed = response.numberOfRecordsProcessed;
						
						// Only if status is available, and status is RUNNING, re-trigger status check
						// after a second ...
						setTimeout(function() { checkStatus(vm, callback); }, 2000); 
					}
				} 
			} else {
				vm.generator.status = "Error";
				vm.generator.errorMessage = "Unable to retrieve status of Generator. Request status received: " + this.status;
			}
		}
	};
	xhr.open("GET", "api/generator/" + vm.generator.id, true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.send();
}


function downloadFile(data, fn) {
	let blob = new Blob([data], {type : "text/plain"});
	let link = document.createElement("a");
	link.href = URL.createObjectURL(blob);
	link.setAttribute("download", fn);
	link.click();
	URL.revokeObjectURL(link.href);
}

function getISODate(date) {
	if(!date) return null;
	return date.getFullYear() + "-" + date.getMonth().padStart(2, "0") + "-" + date.getDate().padStart(2, "0"); 
}

function determineMdp(entries) {
	let mdp = "";
	for(let i = 0; i < entries.length; ++i) {
		if(mdp == "") mdp = entries[i].mdp
		else if(mdp != entries[i].mdp) {
			mdp = "";
			break;
		}
	}
	return mdp;
}

function deriveFileName(prefix) {
	let dttm = new Date();
	return prefix + 
		String(dttm.getFullYear()).padStart(4, "0") + "-" +
		String(dttm.getMonth()).padStart(2, "0") + "-" +
		String(dttm.getDate()).padStart(2, "0") + "-" +
		String(dttm.getHours()).padStart(2, "0") +
		String(dttm.getMinutes()).padStart(2, "0") +
		String(dttm.getSeconds()).padStart(2, "0");
}

})();