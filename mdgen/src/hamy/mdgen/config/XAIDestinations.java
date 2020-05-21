package hamy.mdgen.config;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="xaiDestinations")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class XAIDestinations {
	Map<String, XAIDestination> destinations = new LinkedHashMap<>();
	
	public XAIDestinations() {}
	
	public XAIDestination get(String name) {
		return this.destinations.get(name);
	}
	
	public Map<String, XAIDestination> getDestinations() {
		return this.destinations;
	}
	
	@XmlAccessorType(XmlAccessType.PROPERTY)
	public class XAIDestination {
		String url;
		String username;
		String password;
		
		public XAIDestination() {}
		
		public String getUrl() { return this.url; }
		@XmlTransient
		public String getUsername() { return this.username; }
		@XmlTransient
		public String getPassword() { return this.password; }
		
	}
}