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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Row of the Electricity NMI Role Standing Data table extended by BDTStatus and Event for Bulk Data Tool
 * 			
 * 
 * <p>Java class for ElectricityNMIRoleRowBDT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityNMIRoleRowBDT">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow">
 *       &lt;sequence>
 *         &lt;group ref="{urn:aseXML:r38}ElectricityNMIRoleGroup"/>
 *         &lt;element name="BDTStatus" type="{urn:aseXML:r38}BDTStatus" minOccurs="0"/>
 *         &lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r9" default="r9" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityNMIRoleRowBDT", propOrder = {
    "party",
    "role",
    "bdtStatus",
    "event"
})
public class ElectricityNMIRoleRowBDT
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "Party", required = true, nillable = true)
    protected PartyIdentifier party;
    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "BDTStatus")
    @XmlSchemaType(name = "string")
    protected BDTStatus bdtStatus;
    @XmlElement(name = "Event")
    protected List<Event> event;
    @XmlAttribute(name = "version")
    protected R9 version;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setParty(PartyIdentifier value) {
        this.party = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the bdtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BDTStatus }
     *     
     */
    public BDTStatus getBDTStatus() {
        return bdtStatus;
    }

    /**
     * Sets the value of the bdtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDTStatus }
     *     
     */
    public void setBDTStatus(BDTStatus value) {
        this.bdtStatus = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
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
