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
 * <p>Java class for SpecialReadReasonCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialReadReasonCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account Investigation"/>
 *     &lt;enumeration value="Final Read"/>
 *     &lt;enumeration value="Final Read for Disconnection on Non-Payment"/>
 *     &lt;enumeration value="Final and Opening Read"/>
 *     &lt;enumeration value="Opening Read"/>
 *     &lt;enumeration value="Change of Retailer"/>
 *     &lt;enumeration value="Change of Customer"/>
 *     &lt;enumeration value="Check Read"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Sticker Removed"/>
 *     &lt;enumeration value="Final Read Stickered"/>
 *     &lt;enumeration value="Read Following Disconnection for Non-Payment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialReadReasonCode")
@XmlEnum
public enum SpecialReadReasonCode {

    @XmlEnumValue("Account Investigation")
    ACCOUNT_INVESTIGATION("Account Investigation"),
    @XmlEnumValue("Final Read")
    FINAL_READ("Final Read"),
    @XmlEnumValue("Final Read for Disconnection on Non-Payment")
    FINAL_READ_FOR_DISCONNECTION_ON_NON_PAYMENT("Final Read for Disconnection on Non-Payment"),
    @XmlEnumValue("Final and Opening Read")
    FINAL_AND_OPENING_READ("Final and Opening Read"),
    @XmlEnumValue("Opening Read")
    OPENING_READ("Opening Read"),
    @XmlEnumValue("Change of Retailer")
    CHANGE_OF_RETAILER("Change of Retailer"),
    @XmlEnumValue("Change of Customer")
    CHANGE_OF_CUSTOMER("Change of Customer"),
    @XmlEnumValue("Check Read")
    CHECK_READ("Check Read"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Sticker Removed")
    STICKER_REMOVED("Sticker Removed"),
    @XmlEnumValue("Final Read Stickered")
    FINAL_READ_STICKERED("Final Read Stickered"),
    @XmlEnumValue("Read Following Disconnection for Non-Payment")
    READ_FOLLOWING_DISCONNECTION_FOR_NON_PAYMENT("Read Following Disconnection for Non-Payment");
    private final String value;

    SpecialReadReasonCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialReadReasonCode fromValue(String v) {
        for (SpecialReadReasonCode c: SpecialReadReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
