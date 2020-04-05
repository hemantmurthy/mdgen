package hamy.mdgen.api.generator.base;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="generator-output")
public class GeneratorOutput {
	private String id;
	private String status;
	private GeneratorInput input;
	
	public GeneratorOutput() {}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GeneratorInput getInput() {
		return input;
	}

	public void setInput(GeneratorInput input) {
		this.input = input;
	}
}
