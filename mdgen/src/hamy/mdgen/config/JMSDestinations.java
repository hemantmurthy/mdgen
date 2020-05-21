package hamy.mdgen.config;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="jmsDestinations")
//@XmlAccessorType (XmlAccessType.FIELD)
public class JMSDestinations {
	Map<String, JMSDestination> destinations = new LinkedHashMap<>();
	
	public JMSDestinations() {}
	
	public JMSDestination get(String name) {
		return this.destinations.get(name);
	}
	
	public Map<String, JMSDestination> getDestinations() {
		return this.destinations;
	}
	
	@XmlRootElement
	//@XmlAccessorType (XmlAccessType.FIELD)
	public class JMSDestination {
		String url;
		@XmlTransient
		String username;
		@XmlTransient
		String password;
		List<String> queues = new ArrayList<>();
		
		public JMSDestination() {}
		public String getUrl() { return this.url; }
		public List<String> getQueues() { return this.queues; }
		public String getUsername() { return this.username; }
		public String getPassword() { return this.password; }
		
	}
}
