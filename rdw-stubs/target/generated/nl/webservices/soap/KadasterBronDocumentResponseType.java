
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterBronDocumentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterBronDocumentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bron_document" type="{http://www.webservices.nl/soap/}KadasterBronDocument"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterBronDocumentResponseType", propOrder = {

})
public class KadasterBronDocumentResponseType {

    @XmlElement(name = "bron_document", required = true)
    protected KadasterBronDocument bronDocument;

    /**
     * Gets the value of the bronDocument property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterBronDocument }
     *     
     */
    public KadasterBronDocument getBronDocument() {
        return bronDocument;
    }

    /**
     * Sets the value of the bronDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterBronDocument }
     *     
     */
    public void setBronDocument(KadasterBronDocument value) {
        this.bronDocument = value;
    }

}
