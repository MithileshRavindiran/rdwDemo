
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KoopsommenOverzichtV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoopsommenOverzichtV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}KoopsommenOverzicht"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoopsommenOverzichtV2", propOrder = {

})
public class KoopsommenOverzichtV2 {

    protected byte[] document;
    @XmlElement(required = true)
    protected KoopsommenOverzicht overzicht;

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
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link KoopsommenOverzicht }
     *     
     */
    public KoopsommenOverzicht getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoopsommenOverzicht }
     *     
     */
    public void setOverzicht(KoopsommenOverzicht value) {
        this.overzicht = value;
    }

}
