import org.apache.commons.httpclient.util.DateParseException;
import uk.gov.nationalarchives.droid.core.SignatureParseException;
import uk.gov.nationalarchives.droid.core.interfaces.IdentificationResultCollection;
import uk.gov.nationalarchives.droid.core.interfaces.signature.SignatureServiceException;
import uk.gov.nationalarchives.droid.internal.api.DroidAPI;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DoesItWork {
    public static void main(String args[]) throws IOException, SignatureParseException, DateParseException, SignatureServiceException, JAXBException {
        SignatureFileLocator loc = new SignatureFileLocator();

        loc.isNewerFileAvailable(0);

        DroidAPI api = DroidAPI.getInstance(loc.getLatestBinarySignature(), loc.getContainerFilePath());
        IdentificationResultCollection coll = api.submit(Paths.get("/home/sparkhi/Downloads/deliberately_unidentifiable_file.dat"));
        List<String> details = coll.getResults().stream().map(res -> res.getName() + ", " + res.getPuid()).collect(Collectors.toList());
        for (String detail : details) {
            System.out.println(detail);
        }
    }
}
