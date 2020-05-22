package hamy.test.api;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="compound-object")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class CompoundPropertyObject {
	private String foo;
	private double boo;
	private String hidden;
	private String unexposed = "Initial Unexposed Value";
	//private InnerObject inner;
	private NestedPropertyObject nestedPropertyObject;
	private NestedObject nestedObject;
	private List<NestedObject> nestedObjects;
	
	public CompoundPropertyObject() {
		System.out.println("CompoundPropertyObject() ...");
	}
	
	public String getFoo() {
		System.out.println("CompoundPropertyObject.getFoo() ...");
		return foo;
	}

	void setFoo(String foo) {
		System.out.println("CompoundPropertyObject.setFoo(foo) ...");
		this.foo = foo;
	}

	public double getBoo() {
		System.out.println("CompoundPropertyObject.getBoo() ...");
		return boo;
	}

	void setBoo(double boo) {
		System.out.println("CompoundPropertyObject.setBoo(boo) ...");
		this.boo = boo;
	}

	@XmlTransient
	public String getHidden() {
		System.out.println("CompoundPropertyObject.getHidden() ...");
		return hidden;
	}

	@XmlTransient
	void setHidden(String hidden) {
		this.hidden = hidden;
	}
	
	public String getExtra() {
		System.out.println("CompoundPropertyObject.getExtra() ...");
		return "This is an extra value";
	}
	
	void setExtra(String extra) {
	}

	/*public InnerObject getInner() {
		System.out.println("CompoundPropertyObject.getInner() ...");
		return inner;
	}

	void setInner(InnerObject inner) {
		this.inner = inner;
	}*/

	@XmlElement(name="nested-property-object")
	public NestedPropertyObject getNestedPropertyObject() {
		System.out.println("CompoundPropertyObject.getNestedPropertyObject() ...");
		return nestedPropertyObject;
	}

	@XmlElement(name="nested-property-object")
	void setNestedPropertyObject(NestedPropertyObject nestedPropertyObject) {
		this.nestedPropertyObject = nestedPropertyObject;
	}

	@XmlElement(name="nested-object")
	public NestedObject getNestedObject() {
		System.out.println("CompoundPropertyObject.getNestedObject() ...");
		return nestedObject;
	}

	@XmlElement(name="nested-object")
	void setNestedObject(NestedObject nestedObject) {
		this.nestedObject = nestedObject;
	}

	@XmlElement(name="nested-objects")
	public List<NestedObject> getNestedObjects() {
		System.out.println("CompoundPropertyObject.getNestedObjects() ...");
		return nestedObjects;
	}

	@XmlElement(name="nested-objects")
	void setNestedObjects(List<NestedObject> nestedObjects) {
		this.nestedObjects = nestedObjects;
	}
	/*
	@XmlRootElement
	@XmlAccessorType(XmlAccessType.PROPERTY)
	public class InnerObject {
		private String goo;
		private String loo;
		private String hidden;
		
		public InnerObject() {
			System.out.println("InnerObject() ...");
		}

		public String getGoo() {
			System.out.println("InnerObject.getGoo() ...");
			return goo;
		}

		void setGoo(String goo) {
			this.goo = goo;
		}

		public String getLoo() {
			System.out.println("InnerObject.getLoo() ...");
			return loo;
		}

		void setLoo(String loo) {
			this.loo = loo;
		}

		@XmlTransient
		public String getHidden() {
			System.out.println("InnerObject.getHidden() ...");
			return hidden;
		}

		@XmlTransient
		void setHidden(String hidden) {
			this.hidden = hidden;
		}
	}*/
	
}
