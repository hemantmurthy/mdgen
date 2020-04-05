package hamy.mdgen.api.generator.base;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="generators")
@XmlAccessorType (XmlAccessType.FIELD)
public class GeneratorList {
	@XmlElement(name="generators")
	private List<GeneratorStatus> generators = new ArrayList<GeneratorStatus>();

	public List<GeneratorStatus> getGenerators() {
		return generators;
	}
	public void setGenerators(List<GeneratorStatus> generators) {
		this.generators = generators;
	}

	@XmlRootElement(name="generator")
	public static class GeneratorStatus {
		private String id;
		private String status;
		
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
	}
	
}
