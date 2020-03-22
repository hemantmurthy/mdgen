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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Standing data associated with a multimeter gas NMI.
 * 
 * <p>Java class for GasMultiMeterStandingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasMultiMeterStandingData">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}NMIStandingData">
 *       &lt;sequence>
 *         &lt;element name="MasterData" type="{urn:aseXML:r38}GasMultiMeterMasterStandingDataType" minOccurs="0"/>
 *         &lt;element name="RoleAssignments" type="{urn:aseXML:r38}RoleAssignments" minOccurs="0"/>
 *         &lt;element name="MeterData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Meter" type="{urn:aseXML:r38}GasMultiMeterStandingDataType" maxOccurs="999"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SiteData" type="{urn:aseXML:r38}ServicePoint" minOccurs="0"/>
 *         &lt;element name="AdditionalDataToFollow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r34" default="r34" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasMultiMeterStandingData", propOrder = {
    "masterData",
    "roleAssignments",
    "meterData",
    "siteData",
    "additionalDataToFollow"
})
@XmlSeeAlso({
    GasMultiMeterStandingDataUpdate.class
})
public class GasMultiMeterStandingData
    extends NMIStandingData
{

    @XmlElement(name = "MasterData")
    protected GasMultiMeterMasterStandingDataType masterData;
    @XmlElement(name = "RoleAssignments")
    protected RoleAssignments roleAssignments;
    @XmlElement(name = "MeterData")
    protected GasMultiMeterStandingData.MeterData meterData;
    @XmlElement(name = "SiteData")
    protected ServicePoint siteData;
    @XmlElement(name = "AdditionalDataToFollow")
    protected Boolean additionalDataToFollow;
    @XmlAttribute(name = "version")
    protected R34 version;

    /**
     * Gets the value of the masterData property.
     * 
     * @return
     *     possible object is
     *     {@link GasMultiMeterMasterStandingDataType }
     *     
     */
    public GasMultiMeterMasterStandingDataType getMasterData() {
        return masterData;
    }

    /**
     * Sets the value of the masterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMultiMeterMasterStandingDataType }
     *     
     */
    public void setMasterData(GasMultiMeterMasterStandingDataType value) {
        this.masterData = value;
    }

    /**
     * Gets the value of the roleAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link RoleAssignments }
     *     
     */
    public RoleAssignments getRoleAssignments() {
        return roleAssignments;
    }

    /**
     * Sets the value of the roleAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleAssignments }
     *     
     */
    public void setRoleAssignments(RoleAssignments value) {
        this.roleAssignments = value;
    }

    /**
     * Gets the value of the meterData property.
     * 
     * @return
     *     possible object is
     *     {@link GasMultiMeterStandingData.MeterData }
     *     
     */
    public GasMultiMeterStandingData.MeterData getMeterData() {
        return meterData;
    }

    /**
     * Sets the value of the meterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMultiMeterStandingData.MeterData }
     *     
     */
    public void setMeterData(GasMultiMeterStandingData.MeterData value) {
        this.meterData = value;
    }

    /**
     * Gets the value of the siteData property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePoint }
     *     
     */
    public ServicePoint getSiteData() {
        return siteData;
    }

    /**
     * Sets the value of the siteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePoint }
     *     
     */
    public void setSiteData(ServicePoint value) {
        this.siteData = value;
    }

    /**
     * Gets the value of the additionalDataToFollow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalDataToFollow() {
        return additionalDataToFollow;
    }

    /**
     * Sets the value of the additionalDataToFollow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalDataToFollow(Boolean value) {
        this.additionalDataToFollow = value;
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
     *         &lt;element name="Meter" type="{urn:aseXML:r38}GasMultiMeterStandingDataType" maxOccurs="999"/>
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
        "meter"
    })
    public static class MeterData {

        @XmlElement(name = "Meter", required = true)
        protected List<GasMultiMeterStandingDataType> meter;

        /**
         * Gets the value of the meter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the meter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GasMultiMeterStandingDataType }
         * 
         * 
         */
        public List<GasMultiMeterStandingDataType> getMeter() {
            if (meter == null) {
                meter = new ArrayList<GasMultiMeterStandingDataType>();
            }
            return this.meter;
        }

    }

}
