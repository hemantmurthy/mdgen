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
 * <p>Java class for WholesaleSubmitRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WholesaleSubmitRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubmitRequestData" type="{urn:aseXML:r38}WholesaleSubmitRequestData"/>
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
@XmlType(name = "WholesaleSubmitRequest", propOrder = {
    "submitRequestData"
})
public class WholesaleSubmitRequest {

    @XmlElement(name = "SubmitRequestData", required = true)
    protected WholesaleSubmitRequestData submitRequestData;
    @XmlAttribute(name = "version")
    protected R20 version;

    /**
     * Gets the value of the submitRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link WholesaleSubmitRequestData }
     *     
     */
    public WholesaleSubmitRequestData getSubmitRequestData() {
        return submitRequestData;
    }

    /**
     * Sets the value of the submitRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesaleSubmitRequestData }
     *     
     */
    public void setSubmitRequestData(WholesaleSubmitRequestData value) {
        this.submitRequestData = value;
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
