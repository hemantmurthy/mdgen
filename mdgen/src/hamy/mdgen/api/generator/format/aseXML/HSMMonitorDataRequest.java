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
 * <p>Java class for HSMMonitorDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HSMMonitorDataRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestData" type="{urn:aseXML:r38}HSMMonitorDataRequestData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r21" default="r21" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMMonitorDataRequest", propOrder = {
    "requestData"
})
public class HSMMonitorDataRequest {

    @XmlElement(name = "RequestData", required = true)
    protected HSMMonitorDataRequestData requestData;
    @XmlAttribute(name = "version")
    protected R21 version;

    /**
     * Gets the value of the requestData property.
     * 
     * @return
     *     possible object is
     *     {@link HSMMonitorDataRequestData }
     *     
     */
    public HSMMonitorDataRequestData getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMMonitorDataRequestData }
     *     
     */
    public void setRequestData(HSMMonitorDataRequestData value) {
        this.requestData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R21 }
     *     
     */
    public R21 getVersion() {
        if (version == null) {
            return R21 .R_21;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R21 }
     *     
     */
    public void setVersion(R21 value) {
        this.version = value;
    }

}
