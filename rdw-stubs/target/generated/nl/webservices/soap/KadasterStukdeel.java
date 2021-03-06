
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterStukdeel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterStukdeel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aard_stukdeel_omschrijving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hypotheek" type="{http://www.webservices.nl/soap/}kadasterHypotheek" minOccurs="0"/>
 *         &lt;element name="schuldeisers_beslagleggers" type="{http://www.webservices.nl/soap/}kadasterPersoonLijst" minOccurs="0"/>
 *         &lt;element name="vordering" type="{http://www.webservices.nl/soap/}kadasterBedrag" minOccurs="0"/>
 *         &lt;element name="rechten" type="{http://www.webservices.nl/soap/}kadasterStukdeelRechtArray" minOccurs="0"/>
 *         &lt;element name="onroerende_zaken" type="{http://www.webservices.nl/soap/}kadasterBeknoptOnroerendeZaakArray" minOccurs="0"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stukdeel_relaties" type="{http://www.webservices.nl/soap/}kadasterStukdeelReferentiesLijst" minOccurs="0"/>
 *         &lt;element name="hoort_bij" type="{http://www.webservices.nl/soap/}kadasterGerelateerdStukdeelArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterStukdeel", propOrder = {

})
public class KadasterStukdeel {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "aard_stukdeel_omschrijving", required = true)
    protected String aardStukdeelOmschrijving;
    protected KadasterHypotheek hypotheek;
    @XmlElement(name = "schuldeisers_beslagleggers")
    protected KadasterPersoonLijst schuldeisersBeslagleggers;
    protected KadasterBedrag vordering;
    protected KadasterStukdeelRechtArray rechten;
    @XmlElement(name = "onroerende_zaken")
    protected KadasterBeknoptOnroerendeZaakArray onroerendeZaken;
    protected String omschrijving;
    @XmlElement(name = "stukdeel_relaties")
    protected KadasterStukdeelReferentiesLijst stukdeelRelaties;
    @XmlElement(name = "hoort_bij")
    protected KadasterGerelateerdStukdeelArray hoortBij;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the aardStukdeelOmschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAardStukdeelOmschrijving() {
        return aardStukdeelOmschrijving;
    }

    /**
     * Sets the value of the aardStukdeelOmschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAardStukdeelOmschrijving(String value) {
        this.aardStukdeelOmschrijving = value;
    }

    /**
     * Gets the value of the hypotheek property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterHypotheek }
     *     
     */
    public KadasterHypotheek getHypotheek() {
        return hypotheek;
    }

    /**
     * Sets the value of the hypotheek property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterHypotheek }
     *     
     */
    public void setHypotheek(KadasterHypotheek value) {
        this.hypotheek = value;
    }

    /**
     * Gets the value of the schuldeisersBeslagleggers property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterPersoonLijst }
     *     
     */
    public KadasterPersoonLijst getSchuldeisersBeslagleggers() {
        return schuldeisersBeslagleggers;
    }

    /**
     * Sets the value of the schuldeisersBeslagleggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterPersoonLijst }
     *     
     */
    public void setSchuldeisersBeslagleggers(KadasterPersoonLijst value) {
        this.schuldeisersBeslagleggers = value;
    }

    /**
     * Gets the value of the vordering property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterBedrag }
     *     
     */
    public KadasterBedrag getVordering() {
        return vordering;
    }

    /**
     * Sets the value of the vordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterBedrag }
     *     
     */
    public void setVordering(KadasterBedrag value) {
        this.vordering = value;
    }

    /**
     * Gets the value of the rechten property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterStukdeelRechtArray }
     *     
     */
    public KadasterStukdeelRechtArray getRechten() {
        return rechten;
    }

    /**
     * Sets the value of the rechten property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterStukdeelRechtArray }
     *     
     */
    public void setRechten(KadasterStukdeelRechtArray value) {
        this.rechten = value;
    }

    /**
     * Gets the value of the onroerendeZaken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterBeknoptOnroerendeZaakArray }
     *     
     */
    public KadasterBeknoptOnroerendeZaakArray getOnroerendeZaken() {
        return onroerendeZaken;
    }

    /**
     * Sets the value of the onroerendeZaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterBeknoptOnroerendeZaakArray }
     *     
     */
    public void setOnroerendeZaken(KadasterBeknoptOnroerendeZaakArray value) {
        this.onroerendeZaken = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

    /**
     * Gets the value of the stukdeelRelaties property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterStukdeelReferentiesLijst }
     *     
     */
    public KadasterStukdeelReferentiesLijst getStukdeelRelaties() {
        return stukdeelRelaties;
    }

    /**
     * Sets the value of the stukdeelRelaties property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterStukdeelReferentiesLijst }
     *     
     */
    public void setStukdeelRelaties(KadasterStukdeelReferentiesLijst value) {
        this.stukdeelRelaties = value;
    }

    /**
     * Gets the value of the hoortBij property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterGerelateerdStukdeelArray }
     *     
     */
    public KadasterGerelateerdStukdeelArray getHoortBij() {
        return hoortBij;
    }

    /**
     * Sets the value of the hoortBij property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterGerelateerdStukdeelArray }
     *     
     */
    public void setHoortBij(KadasterGerelateerdStukdeelArray value) {
        this.hoortBij = value;
    }

}
