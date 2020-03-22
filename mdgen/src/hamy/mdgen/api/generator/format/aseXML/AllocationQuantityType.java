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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for AllocationQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationQuantityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:aseXML:r38>EnergyQuantity">
 *       &lt;attribute name="type" type="{urn:aseXML:r38}AllocationType" />
 *       &lt;attribute name="usagePrecedence" type="{urn:aseXML:r38}UsagePrecedenceType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationQuantityType", propOrder = {
    "value"
})
public class AllocationQuantityType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "type")
    protected AllocationType type;
    @XmlAttribute(name = "usagePrecedence")
    protected Integer usagePrecedence;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationType }
     *     
     */
    public AllocationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationType }
     *     
     */
    public void setType(AllocationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the usagePrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsagePrecedence() {
        return usagePrecedence;
    }

    /**
     * Sets the value of the usagePrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsagePrecedence(Integer value) {
        this.usagePrecedence = value;
    }

}
