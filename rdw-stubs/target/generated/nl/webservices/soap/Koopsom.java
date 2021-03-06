
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Koopsom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Koopsom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="koopdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="huisnummer_toevoeging" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bedrag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oppervlakte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meer_onroerende_goederen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Koopsom", propOrder = {

})
public class Koopsom {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar koopdatum;
    protected int huisnummer;
    @XmlElement(name = "huisnummer_toevoeging", required = true)
    protected String huisnummerToevoeging;
    protected int bedrag;
    protected int oppervlakte;
    @XmlElement(required = true)
    protected String omschrijving;
    @XmlElement(name = "meer_onroerende_goederen")
    protected boolean meerOnroerendeGoederen;

    /**
     * Gets the value of the koopdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKoopdatum() {
        return koopdatum;
    }

    /**
     * Sets the value of the koopdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKoopdatum(XMLGregorianCalendar value) {
        this.koopdatum = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     */
    public int getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     */
    public void setHuisnummer(int value) {
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
     * Gets the value of the bedrag property.
     * 
     */
    public int getBedrag() {
        return bedrag;
    }

    /**
     * Sets the value of the bedrag property.
     * 
     */
    public void setBedrag(int value) {
        this.bedrag = value;
    }

    /**
     * Gets the value of the oppervlakte property.
     * 
     */
    public int getOppervlakte() {
        return oppervlakte;
    }

    /**
     * Sets the value of the oppervlakte property.
     * 
     */
    public void setOppervlakte(int value) {
        this.oppervlakte = value;
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
     * Gets the value of the meerOnroerendeGoederen property.
     * 
     */
    public boolean isMeerOnroerendeGoederen() {
        return meerOnroerendeGoederen;
    }

    /**
     * Sets the value of the meerOnroerendeGoederen property.
     * 
     */
    public void setMeerOnroerendeGoederen(boolean value) {
        this.meerOnroerendeGoederen = value;
    }

}
