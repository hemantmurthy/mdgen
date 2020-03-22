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
 * <p>Java class for ChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NUOS Charge"/>
 *     &lt;enumeration value="Event Based Charge"/>
 *     &lt;enumeration value="GSL Credit Charge"/>
 *     &lt;enumeration value="Excluded Service Charge"/>
 *     &lt;enumeration value="Interest Charge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeType")
@XmlEnum
public enum ChargeType {

    @XmlEnumValue("NUOS Charge")
    NUOS_CHARGE("NUOS Charge"),
    @XmlEnumValue("Event Based Charge")
    EVENT_BASED_CHARGE("Event Based Charge"),
    @XmlEnumValue("GSL Credit Charge")
    GSL_CREDIT_CHARGE("GSL Credit Charge"),
    @XmlEnumValue("Excluded Service Charge")
    EXCLUDED_SERVICE_CHARGE("Excluded Service Charge"),
    @XmlEnumValue("Interest Charge")
    INTEREST_CHARGE("Interest Charge");
    private final String value;

    ChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeType fromValue(String v) {
        for (ChargeType c: ChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
