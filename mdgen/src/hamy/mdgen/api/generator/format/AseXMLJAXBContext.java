package hamy.mdgen.api.generator.format;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import hamy.mdgen.api.generator.format.aseXML.Envelope;

public class AseXMLJAXBContext {
	private static JAXBContext jaxbContext;
	
	static {
		try {
			jaxbContext = JAXBContext.newInstance(Envelope.class);
		} catch (JAXBException e) {
			throw new RuntimeException("Unable to create JAXBContext", e);
		}
	}
	
	public static Marshaller createMarshaller() throws JAXBException {
		return jaxbContext.createMarshaller();
	}
	
}
