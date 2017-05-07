
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dutchBusinessGetExtractDocumentDataV3ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchBusinessGetExtractDocumentDataV3ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}DutchBusinessExtractDocumentDataV3"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchBusinessGetExtractDocumentDataV3ResponseType", propOrder = {

})
public class DutchBusinessGetExtractDocumentDataV3ResponseType {

    @XmlElement(required = true)
    protected DutchBusinessExtractDocumentDataV3 out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessExtractDocumentDataV3 }
     *     
     */
    public DutchBusinessExtractDocumentDataV3 getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessExtractDocumentDataV3 }
     *     
     */
    public void setOut(DutchBusinessExtractDocumentDataV3 value) {
        this.out = value;
    }

}
