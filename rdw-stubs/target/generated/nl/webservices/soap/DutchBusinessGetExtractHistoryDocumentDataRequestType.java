
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dutchBusinessGetExtractHistoryDocumentDataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchBusinessGetExtractHistoryDocumentDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="extract_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchBusinessGetExtractHistoryDocumentDataRequestType", propOrder = {

})
public class DutchBusinessGetExtractHistoryDocumentDataRequestType {

    @XmlElement(name = "extract_id", required = true)
    protected String extractId;

    /**
     * Gets the value of the extractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractId() {
        return extractId;
    }

    /**
     * Sets the value of the extractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractId(String value) {
        this.extractId = value;
    }

}
