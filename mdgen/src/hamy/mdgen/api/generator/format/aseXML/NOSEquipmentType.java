//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for a station resident equipment. NOTE: for all NOSEquipmentType descendants CompanyElementName must be unqiue for the company/station(s)/equipmentType
 * 
 * <p>Java class for NOSEquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOSEquipmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}EquipmentBaseType">
 *       &lt;sequence>
 *         &lt;element name="StationFromCompanyElementId" type="{urn:aseXML:r38}CompanyElementIdType" minOccurs="0"/>
 *         &lt;element name="Voltage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn:aseXML:r38}NOSVoltage">
 *               &lt;minInclusive value="1.0"/>
 *               &lt;maxInclusive value="600.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Designation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;maxLength value="8"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOSEquipmentType", propOrder = {
    "stationFromCompanyElementId",
    "voltage",
    "designation"
})
@XmlSeeAlso({
    NOSSynchronousCondenserType.class,
    NOSBusType.class,
    NOSReactorType.class,
    NOSLoadType.class,
    NOSStaticVarCompensatorType.class,
    NOSIsolatorType.class,
    NOSBrakingResistorType.class,
    NOSCapacitorType.class,
    NOSTwoWindingTransformerType.class,
    NOSCircuitBreakerType.class,
    NOSLineType.class,
    NOSUnitType.class
})
public class NOSEquipmentType
    extends EquipmentBaseType
{

    @XmlElement(name = "StationFromCompanyElementId")
    protected String stationFromCompanyElementId;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Designation")
    protected String designation;

    /**
     * Gets the value of the stationFromCompanyElementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationFromCompanyElementId() {
        return stationFromCompanyElementId;
    }

    /**
     * Sets the value of the stationFromCompanyElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationFromCompanyElementId(String value) {
        this.stationFromCompanyElementId = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltage(BigDecimal value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the designation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the value of the designation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

}
