//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProfieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserProfieType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPF"/>
 *     &lt;enumeration value="UBPF"/>
 *     &lt;enumeration value="UIPF"/>
 *     &lt;enumeration value="RPF"/>
 *     &lt;enumeration value="SPF"/>
 *     &lt;enumeration value="UUAFGPF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserProfieType")
@XmlEnum
public enum UserProfieType {

    UPF,
    UBPF,
    UIPF,
    RPF,
    SPF,
    UUAFGPF;

    public String value() {
        return name();
    }

    public static UserProfieType fromValue(String v) {
        return valueOf(v);
    }

}
