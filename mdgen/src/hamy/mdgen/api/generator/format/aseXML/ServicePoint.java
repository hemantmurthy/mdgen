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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Define service point address and other properties
 * 
 * <p>Java class for ServicePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{urn:aseXML:r38}Address" minOccurs="0"/>
 *         &lt;element name="AccessDetails" type="{urn:aseXML:r38}AccessDetail" minOccurs="0"/>
 *         &lt;element name="Hazard" type="{urn:aseXML:r38}SiteHazard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MelwayGridReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DogCode" type="{urn:aseXML:r38}GasMeterDogCode" minOccurs="0"/>
 *         &lt;element name="MeterPosition" type="{urn:aseXML:r38}GasMeterPosition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePoint", propOrder = {
    "address",
    "accessDetails",
    "hazard",
    "melwayGridReference",
    "dogCode",
    "meterPosition"
})
public class ServicePoint {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AccessDetails")
    protected String accessDetails;
    @XmlElement(name = "Hazard")
    protected List<SiteHazard> hazard;
    @XmlElement(name = "MelwayGridReference")
    protected String melwayGridReference;
    @XmlElement(name = "DogCode")
    @XmlSchemaType(name = "string")
    protected GasMeterDogCode dogCode;
    @XmlElement(name = "MeterPosition")
    @XmlSchemaType(name = "string")
    protected GasMeterPosition meterPosition;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the accessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessDetails() {
        return accessDetails;
    }

    /**
     * Sets the value of the accessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessDetails(String value) {
        this.accessDetails = value;
    }

    /**
     * Gets the value of the hazard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteHazard }
     * 
     * 
     */
    public List<SiteHazard> getHazard() {
        if (hazard == null) {
            hazard = new ArrayList<SiteHazard>();
        }
        return this.hazard;
    }

    /**
     * Gets the value of the melwayGridReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMelwayGridReference() {
        return melwayGridReference;
    }

    /**
     * Sets the value of the melwayGridReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMelwayGridReference(String value) {
        this.melwayGridReference = value;
    }

    /**
     * Gets the value of the dogCode property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterDogCode }
     *     
     */
    public GasMeterDogCode getDogCode() {
        return dogCode;
    }

    /**
     * Sets the value of the dogCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterDogCode }
     *     
     */
    public void setDogCode(GasMeterDogCode value) {
        this.dogCode = value;
    }

    /**
     * Gets the value of the meterPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterPosition }
     *     
     */
    public GasMeterPosition getMeterPosition() {
        return meterPosition;
    }

    /**
     * Sets the value of the meterPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterPosition }
     *     
     */
    public void setMeterPosition(GasMeterPosition value) {
        this.meterPosition = value;
    }

}
