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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Define the structure network device detail.
 * 
 * <p>Java class for NetworkDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkDeviceNumber" type="{urn:aseXML:r38}DeviceSerialNumber" minOccurs="0"/>
 *         &lt;element name="NetworkDeviceLocation" type="{urn:aseXML:r38}DeviceLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkDevice", propOrder = {
    "networkDeviceNumber",
    "networkDeviceLocation"
})
public class NetworkDevice {

    @XmlElement(name = "NetworkDeviceNumber")
    protected String networkDeviceNumber;
    @XmlElement(name = "NetworkDeviceLocation")
    @XmlSchemaType(name = "string")
    protected DeviceLocation networkDeviceLocation;

    /**
     * Gets the value of the networkDeviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkDeviceNumber() {
        return networkDeviceNumber;
    }

    /**
     * Sets the value of the networkDeviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkDeviceNumber(String value) {
        this.networkDeviceNumber = value;
    }

    /**
     * Gets the value of the networkDeviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceLocation }
     *     
     */
    public DeviceLocation getNetworkDeviceLocation() {
        return networkDeviceLocation;
    }

    /**
     * Sets the value of the networkDeviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLocation }
     *     
     */
    public void setNetworkDeviceLocation(DeviceLocation value) {
        this.networkDeviceLocation = value;
    }

}
