package hamy.mdgen.config;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.log4j.Logger;

import hamy.mdgen.config.JMSDestinationsXML.JMSDestinationXML;
import hamy.mdgen.config.JMSDestinationsXML.JMSQueueXML;

public class JMSDestinationsFactory {
	private static Logger log = Logger.getLogger(JMSDestinationsFactory.class);
	public static final String DEFAULT_JMS_CONFIG_FILE_PATH = "jms_config.xml";
	
	private static JMSDestinations defaultJMSDestinations = null;
	public static JMSDestinations loadConfig() {
		if(defaultJMSDestinations == null) {
			try {
				defaultJMSDestinations = loadConfig(DEFAULT_JMS_CONFIG_FILE_PATH);
				log.info("JMS Config Loaded. Number of entries: " + defaultJMSDestinations.getDestinations().size());
			} catch(Exception e) {
				log.error("Unable to load JMS Destinations Config", e);
				defaultJMSDestinations = new JMSDestinations();
			}
		}
		
		return defaultJMSDestinations;
	}
	
	public static JMSDestinations loadConfig(String xmlResourcePath) {
		
		InputStream is = JMSDestinationsXML.class.getClassLoader().getResourceAsStream(xmlResourcePath);
		if(is == null)
			throw new RuntimeException("Unable to find JMS Destinations configuration file at " + xmlResourcePath);
		
		JMSDestinationsXML xml = null;
		try {
			JAXBContext c = JAXBContext.newInstance(JMSDestinationsXML.class);
			Unmarshaller u = c.createUnmarshaller();
			xml = (JMSDestinationsXML) u.unmarshal(is);
		
		} catch (JAXBException e) {
			throw new RuntimeException("Unable to parse JMS Destinations configuration file at " + xmlResourcePath, e);
		}
		
		JMSDestinations jmsds = new JMSDestinations();
		for(JMSDestinationXML jdx : xml.getDestinations()) {
			JMSDestinations.JMSDestination jd = jmsds.new JMSDestination();
			jd.url = jdx.getUrl() == null || "".equals(jdx.getUrl().trim()) ? null : jdx.getUrl().trim();
			jd.username = jdx.getUsername() == null || "".equals(jdx.getUsername().trim()) ? null : jdx.getUsername().trim();
			jd.password = jdx.getPassword() == null || "".equals(jdx.getPassword().trim()) ? null : jdx.getPassword().trim();
			
			for(JMSQueueXML qx : jdx.getQueues().getQueues())
				jd.queues.add(qx.getName());
			
			jmsds.destinations.put(jdx.getName(), jd);
		}
		
		return jmsds;
	}
}
