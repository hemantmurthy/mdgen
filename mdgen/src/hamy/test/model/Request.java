package hamy.test.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

/**
 * A simple request object for the test application
 * @author hmurt
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="request")
@XmlSeeAlso({EnhancedRequest.class})
//@XmlDiscriminatorNode("@type")
public class Request {
	private String id;
	private List<Prop> props;
	
	public Request() {}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public List<Prop> getProps() {
		return props;
	}
	public void setProps(List<Prop> props) {
		this.props = props;
	}
	
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
}
