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
 * 
 * Purpose - Define an Australian telephone service number
 * Detail - This format follows AS4590. 
 * 
 * 
 * <p>Java class for AustralianPhoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AustralianPhoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prefix" type="{urn:aseXML:r38}AustralianTelephonePrefix"/>
 *         &lt;element name="Number" type="{urn:aseXML:r38}AustralianTelephoneNumber"/>
 *         &lt;element name="ServiceComment" type="{urn:aseXML:r38}AustralianTelephoneServiceComment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="serviceType" use="required" type="{urn:aseXML:r38}AustralianTelephoneServiceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AustralianPhoneNumber", propOrder = {
    "prefix",
    "number",
    "serviceComment"
})
public class AustralianPhoneNumber {

    @XmlElement(name = "Prefix", required = true)
    protected String prefix;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "ServiceComment")
    protected String serviceComment;
    @XmlAttribute(name = "serviceType", required = true)
    protected AustralianTelephoneServiceType serviceType;

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the serviceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceComment() {
        return serviceComment;
    }

    /**
     * Sets the value of the serviceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceComment(String value) {
        this.serviceComment = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianTelephoneServiceType }
     *     
     */
    public AustralianTelephoneServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianTelephoneServiceType }
     *     
     */
    public void setServiceType(AustralianTelephoneServiceType value) {
        this.serviceType = value;
    }

}
