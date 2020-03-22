//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Row of the Electricity NMI Meter Register table
 * MSATS Data Model Table - CATS_Meter_Register
 * Replication Table Name - ElectricityNMIMeters
 * 			
 * 
 * <p>Java class for ElectricityNMIMeterRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityNMIMeterRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow">
 *       &lt;sequence>
 *         &lt;element name="NMI" type="{urn:aseXML:r38}NMIBase"/>
 *         &lt;group ref="{urn:aseXML:r38}ElectricityNMIMeterGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r19" default="r19" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityNMIMeterRow", propOrder = {
    "nmi",
    "serialNumber",
    "nextScheduledReadDate",
    "location",
    "hazard",
    "installationTypeCode",
    "route",
    "use",
    "point",
    "manufacturer",
    "model",
    "transformerLocation",
    "transformerType",
    "transformerRatio",
    "constant",
    "lastTestDate",
    "nextTestDate",
    "testResultAccuracy",
    "testResultNotes",
    "testPerformedBy",
    "measurementType",
    "readTypeCode",
    "remotePhoneNumber",
    "communicationsEquipmentType",
    "communicationsProtocol",
    "dataConversion",
    "dataValidations",
    "status",
    "program",
    "additionalSiteInformation",
    "estimationInstructions",
    "assetManagementPlan",
    "calibrationTables",
    "userAccessRights",
    "password",
    "testCalibrationProgram",
    "keyCode",
    "customerFundedMeter"
})
public class ElectricityNMIMeterRow
    extends ReplicationDateRangeRow
{

    @XmlElement(name = "NMI", required = true)
    protected String nmi;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElementRef(name = "NextScheduledReadDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nextScheduledReadDate;
    @XmlElementRef(name = "Location", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "Hazard", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hazard;
    @XmlElementRef(name = "InstallationTypeCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installationTypeCode;
    @XmlElementRef(name = "Route", type = JAXBElement.class, required = false)
    protected JAXBElement<String> route;
    @XmlElementRef(name = "Use", type = JAXBElement.class, required = false)
    protected JAXBElement<String> use;
    @XmlElementRef(name = "Point", type = JAXBElement.class, required = false)
    protected JAXBElement<String> point;
    @XmlElementRef(name = "Manufacturer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manufacturer;
    @XmlElementRef(name = "Model", type = JAXBElement.class, required = false)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "TransformerLocation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transformerLocation;
    @XmlElementRef(name = "TransformerType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transformerType;
    @XmlElementRef(name = "TransformerRatio", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transformerRatio;
    @XmlElementRef(name = "Constant", type = JAXBElement.class, required = false)
    protected JAXBElement<String> constant;
    @XmlElementRef(name = "LastTestDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastTestDate;
    @XmlElementRef(name = "NextTestDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nextTestDate;
    @XmlElementRef(name = "TestResultAccuracy", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> testResultAccuracy;
    @XmlElementRef(name = "TestResultNotes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> testResultNotes;
    @XmlElementRef(name = "TestPerformedBy", type = JAXBElement.class, required = false)
    protected JAXBElement<String> testPerformedBy;
    @XmlElementRef(name = "MeasurementType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> measurementType;
    @XmlElementRef(name = "ReadTypeCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> readTypeCode;
    @XmlElementRef(name = "RemotePhoneNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remotePhoneNumber;
    @XmlElementRef(name = "CommunicationsEquipmentType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> communicationsEquipmentType;
    @XmlElementRef(name = "CommunicationsProtocol", type = JAXBElement.class, required = false)
    protected JAXBElement<String> communicationsProtocol;
    @XmlElementRef(name = "DataConversion", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataConversion;
    @XmlElementRef(name = "DataValidations", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataValidations;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "Program", type = JAXBElement.class, required = false)
    protected JAXBElement<String> program;
    @XmlElementRef(name = "AdditionalSiteInformation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalSiteInformation;
    @XmlElementRef(name = "EstimationInstructions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estimationInstructions;
    @XmlElementRef(name = "AssetManagementPlan", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assetManagementPlan;
    @XmlElementRef(name = "CalibrationTables", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calibrationTables;
    @XmlElementRef(name = "UserAccessRights", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userAccessRights;
    @XmlElementRef(name = "Password", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "TestCalibrationProgram", type = JAXBElement.class, required = false)
    protected JAXBElement<String> testCalibrationProgram;
    @XmlElementRef(name = "KeyCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyCode;
    @XmlElementRef(name = "CustomerFundedMeter", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> customerFundedMeter;
    @XmlAttribute(name = "version")
    protected R19 version;

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
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the nextScheduledReadDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextScheduledReadDate() {
        return nextScheduledReadDate;
    }

    /**
     * Sets the value of the nextScheduledReadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextScheduledReadDate(JAXBElement<XMLGregorianCalendar> value) {
        this.nextScheduledReadDate = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the hazard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHazard() {
        return hazard;
    }

    /**
     * Sets the value of the hazard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHazard(JAXBElement<String> value) {
        this.hazard = value;
    }

    /**
     * Gets the value of the installationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallationTypeCode() {
        return installationTypeCode;
    }

    /**
     * Sets the value of the installationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallationTypeCode(JAXBElement<String> value) {
        this.installationTypeCode = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoute(JAXBElement<String> value) {
        this.route = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUse(JAXBElement<String> value) {
        this.use = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoint(JAXBElement<String> value) {
        this.point = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManufacturer(JAXBElement<String> value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Gets the value of the transformerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransformerLocation() {
        return transformerLocation;
    }

    /**
     * Sets the value of the transformerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransformerLocation(JAXBElement<String> value) {
        this.transformerLocation = value;
    }

    /**
     * Gets the value of the transformerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransformerType() {
        return transformerType;
    }

    /**
     * Sets the value of the transformerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransformerType(JAXBElement<String> value) {
        this.transformerType = value;
    }

    /**
     * Gets the value of the transformerRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransformerRatio() {
        return transformerRatio;
    }

    /**
     * Sets the value of the transformerRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransformerRatio(JAXBElement<String> value) {
        this.transformerRatio = value;
    }

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConstant(JAXBElement<String> value) {
        this.constant = value;
    }

    /**
     * Gets the value of the lastTestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastTestDate() {
        return lastTestDate;
    }

    /**
     * Sets the value of the lastTestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastTestDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastTestDate = value;
    }

    /**
     * Gets the value of the nextTestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextTestDate() {
        return nextTestDate;
    }

    /**
     * Sets the value of the nextTestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextTestDate(JAXBElement<XMLGregorianCalendar> value) {
        this.nextTestDate = value;
    }

    /**
     * Gets the value of the testResultAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTestResultAccuracy() {
        return testResultAccuracy;
    }

    /**
     * Sets the value of the testResultAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTestResultAccuracy(JAXBElement<BigDecimal> value) {
        this.testResultAccuracy = value;
    }

    /**
     * Gets the value of the testResultNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTestResultNotes() {
        return testResultNotes;
    }

    /**
     * Sets the value of the testResultNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTestResultNotes(JAXBElement<String> value) {
        this.testResultNotes = value;
    }

    /**
     * Gets the value of the testPerformedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTestPerformedBy() {
        return testPerformedBy;
    }

    /**
     * Sets the value of the testPerformedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTestPerformedBy(JAXBElement<String> value) {
        this.testPerformedBy = value;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeasurementType(JAXBElement<String> value) {
        this.measurementType = value;
    }

    /**
     * Gets the value of the readTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReadTypeCode() {
        return readTypeCode;
    }

    /**
     * Sets the value of the readTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReadTypeCode(JAXBElement<String> value) {
        this.readTypeCode = value;
    }

    /**
     * Gets the value of the remotePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemotePhoneNumber() {
        return remotePhoneNumber;
    }

    /**
     * Sets the value of the remotePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemotePhoneNumber(JAXBElement<String> value) {
        this.remotePhoneNumber = value;
    }

    /**
     * Gets the value of the communicationsEquipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommunicationsEquipmentType() {
        return communicationsEquipmentType;
    }

    /**
     * Sets the value of the communicationsEquipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommunicationsEquipmentType(JAXBElement<String> value) {
        this.communicationsEquipmentType = value;
    }

    /**
     * Gets the value of the communicationsProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommunicationsProtocol() {
        return communicationsProtocol;
    }

    /**
     * Sets the value of the communicationsProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommunicationsProtocol(JAXBElement<String> value) {
        this.communicationsProtocol = value;
    }

    /**
     * Gets the value of the dataConversion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataConversion() {
        return dataConversion;
    }

    /**
     * Sets the value of the dataConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataConversion(JAXBElement<String> value) {
        this.dataConversion = value;
    }

    /**
     * Gets the value of the dataValidations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataValidations() {
        return dataValidations;
    }

    /**
     * Sets the value of the dataValidations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataValidations(JAXBElement<String> value) {
        this.dataValidations = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProgram(JAXBElement<String> value) {
        this.program = value;
    }

    /**
     * Gets the value of the additionalSiteInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalSiteInformation() {
        return additionalSiteInformation;
    }

    /**
     * Sets the value of the additionalSiteInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalSiteInformation(JAXBElement<String> value) {
        this.additionalSiteInformation = value;
    }

    /**
     * Gets the value of the estimationInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstimationInstructions() {
        return estimationInstructions;
    }

    /**
     * Sets the value of the estimationInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstimationInstructions(JAXBElement<String> value) {
        this.estimationInstructions = value;
    }

    /**
     * Gets the value of the assetManagementPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssetManagementPlan() {
        return assetManagementPlan;
    }

    /**
     * Sets the value of the assetManagementPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssetManagementPlan(JAXBElement<String> value) {
        this.assetManagementPlan = value;
    }

    /**
     * Gets the value of the calibrationTables property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalibrationTables() {
        return calibrationTables;
    }

    /**
     * Sets the value of the calibrationTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalibrationTables(JAXBElement<String> value) {
        this.calibrationTables = value;
    }

    /**
     * Gets the value of the userAccessRights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserAccessRights() {
        return userAccessRights;
    }

    /**
     * Sets the value of the userAccessRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserAccessRights(JAXBElement<String> value) {
        this.userAccessRights = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the testCalibrationProgram property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTestCalibrationProgram() {
        return testCalibrationProgram;
    }

    /**
     * Sets the value of the testCalibrationProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTestCalibrationProgram(JAXBElement<String> value) {
        this.testCalibrationProgram = value;
    }

    /**
     * Gets the value of the keyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyCode() {
        return keyCode;
    }

    /**
     * Sets the value of the keyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyCode(JAXBElement<String> value) {
        this.keyCode = value;
    }

    /**
     * Gets the value of the customerFundedMeter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCustomerFundedMeter() {
        return customerFundedMeter;
    }

    /**
     * Sets the value of the customerFundedMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCustomerFundedMeter(JAXBElement<Boolean> value) {
        this.customerFundedMeter = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R19 }
     *     
     */
    public R19 getVersion() {
        if (version == null) {
            return R19 .R_19;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R19 }
     *     
     */
    public void setVersion(R19 value) {
        this.version = value;
    }

}
