
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Recht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gerechtigde_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="omschrijving_recht" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aandeel_in_recht" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totaal_aandeel_in_recht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="einddatum_recht" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="indicatie_recht_betrokken_in_splitsing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ontleend_aan_stukken_lijst" type="{http://www.webservices.nl/soap/}StukMetKadastraleAanduidingLijst" minOccurs="0"/>
 *         &lt;element name="mogelijk_van_belang_stukken_lijst" type="{http://www.webservices.nl/soap/}StukReferentiesLijst" minOccurs="0"/>
 *         &lt;element name="aantekeningen_recht_lijst" type="{http://www.webservices.nl/soap/}AantekeningRechtLijst" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recht", propOrder = {

})
public class Recht {

    @XmlElement(name = "object_id", required = true)
    protected String objectId;
    @XmlElement(name = "gerechtigde_id", required = true)
    protected String gerechtigdeId;
    @XmlElement(name = "omschrijving_recht", required = true)
    protected String omschrijvingRecht;
    @XmlElement(name = "aandeel_in_recht", required = true)
    protected String aandeelInRecht;
    @XmlElement(name = "totaal_aandeel_in_recht")
    protected String totaalAandeelInRecht;
    @XmlElement(name = "einddatum_recht")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar einddatumRecht;
    @XmlElement(name = "indicatie_recht_betrokken_in_splitsing")
    protected boolean indicatieRechtBetrokkenInSplitsing;
    @XmlElement(name = "ontleend_aan_stukken_lijst")
    protected StukMetKadastraleAanduidingLijst ontleendAanStukkenLijst;
    @XmlElement(name = "mogelijk_van_belang_stukken_lijst")
    protected StukReferentiesLijst mogelijkVanBelangStukkenLijst;
    @XmlElement(name = "aantekeningen_recht_lijst")
    protected AantekeningRechtLijst aantekeningenRechtLijst;

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
     * Gets the value of the gerechtigdeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerechtigdeId() {
        return gerechtigdeId;
    }

    /**
     * Sets the value of the gerechtigdeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerechtigdeId(String value) {
        this.gerechtigdeId = value;
    }

    /**
     * Gets the value of the omschrijvingRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijvingRecht() {
        return omschrijvingRecht;
    }

    /**
     * Sets the value of the omschrijvingRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijvingRecht(String value) {
        this.omschrijvingRecht = value;
    }

    /**
     * Gets the value of the aandeelInRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAandeelInRecht() {
        return aandeelInRecht;
    }

    /**
     * Sets the value of the aandeelInRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAandeelInRecht(String value) {
        this.aandeelInRecht = value;
    }

    /**
     * Gets the value of the totaalAandeelInRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotaalAandeelInRecht() {
        return totaalAandeelInRecht;
    }

    /**
     * Sets the value of the totaalAandeelInRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotaalAandeelInRecht(String value) {
        this.totaalAandeelInRecht = value;
    }

    /**
     * Gets the value of the einddatumRecht property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEinddatumRecht() {
        return einddatumRecht;
    }

    /**
     * Sets the value of the einddatumRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEinddatumRecht(XMLGregorianCalendar value) {
        this.einddatumRecht = value;
    }

    /**
     * Gets the value of the indicatieRechtBetrokkenInSplitsing property.
     * 
     */
    public boolean isIndicatieRechtBetrokkenInSplitsing() {
        return indicatieRechtBetrokkenInSplitsing;
    }

    /**
     * Sets the value of the indicatieRechtBetrokkenInSplitsing property.
     * 
     */
    public void setIndicatieRechtBetrokkenInSplitsing(boolean value) {
        this.indicatieRechtBetrokkenInSplitsing = value;
    }

    /**
     * Gets the value of the ontleendAanStukkenLijst property.
     * 
     * @return
     *     possible object is
     *     {@link StukMetKadastraleAanduidingLijst }
     *     
     */
    public StukMetKadastraleAanduidingLijst getOntleendAanStukkenLijst() {
        return ontleendAanStukkenLijst;
    }

    /**
     * Sets the value of the ontleendAanStukkenLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link StukMetKadastraleAanduidingLijst }
     *     
     */
    public void setOntleendAanStukkenLijst(StukMetKadastraleAanduidingLijst value) {
        this.ontleendAanStukkenLijst = value;
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

    /**
     * Gets the value of the aantekeningenRechtLijst property.
     * 
     * @return
     *     possible object is
     *     {@link AantekeningRechtLijst }
     *     
     */
    public AantekeningRechtLijst getAantekeningenRechtLijst() {
        return aantekeningenRechtLijst;
    }

    /**
     * Sets the value of the aantekeningenRechtLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link AantekeningRechtLijst }
     *     
     */
    public void setAantekeningenRechtLijst(AantekeningRechtLijst value) {
        this.aantekeningenRechtLijst = value;
    }

}
