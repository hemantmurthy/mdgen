package hamy.test.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class NestedObject {
	private String yak;
	private String bull;
	@XmlTransient
	private String hidden;
	private String unexposed = "Initial Unexposed Value";
	
	public NestedObject() {
		System.out.println("NestedObject() ...");
	}

	/*public String getYak() {
		System.out.println("NestedObject.getYak() ...");
		return yak;
	}*/

	void setYak(String yak) {
		this.yak = yak;
	}

	/*public String getBull() {
		System.out.println("NestedObject.getBull() ...");
		return bull;
	}*/

	void setBull(String bull) {
		this.bull = bull;
	}
	
	/*public String getHidden() {
		System.out.println("NestedObject.getHidden() ...");
		return hidden;
	}*/
	
	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	public String getExtra() {
		System.out.println("NestedObject.getExtra() ...");
		return "This is an extra value";
	}
	
	void setExtra(String extra) {
	}
}
