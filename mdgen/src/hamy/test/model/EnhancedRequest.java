package hamy.test.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="enhancedRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnhancedRequest extends Request {
	private String additionalValue;
	
	public EnhancedRequest() {}
	
	public String getAdditionalValue() {
		return additionalValue;
	}

	public void setAdditionalValue(String additionalValue) {
		this.additionalValue = additionalValue;
	}
}
