//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Application - Meter Data Management
 * TransactionExchange - Meter Data Delivery
 * TransactionGroup - MDMT for VicGas and SAWA Gas
 * Priority - Low
 * Purpose - Provide meter data
 * Detail - Only one type of meter data can be delivered within a given transaction. 
 * 
 * 			Transaction Group: MTRD NEM - B2B Electricity National Electricity B2B Process Tranche 1 Build Pack;	Only CSVConsumptionData and CSVIntervalData used.
 * 
 * <p>Java class for MeterDataNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterDataNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordCount" type="{urn:aseXML:r38}RecordCount" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="CSVConsumptionData" type="{urn:aseXML:r38}CSVDataWithName"/>
 *           &lt;element name="CSVIntervalData" type="{urn:aseXML:r38}CSVDataWithName"/>
 *           &lt;element name="CSVProfileData" type="{urn:aseXML:r38}CSVDataWithName"/>
 *         &lt;/choice>
 *         &lt;element name="ParticipantRole" type="{urn:aseXML:r38}RoleAssignment" minOccurs="0"/>
 *         &lt;element name="MeterReadingGroup" type="{urn:aseXML:r38}MeterReadingGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r25" default="r25" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterDataNotification", propOrder = {
    "recordCount",
    "csvConsumptionData",
    "csvIntervalData",
    "csvProfileData",
    "participantRole",
    "meterReadingGroup"
})
public class MeterDataNotification {

    @XmlElement(name = "RecordCount")
    protected BigInteger recordCount;
    @XmlElementRef(name = "CSVConsumptionData", type = JAXBElement.class, required = false)
    protected JAXBElement<CSVDataWithName> csvConsumptionData;
    @XmlElementRef(name = "CSVIntervalData", type = JAXBElement.class, required = false)
    protected JAXBElement<CSVDataWithName> csvIntervalData;
    @XmlElementRef(name = "CSVProfileData", type = JAXBElement.class, required = false)
    protected JAXBElement<CSVDataWithName> csvProfileData;
    @XmlElement(name = "ParticipantRole")
    protected RoleAssignment participantRole;
    @XmlElement(name = "MeterReadingGroup")
    protected MeterReadingGroup meterReadingGroup;
    @XmlAttribute(name = "version")
    protected R25 version;

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
     * Gets the value of the csvConsumptionData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CSVDataWithName }{@code >}
     *     
     */
    public JAXBElement<CSVDataWithName> getCSVConsumptionData() {
        return csvConsumptionData;
    }

    /**
     * Sets the value of the csvConsumptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CSVDataWithName }{@code >}
     *     
     */
    public void setCSVConsumptionData(JAXBElement<CSVDataWithName> value) {
        this.csvConsumptionData = value;
    }

    /**
     * Gets the value of the csvIntervalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CSVDataWithName }{@code >}
     *     
     */
    public JAXBElement<CSVDataWithName> getCSVIntervalData() {
        return csvIntervalData;
    }

    /**
     * Sets the value of the csvIntervalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CSVDataWithName }{@code >}
     *     
     */
    public void setCSVIntervalData(JAXBElement<CSVDataWithName> value) {
        this.csvIntervalData = value;
    }

    /**
     * Gets the value of the csvProfileData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CSVDataWithName }{@code >}
     *     
     */
    public JAXBElement<CSVDataWithName> getCSVProfileData() {
        return csvProfileData;
    }

    /**
     * Sets the value of the csvProfileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CSVDataWithName }{@code >}
     *     
     */
    public void setCSVProfileData(JAXBElement<CSVDataWithName> value) {
        this.csvProfileData = value;
    }

    /**
     * Gets the value of the participantRole property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAssignment }
     *     
     */
    public RoleAssignment getParticipantRole() {
        return participantRole;
    }

    /**
     * Sets the value of the participantRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAssignment }
     *     
     */
    public void setParticipantRole(RoleAssignment value) {
        this.participantRole = value;
    }

    /**
     * Gets the value of the meterReadingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingGroup }
     *     
     */
    public MeterReadingGroup getMeterReadingGroup() {
        return meterReadingGroup;
    }

    /**
     * Sets the value of the meterReadingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingGroup }
     *     
     */
    public void setMeterReadingGroup(MeterReadingGroup value) {
        this.meterReadingGroup = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R25 }
     *     
     */
    public R25 getVersion() {
        if (version == null) {
            return R25 .R_25;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R25 }
     *     
     */
    public void setVersion(R25 value) {
        this.version = value;
    }

}
