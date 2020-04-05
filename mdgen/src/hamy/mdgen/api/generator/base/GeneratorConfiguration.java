package hamy.mdgen.api.generator.base;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;


@XmlRootElement(name="generator-configuration")
@XmlAccessorType (XmlAccessType.FIELD)
public class GeneratorConfiguration {
	@XmlElement(name="uom-conversions")
	private UomConversions uomConversions;
	
	public UomConversions getUomConversions() {
		return uomConversions;
	}
	public void setUomConversions(UomConversions uomConversions) {
		this.uomConversions = uomConversions;
	}

	@XmlAccessorType (XmlAccessType.FIELD)
	public static class UomConversions {
		@XmlElement(name="from")
		private List<UomConversion> convertUoms;

		public List<UomConversion> getConvertUoms() {
			return convertUoms;
		}
		public void setConvertUoms(List<UomConversion> convertUoms) {
			this.convertUoms = convertUoms;
		}
	}
	
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class UomConversion {
		@XmlAttribute
		private String uom;
		
		@XmlElement(name="to")
		private List<ToUom> toUoms;
		
		public String getUom() {
			return uom;
		}
		public void setUom(String uom) {
			this.uom = uom;
		}
		public List<ToUom> getToUoms() {
			return toUoms;
		}
		public void setToUoms(List<ToUom> toUom) {
			this.toUoms = toUom;
		}
	}
	
	@XmlAccessorType (XmlAccessType.FIELD)
	public static class ToUom {
		@XmlAttribute
		private String uom;
		
		@XmlValue
		private double multiplier;

		public String getUom() {
			return uom;
		}
		public void setUom(String uom) {
			this.uom = uom;
		}
		public double getMultiplier() {
			return multiplier;
		}
		public void setMultiplier(double value) {
			this.multiplier = value;
		}
	}

	public static void main(String[] a) {
		GeneratorConfiguration gc = new GeneratorConfiguration();
		
		UomConversions ucs = new UomConversions();
		
		List<ToUom> tus = new ArrayList<>();
		ToUom tu = new ToUom(); tu.setUom("WH"); tu.setMultiplier(1000.0); tus.add(tu);
		tu = new ToUom(); tu.setUom("VARH"); tu.setMultiplier(1000.0); tus.add(tu);
		tu = new ToUom(); tu.setUom("W"); tu.setMultiplier(1000.0); tus.add(tu);
		tu = new ToUom(); tu.setUom("VAR"); tu.setMultiplier(1000.0); tus.add(tu);
		
		List<UomConversion> ucsl = new ArrayList<>();
		UomConversion uc = new UomConversion();	uc.setUom("KWH"); uc.setToUoms(tus); ucsl.add(uc);
		uc = new UomConversion();	uc.setUom("KW"); uc.setToUoms(tus); ucsl.add(uc);
		uc = new UomConversion();	uc.setUom("KVAR"); uc.setToUoms(tus); ucsl.add(uc);
		uc = new UomConversion();	uc.setUom("KVARH"); uc.setToUoms(tus); ucsl.add(uc);
		
		ucs.setConvertUoms(ucsl);
		gc.setUomConversions(ucs);
		
		try {
			JAXBContext jc = JAXBContext.newInstance(GeneratorConfiguration.class);
			Marshaller m = jc.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(gc, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}