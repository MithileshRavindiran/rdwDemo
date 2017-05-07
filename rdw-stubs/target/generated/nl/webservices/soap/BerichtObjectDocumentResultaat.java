
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BerichtObjectDocumentResultaat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerichtObjectDocumentResultaat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}DocumentOverzicht" minOccurs="0"/>
 *         &lt;element name="eigendomsbericht" type="{http://www.webservices.nl/soap/}BerichtObjectDocument" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtObjectDocumentResultaat", propOrder = {

})
public class BerichtObjectDocumentResultaat {

    protected DocumentOverzicht overzicht;
    protected BerichtObjectDocument eigendomsbericht;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOverzicht }
     *     
     */
    public DocumentOverzicht getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOverzicht }
     *     
     */
    public void setOverzicht(DocumentOverzicht value) {
        this.overzicht = value;
    }

    /**
     * Gets the value of the eigendomsbericht property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtObjectDocument }
     *     
     */
    public BerichtObjectDocument getEigendomsbericht() {
        return eigendomsbericht;
    }

    /**
     * Sets the value of the eigendomsbericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtObjectDocument }
     *     
     */
    public void setEigendomsbericht(BerichtObjectDocument value) {
        this.eigendomsbericht = value;
    }

}
