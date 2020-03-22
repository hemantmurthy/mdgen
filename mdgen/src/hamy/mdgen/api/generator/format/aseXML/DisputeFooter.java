//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Network charge record type - "912" - Dispute Footer 
 * 
 * <p>Java class for DisputeFooter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisputeFooter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordCount" type="{urn:aseXML:r38}RecordCount"/>
 *         &lt;element name="TotalExclGST" type="{urn:aseXML:r38}Amount" minOccurs="0"/>
 *         &lt;element name="TotalInclGST" type="{urn:aseXML:r38}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeFooter", propOrder = {
    "recordCount",
    "totalExclGST",
    "totalInclGST"
})
public class DisputeFooter {

    @XmlElement(name = "RecordCount", required = true)
    protected BigInteger recordCount;
    @XmlElement(name = "TotalExclGST")
    protected BigDecimal totalExclGST;
    @XmlElement(name = "TotalInclGST")
    protected BigDecimal totalInclGST;

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordCount(BigInteger value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the totalExclGST property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalExclGST() {
        return totalExclGST;
    }

    /**
     * Sets the value of the totalExclGST property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalExclGST(BigDecimal value) {
        this.totalExclGST = value;
    }

    /**
     * Gets the value of the totalInclGST property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalInclGST() {
        return totalInclGST;
    }

    /**
     * Sets the value of the totalInclGST property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalInclGST(BigDecimal value) {
        this.totalInclGST = value;
    }

}
