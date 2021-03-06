
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterKoopsommenOverzichtV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterKoopsommenOverzichtV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="koopsommenoverzicht" type="{http://www.webservices.nl/soap/}KoopsommenOverzichtV2"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterKoopsommenOverzichtV2ResponseType", propOrder = {

})
public class KadasterKoopsommenOverzichtV2ResponseType {

    @XmlElement(required = true)
    protected KoopsommenOverzichtV2 koopsommenoverzicht;

    /**
     * Gets the value of the koopsommenoverzicht property.
     * 
     * @return
     *     possible object is
     *     {@link KoopsommenOverzichtV2 }
     *     
     */
    public KoopsommenOverzichtV2 getKoopsommenoverzicht() {
        return koopsommenoverzicht;
    }

    /**
     * Sets the value of the koopsommenoverzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoopsommenOverzichtV2 }
     *     
     */
    public void setKoopsommenoverzicht(KoopsommenOverzichtV2 value) {
        this.koopsommenoverzicht = value;
    }

}
