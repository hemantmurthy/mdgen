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
 * Schema - MeterDataManagement
 * 
 * <p>Java class for GasMeterVerifyResponseWithMSNData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasMeterVerifyResponseWithMSNData">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}NMITransactionBase">
 *       &lt;sequence>
 *         &lt;element name="InitiatorReferenceNumber" type="{urn:aseXML:r38}UniqueIdentifier"/>
 *         &lt;element name="RevisedRead" type="{urn:aseXML:r38}GasMeterReadData"/>
 *         &lt;element name="AdjustmentReasonCode" type="{urn:aseXML:r38}IndexAdjustmentReasonCode"/>
 *         &lt;element name="MeterSerialNumber" type="{urn:aseXML:r38}MeterSerialNumber"/>
 *         &lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r34" default="r34" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasMeterVerifyResponseWithMSNData", propOrder = {
    "initiatorReferenceNumber",
    "revisedRead",
    "adjustmentReasonCode",
    "meterSerialNumber",
    "event"
})
public class GasMeterVerifyResponseWithMSNData
    extends NMITransactionBase
{

    @XmlElement(name = "InitiatorReferenceNumber", required = true)
    protected String initiatorReferenceNumber;
    @XmlElement(name = "RevisedRead", required = true)
    protected GasMeterReadData revisedRead;
    @XmlElement(name = "AdjustmentReasonCode", required = true)
    @XmlSchemaType(name = "string")
    protected IndexAdjustmentReasonCode adjustmentReasonCode;
    @XmlElement(name = "MeterSerialNumber", required = true)
    protected String meterSerialNumber;
    @XmlElement(name = "Event")
    protected List<Event> event;
    @XmlAttribute(name = "version")
    protected R34 version;

    /**
     * Gets the value of the initiatorReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorReferenceNumber() {
        return initiatorReferenceNumber;
    }

    /**
     * Sets the value of the initiatorReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorReferenceNumber(String value) {
        this.initiatorReferenceNumber = value;
    }

    /**
     * Gets the value of the revisedRead property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterReadData }
     *     
     */
    public GasMeterReadData getRevisedRead() {
        return revisedRead;
    }

    /**
     * Sets the value of the revisedRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterReadData }
     *     
     */
    public void setRevisedRead(GasMeterReadData value) {
        this.revisedRead = value;
    }

    /**
     * Gets the value of the adjustmentReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndexAdjustmentReasonCode }
     *     
     */
    public IndexAdjustmentReasonCode getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Sets the value of the adjustmentReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexAdjustmentReasonCode }
     *     
     */
    public void setAdjustmentReasonCode(IndexAdjustmentReasonCode value) {
        this.adjustmentReasonCode = value;
    }

    /**
     * Gets the value of the meterSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    /**
     * Sets the value of the meterSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterSerialNumber(String value) {
        this.meterSerialNumber = value;
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
     *     {@link R34 }
     *     
     */
    public R34 getVersion() {
        if (version == null) {
            return R34 .R_34;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R34 }
     *     
     */
    public void setVersion(R34 value) {
        this.version = value;
    }

}
