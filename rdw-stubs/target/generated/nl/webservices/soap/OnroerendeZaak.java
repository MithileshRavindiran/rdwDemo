
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OnroerendeZaak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnroerendeZaak">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kadastrale_aanduiding" type="{http://www.webservices.nl/soap/}KadastraleAanduiding"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locaties" type="{http://www.webservices.nl/soap/}LocatieBinnenlandLijst" minOccurs="0"/>
 *         &lt;element name="datum_ontstaan" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="onroerende_zaak_historie" type="{http://www.webservices.nl/soap/}KadastraleAanduidingLijst" minOccurs="0"/>
 *         &lt;element name="perceel_details" type="{http://www.webservices.nl/soap/}PerceelDetails"/>
 *         &lt;element name="koopsom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="koopjaar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatie_meer_onroerende_zaken" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="landinrichtingsrente" type="{http://www.webservices.nl/soap/}Landinrichtingsrente" minOccurs="0"/>
 *         &lt;element name="indicatie_voorgenomen_splitsing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicatie_voorlopige_aantekening" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="niet_volledig_verwerkt_stukken_lijst" type="{http://www.webservices.nl/soap/}StukReferentiesLijst" minOccurs="0"/>
 *         &lt;element name="mandeligheid" type="{http://www.webservices.nl/soap/}Mandeligheid" minOccurs="0"/>
 *         &lt;element name="aantekeningen_kadastraal_object" type="{http://www.webservices.nl/soap/}AantekeningenKadastraalObject" minOccurs="0"/>
 *         &lt;element name="pr_beperkingen_kadastraal_object" type="{http://www.webservices.nl/soap/}PRBeperkingenKadastraalObject" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnroerendeZaak", propOrder = {

})
public class OnroerendeZaak {

