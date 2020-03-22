//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OneWayNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneWayNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSVNotificationDetail" type="{urn:aseXML:r38}CSVDataWithName"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{urn:aseXML:r38}r25" default="r25" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneWayNotification", propOrder = {
    "csvNotificationDetail"
})
public class OneWayNotification {

    @XmlElement(name = "CSVNotificationDetail", required = true)
    protected CSVDataWithName csvNotificationDetail;
    @XmlAttribute(name = "version")
    protected R25 version;

    /**
     * Gets the value of the csvNotificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CSVDataWithName }
     *     
     */
    public CSVDataWithName getCSVNotificationDetail() {
        return csvNotificationDetail;
    }

    /**
     * Sets the value of the csvNotificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVDataWithName }
     *     
     */
    public void setCSVNotificationDetail(CSVDataWithName value) {
        this.csvNotificationDetail = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R25 }
     *     
     */
    public R25 getVersion() {
        if (version == null) {
            return R25 .R_25;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R25 }
     *     
     */
    public void setVersion(R25 value) {
        this.version = value;
    }

}
