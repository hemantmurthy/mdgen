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
 * <p>Java class for HSMStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HSMStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Offline"/>
 *     &lt;enumeration value="Synchronised"/>
 *     &lt;enumeration value="Unsynchronised"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HSMStatus")
@XmlEnum
public enum HSMStatus {

    @XmlEnumValue("Offline")
    OFFLINE("Offline"),
    @XmlEnumValue("Synchronised")
    SYNCHRONISED("Synchronised"),
    @XmlEnumValue("Unsynchronised")
    UNSYNCHRONISED("Unsynchronised");
    private final String value;

    HSMStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HSMStatus fromValue(String v) {
        for (HSMStatus c: HSMStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
