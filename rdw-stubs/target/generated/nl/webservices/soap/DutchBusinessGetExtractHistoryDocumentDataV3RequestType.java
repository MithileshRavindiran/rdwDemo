
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dutchBusinessGetExtractHistoryDocumentDataV3RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchBusinessGetExtractHistoryDocumentDataV3RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="extract_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="include_source" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchBusinessGetExtractHistoryDocumentDataV3RequestType", propOrder = {

})
public class DutchBusinessGetExtractHistoryDocumentDataV3RequestType {

    @XmlElement(name = "extract_id", required = true)
    protected String extractId;
    @XmlElement(name = "include_source")
    protected boolean includeSource;

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

    /**
     * Gets the value of the includeSource property.
     * 
     */
    public boolean isIncludeSource() {
        return includeSource;
    }

    /**
     * Sets the value of the includeSource property.
     * 
     */
    public void setIncludeSource(boolean value) {
        this.includeSource = value;
    }

}
