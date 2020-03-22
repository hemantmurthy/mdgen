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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Application - Bulk Data Tool
 * TransactionExchange - CATSBulkDataResponse
 * TransactionGroup - CATS
 * Priority - Low
 * Purpose - Provide Bulk Data Tool processing results. Events may be provided per row and have to be provided per NMI. Events report on success or failure of NMI or row processing.
 * Detail - 
 * 			
 * 
 * <p>Java class for CATSBulkDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATSBulkDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CATSBulkDataBlock" type="{urn:aseXML:r38}CATSBulkDataBlock" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r9" default="r9" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSBulkDataResponse", propOrder = {
    "catsBulkDataBlock"
})
public class CATSBulkDataResponse {

    @XmlElement(name = "CATSBulkDataBlock", required = true)
    protected List<CATSBulkDataBlock> catsBulkDataBlock;
    @XmlAttribute(name = "version")
    protected R9 version;

    /**
     * Gets the value of the catsBulkDataBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catsBulkDataBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCATSBulkDataBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CATSBulkDataBlock }
     * 
     * 
     */
    public List<CATSBulkDataBlock> getCATSBulkDataBlock() {
        if (catsBulkDataBlock == null) {
            catsBulkDataBlock = new ArrayList<CATSBulkDataBlock>();
        }
        return this.catsBulkDataBlock;
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
