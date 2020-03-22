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
 * 
 * Purpose - Row of the Electricity NMI Role Assignment table
 * MSATS Data Model Table - CATS_NMI_Participant_Relations
 * Replication Table Name - ElectricityNMIRoles
 * 			
 * 
 * <p>Java class for ElectricityNMIRoleRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityNMIRoleRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow">
 *       &lt;sequence>
 *         &lt;element name="NMI" type="{urn:aseXML:r38}NMIBase"/>
 *         &lt;group ref="{urn:aseXML:r38}ElectricityNMIRoleGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityNMIRoleRow", propOrder = {
    "nmi",
    "party",
    "role"
})
public class ElectricityNMIRoleRow
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "NMI", required = true)
    protected String nmi;
    @XmlElement(name = "Party", required = true, nillable = true)
    protected PartyIdentifier party;
    @XmlElement(name = "Role", required = true)
    protected String role;

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

}
