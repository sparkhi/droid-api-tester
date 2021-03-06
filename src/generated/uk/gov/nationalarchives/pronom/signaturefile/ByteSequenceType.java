
package uk.gov.nationalarchives.pronom.signaturefile;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByteSequenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByteSequenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="SubSequence" type="{http://www.nationalarchives.gov.uk/pronom/SignatureFile}SubSequenceType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Reference"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="BOFoffset"/&gt;
 *             &lt;enumeration value="EOFoffset"/&gt;
 *             &lt;enumeration value="IndirectBOFoffset"/&gt;
 *             &lt;enumeration value="IndirectEOFoffset"/&gt;
 *             &lt;enumeration value="NOoffset"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Endianness"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Big-endian"/&gt;
 *             &lt;enumeration value="Little-endian"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="IndirectOffsetLocation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="IndirectOffsetLength" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByteSequenceType", propOrder = {
    "subSequence"
})
public class ByteSequenceType {

    @XmlElement(name = "SubSequence")
    protected List<SubSequenceType> subSequence;
    @XmlAttribute(name = "Reference")
    protected String reference;
    @XmlAttribute(name = "Endianness")
    protected String endianness;
    @XmlAttribute(name = "IndirectOffsetLocation")
    @XmlSchemaType(name = "anySimpleType")
    protected String indirectOffsetLocation;
    @XmlAttribute(name = "IndirectOffsetLength")
    @XmlSchemaType(name = "anySimpleType")
    protected String indirectOffsetLength;

    /**
     * Gets the value of the subSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubSequenceType }
     * 
     * 
     */
    public List<SubSequenceType> getSubSequence() {
        if (subSequence == null) {
            subSequence = new ArrayList<SubSequenceType>();
        }
        return this.subSequence;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the endianness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndianness() {
        return endianness;
    }

    /**
     * Sets the value of the endianness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndianness(String value) {
        this.endianness = value;
    }

    /**
     * Gets the value of the indirectOffsetLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirectOffsetLocation() {
        return indirectOffsetLocation;
    }

    /**
     * Sets the value of the indirectOffsetLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirectOffsetLocation(String value) {
        this.indirectOffsetLocation = value;
    }

    /**
     * Gets the value of the indirectOffsetLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirectOffsetLength() {
        return indirectOffsetLength;
    }

    /**
     * Sets the value of the indirectOffsetLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirectOffsetLength(String value) {
        this.indirectOffsetLength = value;
    }

}
