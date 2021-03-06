//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies a Delivery Point Reading Frequency as Daily or Non Daily
 * 
 * <p>Java class for MeterReadingFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterReadingFrequencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeterReadingFrequencyTypeCode" type="{urn:aseXML:r38}MeterReadingFrequencyTypeBase"/>
 *         &lt;element name="Description" type="{urn:aseXML:r38}Description" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadingFrequencyType", propOrder = {
    "meterReadingFrequencyTypeCode",
    "description"
})
public class MeterReadingFrequencyType {

    @XmlElement(name = "MeterReadingFrequencyTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected MeterReadingFrequencyTypeBase meterReadingFrequencyTypeCode;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the meterReadingFrequencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingFrequencyTypeBase }
     *     
     */
    public MeterReadingFrequencyTypeBase getMeterReadingFrequencyTypeCode() {
        return meterReadingFrequencyTypeCode;
    }

    /**
     * Sets the value of the meterReadingFrequencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingFrequencyTypeBase }
     *     
     */
    public void setMeterReadingFrequencyTypeCode(MeterReadingFrequencyTypeBase value) {
        this.meterReadingFrequencyTypeCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
