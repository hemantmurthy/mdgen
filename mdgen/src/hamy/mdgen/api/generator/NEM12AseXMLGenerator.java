package hamy.mdgen.api.generator;

import java.io.StringWriter;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import hamy.mdgen.api.generator.GeneratorInput.Read;
import hamy.mdgen.api.generator.format.AseXMLJAXBContext;
import hamy.mdgen.api.generator.format.AseXMLNEM12Builder;

public class NEM12AseXMLGenerator extends NEM12CSVGenerator {
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
	private String aseXML;

	public NEM12AseXMLGenerator(GeneratorInput input) {
		super(input);
	}

	@Override
	public void processFile(String mdp, String targetParticipant, String nem12FileName,
			ZonedDateTime nem12UpdateDateTime) {
		super.processFile(mdp, targetParticipant, nem12FileName, nem12UpdateDateTime);
		this.mdp = mdp;
		this.nem12FileName = nem12FileName;
		this.nem12UpdateDateTime = nem12UpdateDateTime;
		
	}

	@Override
	public void processRegister(String overrideMdp, String nmi, String nmiConfig, String meterSerialNumber,
			String nmiSuffix, String registerId, String dataStreamIdentifier, String uom, int intervalSize) {
		super.processRegister(overrideMdp, nmi, nmiConfig, meterSerialNumber, nmiSuffix, registerId, dataStreamIdentifier, uom,
				intervalSize);
		this.overrideMdp = overrideMdp;
		this.nmi = nmi;
		this.meterSerialNumber = meterSerialNumber;
		this.nmiSuffix = nmiSuffix;
		this.registerId = registerId;
		this.uom = uom;
		this.intervalSize = intervalSize;
		
	}

	@Override
	public void processReadsForADay(LocalDate date, List<Read> reads, double indexRead) {
		super.processReadsForADay(date, reads, indexRead);
	}

	@Override
	public void processEndOfFile(int numReadsProcessed) {
		super.processEndOfFile(numReadsProcessed);
		
		// Obtain NEM12 CSV ...
		String nem12CSV = super.getNEM12CSV();
		
		// Generate the aseXML and insert the generated CSV into transaction data ...
		Object xml = AseXMLNEM12Builder.build(mdp, nem12FileName, nem12UpdateDateTime, numReadsProcessed, nem12CSV);
		
		try {
			Marshaller m = AseXMLJAXBContext.createMarshaller();
			StringWriter out = new StringWriter();
			m.marshal(xml, out);
			
			this.aseXML = out.getBuffer().toString();
		} catch (JAXBException e) {
			throw new RuntimeException("Unable to create marshaller to create aseXML", e);
		}
	}
	
	public String getAseXML() {
		return aseXML;
	}

}
