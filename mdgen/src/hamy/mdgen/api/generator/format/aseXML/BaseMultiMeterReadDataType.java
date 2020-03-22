//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - base types from which all gas and hot water meter read data are implemented.
 * Detail - The only limitation made by this definition is that the content will be complex. This is done to
 * alow NSW/ACT Meters to have specific attributes for meters such as Hot Water Meter.
 * 			
 * 
 * <p>Java class for BaseMultiMeterReadDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseMultiMeterReadDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumedEnergy" type="{urn:aseXML:r38}QuantityOfGasMJ" minOccurs="0"/>
 *         &lt;element name="ConsumptionFactor" type="{urn:aseXML:r38}ConsumptionFactorType" minOccurs="0"/>
 *         &lt;element name="EnergyCalculationDatestamp" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EnergyCalculationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimationSubstitutionReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimationSubstitutionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HiLowFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndexValue" type="{urn:aseXML:r38}GasMeterIndexValue" minOccurs="0"/>
 *         &lt;element name="MeterCapacityFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReasonForRead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfRead" type="{urn:aseXML:r38}TypeOfRead" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMultiMeterReadDataType", propOrder = {
    "adjustmentReasonCode",
    "consumedEnergy",
    "consumptionFactor",
    "energyCalculationDatestamp",
    "energyCalculationTimestamp",
    "estimationSubstitutionReasonCode",
    "estimationSubstitutionType",
    "hiLowFailure",
    "indexValue",
    "meterCapacityFailure",
    "readDate",
    "reasonForRead",
    "typeOfRead"
})
@XmlSeeAlso({
    GasMultiMeterReadDataType.class,
    HWMultiMeterReadDataType.class
})
public abstract class BaseMultiMeterReadDataType {

    @XmlElement(name = "AdjustmentReasonCode")
    protected String adjustmentReasonCode;
    @XmlElement(name = "ConsumedEnergy")
    @XmlSchemaType(name = "integer")
    protected Long consumedEnergy;
    @XmlElement(name = "ConsumptionFactor")
    protected BigDecimal consumptionFactor;
    @XmlElement(name = "EnergyCalculationDatestamp")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar energyCalculationDatestamp;
    @XmlElement(name = "EnergyCalculationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar energyCalculationTimestamp;
    @XmlElement(name = "EstimationSubstitutionReasonCode")
    protected String estimationSubstitutionReasonCode;
    @XmlElement(name = "EstimationSubstitutionType")
    protected String estimationSubstitutionType;
    @XmlElement(name = "HiLowFailure")
    protected String hiLowFailure;
    @XmlElementRef(name = "IndexValue", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> indexValue;
    @XmlElement(name = "MeterCapacityFailure")
    protected String meterCapacityFailure;
    @XmlElementRef(name = "ReadDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> readDate;
    @XmlElement(name = "ReasonForRead")
    protected String reasonForRead;
    @XmlElementRef(name = "TypeOfRead", type = JAXBElement.class, required = false)
    protected JAXBElement<TypeOfRead> typeOfRead;

    /**
     * Gets the value of the adjustmentReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Sets the value of the adjustmentReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReasonCode(String value) {
        this.adjustmentReasonCode = value;
    }

    /**
     * Gets the value of the consumedEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsumedEnergy() {
        return consumedEnergy;
    }

    /**
     * Sets the value of the consumedEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsumedEnergy(Long value) {
        this.consumedEnergy = value;
    }

    /**
     * Gets the value of the consumptionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionFactor() {
        return consumptionFactor;
    }

    /**
     * Sets the value of the consumptionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionFactor(BigDecimal value) {
        this.consumptionFactor = value;
    }

    /**
     * Gets the value of the energyCalculationDatestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnergyCalculationDatestamp() {
        return energyCalculationDatestamp;
    }

    /**
     * Sets the value of the energyCalculationDatestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnergyCalculationDatestamp(XMLGregorianCalendar value) {
        this.energyCalculationDatestamp = value;
    }

    /**
     * Gets the value of the energyCalculationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnergyCalculationTimestamp() {
        return energyCalculationTimestamp;
    }

    /**
     * Sets the value of the energyCalculationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnergyCalculationTimestamp(XMLGregorianCalendar value) {
        this.energyCalculationTimestamp = value;
    }

    /**
     * Gets the value of the estimationSubstitutionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimationSubstitutionReasonCode() {
        return estimationSubstitutionReasonCode;
    }

    /**
     * Sets the value of the estimationSubstitutionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimationSubstitutionReasonCode(String value) {
        this.estimationSubstitutionReasonCode = value;
    }

    /**
     * Gets the value of the estimationSubstitutionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimationSubstitutionType() {
        return estimationSubstitutionType;
    }

    /**
     * Sets the value of the estimationSubstitutionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimationSubstitutionType(String value) {
        this.estimationSubstitutionType = value;
    }

    /**
     * Gets the value of the hiLowFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiLowFailure() {
        return hiLowFailure;
    }

    /**
     * Sets the value of the hiLowFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiLowFailure(String value) {
        this.hiLowFailure = value;
    }

    /**
     * Gets the value of the indexValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getIndexValue() {
        return indexValue;
    }

    /**
     * Sets the value of the indexValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setIndexValue(JAXBElement<BigInteger> value) {
        this.indexValue = value;
    }

    /**
     * Gets the value of the meterCapacityFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterCapacityFailure() {
        return meterCapacityFailure;
    }

    /**
     * Sets the value of the meterCapacityFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterCapacityFailure(String value) {
        this.meterCapacityFailure = value;
    }

    /**
     * Gets the value of the readDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReadDate() {
        return readDate;
    }

    /**
     * Sets the value of the readDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReadDate(JAXBElement<XMLGregorianCalendar> value) {
        this.readDate = value;
    }

    /**
     * Gets the value of the reasonForRead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForRead() {
        return reasonForRead;
    }

    /**
     * Sets the value of the reasonForRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForRead(String value) {
        this.reasonForRead = value;
    }

    /**
     * Gets the value of the typeOfRead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TypeOfRead }{@code >}
     *     
     */
    public JAXBElement<TypeOfRead> getTypeOfRead() {
        return typeOfRead;
    }

    /**
     * Sets the value of the typeOfRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TypeOfRead }{@code >}
     *     
     */
    public void setTypeOfRead(JAXBElement<TypeOfRead> value) {
        this.typeOfRead = value;
    }

}
