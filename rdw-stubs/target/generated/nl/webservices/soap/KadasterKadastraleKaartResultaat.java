
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadasterKadastraleKaartResultaat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterKadastraleKaartResultaat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}kadasterOverzicht" minOccurs="0"/>
 *         &lt;element name="kadastrale_kaart" type="{http://www.webservices.nl/soap/}KadasterKadastraleKaart" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterKadastraleKaartResultaat", propOrder = {

})
public class KadasterKadastraleKaartResultaat {

    protected KadasterOverzicht overzicht;
    @XmlElement(name = "kadastrale_kaart")
    protected KadasterKadastraleKaart kadastraleKaart;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzicht }
     *     
     */
    public KadasterOverzicht getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzicht }
     *     
     */
    public void setOverzicht(KadasterOverzicht value) {
        this.overzicht = value;
    }

    /**
     * Gets the value of the kadastraleKaart property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterKadastraleKaart }
     *     
     */
    public KadasterKadastraleKaart getKadastraleKaart() {
        return kadastraleKaart;
    }

    /**
     * Sets the value of the kadastraleKaart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterKadastraleKaart }
     *     
     */
    public void setKadastraleKaart(KadasterKadastraleKaart value) {
        this.kadastraleKaart = value;
    }

}
