
package nl.webservices.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "Webservices.nl", targetNamespace = "http://www.webservices.nl/soap/", wsdlLocation = "file:/C:/otherWorkspaces/Spring%20Boot/rdwdemo/rdw-stubs/src/main/resources/wsdl/soap_doclit.wsdl")
public class WebservicesNl
    extends Service
{

    private final static URL WEBSERVICESNL_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(nl.webservices.soap.WebservicesNl.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = nl.webservices.soap.WebservicesNl.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/otherWorkspaces/Spring%20Boot/rdwdemo/rdw-stubs/src/main/resources/wsdl/soap_doclit.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/otherWorkspaces/Spring%20Boot/rdwdemo/rdw-stubs/src/main/resources/wsdl/soap_doclit.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WEBSERVICESNL_WSDL_LOCATION = url;
    }

    public WebservicesNl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebservicesNl() {
        super(WEBSERVICESNL_WSDL_LOCATION, new QName("http://www.webservices.nl/soap/", "Webservices.nl"));
    }

    /**
     * 
     * @return
     *     returns WebservicesNlPortType
     */
    @WebEndpoint(name = "Webservices.nlPort")
    public WebservicesNlPortType getWebservicesNlPort() {
        return super.getPort(new QName("http://www.webservices.nl/soap/", "Webservices.nlPort"), WebservicesNlPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebservicesNlPortType
     */
    @WebEndpoint(name = "Webservices.nlPort")
    public WebservicesNlPortType getWebservicesNlPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservices.nl/soap/", "Webservices.nlPort"), WebservicesNlPortType.class, features);
    }

}
