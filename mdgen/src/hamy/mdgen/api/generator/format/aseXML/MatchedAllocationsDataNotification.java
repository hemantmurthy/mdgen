//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

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
 * Matched Allocation Data from Network Operator
 * 
 * <p>Java class for MatchedAllocationsDataNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchedAllocationsDataNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="MatchedAllocationsData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Quantity" type="{urn:aseXML:r38}QuantityOfGasMJ"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="networkID" use="required" type="{urn:aseXML:r38}NetworkID" />
 *                 &lt;attribute name="participantID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r34" default="r34" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchedAllocationsDataNotification", propOrder = {
    "matchedAllocationsData"
})
public class MatchedAllocationsDataNotification {

    @XmlElement(name = "MatchedAllocationsData", required = true)
    protected List<MatchedAllocationsDataNotification.MatchedAllocationsData> matchedAllocationsData;
    @XmlAttribute(name = "version")
    protected R34 version;

    /**
     * Gets the value of the matchedAllocationsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchedAllocationsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchedAllocationsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchedAllocationsDataNotification.MatchedAllocationsData }
     * 
     * 
     */
    public List<MatchedAllocationsDataNotification.MatchedAllocationsData> getMatchedAllocationsData() {
        if (matchedAllocationsData == null) {
            matchedAllocationsData = new ArrayList<MatchedAllocationsDataNotification.MatchedAllocationsData>();
        }
        return this.matchedAllocationsData;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R34 }
     *     
     */
    public R34 getVersion() {
        if (version == null) {
            return R34 .R_34;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R34 }
     *     
     */
    public void setVersion(R34 value) {
        this.version = value;
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
     *         &lt;element name="Quantity" type="{urn:aseXML:r38}QuantityOfGasMJ"/>
     *       &lt;/sequence>
     *       &lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="networkID" use="required" type="{urn:aseXML:r38}NetworkID" />
     *       &lt;attribute name="participantID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "quantity"
    })
    public static class MatchedAllocationsData {

        @XmlElement(name = "Quantity")
        @XmlSchemaType(name = "integer")
        protected long quantity;
        @XmlAttribute(name = "gasDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar gasDate;
        @XmlAttribute(name = "networkID", required = true)
        protected String networkID;
        @XmlAttribute(name = "participantID", required = true)
        protected String participantID;

        /**
         * Gets the value of the quantity property.
         * 
         */
        public long getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(long value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the gasDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGasDate() {
            return gasDate;
        }

        /**
         * Sets the value of the gasDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGasDate(XMLGregorianCalendar value) {
            this.gasDate = value;
        }

        /**
         * Gets the value of the networkID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetworkID() {
            return networkID;
        }

        /**
         * Sets the value of the networkID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetworkID(String value) {
            this.networkID = value;
        }

        /**
         * Gets the value of the participantID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipantID() {
            return participantID;
        }

        /**
         * Sets the value of the participantID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipantID(String value) {
            this.participantID = value;
        }

    }

}
