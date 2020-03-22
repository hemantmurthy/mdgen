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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeterReadingReferenceDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterReadingReferenceDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeterReadingGroup" type="{urn:aseXML:r38}MeterReadingGroup"/>
 *         &lt;element name="NMIStandingData" type="{urn:aseXML:r38}NMIStandingData"/>
 *         &lt;element name="Event" type="{urn:aseXML:r38}Event" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r19" default="r19" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadingReferenceDataResponse", propOrder = {
    "meterReadingGroup",
    "nmiStandingData",
    "event"
})
public class MeterReadingReferenceDataResponse {

    @XmlElement(name = "MeterReadingGroup", required = true)
    protected MeterReadingGroup meterReadingGroup;
    @XmlElement(name = "NMIStandingData", required = true)
    protected NMIStandingData nmiStandingData;
    @XmlElement(name = "Event")
    protected Event event;
    @XmlAttribute(name = "version")
    protected R19 version;

    /**
     * Gets the value of the meterReadingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingGroup }
     *     
     */
    public MeterReadingGroup getMeterReadingGroup() {
        return meterReadingGroup;
    }

    /**
     * Sets the value of the meterReadingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingGroup }
     *     
     */
    public void setMeterReadingGroup(MeterReadingGroup value) {
        this.meterReadingGroup = value;
    }

    /**
     * Gets the value of the nmiStandingData property.
     * 
     * @return
     *     possible object is
     *     {@link NMIStandingData }
     *     
     */
    public NMIStandingData getNMIStandingData() {
        return nmiStandingData;
    }

    /**
     * Sets the value of the nmiStandingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIStandingData }
     *     
     */
    public void setNMIStandingData(NMIStandingData value) {
        this.nmiStandingData = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R19 }
     *     
     */
    public R19 getVersion() {
        if (version == null) {
            return R19 .R_19;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R19 }
     *     
     */
    public void setVersion(R19 value) {
        this.version = value;
    }

}
