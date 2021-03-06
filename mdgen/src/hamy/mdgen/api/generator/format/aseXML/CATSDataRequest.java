//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Application - Customer Transfer
 * TransactionExchange - CATS Data Request
 * TransactionGroup - CATS
 * Priority - Medium
 * Purpose - Request the provision of a subset of the standing data for a NMI
 * 			
 * 
 * <p>Java class for CATSDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATSDataRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{urn:aseXML:r38}RoleIdentifier"/>
 *         &lt;element name="RoleStatus" type="{urn:aseXML:r38}CATSRoleStatus"/>
 *         &lt;element name="InitiatingRequestID" type="{urn:aseXML:r38}CATSRequestIdentifier"/>
 *         &lt;element name="ActualChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NMIStandingData" type="{urn:aseXML:r38}NMIStandingData"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r29" default="r29" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSDataRequest", propOrder = {
    "role",
    "roleStatus",
    "initiatingRequestID",
    "actualChangeDate",
    "nmiStandingData"
})
public class CATSDataRequest {

    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "RoleStatus", required = true)
    @XmlSchemaType(name = "string")
    protected CATSRoleStatus roleStatus;
    @XmlElement(name = "InitiatingRequestID")
    @XmlSchemaType(name = "positiveInteger")
    protected long initiatingRequestID;
    @XmlElementRef(name = "ActualChangeDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualChangeDate;
    @XmlElement(name = "NMIStandingData", required = true)
    protected NMIStandingData nmiStandingData;
    @XmlAttribute(name = "version")
    protected R29 version;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the roleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CATSRoleStatus }
     *     
     */
    public CATSRoleStatus getRoleStatus() {
        return roleStatus;
    }

    /**
     * Sets the value of the roleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSRoleStatus }
     *     
     */
    public void setRoleStatus(CATSRoleStatus value) {
        this.roleStatus = value;
    }

    /**
     * Gets the value of the initiatingRequestID property.
     * 
     */
    public long getInitiatingRequestID() {
        return initiatingRequestID;
    }

    /**
     * Sets the value of the initiatingRequestID property.
     * 
     */
    public void setInitiatingRequestID(long value) {
        this.initiatingRequestID = value;
    }

    /**
     * Gets the value of the actualChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualChangeDate() {
        return actualChangeDate;
    }

    /**
     * Sets the value of the actualChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualChangeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualChangeDate = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R29 }
     *     
     */
    public R29 getVersion() {
        if (version == null) {
            return R29 .R_29;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R29 }
     *     
     */
    public void setVersion(R29 value) {
        this.version = value;
    }

}
