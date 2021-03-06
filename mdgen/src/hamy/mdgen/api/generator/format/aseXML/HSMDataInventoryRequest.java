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
 * <p>Java class for HSMDataInventoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HSMDataInventoryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestData" type="{urn:aseXML:r38}HSMDataInventoryRequestData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r26" default="r26" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMDataInventoryRequest", propOrder = {
    "requestData"
})
public class HSMDataInventoryRequest {

    @XmlElement(name = "RequestData", required = true)
    protected HSMDataInventoryRequestData requestData;
    @XmlAttribute(name = "version")
    protected R26 version;

    /**
     * Gets the value of the requestData property.
     * 
     * @return
     *     possible object is
     *     {@link HSMDataInventoryRequestData }
     *     
     */
    public HSMDataInventoryRequestData getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMDataInventoryRequestData }
     *     
     */
    public void setRequestData(HSMDataInventoryRequestData value) {
        this.requestData = value;
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
