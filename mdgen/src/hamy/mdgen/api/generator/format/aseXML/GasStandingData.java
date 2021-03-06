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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Standing data associated with an gas NMI.
 * 
 * <p>Java class for GasStandingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasStandingData">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}NMIStandingData">
 *       &lt;sequence>
 *         &lt;element name="MasterData" type="{urn:aseXML:r38}GasMasterStandingData" minOccurs="0"/>
 *         &lt;element name="RoleAssignments" type="{urn:aseXML:r38}RoleAssignments" minOccurs="0"/>
 *         &lt;element name="MeterData" type="{urn:aseXML:r38}GasMeterStandingData" minOccurs="0"/>
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
@XmlType(name = "GasStandingData", propOrder = {
    "masterData",
    "roleAssignments",
    "meterData",
    "siteData",
    "additionalDataToFollow"
})
@XmlSeeAlso({
    GasStandingDataUpdate.class
})
public class GasStandingData
    extends NMIStandingData
{

    @XmlElement(name = "MasterData")
    protected GasMasterStandingData masterData;
    @XmlElement(name = "RoleAssignments")
    protected RoleAssignments roleAssignments;
    @XmlElement(name = "MeterData")
    protected GasMeterStandingData meterData;
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
     *     {@link GasMasterStandingData }
     *     
     */
    public GasMasterStandingData getMasterData() {
        return masterData;
    }

    /**
     * Sets the value of the masterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMasterStandingData }
     *     
     */
    public void setMasterData(GasMasterStandingData value) {
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
     *     {@link GasMeterStandingData }
     *     
     */
    public GasMeterStandingData getMeterData() {
        return meterData;
    }

    /**
     * Sets the value of the meterData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterStandingData }
     *     
     */
    public void setMeterData(GasMeterStandingData value) {
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

}
