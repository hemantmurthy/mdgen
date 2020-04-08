package hamy.mdgen.api.generator.imd;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import hamy.mdgen.api.generator.base.Generator;
import hamy.mdgen.api.generator.base.GeneratorInput;
import hamy.mdgen.api.generator.base.GeneratorInput.Read;
import hamy.mdgen.api.generator.format.CMIMDSeederBuilder;
import hamy.mdgen.api.generator.format.CMIMDSeederJAXBContext;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeeder;;

public class IMDGenerator extends Generator {
	protected String fileMdp;
	protected String nem12FileName; 
	protected ZonedDateTime nem12UpdateDateTime;
	protected String mdp;
	protected String nmi;
	protected String meterSerialNumber;
	protected String nmiSuffix;
	protected String registerId;
	protected String uom;
	private int intervalSize;
	
	public IMDGenerator(GeneratorInput input) {
		super(input);
	}
	
	@Override
	public void processFile(String mdp, String targetParticipant, String targetRole, String nem12FileName, ZonedDateTime nem12UpdateDateTime) {
		this.fileMdp = mdp;
		this.nem12FileName = nem12FileName;
		this.nem12UpdateDateTime = nem12UpdateDateTime;
		
		// targetParticipant and targetRole are not required for IMDs.
	}

	@Override
	public void processRegister(String mdp, String nmi, String nmiConfig, String meterSerialNumber, 
			String nmiSuffix, String registerId, String dataStreamIdentifier, String uom, int intervalSize) {
		this.mdp = mdp == null || "".equals(mdp.trim()) ? null : mdp.trim();
		this.nmi = nmi;
		this.meterSerialNumber = meterSerialNumber;
		this.nmiSuffix = nmiSuffix;
		this.registerId = registerId;
		this.uom = uom;
		this.intervalSize = intervalSize;
		
		// nmiConfig and dataStreamIdentifier are not required for IMDs.
	}

	@Override
	public void processReadsForADay(LocalDate date, List<Read> reads, double indexRead) {
		CMIMDSeeder imd = CMIMDSeederBuilder.build(mdp == null ? fileMdp : mdp, nem12FileName, 
				nem12UpdateDateTime, nmi, meterSerialNumber, nmiSuffix, registerId, uom, intervalSize, 
				date, date.plusDays(1), reads, indexRead);
		
		dispatchIMD(imd);
	}
	
	protected void dispatchIMD(CMIMDSeeder imd) {
		try {
			Marshaller mar = CMIMDSeederJAXBContext.createMarshaller();
			System.out.println("\nOutput");
			mar.marshal(imd, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void processEndOfFile(int numReadsProcessed) {
	}
}
