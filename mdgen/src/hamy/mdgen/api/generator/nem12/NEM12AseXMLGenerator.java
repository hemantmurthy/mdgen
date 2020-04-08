package hamy.mdgen.api.generator.nem12;

import java.io.StringWriter;
import java.time.LocalDate;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import hamy.mdgen.api.generator.base.GeneratorInput;
import hamy.mdgen.api.generator.base.GeneratorInput.Read;
import hamy.mdgen.api.generator.format.AseXMLJAXBContext;
import hamy.mdgen.api.generator.format.AseXMLNEM12Builder;

public class NEM12AseXMLGenerator extends NEM12CSVGenerator {
	private String aseXML;

	public NEM12AseXMLGenerator(GeneratorInput input) {
		super(input);
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
		Object xml = AseXMLNEM12Builder.build(super.mdp, super.targetParticipant, super.targetRole, super.nem12FileName, super.nem12UpdateDateTime, nem12CSV);
		
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
