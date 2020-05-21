package hamy.mdgen.api.generator.imd;

import java.io.StringWriter;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;

import hamy.mdgen.api.generator.format.CMIMDSeederJAXBContext;
import hamy.mdgen.api.generator.format.xai.CMIMDSeeder.CMIMDSeeder;
import hamy.mdgen.config.JMSDestinationsFactory;
import hamy.mdgen.config.JMSDestinationsFactory.JMSDestinations;
import hamy.mdgen.config.JMSDestinationsFactory.JMSDestinations.JMSDestination;

public class IMDViaJMSGenerator extends IMDGenerator {
	private static Logger log = Logger.getLogger(IMDViaJMSGenerator.class);
	
	private static JMSDestinations jmsDestinations = null;
	static {
		jmsDestinations = JMSDestinationsFactory.loadConfig();
	}
	
	private Connection connection = null;
	private Session session = null;
	private MessageProducer[] producers = null;
	private int nextTargetIndex = -1;
	
	public IMDViaJMSGenerator(IMDViaJMSGeneratorInput input) {
		super(input);
		
		if(input.getServer() == null || "".equals(input.getServer().trim()))
			throw new RuntimeException("JMS Server not specified or is blank");
		
		JMSDestination jd = jmsDestinations.get(input.getServer().trim());
		if(jd == null)
			throw new RuntimeException("JMS Server not recognised. Value specified is " + input.getServer().trim());
		
		try {
			log.trace("Creating connection factory for ActiveMQ server ...");
			ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(jd.getUrl());
			if(jd.getUsername() != null && jd.getPassword() != null) {
				connectionFactory.setUserName(jd.getUsername()); 
				connectionFactory.setPassword(jd.getPassword());
			} else if(input.getUsername() != null && input.getPassword() != null) {
				connectionFactory.setUserName(input.getUsername()); 
				connectionFactory.setPassword(input.getPassword());
			} else
				throw new RuntimeException("Username and password are required");
			
			log.trace("Creating connection to Active MQ server ...");
			connection = connectionFactory.createConnection();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			
			log.trace("Creating pool of message producers ...");
			producers = new MessageProducer[jd.getQueues().size()];
			for(int i = 0; i < producers.length; ++i)
				producers[i] = session.createProducer(session.createQueue(jd.getQueues().get(i)));
			
			log.debug("Connected to Active MQ Server");
		} catch (JMSException e) {
			throw new RuntimeException("Unable to connect and establish session with JMS Server", e);
		}
	}
	
	@Override
	protected void dispatchIMD(CMIMDSeeder imd) {
		try {
			Marshaller m = CMIMDSeederJAXBContext.createMarshaller();
			StringWriter out = new StringWriter();
			m.marshal(imd, out);
			
			if(log.isDebugEnabled()) {
				log.debug("IMD Created");
				log.debug(out.toString());
			}
			// Shift between queues ...
			nextTargetIndex = (nextTargetIndex + 1) % producers.length;
			log.trace("Dispatching IMD ...");
			producers[nextTargetIndex].send(session.createTextMessage(out.toString()));
			log.trace("IMD Dispatched");
		} catch (JAXBException e) {
			throw new RuntimeException("Unable to convert IMD data to XML", e);
		} catch (JMSException e) {
			throw new RuntimeException("Unable to send message to queue", e);
		}
	}

	@Override
	public void processEndOfFile(int numReadsProcessed) {
		super.processEndOfFile(numReadsProcessed);
		
		for(MessageProducer p : producers) {
			try {
				if(p != null) p.close();
			} catch (JMSException e) {}
		}
		try {
			if(session != null) session.close();
		} catch (JMSException e) {}
		
		try {
			if(connection != null) connection.close();
		} catch (JMSException e) {}
	}
	
}
