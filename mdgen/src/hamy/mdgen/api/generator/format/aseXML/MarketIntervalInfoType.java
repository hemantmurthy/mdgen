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
 * <p>Java class for MarketIntervalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketIntervalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentInterval" type="{urn:aseXML:r38}GasIntervalInfoType"/>
 *         &lt;element name="NextInterval" type="{urn:aseXML:r38}GasIntervalInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIntervalInfoType", propOrder = {
    "currentInterval",
    "nextInterval"
})
public class MarketIntervalInfoType {

    @XmlElement(name = "CurrentInterval", required = true)
    protected GasIntervalInfoType currentInterval;
    @XmlElement(name = "NextInterval", required = true)
    protected GasIntervalInfoType nextInterval;

    /**
     * Gets the value of the currentInterval property.
     * 
     * @return
     *     possible object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public GasIntervalInfoType getCurrentInterval() {
        return currentInterval;
    }

    /**
     * Sets the value of the currentInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public void setCurrentInterval(GasIntervalInfoType value) {
        this.currentInterval = value;
    }

    /**
     * Gets the value of the nextInterval property.
     * 
     * @return
     *     possible object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public GasIntervalInfoType getNextInterval() {
        return nextInterval;
    }

    /**
     * Sets the value of the nextInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasIntervalInfoType }
     *     
     */
    public void setNextInterval(GasIntervalInfoType value) {
        this.nextInterval = value;
    }

}
