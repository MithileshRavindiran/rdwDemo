
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterKoopsommenOverzichtResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterKoopsommenOverzichtResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="koopsommenoverzicht" type="{http://www.webservices.nl/soap/}KoopsommenOverzicht"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterKoopsommenOverzichtResponseType", propOrder = {

})
public class KadasterKoopsommenOverzichtResponseType {

    @XmlElement(required = true)
    protected KoopsommenOverzicht koopsommenoverzicht;

    /**
     * Gets the value of the koopsommenoverzicht property.
     * 
     * @return
     *     possible object is
     *     {@link KoopsommenOverzicht }
     *     
     */
    public KoopsommenOverzicht getKoopsommenoverzicht() {
        return koopsommenoverzicht;
    }

    /**
     * Sets the value of the koopsommenoverzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoopsommenOverzicht }
     *     
     */
    public void setKoopsommenoverzicht(KoopsommenOverzicht value) {
        this.koopsommenoverzicht = value;
    }

}
