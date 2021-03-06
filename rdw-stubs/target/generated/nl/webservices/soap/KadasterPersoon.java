
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterPersoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="akr_subject_nr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kadastrale_identificatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natuurlijk_persoon" type="{http://www.webservices.nl/soap/}kadasterNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="niet_natuurlijk_persoon" type="{http://www.webservices.nl/soap/}kadasterNietNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="aantekening_beschikkingsbevoegdheid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="woonlocatie" type="{http://www.webservices.nl/soap/}kadasterLocatie" minOccurs="0"/>
 *         &lt;element name="postlocatie" type="{http://www.webservices.nl/soap/}kadasterLocatie" minOccurs="0"/>
 *         &lt;element name="domicilie_keuzes" type="{http://www.webservices.nl/soap/}kadasterDomicilieKeuzeLijst" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterPersoon", propOrder = {

})
public class KadasterPersoon {

    @XmlElement(name = "akr_subject_nr")
    protected String akrSubjectNr;
    @XmlElement(name = "kadastrale_identificatie")
    protected String kadastraleIdentificatie;
    @XmlElement(name = "natuurlijk_persoon")
    protected KadasterNatuurlijkPersoon natuurlijkPersoon;
    @XmlElement(name = "niet_natuurlijk_persoon")
    protected KadasterNietNatuurlijkPersoon nietNatuurlijkPersoon;
    @XmlElement(name = "aantekening_beschikkingsbevoegdheid")
    protected Boolean aantekeningBeschikkingsbevoegdheid;
    protected KadasterLocatie woonlocatie;
    protected KadasterLocatie postlocatie;
    @XmlElement(name = "domicilie_keuzes")
    protected KadasterDomicilieKeuzeLijst domicilieKeuzes;

    /**
     * Gets the value of the akrSubjectNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkrSubjectNr() {
        return akrSubjectNr;
    }

    /**
     * Sets the value of the akrSubjectNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkrSubjectNr(String value) {
        this.akrSubjectNr = value;
    }

    /**
     * Gets the value of the kadastraleIdentificatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKadastraleIdentificatie() {
        return kadastraleIdentificatie;
    }

    /**
     * Sets the value of the kadastraleIdentificatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKadastraleIdentificatie(String value) {
        this.kadastraleIdentificatie = value;
    }

    /**
     * Gets the value of the natuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterNatuurlijkPersoon }
     *     
     */
    public KadasterNatuurlijkPersoon getNatuurlijkPersoon() {
        return natuurlijkPersoon;
    }

    /**
     * Sets the value of the natuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterNatuurlijkPersoon }
     *     
     */
    public void setNatuurlijkPersoon(KadasterNatuurlijkPersoon value) {
        this.natuurlijkPersoon = value;
    }

    /**
     * Gets the value of the nietNatuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterNietNatuurlijkPersoon }
     *     
     */
    public KadasterNietNatuurlijkPersoon getNietNatuurlijkPersoon() {
        return nietNatuurlijkPersoon;
    }

    /**
     * Sets the value of the nietNatuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterNietNatuurlijkPersoon }
     *     
     */
    public void setNietNatuurlijkPersoon(KadasterNietNatuurlijkPersoon value) {
        this.nietNatuurlijkPersoon = value;
    }

    /**
     * Gets the value of the aantekeningBeschikkingsbevoegdheid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAantekeningBeschikkingsbevoegdheid() {
        return aantekeningBeschikkingsbevoegdheid;
    }

    /**
     * Sets the value of the aantekeningBeschikkingsbevoegdheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAantekeningBeschikkingsbevoegdheid(Boolean value) {
        this.aantekeningBeschikkingsbevoegdheid = value;
    }

    /**
     * Gets the value of the woonlocatie property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterLocatie }
     *     
     */
    public KadasterLocatie getWoonlocatie() {
        return woonlocatie;
    }

    /**
     * Sets the value of the woonlocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterLocatie }
     *     
     */
    public void setWoonlocatie(KadasterLocatie value) {
        this.woonlocatie = value;
    }

    /**
     * Gets the value of the postlocatie property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterLocatie }
     *     
     */
    public KadasterLocatie getPostlocatie() {
        return postlocatie;
    }

    /**
     * Sets the value of the postlocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterLocatie }
     *     
     */
    public void setPostlocatie(KadasterLocatie value) {
        this.postlocatie = value;
    }

    /**
     * Gets the value of the domicilieKeuzes property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterDomicilieKeuzeLijst }
     *     
     */
    public KadasterDomicilieKeuzeLijst getDomicilieKeuzes() {
        return domicilieKeuzes;
    }

    /**
     * Sets the value of the domicilieKeuzes property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterDomicilieKeuzeLijst }
     *     
     */
    public void setDomicilieKeuzes(KadasterDomicilieKeuzeLijst value) {
        this.domicilieKeuzes = value;
    }

}
