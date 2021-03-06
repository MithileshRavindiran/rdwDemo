
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterOverzichtPersoonV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterOverzichtPersoonV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="akr_subject_nr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kadastrale_identificatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natuurlijk_persoon" type="{http://www.webservices.nl/soap/}kadasterOverzichtNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="niet_natuurlijk_persoon" type="{http://www.webservices.nl/soap/}kadasterOverzichtNietNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="melding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterOverzichtPersoonV2", propOrder = {

})
public class KadasterOverzichtPersoonV2 {

    @XmlElement(name = "akr_subject_nr", required = true)
    protected String akrSubjectNr;
    @XmlElement(name = "kadastrale_identificatie")
    protected String kadastraleIdentificatie;
    @XmlElement(name = "natuurlijk_persoon")
    protected KadasterOverzichtNatuurlijkPersoon natuurlijkPersoon;
    @XmlElement(name = "niet_natuurlijk_persoon")
    protected KadasterOverzichtNietNatuurlijkPersoon nietNatuurlijkPersoon;
    protected String melding;

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
     *     {@link KadasterOverzichtNatuurlijkPersoon }
     *     
     */
    public KadasterOverzichtNatuurlijkPersoon getNatuurlijkPersoon() {
        return natuurlijkPersoon;
    }

    /**
     * Sets the value of the natuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzichtNatuurlijkPersoon }
     *     
     */
    public void setNatuurlijkPersoon(KadasterOverzichtNatuurlijkPersoon value) {
        this.natuurlijkPersoon = value;
    }

    /**
     * Gets the value of the nietNatuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzichtNietNatuurlijkPersoon }
     *     
     */
    public KadasterOverzichtNietNatuurlijkPersoon getNietNatuurlijkPersoon() {
        return nietNatuurlijkPersoon;
    }

    /**
     * Sets the value of the nietNatuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzichtNietNatuurlijkPersoon }
     *     
     */
    public void setNietNatuurlijkPersoon(KadasterOverzichtNietNatuurlijkPersoon value) {
        this.nietNatuurlijkPersoon = value;
    }

    /**
     * Gets the value of the melding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMelding() {
        return melding;
    }

    /**
     * Sets the value of the melding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMelding(String value) {
        this.melding = value;
    }

}
