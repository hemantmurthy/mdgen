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
 * Purpose - Define the structure of Instrument transformer details.
 * 
 * <p>Java class for InstrumentTransformer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTransformer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransformerNumber" type="{urn:aseXML:r38}InstrumentTransformerSerialNumber" minOccurs="0"/>
 *         &lt;element name="TransformerType" type="{urn:aseXML:r38}InstrumentTransformerType" minOccurs="0"/>
 *         &lt;element name="TransformerRatio" type="{urn:aseXML:r38}MeterTransformerRatio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTransformer", propOrder = {
    "transformerNumber",
    "transformerType",
    "transformerRatio"
})
public class InstrumentTransformer {

    @XmlElement(name = "TransformerNumber")
    protected String transformerNumber;
    @XmlElement(name = "TransformerType")
    @XmlSchemaType(name = "string")
    protected InstrumentTransformerType transformerType;
    @XmlElement(name = "TransformerRatio")
    protected String transformerRatio;

    /**
     * Gets the value of the transformerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerNumber() {
        return transformerNumber;
    }

    /**
     * Sets the value of the transformerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerNumber(String value) {
        this.transformerNumber = value;
    }

    /**
     * Gets the value of the transformerType property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentTransformerType }
     *     
     */
    public InstrumentTransformerType getTransformerType() {
        return transformerType;
    }

    /**
     * Sets the value of the transformerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentTransformerType }
     *     
     */
    public void setTransformerType(InstrumentTransformerType value) {
        this.transformerType = value;
    }

    /**
     * Gets the value of the transformerRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerRatio() {
        return transformerRatio;
    }

    /**
     * Sets the value of the transformerRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerRatio(String value) {
        this.transformerRatio = value;
    }

}
