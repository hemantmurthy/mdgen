package hamy.mdgen.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="jms-destinations")
@XmlAccessorType (XmlAccessType.FIELD)
public class JMSDestinationsXML {
	@XmlElement(name="destination")
	List<JMSDestinationXML> destinations = new ArrayList<>();
	
	public List<JMSDestinationXML> getDestinations() {
		return destinations;
	}
	public void setDestinations(List<JMSDestinationXML> destinations) {
		this.destinations = destinations;
	}

	@XmlAccessorType (XmlAccessType.FIELD)
	public static class JMSDestinationXML {
		private String name;
		private String url;
		private String username;
		private String password;
		JMSQueuesXML queues;
		
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
		public JMSQueuesXML getQueues() {
			return queues;
		}
		public void setQueues(JMSQueuesXML queues) {
			this.queues = queues;
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
	
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class JMSQueuesXML {
		@XmlElement(name="queue")
		private List<JMSQueueXML> queues;

		public List<JMSQueueXML> getQueues() {
			return queues;
		}
		public void setQueues(List<JMSQueueXML> queues) {
			this.queues = queues;
		}
	}
	
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class JMSQueueXML {
		private String name;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}	
