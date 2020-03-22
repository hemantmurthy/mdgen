//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Purpose - defines the resolution details
 * 
 * <p>Java class for ResolutionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolutionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NumberOfTransactions" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AgreedAmount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Gross" type="{urn:aseXML:r38}Amount"/>
 *                   &lt;element name="Net" type="{urn:aseXML:r38}Amount" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comments" type="{urn:aseXML:r38}SpecialComments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionItem", propOrder = {
    "date",
    "numberOfTransactions",
    "agreedAmount",
    "comments"
})
public class ResolutionItem {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "NumberOfTransactions")
    protected BigDecimal numberOfTransactions;
    @XmlElement(name = "AgreedAmount", required = true)
    protected ResolutionItem.AgreedAmount agreedAmount;
    @XmlElement(name = "Comments")
    protected SpecialComments comments;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the numberOfTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfTransactions() {
        return numberOfTransactions;
    }

    /**
     * Sets the value of the numberOfTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfTransactions(BigDecimal value) {
        this.numberOfTransactions = value;
    }

    /**
     * Gets the value of the agreedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionItem.AgreedAmount }
     *     
     */
    public ResolutionItem.AgreedAmount getAgreedAmount() {
        return agreedAmount;
    }

    /**
     * Sets the value of the agreedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionItem.AgreedAmount }
     *     
     */
    public void setAgreedAmount(ResolutionItem.AgreedAmount value) {
        this.agreedAmount = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialComments }
     *     
     */
    public SpecialComments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialComments }
     *     
     */
    public void setComments(SpecialComments value) {
        this.comments = value;
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
     *         &lt;element name="Gross" type="{urn:aseXML:r38}Amount"/>
     *         &lt;element name="Net" type="{urn:aseXML:r38}Amount" minOccurs="0"/>
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
        "gross",
        "net"
    })
    public static class AgreedAmount {

        @XmlElement(name = "Gross", required = true)
        protected BigDecimal gross;
        @XmlElement(name = "Net")
        protected BigDecimal net;

        /**
         * Gets the value of the gross property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGross() {
            return gross;
        }

        /**
         * Sets the value of the gross property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGross(BigDecimal value) {
            this.gross = value;
        }

        /**
         * Gets the value of the net property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNet() {
            return net;
        }

        /**
         * Sets the value of the net property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNet(BigDecimal value) {
            this.net = value;
        }

    }

}
