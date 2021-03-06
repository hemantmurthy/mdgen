//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Assessment note
 * 
 * <p>Java class for NOSAssessmentNoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOSAssessmentNoteType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:aseXML:r38}NoteType">
 *       &lt;sequence>
 *         &lt;element name="NoteId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{urn:aseXML:r38}EnumAssessmentNoteType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operationType" type="{urn:aseXML:r38}NOSOperationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOSAssessmentNoteType", propOrder = {
    "noteId",
    "type"
})
public class NOSAssessmentNoteType
    extends NoteType
{

    @XmlElement(name = "NoteId")
    protected int noteId;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected EnumAssessmentNoteType type;
    @XmlAttribute(name = "operationType")
    protected NOSOperationType operationType;

    /**
     * Gets the value of the noteId property.
     * 
     */
    public int getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     */
    public void setNoteId(int value) {
        this.noteId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumAssessmentNoteType }
     *     
     */
    public EnumAssessmentNoteType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAssessmentNoteType }
     *     
     */
    public void setType(EnumAssessmentNoteType value) {
        this.type = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link NOSOperationType }
     *     
     */
    public NOSOperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOSOperationType }
     *     
     */
    public void setOperationType(NOSOperationType value) {
        this.operationType = value;
    }

}
