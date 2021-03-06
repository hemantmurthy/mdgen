package hamy.mdgen.api.generator.imd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import hamy.mdgen.api.generator.base.GeneratorInput;

@XmlRootElement(name="input")
@XmlAccessorType (XmlAccessType.FIELD)
public class IMDViaXAIGeneratorInput
extends GeneratorInput {
	private String server;
	private String username;
	private String password;
	private int dispatcherPoolSize = 0;
	
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
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
	public int getDispatcherPoolSize() {
		return dispatcherPoolSize;
	}
	public void setDispatcherPoolSize(int dispatcherPoolSize) {
		this.dispatcherPoolSize = dispatcherPoolSize;
	}
}
