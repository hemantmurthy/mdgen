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

import hamy.mdgen.config.JMSDestinationsXML.JMSDestinationXML;
import hamy.mdgen.config.JMSDestinationsXML.JMSQueueXML;

public class JMSDestinationsFactory {
	public static final String DEFAULT_JMS_CONFIG_FILE_PATH = "jms_config.xml";
	
	private static JMSDestinations defaultJMSDestinations = null;
	public static JMSDestinations loadConfig() {
		if(defaultJMSDestinations == null) {
			defaultJMSDestinations = loadConfig(DEFAULT_JMS_CONFIG_FILE_PATH);
			System.out.println("JMS Config Loaded. Number of entries: " + defaultJMSDestinations.getDestinations().size());
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
			throw new RuntimeException("Unable to parse JMS Destinations configuration file at " + xmlResourcePath);
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
	
	@XmlRootElement(name="jmsDestinations")
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class JMSDestinations {
		private Map<String, JMSDestination> destinations = new LinkedHashMap<>();
		
		public JMSDestinations() {}
		
		public JMSDestination get(String name) {
			return this.destinations.get(name);
		}
		
		public Map<String, JMSDestination> getDestinations() {
			return this.destinations;
		}
		
		@XmlRootElement
		@XmlAccessorType (XmlAccessType.FIELD)
		public class JMSDestination {
			private String url;
			@XmlTransient
			private String username;
			@XmlTransient
			private String password;
			private List<String> queues = new ArrayList<>();
			
			public JMSDestination() {}
			public String getUrl() { return this.url; }
			public List<String> getQueues() { return this.queues; }
			public String getUsername() { return this.username; }
			public String getPassword() { return this.password; }
			
		}
	}

}
