package hamy.mdgen.config;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@XmlRootElement(name="jms-destinations")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class JMSDestinations {
	Map<String, JMSDestination> destinations = new LinkedHashMap<>();
	
	public JMSDestinations() {}
	
	public JMSDestination get(String name) {
		return this.destinations.get(name);
	}
	
	public Map<String, JMSDestination> getDestinations() {
		return this.destinations;
	}
	void setDestinations(Map<String, JMSDestination> destinations) {
		this.destinations = destinations;
	}
}
