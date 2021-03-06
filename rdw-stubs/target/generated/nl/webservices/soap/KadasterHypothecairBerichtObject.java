
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterHypothecairBerichtObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypothecairBerichtObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="datum_bijgewerkt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onroerende_zaak" type="{http://www.webservices.nl/soap/}kadasterBeknoptOnroerendeZaak"/>
 *         &lt;element name="hypotheek_stuk_lijst" type="{http://www.webservices.nl/soap/}kadasterHypotheekStukLijst"/>
 *         &lt;element name="hypothecair_document" type="{http://www.webservices.nl/soap/}kadasterBerichtObjectDocument" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterHypothecairBerichtObject", propOrder = {

})
public class KadasterHypothecairBerichtObject {

    @XmlElement(name = "datum_bijgewerkt", required = true)
    protected String datumBijgewerkt;
    @XmlElement(name = "onroerende_zaak", required = true)
    protected KadasterBeknoptOnroerendeZaak onroerendeZaak;
    @XmlElement(name = "hypotheek_stuk_lijst", required = true)
    protected KadasterHypotheekStukLijst hypotheekStukLijst;
    @XmlElement(name = "hypothecair_document")
    protected KadasterBerichtObjectDocument hypothecairDocument;

    /**
     * Gets the value of the datumBijgewerkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumBijgewerkt() {
        return datumBijgewerkt;
    }

    /**
     * Sets the value of the datumBijgewerkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumBijgewerkt(String value) {
        this.datumBijgewerkt = value;
    }

    /**
     * Gets the value of the onroerendeZaak property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterBeknoptOnroerendeZaak }
     *     
     */
    public KadasterBeknoptOnroerendeZaak getOnroerendeZaak() {
        return onroerendeZaak;
    }

    /**
     * Sets the value of the onroerendeZaak property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterBeknoptOnroerendeZaak }
     *     
     */
    public void setOnroerendeZaak(KadasterBeknoptOnroerendeZaak value) {
        this.onroerendeZaak = value;
    }

    /**
     * Gets the value of the hypotheekStukLijst property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterHypotheekStukLijst }
     *     
     */
    public KadasterHypotheekStukLijst getHypotheekStukLijst() {
        return hypotheekStukLijst;
    }

    /**
     * Sets the value of the hypotheekStukLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterHypotheekStukLijst }
     *     
     */
    public void setHypotheekStukLijst(KadasterHypotheekStukLijst value) {
        this.hypotheekStukLijst = value;
    }

    /**
     * Gets the value of the hypothecairDocument property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterBerichtObjectDocument }
     *     
     */
    public KadasterBerichtObjectDocument getHypothecairDocument() {
        return hypothecairDocument;
    }

    /**
     * Sets the value of the hypothecairDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterBerichtObjectDocument }
     *     
     */
    public void setHypothecairDocument(KadasterBerichtObjectDocument value) {
        this.hypothecairDocument = value;
    }

}
