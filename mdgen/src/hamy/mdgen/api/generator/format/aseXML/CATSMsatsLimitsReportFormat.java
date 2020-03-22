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
 * 
 * Purpose - Format for a CATS MSATS Limits Report
 * Report Name - MsatsLimits
 * 			
 * 
 * <p>Java class for CATSMsatsLimitsReportFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATSMsatsLimitsReportFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}BaseReportFormat">
 *       &lt;sequence>
 *         &lt;element name="MsatsLimits" type="{urn:aseXML:r38}MsatsLimits"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSMsatsLimitsReportFormat", propOrder = {
    "msatsLimits"
})
public class CATSMsatsLimitsReportFormat
    extends BaseReportFormat
{

    @XmlElement(name = "MsatsLimits", required = true)
    protected MsatsLimits msatsLimits;

    /**
     * Gets the value of the msatsLimits property.
     * 
     * @return
     *     possible object is
     *     {@link MsatsLimits }
     *     
     */
    public MsatsLimits getMsatsLimits() {
        return msatsLimits;
    }

    /**
     * Sets the value of the msatsLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsatsLimits }
     *     
     */
    public void setMsatsLimits(MsatsLimits value) {
        this.msatsLimits = value;
    }

}
