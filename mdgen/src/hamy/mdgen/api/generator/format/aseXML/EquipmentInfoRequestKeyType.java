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
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a request for current information about an item of equipment
 * 
 * <p>Java class for EquipmentInfoRequestKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInfoRequestKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyElementId" type="{urn:aseXML:r38}CompanyElementIdType"/>
 *         &lt;element name="TNSPId" type="{urn:aseXML:r38}PartyIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInfoRequestKeyType", propOrder = {
    "companyElementId",
    "tnspId"
})
public class EquipmentInfoRequestKeyType {

    @XmlElement(name = "CompanyElementId", required = true)
    protected String companyElementId;
    @XmlElement(name = "TNSPId")
    protected PartyIdentifier tnspId;

    /**
     * Gets the value of the companyElementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyElementId() {
        return companyElementId;
    }

    /**
     * Sets the value of the companyElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyElementId(String value) {
        this.companyElementId = value;
    }

    /**
     * Gets the value of the tnspId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getTNSPId() {
        return tnspId;
    }

    /**
     * Sets the value of the tnspId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setTNSPId(PartyIdentifier value) {
        this.tnspId = value;
    }

}
