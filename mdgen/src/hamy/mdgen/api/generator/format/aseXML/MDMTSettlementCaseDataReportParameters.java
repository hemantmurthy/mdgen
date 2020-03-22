//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Parameter definition for reports requiring only the settlement case identifier
 * Report Names - SettlementAggregatedData, SettlementNonAggregatedData, SettlementProfileShape
 * MSATS Reports - RM23, RM24, RM25 
 * Detail - Note that the same report parameters type can be used for several reports since they all use the
 * same parameters. It is thus the report name that will indicate what output will be produced.
 * 			
 * 
 * <p>Java class for MDMTSettlementCaseDataReportParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MDMTSettlementCaseDataReportParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}BaseReportParameters">
 *       &lt;sequence>
 *         &lt;element name="SettlementCase" type="{urn:aseXML:r38}MDMSettlementCaseIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDMTSettlementCaseDataReportParameters", propOrder = {
    "settlementCase"
})
public class MDMTSettlementCaseDataReportParameters
    extends BaseReportParameters
{

    @XmlElement(name = "SettlementCase", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger settlementCase;

    /**
     * Gets the value of the settlementCase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlementCase() {
        return settlementCase;
    }

    /**
     * Sets the value of the settlementCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlementCase(BigInteger value) {
        this.settlementCase = value;
    }

}
