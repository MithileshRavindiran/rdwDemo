
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BerichtObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerichtObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="datum_bijgewerkt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="onroerende_zaak" type="{http://www.webservices.nl/soap/}OnroerendeZaak"/>
 *         &lt;element name="rechten_lijst" type="{http://www.webservices.nl/soap/}RechtenLijst"/>
 *         &lt;element name="personen" type="{http://www.webservices.nl/soap/}PersoonArray"/>
 *         &lt;element name="stukken" type="{http://www.webservices.nl/soap/}StukArray"/>
 *         &lt;element name="gemeentestukken" type="{http://www.webservices.nl/soap/}GemeenteStukArray" minOccurs="0"/>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtObject", propOrder = {

})
public class BerichtObject {

    @XmlElement(name = "datum_bijgewerkt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumBijgewerkt;
    @XmlElement(name = "onroerende_zaak", required = true)
    protected OnroerendeZaak onroerendeZaak;
    @XmlElement(name = "rechten_lijst", required = true)
    protected RechtenLijst rechtenLijst;
    @XmlElement(required = true)
    protected PersoonArray personen;
    @XmlElement(required = true)
    protected StukArray stukken;
    protected GemeenteStukArray gemeentestukken;
    @XmlElement(required = true)
    protected byte[] document;

    /**
     * Gets the value of the datumBijgewerkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumBijgewerkt() {
        return datumBijgewerkt;
    }

    /**
     * Sets the value of the datumBijgewerkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumBijgewerkt(XMLGregorianCalendar value) {
        this.datumBijgewerkt = value;
    }

    /**
     * Gets the value of the onroerendeZaak property.
     * 
     * @return
     *     possible object is
     *     {@link OnroerendeZaak }
     *     
     */
    public OnroerendeZaak getOnroerendeZaak() {
        return onroerendeZaak;
    }

    /**
     * Sets the value of the onroerendeZaak property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnroerendeZaak }
     *     
     */
    public void setOnroerendeZaak(OnroerendeZaak value) {
        this.onroerendeZaak = value;
    }

    /**
     * Gets the value of the rechtenLijst property.
     * 
     * @return
     *     possible object is
     *     {@link RechtenLijst }
     *     
     */
    public RechtenLijst getRechtenLijst() {
        return rechtenLijst;
    }

    /**
     * Sets the value of the rechtenLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtenLijst }
     *     
     */
    public void setRechtenLijst(RechtenLijst value) {
        this.rechtenLijst = value;
    }

    /**
     * Gets the value of the personen property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonArray }
     *     
     */
    public PersoonArray getPersonen() {
        return personen;
    }

    /**
     * Sets the value of the personen property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonArray }
     *     
     */
    public void setPersonen(PersoonArray value) {
        this.personen = value;
    }

    /**
     * Gets the value of the stukken property.
     * 
     * @return
     *     possible object is
     *     {@link StukArray }
     *     
     */
    public StukArray getStukken() {
        return stukken;
    }

    /**
     * Sets the value of the stukken property.
     * 
     * @param value
     *     allowed object is
     *     {@link StukArray }
     *     
     */
    public void setStukken(StukArray value) {
        this.stukken = value;
    }

    /**
     * Gets the value of the gemeentestukken property.
     * 
     * @return
     *     possible object is
     *     {@link GemeenteStukArray }
     *     
     */
    public GemeenteStukArray getGemeentestukken() {
        return gemeentestukken;
    }

    /**
     * Sets the value of the gemeentestukken property.
     * 
     * @param value
     *     allowed object is
     *     {@link GemeenteStukArray }
     *     
     */
    public void setGemeentestukken(GemeenteStukArray value) {
        this.gemeentestukken = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument(byte[] value) {
        this.document = ((byte[]) value);
    }

}
