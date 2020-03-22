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
 * List of flow control alerts.
 * 
 * <p>Java class for FlowControlAlerts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowControlAlerts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlowControlAlert" type="{urn:aseXML:r38}FlowControlAlert" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowControlAlerts", propOrder = {
    "flowControlAlert"
})
public class FlowControlAlerts {

    @XmlElement(name = "FlowControlAlert")
    protected List<FlowControlAlert> flowControlAlert;

    /**
     * Gets the value of the flowControlAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flowControlAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowControlAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowControlAlert }
     * 
     * 
     */
    public List<FlowControlAlert> getFlowControlAlert() {
        if (flowControlAlert == null) {
            flowControlAlert = new ArrayList<FlowControlAlert>();
        }
        return this.flowControlAlert;
    }

}
