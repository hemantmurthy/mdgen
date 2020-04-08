package hamy.mdgen.api.generator.format;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import hamy.mdgen.api.generator.format.aseXML.CSVDataWithName;
import hamy.mdgen.api.generator.format.aseXML.EnergyMarket;
import hamy.mdgen.api.generator.format.aseXML.Envelope;
import hamy.mdgen.api.generator.format.aseXML.Header;
import hamy.mdgen.api.generator.format.aseXML.MeterDataNotification;
import hamy.mdgen.api.generator.format.aseXML.ObjectFactory;
import hamy.mdgen.api.generator.format.aseXML.PartyIdentifier;
import hamy.mdgen.api.generator.format.aseXML.R25;
import hamy.mdgen.api.generator.format.aseXML.RoleAssignment;
import hamy.mdgen.api.generator.format.aseXML.Transaction;
import hamy.mdgen.api.generator.format.aseXML.TransactionGroup;
import hamy.mdgen.api.generator.format.aseXML.TransactionPriority;
import hamy.mdgen.api.generator.format.aseXML.Transactions;

/**
 * Build the aseXML NEM12 file content.
 * @author Hamy
 *
 */
public class AseXMLNEM12Builder {
	private static DatatypeFactory datatypeFactory;
	private static final ZoneId AEST = ZoneId.of("+10:00");
	
	static {
		try {
			datatypeFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException("Unable to create DatatypeFactory instance", e);
		}
	}
	
	public static JAXBElement<Envelope> build(String mdp, String toParticipant, String targetRole, String nem12FileName, ZonedDateTime nem12UpdateDateTime, String nem12CSV) {
		ObjectFactory of = new ObjectFactory();
		
		// Create the header ...
		Envelope e = of.createEnvelope();
		ZonedDateTime processingTime = ZonedDateTime.now();
		String messageId = nem12FileName == null || "".equals(nem12FileName.trim()) ? "MDGEN-MTRD-FILE" : nem12FileName.trim();
		e.setHeader(createHeader(of, mdp, toParticipant, messageId, processingTime));
		
		String transactionId = messageId + "-01";
		e.setTransactions(createTransactions(of, targetRole, transactionId, processingTime, nem12CSV));
		
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
		
		h.setMessageID(messageId);
		h.setMessageDate(datatypeFactory.newXMLGregorianCalendar(
				GregorianCalendar.from(messageDate.withZoneSameInstant(AEST))));
		h.setTransactionGroup(TransactionGroup.MTRD);
		h.setPriority(TransactionPriority.LOW);
		h.setMarket(EnergyMarket.NEM);
		return h;
	}
	
	private static Transactions createTransactions(ObjectFactory of, String participantRole, String transactionId, ZonedDateTime transactionDate, String nem12CSV) {
		CSVDataWithName csv = of.createCSVDataWithName();
		csv.setValue(nem12CSV);
		
		MeterDataNotification mdn = of.createMeterDataNotification();
		mdn.setVersion(R25.R_25);
		mdn.setCSVIntervalData(of.createMeterDataNotificationCSVConsumptionData(csv));
		
		RoleAssignment role = of.createRoleAssignment();
		role.setRole(participantRole);
		mdn.setParticipantRole(role);
		
		Transaction t = of.createTransaction();
		t.setTransactionID(transactionId);
		t.setTransactionDate(datatypeFactory.newXMLGregorianCalendar(
				GregorianCalendar.from(transactionDate.withZoneSameInstant(AEST))));
		t.setMeterDataNotification(mdn);

		Transactions ts = of.createTransactions();
		ts.getTransaction().add(t);
		
		return ts;
	}
	
}
