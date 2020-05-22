package hamy.test.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="simple-object")
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleObject {
	private String foo;
	private double boo;
	@XmlTransient
	private String hidden;
	
	public SimpleObject() {
		System.out.println("SimpleObject() ...");
	} // For XML
	
	public SimpleObject(String foo, double boo, String hidden) {
		System.out.println("SimpleObject(foo, boo, hidden) ...");
		this.foo = foo;
		this.boo = boo;
		this.hidden = hidden;
	}

	public String getExtra() {
		System.out.println("SimpleObject.getExtra() ...");
		return "This is an extra value";
	}
	
	void setExtra(String extra) {
		System.out.println("SimpleObject.setExtra(extra) ...");
		
	}
}
