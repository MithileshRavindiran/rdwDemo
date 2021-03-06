
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Persoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Persoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="natuurlijk_persoon" type="{http://www.webservices.nl/soap/}NatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="niet_natuurlijk_persoon" type="{http://www.webservices.nl/soap/}NietNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="aantekening_beschikkingsbevoegdheid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicatie_meer_onroerende_zaken" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="woonlocatie" type="{http://www.webservices.nl/soap/}Locatie" minOccurs="0"/>
 *         &lt;element name="postlocatie" type="{http://www.webservices.nl/soap/}Locatie" minOccurs="0"/>
 *         &lt;element name="niet_volledig_verwerkt_stukken_lijst" type="{http://www.webservices.nl/soap/}StukReferentiesLijst" minOccurs="0"/>
 *         &lt;element name="mogelijk_van_belang_stukken_lijst" type="{http://www.webservices.nl/soap/}StukReferentiesLijst" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Persoon", propOrder = {

})
public class Persoon {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "natuurlijk_persoon")
    protected NatuurlijkPersoon natuurlijkPersoon;
    @XmlElement(name = "niet_natuurlijk_persoon")
    protected NietNatuurlijkPersoon nietNatuurlijkPersoon;
    @XmlElement(name = "aantekening_beschikkingsbevoegdheid")
    protected boolean aantekeningBeschikkingsbevoegdheid;
    @XmlElement(name = "indicatie_meer_onroerende_zaken")
    protected boolean indicatieMeerOnroerendeZaken;
    protected Locatie woonlocatie;
    protected Locatie postlocatie;
    @XmlElement(name = "niet_volledig_verwerkt_stukken_lijst")
    protected StukReferentiesLijst nietVolledigVerwerktStukkenLijst;
    @XmlElement(name = "mogelijk_van_belang_stukken_lijst")
    protected StukReferentiesLijst mogelijkVanBelangStukkenLijst;

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
     * Gets the value of the natuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NatuurlijkPersoon }
     *     
     */
    public NatuurlijkPersoon getNatuurlijkPersoon() {
        return natuurlijkPersoon;
    }

    /**
     * Sets the value of the natuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatuurlijkPersoon }
     *     
     */
    public void setNatuurlijkPersoon(NatuurlijkPersoon value) {
        this.natuurlijkPersoon = value;
    }

    /**
     * Gets the value of the nietNatuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NietNatuurlijkPersoon }
     *     
     */
    public NietNatuurlijkPersoon getNietNatuurlijkPersoon() {
        return nietNatuurlijkPersoon;
    }

    /**
     * Sets the value of the nietNatuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NietNatuurlijkPersoon }
     *     
     */
    public void setNietNatuurlijkPersoon(NietNatuurlijkPersoon value) {
        this.nietNatuurlijkPersoon = value;
    }

    /**
     * Gets the value of the aantekeningBeschikkingsbevoegdheid property.
     * 
     */
    public boolean isAantekeningBeschikkingsbevoegdheid() {
        return aantekeningBeschikkingsbevoegdheid;
    }

    /**
     * Sets the value of the aantekeningBeschikkingsbevoegdheid property.
     * 
     */
    public void setAantekeningBeschikkingsbevoegdheid(boolean value) {
        this.aantekeningBeschikkingsbevoegdheid = value;
    }

    /**
     * Gets the value of the indicatieMeerOnroerendeZaken property.
     * 
     */
    public boolean isIndicatieMeerOnroerendeZaken() {
        return indicatieMeerOnroerendeZaken;
    }

    /**
     * Sets the value of the indicatieMeerOnroerendeZaken property.
     * 
     */
    public void setIndicatieMeerOnroerendeZaken(boolean value) {
        this.indicatieMeerOnroerendeZaken = value;
    }

    /**
     * Gets the value of the woonlocatie property.
     * 
     * @return
     *     possible object is
     *     {@link Locatie }
     *     
     */
    public Locatie getWoonlocatie() {
        return woonlocatie;
    }

    /**
     * Sets the value of the woonlocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locatie }
     *     
     */
    public void setWoonlocatie(Locatie value) {
        this.woonlocatie = value;
    }

    /**
     * Gets the value of the postlocatie property.
     * 
     * @return
     *     possible object is
     *     {@link Locatie }
     *     
     */
    public Locatie getPostlocatie() {
        return postlocatie;
    }

    /**
     * Sets the value of the postlocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locatie }
     *     
     */
    public void setPostlocatie(Locatie value) {
        this.postlocatie = value;
    }

    /**
     * Gets the value of the nietVolledigVerwerktStukkenLijst property.
     * 
     * @return
     *     possible object is
     *     {@link StukReferentiesLijst }
     *     
     */
    public StukReferentiesLijst getNietVolledigVerwerktStukkenLijst() {
        return nietVolledigVerwerktStukkenLijst;
    }

    /**
     * Sets the value of the nietVolledigVerwerktStukkenLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link StukReferentiesLijst }
     *     
     */
    public void setNietVolledigVerwerktStukkenLijst(StukReferentiesLijst value) {
        this.nietVolledigVerwerktStukkenLijst = value;
    }

    /**
     * Gets the value of the mogelijkVanBelangStukkenLijst property.
     * 
     * @return
     *     possible object is
     *     {@link StukReferentiesLijst }
     *     
     */
    public StukReferentiesLijst getMogelijkVanBelangStukkenLijst() {
        return mogelijkVanBelangStukkenLijst;
    }

    /**
     * Sets the value of the mogelijkVanBelangStukkenLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link StukReferentiesLijst }
     *     
     */
    public void setMogelijkVanBelangStukkenLijst(StukReferentiesLijst value) {
        this.mogelijkVanBelangStukkenLijst = value;
    }

}
