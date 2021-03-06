//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * Purpose - Row of the CATS Data Request table
 * MSATS Data Model Table - CATS_Outbound_Requests
 * Replication Table Name - CATSDataRequests
 * 			
 * 
 * <p>Java class for CATSDataRequestRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATSDataRequestRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}ReplicationBaseRow">
 *       &lt;sequence>
 *         &lt;element name="Participant" type="{urn:aseXML:r38}PartyIdentifier"/>
 *         &lt;element name="TransactionID" type="{urn:aseXML:r38}TransactionIdentifier"/>
 *         &lt;element name="DataRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSDataRequestRow", propOrder = {
    "participant",
    "transactionID",
    "dataRequest"
})
public class CATSDataRequestRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "Participant", required = true)
    protected PartyIdentifier participant;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "DataRequest", required = true)
    protected CATSDataRequestRow.DataRequest dataRequest;

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
     * Gets the value of the dataRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CATSDataRequestRow.DataRequest }
     *     
     */
    public CATSDataRequestRow.DataRequest getDataRequest() {
        return dataRequest;
    }

    /**
     * Sets the value of the dataRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSDataRequestRow.DataRequest }
     *     
     */
    public void setDataRequest(CATSDataRequestRow.DataRequest value) {
        this.dataRequest = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='skip'/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class DataRequest {

        @XmlAnyElement
        protected Element any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }

}
