
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterBeknoptOnroerendeZaak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterBeknoptOnroerendeZaak">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kadastrale_aanduiding" type="{http://www.webservices.nl/soap/}KadastraleAanduiding"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voorlopige_aantekening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="meerdere_splitsingen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gerechtigde" type="{http://www.webservices.nl/soap/}kadasterPersoon" minOccurs="0"/>
 *         &lt;element name="onverwerkte_documenten" type="{http://www.webservices.nl/soap/}kadasterHypotheekStukLijst" minOccurs="0"/>
 *         &lt;element name="grootte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="vastgestelde_grootte" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterBeknoptOnroerendeZaak", propOrder = {

})
public class KadasterBeknoptOnroerendeZaak {

    @XmlElement(name = "object_id", required = true)
    protected String objectId;
    @XmlElement(name = "kadastrale_aanduiding", required = true)
    protected KadastraleAanduiding kadastraleAanduiding;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "voorlopige_aantekening")
    protected Boolean voorlopigeAantekening;
    @XmlElement(name = "meerdere_splitsingen")
    protected Boolean meerdereSplitsingen;
    protected KadasterPersoon gerechtigde;
    @XmlElement(name = "onverwerkte_documenten")
    protected KadasterHypotheekStukLijst onverwerkteDocumenten;
    protected BigDecimal grootte;
    @XmlElement(name = "vastgestelde_grootte")
    protected Boolean vastgesteldeGrootte;

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the kadastraleAanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public KadastraleAanduiding getKadastraleAanduiding() {
        return kadastraleAanduiding;
    }

    /**
     * Sets the value of the kadastraleAanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public void setKadastraleAanduiding(KadastraleAanduiding value) {
        this.kadastraleAanduiding = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the voorlopigeAantekening property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoorlopigeAantekening() {
        return voorlopigeAantekening;
    }

    /**
     * Sets the value of the voorlopigeAantekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoorlopigeAantekening(Boolean value) {
        this.voorlopigeAantekening = value;
    }

    /**
     * Gets the value of the meerdereSplitsingen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeerdereSplitsingen() {
        return meerdereSplitsingen;
    }

    /**
     * Sets the value of the meerdereSplitsingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeerdereSplitsingen(Boolean value) {
        this.meerdereSplitsingen = value;
    }

    /**
     * Gets the value of the gerechtigde property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterPersoon }
     *     
     */
    public KadasterPersoon getGerechtigde() {
        return gerechtigde;
    }

    /**
     * Sets the value of the gerechtigde property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterPersoon }
     *     
     */
    public void setGerechtigde(KadasterPersoon value) {
        this.gerechtigde = value;
    }

    /**
     * Gets the value of the onverwerkteDocumenten property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterHypotheekStukLijst }
     *     
     */
    public KadasterHypotheekStukLijst getOnverwerkteDocumenten() {
        return onverwerkteDocumenten;
    }

    /**
     * Sets the value of the onverwerkteDocumenten property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterHypotheekStukLijst }
     *     
     */
    public void setOnverwerkteDocumenten(KadasterHypotheekStukLijst value) {
        this.onverwerkteDocumenten = value;
    }

    /**
     * Gets the value of the grootte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrootte() {
        return grootte;
    }

    /**
     * Sets the value of the grootte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrootte(BigDecimal value) {
        this.grootte = value;
    }

    /**
     * Gets the value of the vastgesteldeGrootte property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVastgesteldeGrootte() {
        return vastgesteldeGrootte;
    }

    /**
     * Sets the value of the vastgesteldeGrootte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVastgesteldeGrootte(Boolean value) {
        this.vastgesteldeGrootte = value;
    }

}
