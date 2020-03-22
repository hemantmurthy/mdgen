package hamy.mdgen.api.generator;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hamy.mdgen.api.generator.GeneratorInput.ChannelTemplate;
import hamy.mdgen.api.generator.GeneratorInput.Read;
import hamy.mdgen.api.generator.GeneratorInput.RequestedChannel;

public abstract class Generator {
	private GeneratorInput input;
	private Thread thread;
	
	private int numReadsToProcess = 0;
	private int numReadsProcessed = 0;
	private String status;
	private String errorMessage;
	
	public Generator(GeneratorInput input) {
		this.input = input;
		this.status = "PENDING";
	}
	
	public void start(String id) {
		this.status = "STARTING";
		if(this.thread != null)
			throw new RuntimeException("Illegal State");
		
		if((this.errorMessage = prepare()) != null) {
			this.status = "VALIDATION_ERROR";
			return;
		}
		
		this.thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Generator.this.status = "RUNNING";
				try {
					generate();
					Generator.this.status = "COMPLETED";
				} catch(Exception e) {
					Generator.this.status = "ERROR";
					Generator.this.errorMessage = e.getMessage();
					e.printStackTrace();
				} finally {
				}
			}
		});
		
		thread.start();
	}
	
	private String prepare() {
		Map<String, ChannelTemplate> cts = new HashMap<String, ChannelTemplate>();
		for(ChannelTemplate ct : input.getChannelTemplates()) {
			if(cts.containsKey(ct.getNmiSuffix())) {
				return "Duplicate tempalte for Channel ID " + ct.getNmiSuffix();
			}
			cts.put(ct.getNmiSuffix(), ct);
		}

		numReadsToProcess = 0;
		for(RequestedChannel rc : input.getRequestedChannels()) {
			String channelId = rc.getNmiSuffix();
			LocalDate startDate = rc.getStartDate();
			LocalDate endDate = rc.getEndDate();
			
			// Find matching channel in templates ...
			ChannelTemplate ct = cts.get(channelId);
			if(ct != null) {
				for(LocalDate date = startDate; date.compareTo(endDate) <= 0; date = date.plusDays(1)) {
					++numReadsToProcess;
				}
			} else {
				// Nothing to do ...
			}
		}
		
		System.out.println("#### " + numReadsToProcess);
		return null;
	}
	
	private void generate() {
		Map<String, ChannelTemplate> cts = new HashMap<String, ChannelTemplate>();
		for(ChannelTemplate ct : input.getChannelTemplates())
			cts.put(ct.getNmiSuffix(), ct);
		
		// Start processing for a file ...
		String mdp = input.getMdp();
		String targetParticipant = input.getTargetParticipant();
		String nem12FileName = input.getNem12FileName();
		ZonedDateTime nem12UpdateDateTime = input.getNem12UpdateDateTime();
		processFile(mdp, targetParticipant, nem12FileName, nem12UpdateDateTime);
		
		// Process each channel ...
		for(RequestedChannel rc : input.getRequestedChannels()) {
			String overrideMdp = rc.getMdp();
			String nmi = rc.getNmi();
			String nmiConfig = rc.getNmiSuffix(); // Default nmi config to the nmi suffix
			String meterSerialNumber = rc.getMeterSerialNumber();
			String nmiSuffix = rc.getNmiSuffix();
			String registerId = rc.getRegisterId();
			String dataStreamIdentifier = rc.getNmiSuffix(); // Default data stream to the nmi suffix
			LocalDate startDate = rc.getStartDate();
			LocalDate endDate = rc.getEndDate();
			double indexRead = rc.getIndexRead();
			
			// Find matching channel in templates ...
			ChannelTemplate ct = cts.get(nmiSuffix);
			if(ct != null) {
				// Generate data only if matching channel found ...
				int intervalSize = ct.getIntervalSize();
				
				// Use override UOM if available, else use UOM from template ...
				String uom = rc.getOverrideUom();
				if(uom == null) uom = ct.getUom();
				
				// Process the register ...
				processRegister(overrideMdp == null ? mdp : overrideMdp, nmi, nmiConfig, meterSerialNumber, 
						nmiSuffix, registerId, dataStreamIdentifier, uom, intervalSize);
				
				// Process reads one day at a time ...
				for(LocalDate date = startDate; date.compareTo(endDate) <= 0; date = date.plusDays(1)) {
					List<Read> reads = ct.getReads();
					processReadsForADay(date, reads, indexRead);
					++numReadsProcessed;
				}
				
			} else {
				// Nothing to do ...
			}
		}
		
		processEndOfFile(numReadsProcessed);
	}

	
	public int getNumReadsToProcess() {
		return numReadsToProcess;
	}

	public int getNumReadsProcessed() {
		return numReadsProcessed;
	}

	public String getStatus() {
		return status;
	}
	
	protected void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	protected void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Start process for one file.
	 * @param mdp The MDP.
	 * @param nem12FileName The NEM12 File Name.
	 * @param nem12UpdateDateTime The Update Datetime of the NEM 12 File.
	 */
	public abstract void processFile(String mdp, String targetParticipant, String nem12FileName, ZonedDateTime nem12UpdateDateTime);
	
	
	public abstract void processRegister(String mdp, String nmi, String nmiConfig, String meterSerialNumber, 
			String nmiSuffix, String registerId, String dataStreamIdentifier, String uom, int intervalSize);
	public abstract void processReadsForADay(LocalDate date, List<Read> reads, double indexRead);
	public abstract void processEndOfFile(int numReadsProcessed);
}
