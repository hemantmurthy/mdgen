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
 * Purpose - Row of the RoleIdentifiers table
 * MSATS Data Model Table - CATS_Roles
 * Replication Table Name - RoleIdentifiers
 * 			
 * 
 * <p>Java class for RoleIdentifierRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleIdentifierRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{urn:aseXML:r38}RoleIdentifier"/>
 *         &lt;element name="Description" type="{urn:aseXML:r38}RoleDescription"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleIdentifierRow", propOrder = {
    "identifier",
    "description"
})
public class RoleIdentifierRow
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
