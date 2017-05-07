
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessExtractDocumentDataV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractDocumentDataV3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.webservices.nl/soap/}DutchBusinessExtractDataV3"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessExtractDocumentDataV3", propOrder = {

})
public class DutchBusinessExtractDocumentDataV3 {

    protected byte[] document;
    @XmlElement(required = true)
    protected DutchBusinessExtractDataV3 data;
    protected byte[] source;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument(byte[] value) {
        this.document = ((byte[]) value);
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessExtractDataV3 }
     *     
     */
    public DutchBusinessExtractDataV3 getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessExtractDataV3 }
     *     
     */
    public void setData(DutchBusinessExtractDataV3 value) {
        this.data = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSource(byte[] value) {
        this.source = ((byte[]) value);
    }

}
