//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Define the details of installed metering equipment.
 * 
 * <p>Java class for NewEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstalledMeterEquipment" type="{urn:aseXML:r38}ElectricityMeters" minOccurs="0"/>
 *         &lt;element name="InstalledNetworkDevices" type="{urn:aseXML:r38}NetworkDevices" minOccurs="0"/>
 *         &lt;element name="InstalledControlEquipment" type="{urn:aseXML:r38}NMIStandingData" minOccurs="0"/>
 *         &lt;element name="InstalledTransformers" type="{urn:aseXML:r38}ElectricityMeters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewEquipment", propOrder = {
    "installedMeterEquipment",
    "installedNetworkDevices",
    "installedControlEquipment",
    "installedTransformers"
})
public class NewEquipment {

    @XmlElement(name = "InstalledMeterEquipment")
    protected ElectricityMeters installedMeterEquipment;
    @XmlElement(name = "InstalledNetworkDevices")
    protected NetworkDevices installedNetworkDevices;
    @XmlElement(name = "InstalledControlEquipment")
    protected NMIStandingData installedControlEquipment;
    @XmlElement(name = "InstalledTransformers")
    protected ElectricityMeters installedTransformers;

    /**
     * Gets the value of the installedMeterEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityMeters }
     *     
     */
    public ElectricityMeters getInstalledMeterEquipment() {
        return installedMeterEquipment;
    }

    /**
     * Sets the value of the installedMeterEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityMeters }
     *     
     */
    public void setInstalledMeterEquipment(ElectricityMeters value) {
        this.installedMeterEquipment = value;
    }

    /**
     * Gets the value of the installedNetworkDevices property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkDevices }
     *     
     */
    public NetworkDevices getInstalledNetworkDevices() {
        return installedNetworkDevices;
    }

    /**
     * Sets the value of the installedNetworkDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkDevices }
     *     
     */
    public void setInstalledNetworkDevices(NetworkDevices value) {
        this.installedNetworkDevices = value;
    }

    /**
     * Gets the value of the installedControlEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link NMIStandingData }
     *     
     */
    public NMIStandingData getInstalledControlEquipment() {
        return installedControlEquipment;
    }

    /**
     * Sets the value of the installedControlEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIStandingData }
     *     
     */
    public void setInstalledControlEquipment(NMIStandingData value) {
        this.installedControlEquipment = value;
    }

    /**
     * Gets the value of the installedTransformers property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityMeters }
     *     
     */
    public ElectricityMeters getInstalledTransformers() {
        return installedTransformers;
    }

    /**
     * Sets the value of the installedTransformers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityMeters }
     *     
     */
    public void setInstalledTransformers(ElectricityMeters value) {
        this.installedTransformers = value;
    }

}
