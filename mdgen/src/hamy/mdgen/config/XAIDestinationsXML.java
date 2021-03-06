package hamy.mdgen.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="xai-destinations")
@XmlAccessorType (XmlAccessType.FIELD)
public class XAIDestinationsXML {
	@XmlElement(name="destination")
	List<XAIDestinationXML> destinations = new ArrayList<>();
	
	public XAIDestinationsXML() {}
	
	public List<XAIDestinationXML> getDestinations() {
		return destinations;
	}
	public void setDestinations(List<XAIDestinationXML> destinations) {
		this.destinations = destinations;
	}

	@XmlAccessorType (XmlAccessType.FIELD)
	public static class XAIDestinationXML {
		private String name;
		private String url;
		private String username;
		private String password;
		
		public XAIDestinationXML() {}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
}	