    @XmlElement(name = "object_id")
    protected String objectId;
    @XmlElement(name = "kadastrale_aanduiding", required = true)
    protected KadastraleAanduiding kadastraleAanduiding;
    protected String omschrijving;
    protected LocatieBinnenlandLijst locaties;
    @XmlElement(name = "datum_ontstaan")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumOntstaan;
    @XmlElement(name = "onroerende_zaak_historie")
    protected KadastraleAanduidingLijst onroerendeZaakHistorie;
    @XmlElement(name = "perceel_details", required = true)
    protected PerceelDetails perceelDetails;
    protected String koopsom;
    protected String koopjaar;
    @XmlElement(name = "indicatie_meer_onroerende_zaken")
    protected boolean indicatieMeerOnroerendeZaken;
    protected Landinrichtingsrente landinrichtingsrente;
    @XmlElement(name = "indicatie_voorgenomen_splitsing")
    protected boolean indicatieVoorgenomenSplitsing;
    @XmlElement(name = "indicatie_voorlopige_aantekening")
    protected boolean indicatieVoorlopigeAantekening;
    @XmlElement(name = "niet_volledig_verwerkt_stukken_lijst")
    protected StukReferentiesLijst nietVolledigVerwerktStukkenLijst;
    protected Mandeligheid mandeligheid;
    @XmlElement(name = "aantekeningen_kadastraal_object")
    protected AantekeningenKadastraalObject aantekeningenKadastraalObject;
    @XmlElement(name = "pr_beperkingen_kadastraal_object")
    protected PRBeperkingenKadastraalObject prBeperkingenKadastraalObject;

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
     * Gets the value of the locaties property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieBinnenlandLijst }
     *     
     */
    public LocatieBinnenlandLijst getLocaties() {
        return locaties;
    }

    /**
     * Sets the value of the locaties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieBinnenlandLijst }
     *     
     */
    public void setLocaties(LocatieBinnenlandLijst value) {
        this.locaties = value;
    }

    /**
     * Gets the value of the datumOntstaan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumOntstaan() {
        return datumOntstaan;
    }

    /**
     * Sets the value of the datumOntstaan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumOntstaan(XMLGregorianCalendar value) {
        this.datumOntstaan = value;
    }

    /**
     * Gets the value of the onroerendeZaakHistorie property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduidingLijst }
     *     
     */
    public KadastraleAanduidingLijst getOnroerendeZaakHistorie() {
        return onroerendeZaakHistorie;
    }

    /**
     * Sets the value of the onroerendeZaakHistorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduidingLijst }
     *     
     */
    public void setOnroerendeZaakHistorie(KadastraleAanduidingLijst value) {
        this.onroerendeZaakHistorie = value;
    }

    /**
     * Gets the value of the perceelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PerceelDetails }
     *     
     */
    public PerceelDetails getPerceelDetails() {
        return perceelDetails;
    }

    /**
     * Sets the value of the perceelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerceelDetails }
     *     
     */
    public void setPerceelDetails(PerceelDetails value) {
        this.perceelDetails = value;
    }

    /**
     * Gets the value of the koopsom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoopsom() {
        return koopsom;
    }

    /**
     * Sets the value of the koopsom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoopsom(String value) {
        this.koopsom = value;
    }

    /**
     * Gets the value of the koopjaar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoopjaar() {
        return koopjaar;
    }

    /**
     * Sets the value of the koopjaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoopjaar(String value) {
        this.koopjaar = value;
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
     * Gets the value of the landinrichtingsrente property.
     * 
     * @return
     *     possible object is
     *     {@link Landinrichtingsrente }
     *     
     */
    public Landinrichtingsrente getLandinrichtingsrente() {
        return landinrichtingsrente;
    }

    /**
     * Sets the value of the landinrichtingsrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Landinrichtingsrente }
     *     
     */
    public void setLandinrichtingsrente(Landinrichtingsrente value) {
        this.landinrichtingsrente = value;
    }

    /**
     * Gets the value of the indicatieVoorgenomenSplitsing property.
     * 
     */
    public boolean isIndicatieVoorgenomenSplitsing() {
        return indicatieVoorgenomenSplitsing;
    }

    /**
     * Sets the value of the indicatieVoorgenomenSplitsing property.
     * 
     */
    public void setIndicatieVoorgenomenSplitsing(boolean value) {
        this.indicatieVoorgenomenSplitsing = value;
    }

    /**
     * Gets the value of the indicatieVoorlopigeAantekening property.
     * 
     */
    public boolean isIndicatieVoorlopigeAantekening() {
        return indicatieVoorlopigeAantekening;
    }

    /**
     * Sets the value of the indicatieVoorlopigeAantekening property.
     * 
     */
    public void setIndicatieVoorlopigeAantekening(boolean value) {
        this.indicatieVoorlopigeAantekening = value;
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
     * Gets the value of the mandeligheid property.
     * 
     * @return
     *     possible object is
     *     {@link Mandeligheid }
     *     
     */
    public Mandeligheid getMandeligheid() {
        return mandeligheid;
    }

    /**
     * Sets the value of the mandeligheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mandeligheid }
     *     
     */
    public void setMandeligheid(Mandeligheid value) {
        this.mandeligheid = value;
    }

    /**
     * Gets the value of the aantekeningenKadastraalObject property.
     * 
     * @return
     *     possible object is
     *     {@link AantekeningenKadastraalObject }
     *     
     */
    public AantekeningenKadastraalObject getAantekeningenKadastraalObject() {
        return aantekeningenKadastraalObject;
    }

    /**
     * Sets the value of the aantekeningenKadastraalObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AantekeningenKadastraalObject }
     *     
     */
    public void setAantekeningenKadastraalObject(AantekeningenKadastraalObject value) {
        this.aantekeningenKadastraalObject = value;
    }

    /**
     * Gets the value of the prBeperkingenKadastraalObject property.
     * 
     * @return
     *     possible object is
     *     {@link PRBeperkingenKadastraalObject }
     *     
     */
    public PRBeperkingenKadastraalObject getPrBeperkingenKadastraalObject() {
        return prBeperkingenKadastraalObject;
    }

    /**
     * Sets the value of the prBeperkingenKadastraalObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRBeperkingenKadastraalObject }
     *     
     */
    public void setPrBeperkingenKadastraalObject(PRBeperkingenKadastraalObject value) {
        this.prBeperkingenKadastraalObject = value;
    }

}
