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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GasBidStepsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasBidStepsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidStep" type="{urn:aseXML:r38}GasBidStepType" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasBidStepsType", propOrder = {
    "bidStep"
})
public class GasBidStepsType {

    @XmlElement(name = "BidStep", required = true)
    protected List<GasBidStepType> bidStep;

    /**
     * Gets the value of the bidStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GasBidStepType }
     * 
     * 
     */
    public List<GasBidStepType> getBidStep() {
        if (bidStep == null) {
            bidStep = new ArrayList<GasBidStepType>();
        }
        return this.bidStep;
    }

}
