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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Assessment issue
 * 
 * <p>Java class for NOSIssueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOSIssueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssueId" type="{urn:aseXML:r38}NEMMCOIssueIdType"/>
 *         &lt;element name="IssueType" type="{urn:aseXML:r38}EnumAssessmentIssueType"/>
 *         &lt;element name="RaisedBy" type="{urn:aseXML:r38}NOSUserIdType"/>
 *         &lt;element name="RaisedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Note" type="{urn:aseXML:r38}NoteType"/>
 *         &lt;element name="Resolved" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operationType" type="{urn:aseXML:r38}NOSOperationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOSIssueType", propOrder = {
    "issueId",
    "issueType",
    "raisedBy",
    "raisedOn",
    "note",
    "resolved"
})
public class NOSIssueType {

    @XmlElement(name = "IssueId")
    protected int issueId;
    @XmlElement(name = "IssueType", required = true)
    @XmlSchemaType(name = "string")
    protected EnumAssessmentIssueType issueType;
    @XmlElement(name = "RaisedBy", required = true)
    protected String raisedBy;
    @XmlElement(name = "RaisedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar raisedOn;
    @XmlElement(name = "Note", required = true)
    protected NoteType note;
    @XmlElement(name = "Resolved")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolved;
    @XmlAttribute(name = "operationType")
    protected NOSOperationType operationType;

    /**
     * Gets the value of the issueId property.
     * 
     */
    public int getIssueId() {
        return issueId;
    }

    /**
     * Sets the value of the issueId property.
     * 
     */
    public void setIssueId(int value) {
        this.issueId = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumAssessmentIssueType }
     *     
     */
    public EnumAssessmentIssueType getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAssessmentIssueType }
     *     
     */
    public void setIssueType(EnumAssessmentIssueType value) {
        this.issueType = value;
    }

    /**
     * Gets the value of the raisedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaisedBy() {
        return raisedBy;
    }

    /**
     * Sets the value of the raisedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaisedBy(String value) {
        this.raisedBy = value;
    }

    /**
     * Gets the value of the raisedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRaisedOn() {
        return raisedOn;
    }

    /**
     * Sets the value of the raisedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRaisedOn(XMLGregorianCalendar value) {
        this.raisedOn = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link NoteType }
     *     
     */
    public NoteType getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteType }
     *     
     */
    public void setNote(NoteType value) {
        this.note = value;
    }

    /**
     * Gets the value of the resolved property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolved() {
        return resolved;
    }

    /**
     * Sets the value of the resolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolved(XMLGregorianCalendar value) {
        this.resolved = value;
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
