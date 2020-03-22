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
 * <p>Java class for TroubleCause.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TroubleCause">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Animal or bird damage"/>
 *     &lt;enumeration value="Associated to work on a nearby outage"/>
 *     &lt;enumeration value="Associated with planned outage"/>
 *     &lt;enumeration value="Damage caused by tree"/>
 *     &lt;enumeration value="False call"/>
 *     &lt;enumeration value="No access"/>
 *     &lt;enumeration value="No identified cause"/>
 *     &lt;enumeration value="OK on arrival"/>
 *     &lt;enumeration value="Pollution buildup"/>
 *     &lt;enumeration value="Problem in zone substation"/>
 *     &lt;enumeration value="Problem on customer's property"/>
 *     &lt;enumeration value="Problem with overhead cable or equipment"/>
 *     &lt;enumeration value="Problem with underground cable"/>
 *     &lt;enumeration value="Problem with underground equipment"/>
 *     &lt;enumeration value="Reconnection / restoration"/>
 *     &lt;enumeration value="Storm damage"/>
 *     &lt;enumeration value="Third party damage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TroubleCause")
@XmlEnum
public enum TroubleCause {

    @XmlEnumValue("Animal or bird damage")
    ANIMAL_OR_BIRD_DAMAGE("Animal or bird damage"),
    @XmlEnumValue("Associated to work on a nearby outage")
    ASSOCIATED_TO_WORK_ON_A_NEARBY_OUTAGE("Associated to work on a nearby outage"),
    @XmlEnumValue("Associated with planned outage")
    ASSOCIATED_WITH_PLANNED_OUTAGE("Associated with planned outage"),
    @XmlEnumValue("Damage caused by tree")
    DAMAGE_CAUSED_BY_TREE("Damage caused by tree"),
    @XmlEnumValue("False call")
    FALSE_CALL("False call"),
    @XmlEnumValue("No access")
    NO_ACCESS("No access"),
    @XmlEnumValue("No identified cause")
    NO_IDENTIFIED_CAUSE("No identified cause"),
    @XmlEnumValue("OK on arrival")
    OK_ON_ARRIVAL("OK on arrival"),
    @XmlEnumValue("Pollution buildup")
    POLLUTION_BUILDUP("Pollution buildup"),
    @XmlEnumValue("Problem in zone substation")
    PROBLEM_IN_ZONE_SUBSTATION("Problem in zone substation"),
    @XmlEnumValue("Problem on customer's property")
    PROBLEM_ON_CUSTOMER_S_PROPERTY("Problem on customer's property"),
    @XmlEnumValue("Problem with overhead cable or equipment")
    PROBLEM_WITH_OVERHEAD_CABLE_OR_EQUIPMENT("Problem with overhead cable or equipment"),
    @XmlEnumValue("Problem with underground cable")
    PROBLEM_WITH_UNDERGROUND_CABLE("Problem with underground cable"),
    @XmlEnumValue("Problem with underground equipment")
    PROBLEM_WITH_UNDERGROUND_EQUIPMENT("Problem with underground equipment"),
    @XmlEnumValue("Reconnection / restoration")
    RECONNECTION_RESTORATION("Reconnection / restoration"),
    @XmlEnumValue("Storm damage")
    STORM_DAMAGE("Storm damage"),
    @XmlEnumValue("Third party damage")
    THIRD_PARTY_DAMAGE("Third party damage");
    private final String value;

    TroubleCause(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TroubleCause fromValue(String v) {
        for (TroubleCause c: TroubleCause.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
