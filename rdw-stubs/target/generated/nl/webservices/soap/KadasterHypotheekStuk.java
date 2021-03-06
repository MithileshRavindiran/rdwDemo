
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterHypotheekStuk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypotheekStuk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="stuk" type="{http://www.webservices.nl/soap/}Stuk"/>
 *         &lt;element name="stukdelen" type="{http://www.webservices.nl/soap/}kadasterStukdeelArray"/>
 *         &lt;element name="datum_aanbieding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum_ondertekening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rectificatie_verzocht" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eenzijdig_opzegbaar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gefiatteerd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterHypotheekStuk", propOrder = {

})
public class KadasterHypotheekStuk {

    @XmlElement(required = true)
    protected Stuk stuk;
    @XmlElement(required = true)
    protected KadasterStukdeelArray stukdelen;
    @XmlElement(name = "datum_aanbieding")
    protected String datumAanbieding;
    @XmlElement(name = "datum_ondertekening")
    protected String datumOndertekening;
    protected String omschrijving;
    @XmlElement(name = "rectificatie_verzocht")
    protected Boolean rectificatieVerzocht;
    @XmlElement(name = "eenzijdig_opzegbaar")
    protected Boolean eenzijdigOpzegbaar;
    protected Boolean gefiatteerd;

    /**
     * Gets the value of the stuk property.
     * 
     * @return
     *     possible object is
     *     {@link Stuk }
     *     
     */
    public Stuk getStuk() {
        return stuk;
    }

    /**
     * Sets the value of the stuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stuk }
     *     
     */
    public void setStuk(Stuk value) {
        this.stuk = value;
    }

    /**
     * Gets the value of the stukdelen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterStukdeelArray }
     *     
     */
    public KadasterStukdeelArray getStukdelen() {
        return stukdelen;
    }

    /**
     * Sets the value of the stukdelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterStukdeelArray }
     *     
     */
    public void setStukdelen(KadasterStukdeelArray value) {
        this.stukdelen = value;
    }

    /**
     * Gets the value of the datumAanbieding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumAanbieding() {
        return datumAanbieding;
    }

    /**
     * Sets the value of the datumAanbieding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumAanbieding(String value) {
        this.datumAanbieding = value;
    }

    /**
     * Gets the value of the datumOndertekening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumOndertekening() {
        return datumOndertekening;
    }

    /**
     * Sets the value of the datumOndertekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumOndertekening(String value) {
        this.datumOndertekening = value;
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
     * Gets the value of the rectificatieVerzocht property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRectificatieVerzocht() {
        return rectificatieVerzocht;
    }

    /**
     * Sets the value of the rectificatieVerzocht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRectificatieVerzocht(Boolean value) {
        this.rectificatieVerzocht = value;
    }

    /**
     * Gets the value of the eenzijdigOpzegbaar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEenzijdigOpzegbaar() {
        return eenzijdigOpzegbaar;
    }

    /**
     * Sets the value of the eenzijdigOpzegbaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEenzijdigOpzegbaar(Boolean value) {
        this.eenzijdigOpzegbaar = value;
    }

    /**
     * Gets the value of the gefiatteerd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGefiatteerd() {
        return gefiatteerd;
    }

    /**
     * Sets the value of the gefiatteerd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGefiatteerd(Boolean value) {
        this.gefiatteerd = value;
    }

}
