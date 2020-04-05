package hamy.mdgen.api.generator.nem12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import hamy.mdgen.api.generator.base.GeneratorInput;

@XmlRootElement(name="input")
@XmlAccessorType (XmlAccessType.FIELD)
public class NEM12AseXMLGeneratorInput 
extends GeneratorInput {
	private String mdp;
	private String targetParticipant;
	private String targetRole;

	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getTargetParticipant() {
		return targetParticipant;
	}
	public void setTargetParticipant(String targetParticipant) {
		this.targetParticipant = targetParticipant;
	}
	public String getTargetRole() {
		return targetRole;
	}
	public void setTargetRole(String targetRole) {
		this.targetRole = targetRole;
	}
}
