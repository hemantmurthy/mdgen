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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - container for information about a register within an electricity meter
 * 	
 * 
 * <p>Java class for ElectricityMeterRegisterDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityMeterRegisterDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterID" type="{urn:aseXML:r38}MeterRegisterIdentifier" minOccurs="0"/>
 *         &lt;element name="NetworkTariffCode" type="{urn:aseXML:r38}NetworkTariffCode" minOccurs="0"/>
 *         &lt;element name="NetworkAdditionalInformation" type="{urn:aseXML:r38}MeterNetworkAdditionalInformation" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{urn:aseXML:r38}MeterUnitOfMeasure" minOccurs="0"/>
 *         &lt;element name="TimeOfDay" type="{urn:aseXML:r38}MeterTimeOfDay" minOccurs="0"/>
 *         &lt;element name="Multiplier" type="{urn:aseXML:r38}MeterMultiplier" minOccurs="0"/>
 *         &lt;element name="DialFormat" type="{urn:aseXML:r38}MeterDialFormat" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{urn:aseXML:r38}NMIDataStreamSuffix" minOccurs="0"/>
 *         &lt;element name="ControlledLoad" type="{urn:aseXML:r38}MeterControlledLoad" minOccurs="0"/>
 *         &lt;element name="ConsumptionType" type="{urn:aseXML:r38}MeterConsumptionType" minOccurs="0"/>
 *         &lt;element name="Demand1" type="{urn:aseXML:r38}MeterDemand" minOccurs="0"/>
 *         &lt;element name="Demand2" type="{urn:aseXML:r38}MeterDemand" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:aseXML:r38}MeterRegisterStatusCode" minOccurs="0"/>
 *         &lt;element name="DirectionIndicator" type="{urn:aseXML:r38}DirectionIndicator" minOccurs="0"/>
 *         &lt;element name="PreviousReading" type="{urn:aseXML:r38}ElectricityMeterReadData" minOccurs="0"/>
 *         &lt;element name="HighLowConsumption" type="{urn:aseXML:r38}HighLowConsumption" minOccurs="0"/>
 *         &lt;element name="RegisterIndexValue" type="{urn:aseXML:r38}RegisterIndexValue" minOccurs="0"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityMeterRegisterDetail", propOrder = {
    "registerID",
    "networkTariffCode",
    "networkAdditionalInformation",
    "unitOfMeasure",
    "timeOfDay",
    "multiplier",
    "dialFormat",
    "suffix",
    "controlledLoad",
    "consumptionType",
    "demand1",
    "demand2",
    "status",
    "directionIndicator",
    "previousReading",
    "highLowConsumption",
    "registerIndexValue",
    "fromDate",
    "toDate"
})
public class ElectricityMeterRegisterDetail {

