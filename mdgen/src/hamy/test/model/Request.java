package hamy.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A simple request object for the test application
 * @author hmurt
 *
 */
@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
public class Request {
	private String id;
	private List<Prop> props;

	
	public static class Prop {
		private String name;

		public Prop() {
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
	}
	
	public Request() {
		this.props = new ArrayList<Request.Prop>();
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void addProp(String name) {
		Prop p = new Prop();
		p.setName(name);
		props.add(p);
	}
}
