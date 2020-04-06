package hamy.mdgen.api.generator.base;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hamy.mdgen.api.generator.base.GeneratorInput.ChannelTemplate;
import hamy.mdgen.api.generator.base.GeneratorInput.Read;
import hamy.mdgen.api.generator.base.GeneratorInput.RequestedChannel;
import hamy.mdgen.config.UOMConvertorsFactory;
import hamy.mdgen.config.UOMConvertorsFactory.UOMConvertors;

/**
 * The Meter Data Generator. This class is the work-horse of the meter generator
 * tool. It processes all entries received as input and generates meter data for each entry based on 
 * templates for each metering channel (also received in the input).<br/><br/>
 * This class must be subclasses to generate and dispatch generated meter data in a specific format. 
 * @author Hamy
 *
 */
public abstract class Generator {
	private GeneratorInput input;
	private Thread thread;
	
	private int numReadsToProcess = 0;
	private int numReadsProcessed = 0;
	private String status;
	private String errorMessage;
	
	private UOMConvertors uomConvertors = UOMConvertorsFactory.loadConfig();
	
	public Generator(GeneratorInput input) {
		this.input = input;
		this.status = "PENDING";
	}
	
	public void processSynchronously() {
		if((Generator.this.errorMessage = prepare()) != null) {
			Generator.this.status = "VALIDATION_ERROR";
			return;
		}
		
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
	
	public void processAsynchronously() {
		if(this.thread != null)
			throw new RuntimeException("Illegal State");
		
		this.status = "STARTING";
		this.thread = new Thread(new Runnable() {
			@Override
			public void run() {
				processSynchronously();
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
			String nmiSuffix = rc.getNmiSuffix();
			LocalDate startDate = rc.getStartDate();
			LocalDate endDate = rc.getEndDate();
			
			// Find matching suffix in templates ...
			ChannelTemplate ct = cts.get(nmiSuffix);
			
			// If not found, then try finding template for first letter of suffix ...
			if(ct == null)
				ct = cts.get(nmiSuffix.substring(0, 1));
			
			if(ct != null) {
				for(LocalDate date = startDate; date.compareTo(endDate) <= 0; date = date.plusDays(1)) {
					++numReadsToProcess;
				}
			} else {
				// Nothing to do ...
			}
		}
		
		return null;
	}
	
	private void generate() {
		Map<String, ChannelTemplate> cts = new HashMap<String, ChannelTemplate>();
		for(ChannelTemplate ct : input.getChannelTemplates())
			cts.put(ct.getNmiSuffix(), ct);
		
		// Start processing for a file ...
		String fileMdp = input.getMdp();
		String targetParticipant = input.getTargetParticipant();
		String nem12FileName = input.getNem12FileName();
		ZonedDateTime nem12UpdateDateTime = input.getNem12UpdateDateTime();
		processFile(fileMdp, targetParticipant, nem12FileName, nem12UpdateDateTime);
		
		// Process each channel ...
		for(RequestedChannel rc : input.getRequestedChannels()) {
			String requestMdp = rc.getMdp();
			String nmi = rc.getNmi();
			String nmiConfig = rc.getNmiSuffix(); // Default nmi config to the nmi suffix
			String meterSerialNumber = rc.getMeterSerialNumber();
			String nmiSuffix = rc.getNmiSuffix();
			String registerId = rc.getRegisterId();
			String dataStreamIdentifier = rc.getNmiSuffix(); // Default data stream to the nmi suffix
			LocalDate startDate = rc.getStartDate();
			LocalDate endDate = rc.getEndDate();
			double indexRead = rc.getIndexRead();
			
			// Find matching suffix in templates ...
			ChannelTemplate ct = cts.get(nmiSuffix);
			
			// If not found, then try finding template for first letter of suffix ...
			if(ct == null)
				ct = cts.get(nmiSuffix.substring(0, 1));
				
			if(ct != null) {
				// Generate data only if matching channel found ...
				int intervalSize = ct.getIntervalSize();
				
				// Use override UOM if available, else use UOM from template ...
				String uom = rc.getOverrideUom();
				uom = uom == null || "".equals(uom.trim()) ? ct.getUom() : uom.trim();
				
				// Get a convertor from template UOM to selected UOM if available ...
				UOMConvertors.UOMConvertor uomConvertor = uomConvertors.get(ct.getUom(), uom);
				
				String mdp = fileMdp;
				mdp = mdp == null || "".equals(mdp.trim()) ? requestMdp : mdp.trim();
				
				// Process the register ...
				processRegister(mdp, nmi, nmiConfig, meterSerialNumber, 
						nmiSuffix, registerId, dataStreamIdentifier, uom, intervalSize);
				
				// Process reads one day at a time ...
				for(LocalDate date = startDate; date.compareTo(endDate) <= 0; date = date.plusDays(1)) {
					List<Read> reads = ct.getReads();
					
					// Apply conversion factor on reads if necessary ...
					if(uomConvertor != null) {
						List<Read> convertedReads = new ArrayList<>();
						reads.forEach(r -> {
							Read cr = new Read();
							cr.setQual(r.getQual());
							cr.setRd(uomConvertor.convert(r.getRd()));
							convertedReads.add(cr);
						});
						
						reads = convertedReads;
					}
					
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
	 * Start process for one file. This method will be invoked before any other method is invoked,
	 * and is called at the beginning of processing.
	 * @param mdp The MDP.
	 * @param nem12FileName The NEM12 File Name.
	 * @param nem12UpdateDateTime The Update Datetime of the NEM 12 File.
	 */
	public abstract void processFile(String mdp, String targetParticipant, String nem12FileName, ZonedDateTime nem12UpdateDateTime);
	
	/**
	 * Start processing a single register. This method will be invoked zero or more times after processFile,
	 * once for each register entry and before any of the reads for the register entry are processed.
	 * @param mdp
	 * @param nmi
	 * @param nmiConfig
	 * @param meterSerialNumber
	 * @param nmiSuffix
	 * @param registerId
	 * @param dataStreamIdentifier
	 * @param uom
	 * @param intervalSize
	 */
	public abstract void processRegister(String mdp, String nmi, String nmiConfig, String meterSerialNumber, 
			String nmiSuffix, String registerId, String dataStreamIdentifier, String uom, int intervalSize);
	
	/**
	 * Process reads for a register for a single day. This method will be called one or more times after each
	 * call to processRegister for that register, once for each day in the date range.
	 * @param date
	 * @param reads
	 * @param indexRead
	 */
	public abstract void processReadsForADay(LocalDate date, List<Read> reads, double indexRead);
	
	/**
	 * Complete generator processing. This method is called at the end, after processing all entries.
	 * @param numReadsProcessed The number of reads processed.
	 */
	public abstract void processEndOfFile(int numReadsProcessed);
}
