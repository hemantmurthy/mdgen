//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Acknowledge a received transaction
 * Detail - For every transaction, a transaction acknowledgment is generated.
 * 
 * Any errors are reported via Event elements.
 * 
 * If a transaction is rejected, no receipt identifier need be provided with the acknowledgement.
 * 	
 * 
 * <p>Java class for TransactionAcknowledgement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionAcknowledgement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="initiatingTransactionID" use="required" type="{urn:aseXML:r38}TransactionIdentifier" />
 *       &lt;attribute name="receiptID" type="{urn:aseXML:r38}ReceiptIdentifier" />
 *       &lt;attribute name="receiptDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" use="required" type="{urn:aseXML:r38}TransactionStatus" />
 *       &lt;attribute name="duplicate" type="{urn:aseXML:r38}YesNo" default="No" />
 *       &lt;attribute name="acceptedCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAcknowledgement", propOrder = {
    "event"
})
public class TransactionAcknowledgement {

    @XmlElement(name = "Event")
    protected List<Event> event;
    @XmlAttribute(name = "initiatingTransactionID", required = true)
    protected String initiatingTransactionID;
    @XmlAttribute(name = "receiptID")
    protected String receiptID;
    @XmlAttribute(name = "receiptDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlAttribute(name = "status", required = true)
    protected TransactionStatus status;
    @XmlAttribute(name = "duplicate")
    protected YesNo duplicate;
    @XmlAttribute(name = "acceptedCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger acceptedCount;

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
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
     * Gets the value of the receiptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptID() {
        return receiptID;
    }

    /**
     * Sets the value of the receiptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptID(String value) {
        this.receiptID = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setStatus(TransactionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the duplicate property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDuplicate() {
        if (duplicate == null) {
            return YesNo.NO;
        } else {
            return duplicate;
        }
    }

    /**
     * Sets the value of the duplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDuplicate(YesNo value) {
        this.duplicate = value;
    }

    /**
     * Gets the value of the acceptedCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcceptedCount() {
        return acceptedCount;
    }

    /**
     * Sets the value of the acceptedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcceptedCount(BigInteger value) {
        this.acceptedCount = value;
    }

}
