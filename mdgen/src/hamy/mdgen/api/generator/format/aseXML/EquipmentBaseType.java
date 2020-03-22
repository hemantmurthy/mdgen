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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The base type for all nos equipment
 * 
 * <p>Java class for EquipmentBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyElementId" type="{urn:aseXML:r38}CompanyElementIdType"/>
 *         &lt;element name="CompanyElementName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CommissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RetirementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NEMMCOName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidatedBy" type="{urn:aseXML:r38}NOSUserIdType" minOccurs="0"/>
 *         &lt;element name="TNSPId" type="{urn:aseXML:r38}PartyIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operationType" type="{urn:aseXML:r38}NOSOperationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentBaseType", propOrder = {
    "companyElementId",
    "companyElementName",
    "commissionDate",
    "retirementDate",
    "nemmcoName",
    "validatedBy",
    "tnspId"
})
@XmlSeeAlso({
    NOSStationType.class,
    NOSEquipmentType.class
})
public abstract class EquipmentBaseType {

    @XmlElement(name = "CompanyElementId", required = true)
    protected String companyElementId;
    @XmlElement(name = "CompanyElementName")
    protected String companyElementName;
    @XmlElement(name = "CommissionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commissionDate;
    @XmlElement(name = "RetirementDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retirementDate;
    @XmlElement(name = "NEMMCOName")
    protected String nemmcoName;
    @XmlElement(name = "ValidatedBy")
    protected String validatedBy;
    @XmlElement(name = "TNSPId")
    protected PartyIdentifier tnspId;
    @XmlAttribute(name = "operationType")
    protected NOSOperationType operationType;

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
     * Gets the value of the companyElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyElementName() {
        return companyElementName;
    }

    /**
     * Sets the value of the companyElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyElementName(String value) {
        this.companyElementName = value;
    }

    /**
     * Gets the value of the commissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissionDate() {
        return commissionDate;
    }

    /**
     * Sets the value of the commissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommissionDate(XMLGregorianCalendar value) {
        this.commissionDate = value;
    }

    /**
     * Gets the value of the retirementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetirementDate() {
        return retirementDate;
    }

    /**
     * Sets the value of the retirementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetirementDate(XMLGregorianCalendar value) {
        this.retirementDate = value;
    }

    /**
     * Gets the value of the nemmcoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEMMCOName() {
        return nemmcoName;
    }

    /**
     * Sets the value of the nemmcoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEMMCOName(String value) {
        this.nemmcoName = value;
    }

    /**
     * Gets the value of the validatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatedBy() {
        return validatedBy;
    }

    /**
     * Sets the value of the validatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatedBy(String value) {
        this.validatedBy = value;
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

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link NOSOperationType }
     *     
     */
    public NOSOperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOSOperationType }
     *     
     */
    public void setOperationType(NOSOperationType value) {
        this.operationType = value;
    }

}
