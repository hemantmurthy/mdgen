package hamy.test.api;

import java.util.ArrayList;
import java.util.List;

public class BaseResource {
	
	protected SimpleObject getSimpleObject() {
		System.out.println("Building result ...");
		SimpleObject obj = new SimpleObject("Foo value", 3.141, "Hidden value");
		System.out.println("Returning result ...");
		return obj;
	}
	
	protected SimplePropertyObject getSimplePropertyObject() {
		System.out.println("Building result ...");
		SimplePropertyObject obj = new SimplePropertyObject("Foo value", 3.141, "Hidden value");
		System.out.println("Returning result ...");
		return obj;
	}
	
	protected CompoundPropertyObject getCompundPropertyObject() {
		System.out.println("Building result ...");
		CompoundPropertyObject obj = new CompoundPropertyObject();
		obj.setFoo("Foo Value");
		obj.setBoo(3.141);
		obj.setHidden("Hidden Value");
		
		/*CompoundObject.InnerObject inner = obj.new InnerObject();
		inner.setGoo("Goo Value");
		inner.setLoo("Loo Value");
		inner.setHidden("Hidden Value");
		obj.setInner(inner);*/
		
		NestedPropertyObject nestedPropertyObject = new NestedPropertyObject();
		nestedPropertyObject.setBull("Bull Value");
		nestedPropertyObject.setYak("Yak Value");
		obj.setNestedPropertyObject(nestedPropertyObject);
		
		NestedObject nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value");
		nestedObject.setYak("Yak Value");
		obj.setNestedObject(nestedObject);

		List<NestedObject> nestedObjects = new ArrayList<>();
		nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value 1");
		nestedObject.setYak("Yak Value 1");
		nestedObjects.add(nestedObject);

		nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value 2");
		nestedObject.setYak("Yak Value 2");
		nestedObjects.add(nestedObject);

		nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value 3");
		nestedObject.setYak("Yak Value 3");
		nestedObjects.add(nestedObject);

		obj.setNestedObjects(nestedObjects);
		
		System.out.println("Returning result ...");
		return obj;
	}
	
	protected CompoundObject getCompundObject() {
		System.out.println("Building result ...");
		CompoundObject obj = new CompoundObject();
		obj.setFoo("Foo Value");
		obj.setBoo(3.141);
		obj.setHidden("Hidden Value");
		
		/*CompoundObject.InnerObject inner = obj.new InnerObject();
		inner.setGoo("Goo Value");
		inner.setLoo("Loo Value");
		inner.setHidden("Hidden Value");
		obj.setInner(inner);*/
		
		NestedPropertyObject nestedPropertyObject = new NestedPropertyObject();
		nestedPropertyObject.setBull("Bull Value");
		nestedPropertyObject.setYak("Yak Value");
		obj.setNestedPropertyObject(nestedPropertyObject);
		
		NestedObject nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value");
		nestedObject.setYak("Yak Value");
		obj.setNestedObject(nestedObject);
		
		List<NestedObject> nestedObjects = new ArrayList<>();
		nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value 1");
		nestedObject.setYak("Yak Value 1");
		nestedObjects.add(nestedObject);

		nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value 2");
		nestedObject.setYak("Yak Value 2");
		nestedObjects.add(nestedObject);

		nestedObject = new NestedObject();
		nestedObject.setBull("Bull Value 3");
		nestedObject.setYak("Yak Value 3");
		nestedObjects.add(nestedObject);
		
		obj.setNestedObjects(nestedObjects);
		
		System.out.println("Returning result ...");
		return obj;
	}

}
