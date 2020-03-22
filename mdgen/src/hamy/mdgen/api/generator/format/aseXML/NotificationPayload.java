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
 * Purpose � Provide the parent holder for payload content for based on aseXML instances.
 * 
 * <p>Java class for NotificationPayload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="TransactionNotified" type="{urn:aseXML:r38}Transaction"/>
 *           &lt;element name="TransAckNotified" type="{urn:aseXML:r38}TransactionAcknowledgement"/>
 *           &lt;element name="MsgAckNotified" type="{urn:aseXML:r38}MessageAcknowledgement"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationPayload", propOrder = {
    "transactionNotified",
    "transAckNotified",
    "msgAckNotified"
})
public class NotificationPayload {

    @XmlElement(name = "TransactionNotified")
    protected Transaction transactionNotified;
    @XmlElement(name = "TransAckNotified")
    protected TransactionAcknowledgement transAckNotified;
    @XmlElement(name = "MsgAckNotified")
    protected MessageAcknowledgement msgAckNotified;

    /**
     * Gets the value of the transactionNotified property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransactionNotified() {
        return transactionNotified;
    }

    /**
     * Sets the value of the transactionNotified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransactionNotified(Transaction value) {
        this.transactionNotified = value;
    }

    /**
     * Gets the value of the transAckNotified property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAcknowledgement }
     *     
     */
    public TransactionAcknowledgement getTransAckNotified() {
        return transAckNotified;
    }

    /**
     * Sets the value of the transAckNotified property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAcknowledgement }
     *     
     */
    public void setTransAckNotified(TransactionAcknowledgement value) {
        this.transAckNotified = value;
    }

    /**
     * Gets the value of the msgAckNotified property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAcknowledgement }
     *     
     */
    public MessageAcknowledgement getMsgAckNotified() {
        return msgAckNotified;
    }

    /**
     * Sets the value of the msgAckNotified property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAcknowledgement }
     *     
     */
    public void setMsgAckNotified(MessageAcknowledgement value) {
        this.msgAckNotified = value;
    }

}
