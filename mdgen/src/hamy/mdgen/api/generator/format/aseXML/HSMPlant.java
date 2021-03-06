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
 * <p>Java class for HSMPlant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HSMPlant">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Generator"/>
 *     &lt;enumeration value="Load"/>
 *     &lt;enumeration value="Region"/>
 *     &lt;enumeration value="Shunt"/>
 *     &lt;enumeration value="Station"/>
 *     &lt;enumeration value="Static VAR Compensator"/>
 *     &lt;enumeration value="Switch"/>
 *     &lt;enumeration value="Transformer"/>
 *     &lt;enumeration value="Transmission Line"/>
 *     &lt;enumeration value="Zero Impedance Branch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HSMPlant")
@XmlEnum
public enum HSMPlant {

    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Generator")
    GENERATOR("Generator"),
    @XmlEnumValue("Load")
    LOAD("Load"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("Shunt")
    SHUNT("Shunt"),
    @XmlEnumValue("Station")
    STATION("Station"),
    @XmlEnumValue("Static VAR Compensator")
    STATIC_VAR_COMPENSATOR("Static VAR Compensator"),
    @XmlEnumValue("Switch")
    SWITCH("Switch"),
    @XmlEnumValue("Transformer")
    TRANSFORMER("Transformer"),
    @XmlEnumValue("Transmission Line")
    TRANSMISSION_LINE("Transmission Line"),
    @XmlEnumValue("Zero Impedance Branch")
    ZERO_IMPEDANCE_BRANCH("Zero Impedance Branch");
    private final String value;

    HSMPlant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HSMPlant fromValue(String v) {
        for (HSMPlant c: HSMPlant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
