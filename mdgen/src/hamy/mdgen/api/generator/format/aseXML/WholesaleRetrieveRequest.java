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
 * <p>Java class for WholesaleRetrieveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WholesaleRetrieveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RetrieveRequestData" type="{urn:aseXML:r38}WholesaleRetrieveRequestData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r20" default="r20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesaleRetrieveRequest", propOrder = {
    "retrieveRequestData"
})
public class WholesaleRetrieveRequest {

    @XmlElement(name = "RetrieveRequestData", required = true)
    protected WholesaleRetrieveRequestData retrieveRequestData;
    @XmlAttribute(name = "version")
    protected R20 version;

    /**
     * Gets the value of the retrieveRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link WholesaleRetrieveRequestData }
     *     
     */
    public WholesaleRetrieveRequestData getRetrieveRequestData() {
        return retrieveRequestData;
    }

    /**
     * Sets the value of the retrieveRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesaleRetrieveRequestData }
     *     
     */
    public void setRetrieveRequestData(WholesaleRetrieveRequestData value) {
        this.retrieveRequestData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R20 }
     *     
     */
    public R20 getVersion() {
        if (version == null) {
            return R20 .R_20;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R20 }
     *     
     */
    public void setVersion(R20 value) {
        this.version = value;
    }

}
