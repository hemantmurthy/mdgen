//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MovementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MovementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Reconciliation"/>
 *     &lt;enumeration value="Site Vacant"/>
 *     &lt;enumeration value="RecCustConf"/>
 *     &lt;enumeration value="RecPerRetailer"/>
 *     &lt;enumeration value="RecPerDNSP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MovementType")
@XmlEnum
public enum MovementType {

    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Reconciliation")
    RECONCILIATION("Reconciliation"),
    @XmlEnumValue("Site Vacant")
    SITE_VACANT("Site Vacant"),
    @XmlEnumValue("RecCustConf")
    REC_CUST_CONF("RecCustConf"),
    @XmlEnumValue("RecPerRetailer")
    REC_PER_RETAILER("RecPerRetailer"),
    @XmlEnumValue("RecPerDNSP")
    REC_PER_DNSP("RecPerDNSP");
    private final String value;

    MovementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MovementType fromValue(String v) {
        for (MovementType c: MovementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
