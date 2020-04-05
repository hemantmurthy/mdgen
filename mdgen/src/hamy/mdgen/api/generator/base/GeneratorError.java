package hamy.mdgen.api.generator.base;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="generator-error")
public class GeneratorError {
	private String errorMessage;
	private String fullErrorMessage;
	private GeneratorInput input;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getFullErrorMessage() {
		return fullErrorMessage;
	}
	public void setFullErrorMessage(String fullErrorMessage) {
		this.fullErrorMessage = fullErrorMessage;
	}
	public GeneratorInput getInput() {
		return input;
	}
	public void setInput(GeneratorInput input) {
		this.input = input;
	}
}
