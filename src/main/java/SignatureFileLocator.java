import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.util.DateParseException;
import uk.gov.nationalarchives.droid.core.interfaces.signature.SignatureServiceException;
import uk.gov.nationalarchives.pronom.PronomService;
import uk.gov.nationalarchives.pronom.PronomService_Service;
import uk.gov.nationalarchives.pronom.Version;
import uk.gov.nationalarchives.pronom.signaturefile.SigFile;
import uk.gov.nationalarchives.pronom.signaturefile.SignatureFileType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SignatureFileLocator {
    public Path getLatestBinarySignature() throws SignatureServiceException, IOException, JAXBException {
        URL url = new URL("http://www.nationalarchives.gov.uk/pronom/service.asmx?WSDL");
        PronomService_Service service = new PronomService_Service(url);
        PronomService proService = service.getPronomServiceSoap();
        SigFile signature = proService.getSignatureFileV1();

        JAXBElement<SignatureFileType> jaxbElement =
                new JAXBElement<SignatureFileType>( new QName("http://www.nationalarchives.gov.uk/pronom/SignatureFile", "FFSignatureFile"),
                        SignatureFileType.class,
                        signature.getFFSignatureFile());

        JAXBContext context = JAXBContext.newInstance(SignatureFileType.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(jaxbElement, new File("/tmp/binary-signature.xml"));

        return Paths.get("/tmp/binary-signature.xml");
    }

    //always download the latest version, save it to temp folder and use it,
    // ** Don't do this in production as this code will fail if the signature URL is down.
    public Path getContainerFilePath() throws IOException, DateParseException {
        final GetMethod getContainerFile = new GetMethod("https://www.nationalarchives.gov.uk/pronom/container-signature.xml");
        HttpClient client = new HttpClient();
        int status = client.executeMethod(getContainerFile);
        if (status == HttpStatus.SC_OK) {
            if (Files.exists(Paths.get("/tmp/container-signature.xml"))) {
                Files.delete(Paths.get("/tmp/container-signature.xml"));
            }
            Files.copy(getContainerFile.getResponseBodyAsStream(), Paths.get("/tmp/container-signature.xml"));
        }
        return Paths.get("/tmp/container-signature.xml");
    }

    public void isNewerFileAvailable(int currentVersion) throws MalformedURLException {
        URL url = new URL("http://www.nationalarchives.gov.uk/pronom/service.asmx?WSDL");
        PronomService_Service service = new PronomService_Service(url);
        PronomService proService = service.getPronomServiceSoap();
        Holder<Version> versionHolder = new Holder<>();
        Holder<Boolean> deprecationHolder = new Holder<>();
        proService.getSignatureFileVersionV1(versionHolder, deprecationHolder);
        System.out.println(versionHolder.value);
    }
}
