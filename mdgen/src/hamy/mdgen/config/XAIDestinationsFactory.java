package hamy.mdgen.config;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.apache.log4j.Logger;

import hamy.mdgen.config.XAIDestinationsXML.XAIDestinationXML;

public class XAIDestinationsFactory {
	private static Logger log = Logger.getLogger(XAIDestinationsFactory.class);
	public static final String DEFAULT_XAI_CONFIG_FILE_PATH = "xai_config.xml";
	
	private static XAIDestinations defaultXAIDestinations = null;
	public static XAIDestinations loadConfig() {
		if(defaultXAIDestinations == null) {
			try {
				defaultXAIDestinations = loadConfig(DEFAULT_XAI_CONFIG_FILE_PATH);
				log.info("XAI Config Loaded. Number of entries: " + defaultXAIDestinations.getDestinations().size());
			} catch(Exception e) {
				log.error("Unable to load XAI Destinations config", e);
				defaultXAIDestinations = new XAIDestinations();
				XAIDestinations.XAIDestination dest = defaultXAIDestinations.new XAIDestination();
				dest.url = "http://10.175.121.154:7004//ouaf/XAIApp/xaiserver";
				defaultXAIDestinations.destinations.put("DEV", dest);
				
				dest = defaultXAIDestinations.new XAIDestination();
				dest.url = "http://10.175.102.74:7004/ouaf/XAIApp/xaiserver";
				defaultXAIDestinations.destinations.put("ST", dest);
				
			}
		}
		return defaultXAIDestinations;
	}
	
	public static XAIDestinations loadConfig(String xmlResourcePath) {
		
		InputStream is = XAIDestinationsXML.class.getClassLoader().getResourceAsStream(xmlResourcePath);
		if(is == null)
			throw new RuntimeException("Unable to find XAI Destinations configuration file at " + xmlResourcePath);
		
		XAIDestinationsXML xml = null;
		try {
			JAXBContext c = JAXBContext.newInstance(XAIDestinationsXML.class);
			Unmarshaller u = c.createUnmarshaller();
			xml = (XAIDestinationsXML) u.unmarshal(is);
			
		} catch (JAXBException e) {
			throw new RuntimeException("Unable to parse XAI Destinations configuration file at " + xmlResourcePath);
		}
		
		XAIDestinations xaids = new XAIDestinations();
		for(XAIDestinationXML xdx : xml.getDestinations()) {
			XAIDestinations.XAIDestination xd = xaids.new XAIDestination();
			xd.url = xdx.getUrl() == null || "".equals(xdx.getUrl().trim()) ? null : xdx.getUrl().trim();
			xd.username = xdx.getUsername() == null || "".equals(xdx.getUsername().trim()) ? null : xdx.getUsername().trim();
			xd.password = xdx.getPassword() == null || "".equals(xdx.getPassword().trim()) ? null : xdx.getPassword().trim();
			
			xaids.destinations.put(xdx.getName(), xd);
		}
		
		return xaids;
	}
	
	@XmlRootElement(name="xaiDestinations")
	//@XmlAccessorType (XmlAccessType.FIELD)
	public static class XAIDestinations {
		private Map<String, XAIDestination> destinations = new LinkedHashMap<>();
		
		public XAIDestinations() {}
		
		public XAIDestination get(String name) {
			return this.destinations.get(name);
		}
		
		public Map<String, XAIDestination> getDestinations() {
			return this.destinations;
		}
		
		@XmlRootElement
		//@XmlAccessorType (XmlAccessType.FIELD)
		public class XAIDestination {
			private String url;
			@XmlTransient
			private String username;
			@XmlTransient
			private String password;
			
			public XAIDestination() {}
			
			public String getUrl() { return this.url; }
			public String getUsername() { return this.username; }
			public String getPassword() { return this.password; }
			
		}
	}

}
