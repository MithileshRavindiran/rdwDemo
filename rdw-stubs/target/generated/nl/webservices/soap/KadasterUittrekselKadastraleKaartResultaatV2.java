
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadasterUittrekselKadastraleKaartResultaatV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterUittrekselKadastraleKaartResultaatV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}kadasterOverzichtV2" minOccurs="0"/>
 *         &lt;element name="kadastrale_kaart" type="{http://www.webservices.nl/soap/}KadasterUittrekselKadastraleKaartV2" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterUittrekselKadastraleKaartResultaatV2", propOrder = {

})
public class KadasterUittrekselKadastraleKaartResultaatV2 {

    protected KadasterOverzichtV2 overzicht;
    @XmlElement(name = "kadastrale_kaart")
    protected KadasterUittrekselKadastraleKaartV2 kadastraleKaart;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzichtV2 }
     *     
     */
    public KadasterOverzichtV2 getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzichtV2 }
     *     
     */
    public void setOverzicht(KadasterOverzichtV2 value) {
        this.overzicht = value;
    }

    /**
     * Gets the value of the kadastraleKaart property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterUittrekselKadastraleKaartV2 }
     *     
     */
    public KadasterUittrekselKadastraleKaartV2 getKadastraleKaart() {
        return kadastraleKaart;
    }

    /**
     * Sets the value of the kadastraleKaart property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterUittrekselKadastraleKaartV2 }
     *     
     */
    public void setKadastraleKaart(KadasterUittrekselKadastraleKaartV2 value) {
        this.kadastraleKaart = value;
    }

}
