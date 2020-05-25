package hamy.mdgen.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class JMSDestination {
	String url;
	String username;
	String password;
	List<String> queues = new ArrayList<>();
	
	public JMSDestination() {}

	public String getUrl() { return this.url; }
	public List<String> getQueues() { return this.queues; }
	@XmlTransient
	public String getUsername() { return this.username; }
	@XmlTransient
	public String getPassword() { return this.password; }
	public boolean isCredentialsRequired() {
		return this.username == null || this.username.trim() == "" || this.password == null || this.password == "";
	}
	
	void setUrl(String url) { this.url = url; }
	void setUsername(String username) { this.username = username; }
	void setPassword(String password) { this.password = password; }
	void setQueues(List<String> queues) { this.queues = queues; }
	void setCredentialsRequired(boolean value) {}
}
