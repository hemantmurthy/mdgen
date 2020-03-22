package hamy.mdgen.api.generator;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import hamy.mdgen.api.generator.GeneratorInput.Read;
import hamy.mdgen.api.generator.format.NEM12CSVBuilder;

public class NEM12Generator extends Generator {
	private String mdp;
	private String overrideMdp;
	private String nem12FileName; 
	private ZonedDateTime nem12UpdateDateTime;
	private String nmi;
	private String meterSerialNumber;
	private String nmiSuffix;
	private String registerId;
	private String uom;
	private int intervalSize;

	private StringBuilder buffer = new StringBuilder();
	
	public NEM12Generator(GeneratorInput input) {
		super(input);
	}

	@Override
	public void processFile(String mdp, String targetParticipant, String nem12FileName, ZonedDateTime nem12UpdateDateTime) {
		this.mdp = mdp;
		this.nem12FileName = nem12FileName;
		this.nem12UpdateDateTime = nem12UpdateDateTime;
		
		String rec100 = NEM12CSVBuilder.create100Record(nem12UpdateDateTime, mdp, targetParticipant);
		buffer.append(rec100).append("\n");
		
		System.out.println(rec100);
	}

	@Override
	public void processRegister(String overrideMdp, String nmi, String nmiConfig, String meterSerialNumber,
			String nmiSuffix, String registerId, String dataStreamIdentifier, String uom, int intervalSize) {
		this.overrideMdp = overrideMdp;
		this.nmi = nmi;
		this.meterSerialNumber = meterSerialNumber;
		this.nmiSuffix = nmiSuffix;
		this.registerId = registerId;
		this.uom = uom;
		this.intervalSize = intervalSize;
		
		String rec200 = NEM12CSVBuilder.create200Record(overrideMdp, nmi, nmiConfig, meterSerialNumber, nmiSuffix, registerId, dataStreamIdentifier, uom, intervalSize);
		buffer.append(rec200).append("\n");
		System.out.println(rec200);
		
	}

	@Override
	public void processReadsForADay(LocalDate date, List<Read> reads, double indexRead) {
		// Check if all read qualities are the same. If not, set 300 read quality to V (variable) ...
		String readQuality = null;
		for(Read r : reads) {
			readQuality = readQuality == null ? r.getQual() : readQuality;
			if(!readQuality.equals(r.getQual())) {
				readQuality = "V";
				break;
			}
		}
		
		String rec300 = NEM12CSVBuilder.create300Record(date, reads, readQuality, "", "", null, null);
		buffer.append(rec300).append("\n");
		System.out.println(rec300);
		
		// Generate 400 records if read quality is V ...
		if("V".equals(readQuality)) {
			int startInt = 1, endInt = 0;
			String prevQ = null;
			for(Read r : reads) {
				if(prevQ != null && !prevQ.equals(r.getQual())) {
					// Generate 400 record for previous block
					String rec400 = NEM12CSVBuilder.create400Record(startInt, endInt, prevQ, null);
					buffer.append(rec400).append("\n");
					System.out.println(rec400);
					
					startInt = endInt + 1;
				}
				
				++endInt;
				prevQ = r.getQual();
			}
			
			//Generate 400 record for last block
			String rec400 = NEM12CSVBuilder.create400Record(startInt, endInt, prevQ, null);
			buffer.append(rec400).append("\n");
			System.out.println(rec400);
		}
	}

	@Override
	public void processEndOfFile(int numReadsProcessed) {
		String rec900 = NEM12CSVBuilder.create900Record();
		buffer.append(rec900);
	}

}
