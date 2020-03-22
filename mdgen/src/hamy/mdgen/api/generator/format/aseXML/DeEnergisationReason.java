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
 * <p>Java class for De-energisationReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="De-energisationReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="40"/>
 *     &lt;enumeration value="Customer Requested"/>
 *     &lt;enumeration value="Move Out"/>
 *     &lt;enumeration value="Non-Payment (DNP)"/>
 *     &lt;enumeration value="Unauthorised Usage (DNI)"/>
 *     &lt;enumeration value="Illegal Usage"/>
 *     &lt;enumeration value="No Access"/>
 *     &lt;enumeration value="Safety"/>
 *     &lt;enumeration value="Defect"/>
 *     &lt;enumeration value="Site Works"/>
 *     &lt;enumeration value="Breach of Contract"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "De-energisationReason")
@XmlEnum
public enum DeEnergisationReason {

    @XmlEnumValue("Customer Requested")
    CUSTOMER_REQUESTED("Customer Requested"),
    @XmlEnumValue("Move Out")
    MOVE_OUT("Move Out"),
    @XmlEnumValue("Non-Payment (DNP)")
    NON_PAYMENT_DNP("Non-Payment (DNP)"),
    @XmlEnumValue("Unauthorised Usage (DNI)")
    UNAUTHORISED_USAGE_DNI("Unauthorised Usage (DNI)"),
    @XmlEnumValue("Illegal Usage")
    ILLEGAL_USAGE("Illegal Usage"),
    @XmlEnumValue("No Access")
    NO_ACCESS("No Access"),
    @XmlEnumValue("Safety")
    SAFETY("Safety"),
    @XmlEnumValue("Defect")
    DEFECT("Defect"),
    @XmlEnumValue("Site Works")
    SITE_WORKS("Site Works"),
    @XmlEnumValue("Breach of Contract")
    BREACH_OF_CONTRACT("Breach of Contract"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DeEnergisationReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeEnergisationReason fromValue(String v) {
        for (DeEnergisationReason c: DeEnergisationReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
