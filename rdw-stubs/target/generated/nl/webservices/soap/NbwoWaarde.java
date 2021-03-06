
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NbwoWaarde complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NbwoWaarde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="waarde" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="betrouwbaarheid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datum_waardebepaling" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="cultuurcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="woningtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prijspeil_datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="straat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="huisnummer_toevoeging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oppervlak" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inhoud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bouwjaar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="grootte" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="garage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tuin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="monument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="schuur" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="postcode_model_resultaat" type="{http://www.webservices.nl/soap/}NbwoPostcodeStraatModelResultaat" minOccurs="0"/>
 *         &lt;element name="straat_model_resultaat" type="{http://www.webservices.nl/soap/}NbwoPostcodeStraatModelResultaat" minOccurs="0"/>
 *         &lt;element name="vorige_verkoop_model_resultaat" type="{http://www.webservices.nl/soap/}NbwoVorigeVerkoopModelResultaat" minOccurs="0"/>
 *         &lt;element name="kenmerken_model_resultaat" type="{http://www.webservices.nl/soap/}NbwoKenmerkenModelResultaat" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NbwoWaarde", propOrder = {

})
public class NbwoWaarde {

    protected int waarde;
    @XmlElement(required = true)
    protected String betrouwbaarheid;
    @XmlElement(name = "datum_waardebepaling")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumWaardebepaling;
    protected String cultuurcode;
    protected String woningtype;
    @XmlElement(name = "prijspeil_datum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prijspeilDatum;
    protected String straat;
    protected Integer huisnummer;
    @XmlElement(name = "huisnummer_toevoeging")
    protected String huisnummerToevoeging;
    protected String postcode;
    protected String plaats;
    protected Integer oppervlak;
    protected Integer inhoud;
    protected Integer bouwjaar;
    protected Integer grootte;
    protected Boolean garage;
    protected Boolean tuin;
    protected Boolean monument;
    protected Boolean schuur;
    @XmlElement(name = "postcode_model_resultaat")
    protected NbwoPostcodeStraatModelResultaat postcodeModelResultaat;
    @XmlElement(name = "straat_model_resultaat")
    protected NbwoPostcodeStraatModelResultaat straatModelResultaat;
    @XmlElement(name = "vorige_verkoop_model_resultaat")
    protected NbwoVorigeVerkoopModelResultaat vorigeVerkoopModelResultaat;
    @XmlElement(name = "kenmerken_model_resultaat")
    protected NbwoKenmerkenModelResultaat kenmerkenModelResultaat;

    /**
     * Gets the value of the waarde property.
     * 
     */
    public int getWaarde() {
        return waarde;
    }

    /**
     * Sets the value of the waarde property.
     * 
     */
    public void setWaarde(int value) {
        this.waarde = value;
    }

    /**
     * Gets the value of the betrouwbaarheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetrouwbaarheid() {
        return betrouwbaarheid;
    }

    /**
     * Sets the value of the betrouwbaarheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetrouwbaarheid(String value) {
        this.betrouwbaarheid = value;
    }

    /**
     * Gets the value of the datumWaardebepaling property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumWaardebepaling() {
        return datumWaardebepaling;
    }

    /**
     * Sets the value of the datumWaardebepaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumWaardebepaling(XMLGregorianCalendar value) {
        this.datumWaardebepaling = value;
    }

    /**
     * Gets the value of the cultuurcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCultuurcode() {
        return cultuurcode;
    }

    /**
     * Sets the value of the cultuurcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCultuurcode(String value) {
        this.cultuurcode = value;
    }

    /**
     * Gets the value of the woningtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoningtype() {
        return woningtype;
    }

    /**
     * Sets the value of the woningtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoningtype(String value) {
        this.woningtype = value;
    }

    /**
     * Gets the value of the prijspeilDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrijspeilDatum() {
        return prijspeilDatum;
    }

    /**
     * Sets the value of the prijspeilDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrijspeilDatum(XMLGregorianCalendar value) {
        this.prijspeilDatum = value;
    }

    /**
     * Gets the value of the straat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraat() {
        return straat;
    }

    /**
     * Sets the value of the straat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraat(String value) {
        this.straat = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHuisnummer(Integer value) {
        this.huisnummer = value;
    }

    /**
     * Gets the value of the huisnummerToevoeging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisnummerToevoeging() {
        return huisnummerToevoeging;
    }

    /**
     * Sets the value of the huisnummerToevoeging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisnummerToevoeging(String value) {
        this.huisnummerToevoeging = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the plaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaats() {
        return plaats;
    }

    /**
     * Sets the value of the plaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaats(String value) {
        this.plaats = value;
    }

    /**
     * Gets the value of the oppervlak property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOppervlak() {
        return oppervlak;
    }

    /**
     * Sets the value of the oppervlak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOppervlak(Integer value) {
        this.oppervlak = value;
    }

    /**
     * Gets the value of the inhoud property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInhoud() {
        return inhoud;
    }

    /**
     * Sets the value of the inhoud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInhoud(Integer value) {
        this.inhoud = value;
    }

    /**
     * Gets the value of the bouwjaar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBouwjaar() {
        return bouwjaar;
    }

    /**
     * Sets the value of the bouwjaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBouwjaar(Integer value) {
        this.bouwjaar = value;
    }

    /**
     * Gets the value of the grootte property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrootte() {
        return grootte;
    }

    /**
     * Sets the value of the grootte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrootte(Integer value) {
        this.grootte = value;
    }

    /**
     * Gets the value of the garage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGarage() {
        return garage;
    }

    /**
     * Sets the value of the garage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGarage(Boolean value) {
        this.garage = value;
    }

    /**
     * Gets the value of the tuin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTuin() {
        return tuin;
    }

    /**
     * Sets the value of the tuin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTuin(Boolean value) {
        this.tuin = value;
    }

    /**
     * Gets the value of the monument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonument() {
        return monument;
    }

    /**
     * Sets the value of the monument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonument(Boolean value) {
        this.monument = value;
    }

    /**
     * Gets the value of the schuur property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchuur() {
        return schuur;
    }

    /**
     * Sets the value of the schuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchuur(Boolean value) {
        this.schuur = value;
    }

    /**
     * Gets the value of the postcodeModelResultaat property.
     * 
     * @return
     *     possible object is
     *     {@link NbwoPostcodeStraatModelResultaat }
     *     
     */
    public NbwoPostcodeStraatModelResultaat getPostcodeModelResultaat() {
        return postcodeModelResultaat;
    }

    /**
     * Sets the value of the postcodeModelResultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NbwoPostcodeStraatModelResultaat }
     *     
     */
    public void setPostcodeModelResultaat(NbwoPostcodeStraatModelResultaat value) {
        this.postcodeModelResultaat = value;
    }

    /**
     * Gets the value of the straatModelResultaat property.
     * 
     * @return
     *     possible object is
     *     {@link NbwoPostcodeStraatModelResultaat }
     *     
     */
    public NbwoPostcodeStraatModelResultaat getStraatModelResultaat() {
        return straatModelResultaat;
    }

    /**
     * Sets the value of the straatModelResultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NbwoPostcodeStraatModelResultaat }
     *     
     */
    public void setStraatModelResultaat(NbwoPostcodeStraatModelResultaat value) {
        this.straatModelResultaat = value;
    }

    /**
     * Gets the value of the vorigeVerkoopModelResultaat property.
     * 
     * @return
     *     possible object is
     *     {@link NbwoVorigeVerkoopModelResultaat }
     *     
     */
    public NbwoVorigeVerkoopModelResultaat getVorigeVerkoopModelResultaat() {
        return vorigeVerkoopModelResultaat;
    }

    /**
     * Sets the value of the vorigeVerkoopModelResultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NbwoVorigeVerkoopModelResultaat }
     *     
     */
    public void setVorigeVerkoopModelResultaat(NbwoVorigeVerkoopModelResultaat value) {
        this.vorigeVerkoopModelResultaat = value;
    }

    /**
     * Gets the value of the kenmerkenModelResultaat property.
     * 
     * @return
     *     possible object is
     *     {@link NbwoKenmerkenModelResultaat }
     *     
     */
    public NbwoKenmerkenModelResultaat getKenmerkenModelResultaat() {
        return kenmerkenModelResultaat;
    }

    /**
     * Sets the value of the kenmerkenModelResultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NbwoKenmerkenModelResultaat }
     *     
     */
    public void setKenmerkenModelResultaat(NbwoKenmerkenModelResultaat value) {
        this.kenmerkenModelResultaat = value;
    }

}
