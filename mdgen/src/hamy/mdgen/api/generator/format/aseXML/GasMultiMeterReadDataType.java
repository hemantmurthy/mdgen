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
import javax.xml.bind.annotation.XmlType;


/**
 * Read data for NSW/ACT Gas NMI.
 * 
 * <p>Java class for GasMultiMeterReadDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasMultiMeterReadDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}BaseMultiMeterReadDataType">
 *       &lt;sequence>
 *         &lt;element name="AverageHeatingValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PressureCorrectionFactor" type="{urn:aseXML:r38}PressureCorrectionFactor" minOccurs="0"/>
 *         &lt;element name="VolumeFlow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasMultiMeterReadDataType", propOrder = {
    "averageHeatingValue",
    "pressureCorrectionFactor",
    "volumeFlow"
})
public class GasMultiMeterReadDataType
    extends BaseMultiMeterReadDataType
{

    @XmlElement(name = "AverageHeatingValue")
    protected BigDecimal averageHeatingValue;
    @XmlElement(name = "PressureCorrectionFactor")
    protected BigDecimal pressureCorrectionFactor;
    @XmlElement(name = "VolumeFlow")
    protected BigDecimal volumeFlow;

    /**
     * Gets the value of the averageHeatingValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageHeatingValue() {
        return averageHeatingValue;
    }

    /**
     * Sets the value of the averageHeatingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageHeatingValue(BigDecimal value) {
        this.averageHeatingValue = value;
    }

    /**
     * Gets the value of the pressureCorrectionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPressureCorrectionFactor() {
        return pressureCorrectionFactor;
    }

    /**
     * Sets the value of the pressureCorrectionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPressureCorrectionFactor(BigDecimal value) {
        this.pressureCorrectionFactor = value;
    }

    /**
     * Gets the value of the volumeFlow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeFlow() {
        return volumeFlow;
    }

    /**
     * Sets the value of the volumeFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeFlow(BigDecimal value) {
        this.volumeFlow = value;
    }

}
