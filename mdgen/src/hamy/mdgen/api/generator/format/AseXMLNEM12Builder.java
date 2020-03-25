package hamy.mdgen.api.generator.format;

import java.time.ZonedDateTime;

import javax.xml.bind.JAXBElement;

import hamy.mdgen.api.generator.format.aseXML.CSVDataWithName;
import hamy.mdgen.api.generator.format.aseXML.Envelope;
import hamy.mdgen.api.generator.format.aseXML.Header;
import hamy.mdgen.api.generator.format.aseXML.MeterDataNotification;
import hamy.mdgen.api.generator.format.aseXML.ObjectFactory;
import hamy.mdgen.api.generator.format.aseXML.PartyIdentifier;
import hamy.mdgen.api.generator.format.aseXML.Transaction;
import hamy.mdgen.api.generator.format.aseXML.Transactions;

/**
 * Build the aseXML NEM12 file content.
 * @author Hamy
 *
 */
public class AseXMLNEM12Builder {
	public static JAXBElement<Envelope> build(String mdp, String nem12FileName, ZonedDateTime nem12UpdateDateTime, int intervalSize, String nem12CSV) {
		ObjectFactory of = new ObjectFactory();
		
		// Create the header ...
		Envelope e = of.createEnvelope();
		e.setHeader(createHeader(of, mdp, "ENGYAUST", null, null));
		e.setTransactions(createTransactions(of, nem12CSV));
		
		JAXBElement<Envelope> root = of.createAseXML(e);
		return root;
	}
	
	private static Header createHeader(ObjectFactory of, String from, String to, String messageId, ZonedDateTime messageDate) {
		Header h = of.createHeader();
		PartyIdentifier frompi = of.createPartyIdentifier();
		frompi.setValue(from);
		h.setFrom(frompi);
		
		PartyIdentifier topi = of.createPartyIdentifier();
		topi.setValue(to);
		h.setTo(topi);
		
		return h;
	}
	
	private static Transactions createTransactions(ObjectFactory of, String nem12CSV) {
		CSVDataWithName csv = of.createCSVDataWithName();
		csv.setValue(nem12CSV);
		
		MeterDataNotification mdn = of.createMeterDataNotification();
		mdn.setCSVIntervalData(of.createMeterDataNotificationCSVConsumptionData(csv));
		Transaction t = of.createTransaction();
		t.setMeterDataNotification(mdn);
		Transactions ts = of.createTransactions();
		ts.getTransaction().add(t);
		
		return ts;
	}
	
}
