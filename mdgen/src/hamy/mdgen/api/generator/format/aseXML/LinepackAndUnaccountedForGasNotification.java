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


/**
 * Linepack And Unaccounted For Gas
 * 
 * <p>Java class for LinepackAndUnaccountedForGasNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinepackAndUnaccountedForGasNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="LinepackAndUnaccountedForGasData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChangeInLinepack" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/>
 *                   &lt;element name="UnaccountedForGas" type="{urn:aseXML:r38}QuantityOfGasMJ"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="networkID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlType(name = "LinepackAndUnaccountedForGasNotification", propOrder = {
    "linepackAndUnaccountedForGasData"
})
public class LinepackAndUnaccountedForGasNotification {

    @XmlElement(name = "LinepackAndUnaccountedForGasData", required = true)
    protected List<LinepackAndUnaccountedForGasNotification.LinepackAndUnaccountedForGasData> linepackAndUnaccountedForGasData;
    @XmlAttribute(name = "version")
    protected R34 version;

    /**
     * Gets the value of the linepackAndUnaccountedForGasData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linepackAndUnaccountedForGasData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinepackAndUnaccountedForGasData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinepackAndUnaccountedForGasNotification.LinepackAndUnaccountedForGasData }
     * 
     * 
     */
    public List<LinepackAndUnaccountedForGasNotification.LinepackAndUnaccountedForGasData> getLinepackAndUnaccountedForGasData() {
        if (linepackAndUnaccountedForGasData == null) {
            linepackAndUnaccountedForGasData = new ArrayList<LinepackAndUnaccountedForGasNotification.LinepackAndUnaccountedForGasData>();
        }
        return this.linepackAndUnaccountedForGasData;
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
     *         &lt;element name="ChangeInLinepack" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/>
     *         &lt;element name="UnaccountedForGas" type="{urn:aseXML:r38}QuantityOfGasMJ"/>
     *       &lt;/sequence>
     *       &lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="networkID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "changeInLinepack",
        "unaccountedForGas"
    })
    public static class LinepackAndUnaccountedForGasData {

        @XmlElement(name = "ChangeInLinepack")
        @XmlSchemaType(name = "integer")
        protected Long changeInLinepack;
        @XmlElement(name = "UnaccountedForGas")
        @XmlSchemaType(name = "integer")
        protected long unaccountedForGas;
        @XmlAttribute(name = "gasDate", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String gasDate;
        @XmlAttribute(name = "networkID", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String networkID;

        /**
         * Gets the value of the changeInLinepack property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getChangeInLinepack() {
            return changeInLinepack;
        }

        /**
         * Sets the value of the changeInLinepack property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setChangeInLinepack(Long value) {
            this.changeInLinepack = value;
        }

        /**
         * Gets the value of the unaccountedForGas property.
         * 
         */
        public long getUnaccountedForGas() {
            return unaccountedForGas;
        }

        /**
         * Sets the value of the unaccountedForGas property.
         * 
         */
        public void setUnaccountedForGas(long value) {
            this.unaccountedForGas = value;
        }

        /**
         * Gets the value of the gasDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGasDate() {
            return gasDate;
        }

        /**
         * Sets the value of the gasDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGasDate(String value) {
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

    }

}
