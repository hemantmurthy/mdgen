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
 * <p>Java class for MDMSettlementRunType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MDMSettlementRunType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RREV2"/>
 *     &lt;enumeration value="RREV1"/>
 *     &lt;enumeration value="SPECIAL"/>
 *     &lt;enumeration value="PRELIMINARY"/>
 *     &lt;enumeration value="FINAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MDMSettlementRunType")
@XmlEnum
public enum MDMSettlementRunType {

    @XmlEnumValue("RREV2")
    RREV_2("RREV2"),
    @XmlEnumValue("RREV1")
    RREV_1("RREV1"),
    SPECIAL("SPECIAL"),
    PRELIMINARY("PRELIMINARY"),
    FINAL("FINAL");
    private final String value;

    MDMSettlementRunType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDMSettlementRunType fromValue(String v) {
        for (MDMSettlementRunType c: MDMSettlementRunType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
