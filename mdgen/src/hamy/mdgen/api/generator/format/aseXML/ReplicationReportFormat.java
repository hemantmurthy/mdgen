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
 * 
 * Purpose - container for a report having the same structure as used by the table replication transactions
 * Detail - Where a report returns a related set of table contents, a standard container may be used, since the structure of the replication block will impose structure on the report in terms of format.
 * 			
 * 
 * <p>Java class for ReplicationReportFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplicationReportFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}BaseReportFormat">
 *       &lt;sequence>
 *         &lt;element name="ReplicationBlock" type="{urn:aseXML:r38}ReplicationBlock" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplicationReportFormat", propOrder = {
    "replicationBlock"
})
public class ReplicationReportFormat
    extends BaseReportFormat
{

    @XmlElement(name = "ReplicationBlock", required = true)
    protected List<ReplicationBlock> replicationBlock;

    /**
     * Gets the value of the replicationBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replicationBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplicationBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplicationBlock }
     * 
     * 
     */
    public List<ReplicationBlock> getReplicationBlock() {
        if (replicationBlock == null) {
            replicationBlock = new ArrayList<ReplicationBlock>();
        }
        return this.replicationBlock;
    }

}
