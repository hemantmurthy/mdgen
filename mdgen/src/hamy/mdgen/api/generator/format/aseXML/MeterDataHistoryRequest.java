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
import javax.xml.bind.annotation.XmlType;


/**
 * Schema - MeterDataManagement
 * 
 * <p>Java class for MeterDataHistoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterDataHistoryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SingleHistoryRequestData" type="{urn:aseXML:r38}NMITransactionBase"/>
 *         &lt;element name="CSVHistoryRequestData" type="{urn:aseXML:r38}CSVRequestFormat"/>
 *       &lt;/choice>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r9" default="r9" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterDataHistoryRequest", propOrder = {
    "singleHistoryRequestData",
    "csvHistoryRequestData"
})
public class MeterDataHistoryRequest {

    @XmlElement(name = "SingleHistoryRequestData")
    protected NMITransactionBase singleHistoryRequestData;
    @XmlElement(name = "CSVHistoryRequestData")
    protected CSVRequestFormat csvHistoryRequestData;
    @XmlAttribute(name = "version")
    protected R9 version;

    /**
     * Gets the value of the singleHistoryRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link NMITransactionBase }
     *     
     */
    public NMITransactionBase getSingleHistoryRequestData() {
        return singleHistoryRequestData;
    }

    /**
     * Sets the value of the singleHistoryRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMITransactionBase }
     *     
     */
    public void setSingleHistoryRequestData(NMITransactionBase value) {
        this.singleHistoryRequestData = value;
    }

    /**
     * Gets the value of the csvHistoryRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link CSVRequestFormat }
     *     
     */
    public CSVRequestFormat getCSVHistoryRequestData() {
        return csvHistoryRequestData;
    }

    /**
     * Sets the value of the csvHistoryRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVRequestFormat }
     *     
     */
    public void setCSVHistoryRequestData(CSVRequestFormat value) {
        this.csvHistoryRequestData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R9 }
     *     
     */
    public R9 getVersion() {
        if (version == null) {
            return R9 .R_9;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R9 }
     *     
     */
    public void setVersion(R9 value) {
        this.version = value;
    }

}
