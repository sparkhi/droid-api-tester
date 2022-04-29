
package uk.gov.nationalarchives.pronom.signaturefile;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FragmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FragmentType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.nationalarchives.gov.uk/pronom/SignatureFile&gt;HexByteRange"&gt;
 *       &lt;attribute name="Position" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MinOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="MaxOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FragmentType", propOrder = {
    "value"
})
public class FragmentType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Position", required = true)
    protected BigInteger position;
    @XmlAttribute(name = "MinOffset", required = true)
    protected BigInteger minOffset;
    @XmlAttribute(name = "MaxOffset", required = true)
    protected BigInteger maxOffset;

    /**
     * 
     * 						One or more bytes expressed as hexadecimal, with patterns.
     * 						Eg. [A1:A4]
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the minOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinOffset() {
        return minOffset;
    }

    /**
     * Sets the value of the minOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinOffset(BigInteger value) {
        this.minOffset = value;
    }

    /**
     * Gets the value of the maxOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOffset() {
        return maxOffset;
    }

    /**
     * Sets the value of the maxOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOffset(BigInteger value) {
        this.maxOffset = value;
    }

}
