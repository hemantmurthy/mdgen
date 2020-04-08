package hamy.mdgen.api.generator.nem12;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import hamy.mdgen.api.generator.base.Generator;
import hamy.mdgen.api.generator.base.GeneratorInput;
import hamy.mdgen.api.generator.base.GeneratorInput.Read;
import hamy.mdgen.api.generator.format.NEM12CSVBuilder;

/**
 * This Generator generates a NEM12 CSV file based on input.
 * @author Hamy
 *
 */
public class NEM12CSVGenerator extends Generator {

	private StringBuilder buffer = new StringBuilder();
	private String generatedData = null;
	
	protected String mdp;
	protected String targetRole = null;
	protected String targetParticipant = null;
	protected String nem12FileName; 
	protected ZonedDateTime nem12UpdateDateTime = null;
	
	public NEM12CSVGenerator(GeneratorInput input) {
		super(input);
	}

	@Override
	public void processFile(String mdp, String targetParticipant, String targetRole, String nem12FileName, ZonedDateTime nem12UpdateDateTime) {
		this.mdp = mdp;
		this.targetRole = targetRole;
		this.targetParticipant = targetParticipant;
		this.nem12FileName = nem12FileName;
		this.nem12UpdateDateTime = nem12UpdateDateTime;
		String rec100 = NEM12CSVBuilder.create100Record(nem12UpdateDateTime, mdp, targetParticipant);
		buffer.append(rec100).append("\n");
	}

	@Override
	public void processRegister(String mdp, String nmi, String nmiConfig, String meterSerialNumber,
			String nmiSuffix, String registerId, String dataStreamIdentifier, String uom, int intervalSize) {
		String rec200 = NEM12CSVBuilder.create200Record(nmi, nmiConfig, meterSerialNumber, nmiSuffix, registerId, dataStreamIdentifier, uom, intervalSize);
		buffer.append(rec200).append("\n");
		
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
		
		String rec300 = NEM12CSVBuilder.create300Record(date, reads, readQuality, "", "", nem12UpdateDateTime, null);
		buffer.append(rec300).append("\n");
		
		// Generate 400 records if read quality is V ...
		if("V".equals(readQuality)) {
			int startInt = 1, endInt = 0;
			String prevQ = null;
			for(Read r : reads) {
				if(prevQ != null && !prevQ.equals(r.getQual())) {
					// Generate 400 record for previous block
					String rec400 = NEM12CSVBuilder.create400Record(startInt, endInt, prevQ, null);
					buffer.append(rec400).append("\n");
					startInt = endInt + 1;
				}
				
				++endInt;
				prevQ = r.getQual();
			}
			
			//Generate 400 record for last block
			String rec400 = NEM12CSVBuilder.create400Record(startInt, endInt, prevQ, null);
			buffer.append(rec400).append("\n");
		}
	}

	@Override
	public void processEndOfFile(int numReadsProcessed) {
		String rec900 = NEM12CSVBuilder.create900Record();
		buffer.append(rec900);
		
		this.generatedData = buffer.toString();
	}
	
	/**
	 * Get the generated data in NEM12 CSV format.
	 * @return Generated data in NEM12 format, or null if generator failed, or has not yet completed processing.
	 */
	public String getNEM12CSV() {
		return this.generatedData;
	}

}
