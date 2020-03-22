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
 * Purpose - Row of the Electricity NMI Data Stream table
 * MSATS Data Model Table - CATS_NMI_Data_Stream
 * Replication Table Name - ElectricityNMIDataStreams
 * 			
 * 
 * <p>Java class for ElectricityNMIDataStreamRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityNMIDataStreamRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow">
 *       &lt;sequence>
 *         &lt;element name="NMI" type="{urn:aseXML:r38}NMIBase"/>
 *         &lt;group ref="{urn:aseXML:r38}ElectricityNMIDataStreamGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r31" default="r31" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityNMIDataStreamRow", propOrder = {
    "nmi",
    "suffix",
    "profileName",
    "averagedDailyLoad",
    "dataStreamType",
    "status"
})
public class ElectricityNMIDataStreamRow
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "NMI", required = true)
    protected String nmi;
    @XmlElement(name = "Suffix", required = true)
    protected String suffix;
    @XmlElementRef(name = "ProfileName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileName;
    @XmlElementRef(name = "AveragedDailyLoad", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> averagedDailyLoad;
    @XmlElementRef(name = "DataStreamType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataStreamType;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlAttribute(name = "version")
    protected R31 version;

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMI(String value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileName(JAXBElement<String> value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the averagedDailyLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getAveragedDailyLoad() {
        return averagedDailyLoad;
    }

    /**
     * Sets the value of the averagedDailyLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setAveragedDailyLoad(JAXBElement<BigInteger> value) {
        this.averagedDailyLoad = value;
    }

    /**
     * Gets the value of the dataStreamType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataStreamType() {
        return dataStreamType;
    }

    /**
     * Sets the value of the dataStreamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataStreamType(JAXBElement<String> value) {
        this.dataStreamType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R31 }
     *     
     */
    public R31 getVersion() {
        if (version == null) {
            return R31 .R_31;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R31 }
     *     
     */
    public void setVersion(R31 value) {
        this.version = value;
    }

}