    @XmlElement(name = "RegisterID")
    protected String registerID;
    @XmlElementRef(name = "NetworkTariffCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkTariffCode;
    @XmlElementRef(name = "NetworkAdditionalInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkAdditionalInformation;
    @XmlElementRef(name = "UnitOfMeasure", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unitOfMeasure;
    @XmlElementRef(name = "TimeOfDay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeOfDay;
    @XmlElementRef(name = "Multiplier", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> multiplier;
    @XmlElementRef(name = "DialFormat", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dialFormat;
    @XmlElementRef(name = "Suffix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suffix;
    @XmlElementRef(name = "ControlledLoad", type = JAXBElement.class, required = false)
    protected JAXBElement<String> controlledLoad;
    @XmlElementRef(name = "ConsumptionType", type = JAXBElement.class, required = false)
    protected JAXBElement<MeterConsumptionType> consumptionType;
    @XmlElementRef(name = "Demand1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> demand1;
    @XmlElementRef(name = "Demand2", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> demand2;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<MeterRegisterStatusCode> status;
    @XmlElementRef(name = "DirectionIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectionIndicator> directionIndicator;
    @XmlElementRef(name = "PreviousReading", type = JAXBElement.class, required = false)
    protected JAXBElement<ElectricityMeterReadData> previousReading;
    @XmlElementRef(name = "HighLowConsumption", type = JAXBElement.class, required = false)
    protected JAXBElement<HighLowConsumption> highLowConsumption;
    @XmlElementRef(name = "RegisterIndexValue", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registerIndexValue;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the registerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterID() {
        return registerID;
    }

    /**
     * Sets the value of the registerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterID(String value) {
        this.registerID = value;
    }

    /**
     * Gets the value of the networkTariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkTariffCode() {
        return networkTariffCode;
    }

    /**
     * Sets the value of the networkTariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkTariffCode(JAXBElement<String> value) {
        this.networkTariffCode = value;
    }

    /**
     * Gets the value of the networkAdditionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkAdditionalInformation() {
        return networkAdditionalInformation;
    }

    /**
     * Sets the value of the networkAdditionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkAdditionalInformation(JAXBElement<String> value) {
        this.networkAdditionalInformation = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitOfMeasure(JAXBElement<String> value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the timeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Sets the value of the timeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeOfDay(JAXBElement<String> value) {
        this.timeOfDay = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMultiplier(JAXBElement<BigDecimal> value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the dialFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDialFormat() {
        return dialFormat;
    }

    /**
     * Sets the value of the dialFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDialFormat(JAXBElement<BigDecimal> value) {
        this.dialFormat = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuffix(JAXBElement<String> value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the controlledLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getControlledLoad() {
        return controlledLoad;
    }

    /**
     * Sets the value of the controlledLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setControlledLoad(JAXBElement<String> value) {
        this.controlledLoad = value;
    }

    /**
     * Gets the value of the consumptionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeterConsumptionType }{@code >}
     *     
     */
    public JAXBElement<MeterConsumptionType> getConsumptionType() {
        return consumptionType;
    }

    /**
     * Sets the value of the consumptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeterConsumptionType }{@code >}
     *     
     */
    public void setConsumptionType(JAXBElement<MeterConsumptionType> value) {
        this.consumptionType = value;
    }

    /**
     * Gets the value of the demand1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDemand1() {
        return demand1;
    }

    /**
     * Sets the value of the demand1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDemand1(JAXBElement<BigInteger> value) {
        this.demand1 = value;
    }

    /**
     * Gets the value of the demand2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDemand2() {
        return demand2;
    }

    /**
     * Sets the value of the demand2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDemand2(JAXBElement<BigInteger> value) {
        this.demand2 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeterRegisterStatusCode }{@code >}
     *     
     */
    public JAXBElement<MeterRegisterStatusCode> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeterRegisterStatusCode }{@code >}
     *     
     */
    public void setStatus(JAXBElement<MeterRegisterStatusCode> value) {
        this.status = value;
    }

    /**
     * Gets the value of the directionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectionIndicator }{@code >}
     *     
     */
    public JAXBElement<DirectionIndicator> getDirectionIndicator() {
        return directionIndicator;
    }

    /**
     * Sets the value of the directionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectionIndicator }{@code >}
     *     
     */
    public void setDirectionIndicator(JAXBElement<DirectionIndicator> value) {
        this.directionIndicator = value;
    }

    /**
     * Gets the value of the previousReading property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElectricityMeterReadData }{@code >}
     *     
     */
    public JAXBElement<ElectricityMeterReadData> getPreviousReading() {
        return previousReading;
    }

    /**
     * Sets the value of the previousReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElectricityMeterReadData }{@code >}
     *     
     */
    public void setPreviousReading(JAXBElement<ElectricityMeterReadData> value) {
        this.previousReading = value;
    }

    /**
     * Gets the value of the highLowConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HighLowConsumption }{@code >}
     *     
     */
    public JAXBElement<HighLowConsumption> getHighLowConsumption() {
        return highLowConsumption;
    }

    /**
     * Sets the value of the highLowConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HighLowConsumption }{@code >}
     *     
     */
    public void setHighLowConsumption(JAXBElement<HighLowConsumption> value) {
        this.highLowConsumption = value;
    }

    /**
     * Gets the value of the registerIndexValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisterIndexValue() {
        return registerIndexValue;
    }

    /**
     * Sets the value of the registerIndexValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisterIndexValue(JAXBElement<String> value) {
        this.registerIndexValue = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

}
