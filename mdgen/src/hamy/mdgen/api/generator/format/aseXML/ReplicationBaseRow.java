//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Base type for all table row definitions
 * Detail - Any table to be replicated must support these fields. Sequence numbers provide a way to request table rows in chunks, with the last sequence number seen in one ReplicationNotification providing an input to the ReplicationRequest of the next.
 * 			
 * 
 * <p>Java class for ReplicationBaseRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplicationBaseRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{urn:aseXML:r38}ReplicationSequenceNumber"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MaintenanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RowStatus" type="{urn:aseXML:r38}ActiveInactive"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationBaseRow", propOrder = {
    "sequenceNumber",
    "creationDate",
    "maintenanceDate",
    "rowStatus",
    "userID"
})
@XmlSeeAlso({
    NationalCalendarRow.class,
    CATSNotificationRow.class,
    ElectricityCATSChangeRequestNMIDataStreamRow.class,
    CATSErrorsRow.class,
    CATSDataRequestRow.class,
    ElectricityCATSChangeRequestNMIMeterRow.class,
    CATSChangeRequestRow.class,
    ElectricityCATSChangeRequestNMIMeterRegisterRow.class,
    ElectricityCATSChangeRequestNMIRoleRow.class,
    CATSObjectionRow.class,
    ElectricityCATSChangeRequestNMIMasterRow.class,
    MSATSCodeValuesRow.class,
    CATSObjectionResponseRow.class,
    NMIRangesRow.class,
    ReplicationDateRangeRow.class,
    CATSChangeResponseRow.class
})
public abstract class ReplicationBaseRow {

    @XmlElement(name = "SequenceNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "MaintenanceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maintenanceDate;
    @XmlElement(name = "RowStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ActiveInactive rowStatus;
    @XmlElement(name = "UserID")
    protected String userID;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the maintenanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintenanceDate() {
        return maintenanceDate;
    }

    /**
     * Sets the value of the maintenanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintenanceDate(XMLGregorianCalendar value) {
        this.maintenanceDate = value;
    }

    /**
     * Gets the value of the rowStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveInactive }
     *     
     */
    public ActiveInactive getRowStatus() {
        return rowStatus;
    }

    /**
     * Sets the value of the rowStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveInactive }
     *     
     */
    public void setRowStatus(ActiveInactive value) {
        this.rowStatus = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
