package hamy.test.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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
