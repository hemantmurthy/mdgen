(function() {
	
let DECIMAL_RE = /^(\d*\.)?\d+$/;	
let NMI_RE = /^[A-Za-z0-9]{10}$/;
let NMI_SUFFIX_RE = /^[A-HJ-MP-WYZ]{1}[0-9A-HJ-NP-Z]{1}$/;
let MTR_SRNO_RE = /^[A-Za-z0-9]+$/;
let REG_ID_RE = /^[A-Za-z0-9]{1,2}$/;

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
		// Load configuration for this application.
		// Configuration is stored in a JSON file. This JSON object is loaded into the vm.config
		
		let vm = this;
		
		// Load configuration ...
		let configLoader = new XMLHttpRequest();
		configLoader.onreadystatechange = function() {
			if(this.readyState == 4) {
				if(this.status == 200) {
					vm.config = JSON.parse(this.responseText);
					vm.configLoaded = true; 
				}
			}
		};
		configLoader.open("GET", "js/config.json", true);
		configLoader.send();
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
		generateImdViaJms: function(parms) {
			invokeAPI("api/generator/xai", parms, this)
		},
		generateImdViaXai: function(parms) {
			invokeAPI("api/generator/xai", parms, this)
		},
		generateNem12Csv: function() {
			invokeAPI("api/generator/nem12csv", {}, this, function(response) {
				// If response contains generated data, then download file to client system ...
				if(response.generatedData) {
					downloadFile(response.generatedData, "nem12_", ".txt")
				}
			});
		},
		generateNem12AseXML: function() {
			invokeAPI("api/generator/nem12asexml", {}, this, function(response) {
				// If response contains generated data, then download file to client system ...
				if(response.generatedData) {
					downloadFile(response.generatedData, "num12_", ".xml");
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
						}
					}
				},
				"add-single-entry": {
					template: "#add-single-entry-template",
					props: ["config", "mode", "actionLabel", "index", "entries"],
					data: function() {
						return {
							mdp: this.index ? this.entries[this.index].mdp : "",
							mdpError: null,
							nmi: this.index != null ? this.entries[this.index].nmi : "",
							nmiError: null,
							meterSerialNumber: this.index != null ? this.entries[this.index].meterSerialNumber : "",
							meterSerialNumberError: null,
							nmiSuffix: this.index != null ? this.entries[this.index].nmiSuffix : "",
							nmiSuffixError: null,
							registerId: this.index != null ? this.entries[this.index].registerId : "",
							registerIdError: null,
							startDate: this.index != null ? this.entries[this.index].startDate : "",
							startDateError: null,
							endDate: this.index != null ? this.entries[this.index].endDate : "",
							endDateError: null,
							transactionId: this.index != null ? this.entries[this.index].transactionId : "",
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
							
							if(this.mdpError != null
								|| this.nmiError != null
								|| this.meterSerialNumberError != null
								|| this.nmiSuffixError != null
							) return;
							
							let entry = {
								mdp: this.mdp,
								nmi: this.nmi,
								meterSerialNumber: this.meterSerialNumber,
								nmiSuffix:this.nmiSuffix,
								registerId: this.registerId,
								startDate: this.startDate,
								endDate: this.endDate,
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
							entriesText: ""
						};
					},
					methods: {
						cancel: function() {
							this.$emit("cancel");
						},
						add: function() {
							// Split entries text by newline
							let entries = [];
							let lines = this.entriesText.split(/\r?\n/g);
							
							lines.forEach(function(l) {
								// Retrieve fields from each line (comma-separated) ...
								let v = l.split(",");
								entries.push({
									mdp: this.mdp,
									nmi: v[0],
									meterSerialNumber: v[1],
									nmiSuffix: v[2],
									registerId: v[3],
									startDate: v[4],
									endDate: v[5]
								});
							}, this);
							this.$emit("add-entries", entries);
						}
					}
				}
			}
		},
		"delivery-method": {
			template: "#delivery-method-template",
			data: function() {
				return {
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
				generateImdViaJms: function(target) 
				{
					this.selectedMethod = null;
					this.showDeliveryMethods = false;
					this.$emit("generate-imd-via-jms", target);
				},
				generateImdViaXai: function(target) {
					this.selectedMethod = null;
					this.showDeliveryMethods = false;
					this.$emit("generate-imd-via-xai", target);
				},
				generateNem12Csv: function() {
					this.selectedMethod = null;
					this.showDeliveryMethods = false;
					this.$emit("generate-nem12-csv");
				},
				generateNem12AseXML: function() {
					this.selectedMethod = null;
					this.showDeliveryMethods = false;
					this.$emit("generate-nem12-asexml");
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
					data: function() {
						return {
							servers: {
								"MSGASVD4": {name: "MSGASVD4", server: "10.20.30.40", 
									queues: [{name: "queue1"}]
								},
								"MSGASVD5": {name: "MSGASVD5", server: "192.168.45.4", 
									queues: [{name: "queue1"},{name: "queue2"}]
								}
							},
							server: "",
							username: "",
							password: ""
						};
					},
					computed: {
						serverHost: function() {
							return this.servers[this.server] === undefined ? "" : this.servers[this.server].server;
						},
						serverQueues: function() {
							return this.servers[this.server] === undefined ? "" : this.servers[this.server].queues;
						}
					},
					methods: {
						generate: function() {
							this.$emit("generate-imd-via-jms", {
								server: this.server, username: this.username, password: this.password
							});
						},
						cancel: function() {
							this.$emit("cancel");
						}
					}
				},
				"imd-via-xai-delivery": {
					template: "#imd-via-xai-template",
					data: function() {
						return {
							server: "",
							username: "",
							password: ""
						};
					},
					methods: {
						generate: function() {
							this.$emit("generate-imd-via-xai", {
								server: this.server
							});
						},
						cancel: function() {
							this.$emit("cancel");
						}
					}
				},
				"nem12-delivery": {
					template: "#nem12-template",
					data: function() {
						return {
						};
					},
					methods: {
						downloadNem12: function() {
							this.$emit("generate-nem12-csv", {
							});
						},
						downloadNem12AseXML: function() {
							this.$emit("generate-nem12-asexml", {
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
			ct.reads.push({rd: Number(int.value.toString().trim()).toFixed(3), qual: int.quality.trim() });
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
					vm.generator.errorMessage = "Error message: " + response.errorMessage;
				}
			} else {
				vm.generator.id = null;
				vm.generator.status = "Error";
				vm.generator.errorMessage = "Request status received: " + this.status;
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
						setTimeout(function() { checkStatus(vm, callback); }, 1000); 
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


function downloadFile(data, fnprefix, fnext) {
	let blob = new Blob([data], {type : "text/plain"});
	let link = document.createElement("a");
	link.href = URL.createObjectURL(blob);
	let dttm = new Date();
	let fileName = fnprefix + 
		String(dttm.getFullYear()).padStart(4, "0") + "-" +
		String(dttm.getMonth()).padStart(2, "0") + "-" +
		String(dttm.getDate()).padStart(2, "0") + "-" +
		String(dttm.getHours()).padStart(2, "0") +
		String(dttm.getMinutes()).padStart(2, "0") +
		String(dttm.getSeconds()).padStart(2, "0") +
		fnext;
	link.setAttribute("download", fileName);
	link.click();
	URL.revokeObjectURL(link.href);
}

})();