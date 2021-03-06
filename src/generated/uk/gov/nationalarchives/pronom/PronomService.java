package uk.gov.nationalarchives.pronom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-29T16:34:35.699+01:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://pronom.nationalarchives.gov.uk", name = "PronomService")
@XmlSeeAlso({ObjectFactory.class, uk.gov.nationalarchives.pronom.signaturefile.ObjectFactory.class})
public interface PronomService {

    /**
     * Returns the current signature file version 
     */
    @WebMethod(action = "http://pronom.nationalarchives.gov.uk:getSignatureFileVersionV1In")
    @RequestWrapper(localName = "getSignatureFileVersionV1", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileVersionV1")
    @ResponseWrapper(localName = "getSignatureFileVersionV1Response", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileVersionV1Response")
    public void getSignatureFileVersionV1(

        @WebParam(mode = WebParam.Mode.OUT, name = "Version", targetNamespace = "http://pronom.nationalarchives.gov.uk")
        javax.xml.ws.Holder<Version> version,
        @WebParam(mode = WebParam.Mode.OUT, name = "Deprecated", targetNamespace = "http://pronom.nationalarchives.gov.uk")
        javax.xml.ws.Holder<java.lang.Boolean> deprecated
    );

    /**
     * Returns the current signature file 
     */
    @WebMethod(action = "http://pronom.nationalarchives.gov.uk:getSignatureFileV1In")
    @RequestWrapper(localName = "getSignatureFileV1", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileV1")
    @ResponseWrapper(localName = "getSignatureFileV1Response", targetNamespace = "http://pronom.nationalarchives.gov.uk", className = "uk.gov.nationalarchives.pronom.GetSignatureFileV1Response")
    @WebResult(name = "SignatureFile", targetNamespace = "http://pronom.nationalarchives.gov.uk")
    public uk.gov.nationalarchives.pronom.signaturefile.SigFile getSignatureFileV1()
;
}
