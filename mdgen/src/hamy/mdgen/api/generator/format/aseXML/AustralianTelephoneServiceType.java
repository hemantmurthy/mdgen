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
 * <p>Java class for AustralianTelephoneServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AustralianTelephoneServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fixed Voice"/>
 *     &lt;enumeration value="Mobile Voice"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Modem"/>
 *     &lt;enumeration value="Pager"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AustralianTelephoneServiceType")
@XmlEnum
public enum AustralianTelephoneServiceType {

    @XmlEnumValue("Fixed Voice")
    FIXED_VOICE("Fixed Voice"),
    @XmlEnumValue("Mobile Voice")
    MOBILE_VOICE("Mobile Voice"),
    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Modem")
    MODEM("Modem"),
    @XmlEnumValue("Pager")
    PAGER("Pager");
    private final String value;

    AustralianTelephoneServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AustralianTelephoneServiceType fromValue(String v) {
        for (AustralianTelephoneServiceType c: AustralianTelephoneServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
