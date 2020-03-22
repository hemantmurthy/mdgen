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
 * <p>Java class for TransactionPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPriority">
 *   &lt;restriction base="{urn:aseXML:r38}Priority">
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="Low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionPriority")
@XmlEnum(Priority.class)
public enum TransactionPriority {

    @XmlEnumValue("High")
    HIGH(Priority.HIGH),
    @XmlEnumValue("Medium")
    MEDIUM(Priority.MEDIUM),
    @XmlEnumValue("Low")
    LOW(Priority.LOW);
    private final Priority value;

    TransactionPriority(Priority v) {
        value = v;
    }

    public Priority value() {
        return value;
    }

    public static TransactionPriority fromValue(Priority v) {
        for (TransactionPriority c: TransactionPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
