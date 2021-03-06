
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NatuurlijkPersoonV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NatuurlijkPersoonV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="adellijke_titel_geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voorvoegsel_geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adellijke_titel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voornamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geslacht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geboorteplaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geboortedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datum_overlijden" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="indicatie_overleden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indicatie_conform_gba" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="relatie_partnerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="omschrijving_relatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NatuurlijkPersoonV2", propOrder = {

})
public class NatuurlijkPersoonV2 {

    @XmlElement(name = "adellijke_titel_geslachtsnaam")
    protected String adellijkeTitelGeslachtsnaam;
    protected String geslachtsnaam;
    @XmlElement(name = "voorvoegsel_geslachtsnaam")
    protected String voorvoegselGeslachtsnaam;
    @XmlElement(name = "adellijke_titel")
    protected String adellijkeTitel;
    protected String voornamen;
    protected String geslacht;
    protected String geboorteplaats;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar geboortedatum;
    @XmlElement(name = "datum_overlijden")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumOverlijden;
    @XmlElement(name = "indicatie_overleden")
    protected boolean indicatieOverleden;
    @XmlElement(name = "indicatie_conform_gba")
    protected boolean indicatieConformGba;
    @XmlElement(name = "relatie_partnerid")
    protected String relatiePartnerid;
    @XmlElement(name = "omschrijving_relatie")
    protected String omschrijvingRelatie;

    /**
     * Gets the value of the adellijkeTitelGeslachtsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdellijkeTitelGeslachtsnaam() {
        return adellijkeTitelGeslachtsnaam;
    }

    /**
     * Sets the value of the adellijkeTitelGeslachtsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdellijkeTitelGeslachtsnaam(String value) {
        this.adellijkeTitelGeslachtsnaam = value;
    }

    /**
     * Gets the value of the geslachtsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslachtsnaam() {
        return geslachtsnaam;
    }

    /**
     * Sets the value of the geslachtsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslachtsnaam(String value) {
        this.geslachtsnaam = value;
    }

    /**
     * Gets the value of the voorvoegselGeslachtsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorvoegselGeslachtsnaam() {
        return voorvoegselGeslachtsnaam;
    }

    /**
     * Sets the value of the voorvoegselGeslachtsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorvoegselGeslachtsnaam(String value) {
        this.voorvoegselGeslachtsnaam = value;
    }

    /**
     * Gets the value of the adellijkeTitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdellijkeTitel() {
        return adellijkeTitel;
    }

    /**
     * Sets the value of the adellijkeTitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdellijkeTitel(String value) {
        this.adellijkeTitel = value;
    }

    /**
     * Gets the value of the voornamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoornamen() {
        return voornamen;
    }

    /**
     * Sets the value of the voornamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoornamen(String value) {
        this.voornamen = value;
    }

    /**
     * Gets the value of the geslacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslacht() {
        return geslacht;
    }

    /**
     * Sets the value of the geslacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslacht(String value) {
        this.geslacht = value;
    }

    /**
     * Gets the value of the geboorteplaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboorteplaats() {
        return geboorteplaats;
    }

    /**
     * Sets the value of the geboorteplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboorteplaats(String value) {
        this.geboorteplaats = value;
    }

    /**
     * Gets the value of the geboortedatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * Sets the value of the geboortedatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeboortedatum(XMLGregorianCalendar value) {
        this.geboortedatum = value;
    }

    /**
     * Gets the value of the datumOverlijden property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumOverlijden() {
        return datumOverlijden;
    }

    /**
     * Sets the value of the datumOverlijden property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumOverlijden(XMLGregorianCalendar value) {
        this.datumOverlijden = value;
    }

    /**
     * Gets the value of the indicatieOverleden property.
     * 
     */
    public boolean isIndicatieOverleden() {
        return indicatieOverleden;
    }

    /**
     * Sets the value of the indicatieOverleden property.
     * 
     */
    public void setIndicatieOverleden(boolean value) {
        this.indicatieOverleden = value;
    }

    /**
     * Gets the value of the indicatieConformGba property.
     * 
     */
    public boolean isIndicatieConformGba() {
        return indicatieConformGba;
    }

    /**
     * Sets the value of the indicatieConformGba property.
     * 
     */
    public void setIndicatieConformGba(boolean value) {
        this.indicatieConformGba = value;
    }

    /**
     * Gets the value of the relatiePartnerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatiePartnerid() {
        return relatiePartnerid;
    }

    /**
     * Sets the value of the relatiePartnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatiePartnerid(String value) {
        this.relatiePartnerid = value;
    }

    /**
     * Gets the value of the omschrijvingRelatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijvingRelatie() {
        return omschrijvingRelatie;
    }

    /**
     * Sets the value of the omschrijvingRelatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijvingRelatie(String value) {
        this.omschrijvingRelatie = value;
    }

}
