
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kadasterNatuurlijkPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterNatuurlijkPersoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voorvoegsel_geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voornamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geslacht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geboorteplaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geboortedatum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="datum_overlijden" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="indicatie_overleden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="burgerlijke_staat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterNatuurlijkPersoon", propOrder = {

})
public class KadasterNatuurlijkPersoon {

    protected String bsn;
    protected String geslachtsnaam;
    @XmlElement(name = "voorvoegsel_geslachtsnaam")
    protected String voorvoegselGeslachtsnaam;
    protected String voornamen;
    protected String geslacht;
    protected String geboorteplaats;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar geboortedatum;
    @XmlElement(name = "datum_overlijden")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumOverlijden;
    @XmlElement(name = "indicatie_overleden")
    protected Boolean indicatieOverleden;
    @XmlElement(name = "burgerlijke_staat")
    protected String burgerlijkeStaat;

    /**
     * Gets the value of the bsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsn() {
        return bsn;
    }

    /**
     * Sets the value of the bsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsn(String value) {
        this.bsn = value;
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicatieOverleden() {
        return indicatieOverleden;
    }

    /**
     * Sets the value of the indicatieOverleden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicatieOverleden(Boolean value) {
        this.indicatieOverleden = value;
    }

    /**
     * Gets the value of the burgerlijkeStaat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBurgerlijkeStaat() {
        return burgerlijkeStaat;
    }

    /**
     * Sets the value of the burgerlijkeStaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBurgerlijkeStaat(String value) {
        this.burgerlijkeStaat = value;
    }

}
