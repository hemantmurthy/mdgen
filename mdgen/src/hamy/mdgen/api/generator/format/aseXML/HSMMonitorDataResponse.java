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
 * <p>Java class for HSMMonitorDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HSMMonitorDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{urn:aseXML:r38}HSMMonitorDataResponseData"/>
 *         &lt;element name="Event" type="{urn:aseXML:r38}Event"/>
 *       &lt;/sequence>
 *       &lt;attribute name="vendorSoftwareVersion" use="required" type="{urn:aseXML:r38}HSMVendorSoftwareVersion" />
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r26" default="r26" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMMonitorDataResponse", propOrder = {
    "responseData",
    "event"
})
public class HSMMonitorDataResponse {

    @XmlElement(name = "ResponseData", required = true)
    protected HSMMonitorDataResponseData responseData;
    @XmlElement(name = "Event", required = true)
    protected Event event;
    @XmlAttribute(name = "vendorSoftwareVersion", required = true)
    protected String vendorSoftwareVersion;
    @XmlAttribute(name = "version")
    protected R26 version;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link HSMMonitorDataResponseData }
     *     
     */
    public HSMMonitorDataResponseData getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMMonitorDataResponseData }
     *     
     */
    public void setResponseData(HSMMonitorDataResponseData value) {
        this.responseData = value;
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
     * Gets the value of the vendorSoftwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorSoftwareVersion() {
        return vendorSoftwareVersion;
    }

    /**
     * Sets the value of the vendorSoftwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorSoftwareVersion(String value) {
        this.vendorSoftwareVersion = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R26 }
     *     
     */
    public R26 getVersion() {
        if (version == null) {
            return R26 .R_26;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R26 }
     *     
     */
    public void setVersion(R26 value) {
        this.version = value;
    }

}
