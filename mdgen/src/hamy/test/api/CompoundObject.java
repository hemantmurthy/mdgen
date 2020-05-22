package hamy.test.api;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="compound-object")
@XmlAccessorType(XmlAccessType.FIELD)
public class CompoundObject {
	private String foo;
	private double boo;
	@XmlTransient
	private String hidden;
	private String unexposed = "Initial Unexposed Value";
	//@XmlElement(name="inner-object")
	//private InnerObject inner;
	@XmlElement(name="nested-property-object")
	private NestedPropertyObject nestedPropertyObject;
	@XmlElement(name="nested-object")
	private NestedObject nestedObject;
	
	@XmlElement(name="nested-objects")
	private List<NestedObject> nestedObjects;
	
	public CompoundObject() {
		System.out.println("CompoundObject() ...");
	}
	
	/*public String getFoo() {
		System.out.println("CompoundObject.getFoo() ...");
		return foo;
	}*/

	void setFoo(String foo) {
		System.out.println("CompoundObject.setFoo(foo) ...");
		this.foo = foo;
	}

	/*public double getBoo() {
		System.out.println("CompoundObject.getBoo() ...");
		return boo;
	}*/

	void setBoo(double boo) {
		System.out.println("CompoundObject.setBoo(boo) ...");
		this.boo = boo;
	}

	/*public String getHidden() {
		System.out.println("CompoundObject.getHidden() ...");
		return hidden;
	}*/

	void setHidden(String hidden) {
		this.hidden = hidden;
	}
	
	public String getExtra() {
		System.out.println("CompoundObject.getExtra() ...");
		return "This is an extra value";
	}
	
	void setExtra(String extra) {
	}

	/*public InnerObject getInner() {
		System.out.println("CompoundObject.getInner() ...");
		return inner;
	}*/

	//void setInner(InnerObject inner) {
	//	this.inner = inner;
	//}

	/*public NestedPropertyObject getNestedPropertyObject() {
		System.out.println("CompoundObject.getNestedPropertyObject() ...");
		return nestedPropertyObject;
	}*/

	void setNestedPropertyObject(NestedPropertyObject nestedPropertyObject) {
		this.nestedPropertyObject = nestedPropertyObject;
	}

	/*public NestedObject getNestedObject() {
		System.out.println("CompoundObject.getNestedObject() ...");
		return nestedObject;
	}*/

	void setNestedObject(NestedObject nestedObject) {
		this.nestedObject = nestedObject;
	}
	
	void setNestedObjects(List<NestedObject> nestedObjects) {
		this.nestedObjects = nestedObjects;
	}

	@XmlRootElement(name="inner")
	@XmlAccessorType(XmlAccessType.FIELD)
	public class InnerObject {
		private String goo;
		private String loo;
		@XmlTransient
		private String hidden;
		
		public InnerObject() {
			System.out.println("InnerObject() ...");
		}

		/*public String getGoo() {
			System.out.println("InnerObject.getGoo() ...");
			return goo;
		}*/

		void setGoo(String goo) {
			this.goo = goo;
		}

		/*public String getLoo() {
			System.out.println("InnerObject.getLoo() ...");
			return loo;
		}*/

		void setLoo(String loo) {
			this.loo = loo;
		}

		/*public String getHidden() {
			System.out.println("InnerObject.getHidden() ...");
			return hidden;
		}*/

		void setHidden(String hidden) {
			this.hidden = hidden;
		}
	}
	
}
