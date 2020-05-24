package hamy.mdgen.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

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

	void setUrl(String url) { this.url = url; }
	void setUsername(String username) { this.username = username; }
	void setPassword(String password) { this.password = password; }
}
