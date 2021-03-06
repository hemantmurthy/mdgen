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
 * <p>Java class for GasBidSearchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasBidSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidType" type="{urn:aseXML:r38}GasInjectWithdrawType"/>
 *         &lt;element name="NMI" type="{urn:aseXML:r38}NMI"/>
 *         &lt;element name="Period" type="{urn:aseXML:r38}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasBidSearchType", propOrder = {
    "bidType",
    "nmi",
    "period"
})
public class GasBidSearchType {

    @XmlElement(name = "BidType", required = true)
    @XmlSchemaType(name = "string")
    protected GasInjectWithdrawType bidType;
    @XmlElement(name = "NMI", required = true)
    protected NMI nmi;
    @XmlElement(name = "Period")
    protected Period period;

    /**
     * Gets the value of the bidType property.
     * 
     * @return
     *     possible object is
     *     {@link GasInjectWithdrawType }
     *     
     */
    public GasInjectWithdrawType getBidType() {
        return bidType;
    }

    /**
     * Sets the value of the bidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasInjectWithdrawType }
     *     
     */
    public void setBidType(GasInjectWithdrawType value) {
        this.bidType = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link NMI }
     *     
     */
    public NMI getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMI }
     *     
     */
    public void setNMI(NMI value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

}
