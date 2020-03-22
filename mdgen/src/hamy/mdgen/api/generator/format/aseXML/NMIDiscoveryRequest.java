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
 * Application - NMI Data Access
 * TransactionExchange - NMI Discovery
 * TransactionGroup - NMID
 * Priority - High
 * Purpose - Request a search of the NMI Standing Data
 * Detail - The JurisdictionCode is mandatory as it is used to determine  jurisdictional limitations on the types of searches allowed and the maximum number of matching rows returned for any one search. The remaining elements allow for provision of the various search parameters. For electricity, searches are possible on the basis of meter serial number or address or DPID.
 * 
 * <p>Java class for NMIDiscoveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NMIDiscoveryRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JurisdictionCode" type="{urn:aseXML:r38}JurisdictionCode"/>
 *         &lt;element name="DeliveryPointIdentifier" type="{urn:aseXML:r38}AustralianDeliveryPointIdentifier" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:aseXML:r38}AustralianAddressSearch" minOccurs="0"/>
 *         &lt;element name="MeterSerialNumber" type="{urn:aseXML:r38}MeterSerialNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r17" default="r17" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMIDiscoveryRequest", propOrder = {
    "jurisdictionCode",
    "deliveryPointIdentifier",
    "address",
    "meterSerialNumber"
})
public class NMIDiscoveryRequest {

    @XmlElement(name = "JurisdictionCode", required = true)
    protected String jurisdictionCode;
    @XmlElement(name = "DeliveryPointIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer deliveryPointIdentifier;
    @XmlElement(name = "Address")
    protected AustralianAddressSearch address;
    @XmlElement(name = "MeterSerialNumber")
    protected String meterSerialNumber;
    @XmlAttribute(name = "version")
    protected R17 version;

    /**
     * Gets the value of the jurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictionCode() {
        return jurisdictionCode;
    }

    /**
     * Sets the value of the jurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictionCode(String value) {
        this.jurisdictionCode = value;
    }

    /**
     * Gets the value of the deliveryPointIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryPointIdentifier() {
        return deliveryPointIdentifier;
    }

    /**
     * Sets the value of the deliveryPointIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryPointIdentifier(Integer value) {
        this.deliveryPointIdentifier = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AustralianAddressSearch }
     *     
     */
    public AustralianAddressSearch getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AustralianAddressSearch }
     *     
     */
    public void setAddress(AustralianAddressSearch value) {
        this.address = value;
    }

    /**
     * Gets the value of the meterSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    /**
     * Sets the value of the meterSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterSerialNumber(String value) {
        this.meterSerialNumber = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R17 }
     *     
     */
    public R17 getVersion() {
        if (version == null) {
            return R17 .R_17;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R17 }
     *     
     */
    public void setVersion(R17 value) {
        this.version = value;
    }

}
