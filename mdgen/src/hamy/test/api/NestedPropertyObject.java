package hamy.test.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class NestedPropertyObject {
	private String yak;
	private String bull;
	private String hidden;
	private String unexposed = "Initial Unexposed Value";
	
	public NestedPropertyObject() {
		System.out.println("NestedPropertyObject() ...");
	}

	public String getYak() {
		System.out.println("NestedPropertyObject.getYak() ...");
		return yak;
	}

	void setYak(String yak) {
		this.yak = yak;
	}

	public String getBull() {
		System.out.println("NestedPropertyObject.getBull() ...");
		return bull;
	}

	void setBull(String bull) {
		this.bull = bull;
	}

	@XmlTransient
	public String getHidden() {
		System.out.println("NestedPropertyObject.getHidden() ...");
		return hidden;
	}
	
	@XmlTransient
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public String getExtra() {
		System.out.println("NestedPropertyObject.getExtra() ...");
		return "This is an extra value";
	}
	
	void setExtra(String extra) {
	}

}
