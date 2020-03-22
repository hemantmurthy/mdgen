//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * Purpose - National Metering Identifier with mandatory checksum
 * Detail - Used to identify electricity and gas metering points
 * 
 * 
 * <p>Java class for NMIWithChecksum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NMIWithChecksum">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:aseXML:r38>NMIBase">
 *       &lt;attribute name="checksum" use="required" type="{urn:aseXML:r38}NMIChecksum" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMIWithChecksum", propOrder = {
    "value"
})
public class NMIWithChecksum {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "checksum", required = true)
    protected int checksum;

    /**
     * 
     * Purpose - Helper type to assist in the definition of the NMI type
     * 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     */
    public int getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     */
    public void setChecksum(int value) {
        this.checksum = value;
    }

}
