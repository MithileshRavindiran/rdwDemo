
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterBerichtObjectDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterBerichtObjectDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="afbeeldingen" type="{http://www.webservices.nl/soap/}base64BinaryArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterBerichtObjectDocument", propOrder = {

})
public class KadasterBerichtObjectDocument {

    @XmlElement(required = true)
    protected byte[] document;
    protected Base64BinaryArray afbeeldingen;

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
     * Gets the value of the afbeeldingen property.
     * 
     * @return
     *     possible object is
     *     {@link Base64BinaryArray }
     *     
     */
    public Base64BinaryArray getAfbeeldingen() {
        return afbeeldingen;
    }

    /**
     * Sets the value of the afbeeldingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64BinaryArray }
     *     
     */
    public void setAfbeeldingen(Base64BinaryArray value) {
        this.afbeeldingen = value;
    }

}
