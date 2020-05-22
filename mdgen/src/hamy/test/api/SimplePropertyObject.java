package hamy.test.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="simple-object")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class SimplePropertyObject {
	private String foo;
	private double boo;
	private String hidden;
	private String unexposed;
	
	public SimplePropertyObject() {
		System.out.println("SimplePropertyObject() ...");
	} // For XML ...
	
	public SimplePropertyObject(String foo, double boo, String hidden) {
		System.out.println("SimplePropertyObject(foo, boo, hidden) ...");
		this.foo = foo;
		this.boo = boo;
		this.hidden = hidden;
		this.unexposed = "I have an unexposed value";
	}
	

	public String getFoo() {
		System.out.println("SimpleObject.getFoo() ...");
		return foo;
	}

	void setFoo(String foo) {
		System.out.println("SimpleObject.setFoo(foo) ...");
		this.foo = foo;
	}

	public double getBoo() {
		System.out.println("SimpleObject.getBoo() ...");
		return boo;
	}

	void setBoo(double boo) {
		System.out.println("SimpleObject.setBoo(boo) ...");
		this.boo = boo;
	}

	@XmlTransient
	public String getHidden() {
		System.out.println("SimpleObject.getHidden() ...");
		return hidden;
	}

	@XmlTransient
	void setHidden(String hidden) {
		System.out.println("SimpleObject.setHidden(hidden) ...");
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
