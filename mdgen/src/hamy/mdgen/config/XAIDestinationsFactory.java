package hamy.mdgen.config;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

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
				XAIDestination dest = new XAIDestination();
				dest.url = "http://10.175.121.154:7004//ouaf/XAIApp/xaiserver";
				defaultXAIDestinations.destinations.put("DEV", dest);
				
				dest = new XAIDestination();
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
			XAIDestination xd = new XAIDestination();
			xd.url = xdx.getUrl() == null || "".equals(xdx.getUrl().trim()) ? null : xdx.getUrl().trim();
			xd.username = xdx.getUsername() == null || "".equals(xdx.getUsername().trim()) ? null : xdx.getUsername().trim();
			xd.password = xdx.getPassword() == null || "".equals(xdx.getPassword().trim()) ? null : xdx.getPassword().trim();
			
			xaids.destinations.put(xdx.getName(), xd);
		}
		
		return xaids;
	}
}
