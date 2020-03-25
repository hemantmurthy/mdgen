package hamy.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import hamy.mdgen.api.generator.format.aseXML.Envelope;
import hamy.mdgen.api.generator.format.aseXML.Header;
import hamy.mdgen.api.generator.format.aseXML.ObjectFactory;
import hamy.mdgen.api.generator.format.aseXML.PartyIdentifier;

public class TestASEXML {
	public static void main(String[] args) {
		try {
			ObjectFactory of = new ObjectFactory();

			Header h = of.createHeader();
			PartyIdentifier msppi = of.createPartyIdentifier();
			msppi.setValue("TCAUSTM");
			h.setFrom(msppi);

			PartyIdentifier topi = of.createPartyIdentifier();
			topi.setValue("ENGYAUST");
			h.setTo(topi);
			
			h.setMessageID("TESTMSG-2020-02-02-232304");
			Envelope e = of.createEnvelope();
			e.setHeader(h);
			
			JAXBElement<Envelope> r = of.createAseXML(e);
			
			Marshaller m = JAXBContext.newInstance(Envelope.class).createMarshaller();
			m.marshal(r, System.out);
		} catch (JAXBException e1) {
			e1.printStackTrace();
		}
	}
}
