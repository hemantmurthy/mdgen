package hamy.test.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;

public class TestJSON {
	public static void main(String[] args) {
		EnhancedRequest er = new EnhancedRequest();
		
		er.setId("12345");
		List<Request.Prop> props = new ArrayList<>();
		Request.Prop p = new Request.Prop();
		p.setName("Prop 1");
		props.add(p);
		
		p = new Request.Prop();
		p.setName("Prop 2");
		props.add(p);
		
		er.setProps(props);
		er.setAdditionalValue("Extra Value");
		
		marshall(er);
		System.out.println("");
		EnhancedRequest r = unmarshall();
		marshall(r);
	}
	
	static void marshall(Request er) {
		try {
			JAXBContext jc = JAXBContext.newInstance(EnhancedRequest.class);
			Marshaller m = jc.createMarshaller();
			m.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
			m.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, false);
			m.marshal(er, System.out);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	static EnhancedRequest unmarshall() {
		try {
			JAXBContext jc = JAXBContext.newInstance(EnhancedRequest.class);
			Unmarshaller u = jc.createUnmarshaller();
			u.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
			u.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, false);
			JAXBElement<EnhancedRequest> e = (JAXBElement<EnhancedRequest>) u.unmarshal(new File("C:\\gitrepo\\mdgen\\mdgen\\src\\hamy\\test\\model\\test.json"));
			return e.getValue();
		} catch (JAXBException ex) {
			ex.printStackTrace();
			return null;
		}
		
	}
}
