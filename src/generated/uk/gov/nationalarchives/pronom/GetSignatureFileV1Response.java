
package uk.gov.nationalarchives.pronom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import uk.gov.nationalarchives.pronom.signaturefile.SigFile;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SignatureFile" type="{http://www.nationalarchives.gov.uk/pronom/SignatureFile}SigFile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signatureFile"
})
@XmlRootElement(name = "getSignatureFileV1Response")
public class GetSignatureFileV1Response {

    @XmlElement(name = "SignatureFile", required = true)
    protected SigFile signatureFile;

    /**
     * Gets the value of the signatureFile property.
     * 
     * @return
     *     possible object is
     *     {@link SigFile }
     *     
     */
    public SigFile getSignatureFile() {
        return signatureFile;
    }

    /**
     * Sets the value of the signatureFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigFile }
     *     
     */
    public void setSignatureFile(SigFile value) {
        this.signatureFile = value;
    }

}
