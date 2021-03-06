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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Row of the CATS Change Response table
 * MSATS Data Model Table - CATS_Outbound_Change_Requests
 * Replication Table Name - CATSChangeResponses
 * 			
 * 
 * <p>Java class for CATSChangeResponseRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATSChangeResponseRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}ReplicationBaseRow">
 *       &lt;sequence>
 *         &lt;element name="RequestID" type="{urn:aseXML:r38}CATSRequestIdentifier"/>
 *         &lt;element name="NMI" type="{urn:aseXML:r38}NMIBase"/>
 *         &lt;element name="Participant" type="{urn:aseXML:r38}PartyIdentifier"/>
 *         &lt;element name="InitiatingTransactionID" type="{urn:aseXML:r38}TransactionIdentifier"/>
 *         &lt;element name="TransactionID" type="{urn:aseXML:r38}TransactionIdentifier"/>
 *         &lt;element name="Status" type="{urn:aseXML:r38}AcceptReject"/>
 *         &lt;element name="TransactionTypeCode" type="{urn:aseXML:r38}CATSTransactionTypeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r29" default="r29" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSChangeResponseRow", propOrder = {
    "requestID",
    "nmi",
    "participant",
    "initiatingTransactionID",
    "transactionID",
    "status",
    "transactionTypeCode"
})
public class CATSChangeResponseRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "positiveInteger")
    protected long requestID;
    @XmlElement(name = "NMI", required = true)
    protected String nmi;
    @XmlElement(name = "Participant", required = true)
    protected PartyIdentifier participant;
    @XmlElement(name = "InitiatingTransactionID", required = true)
    protected String initiatingTransactionID;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected AcceptReject status;
    @XmlElement(name = "TransactionTypeCode")
    protected String transactionTypeCode;
    @XmlAttribute(name = "version")
    protected R29 version;

    /**
     * Gets the value of the requestID property.
     * 
     */
    public long getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     */
    public void setRequestID(long value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMI(String value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setParticipant(PartyIdentifier value) {
        this.participant = value;
    }

    /**
     * Gets the value of the initiatingTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingTransactionID() {
        return initiatingTransactionID;
    }

    /**
     * Sets the value of the initiatingTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingTransactionID(String value) {
        this.initiatingTransactionID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptReject }
     *     
     */
    public AcceptReject getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptReject }
     *     
     */
    public void setStatus(AcceptReject value) {
        this.status = value;
    }

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeCode(String value) {
        this.transactionTypeCode = value;
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
