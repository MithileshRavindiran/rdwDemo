
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KoopsommenOverzicht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoopsommenOverzicht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="eind_datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="straatnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="huisnr_van" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="huisnr_tm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reeksindicatie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koopsommen" type="{http://www.webservices.nl/soap/}KoopsomArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoopsommenOverzicht", propOrder = {

})
public class KoopsommenOverzicht {

    @XmlElement(name = "eind_datum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eindDatum;
    @XmlElement(required = true)
    protected String straatnaam;
    @XmlElement(name = "huisnr_van")
    protected int huisnrVan;
    @XmlElement(name = "huisnr_tm")
    protected int huisnrTm;
    @XmlElement(required = true)
    protected String reeksindicatie;
    @XmlElement(required = true)
    protected String gemeente;
    @XmlElement(required = true)
    protected KoopsomArray koopsommen;

    /**
     * Gets the value of the eindDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEindDatum() {
        return eindDatum;
    }

    /**
     * Sets the value of the eindDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEindDatum(XMLGregorianCalendar value) {
        this.eindDatum = value;
    }

    /**
     * Gets the value of the straatnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaam() {
        return straatnaam;
    }

    /**
     * Sets the value of the straatnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaam(String value) {
        this.straatnaam = value;
    }

    /**
     * Gets the value of the huisnrVan property.
     * 
     */
    public int getHuisnrVan() {
        return huisnrVan;
    }

    /**
     * Sets the value of the huisnrVan property.
     * 
     */
    public void setHuisnrVan(int value) {
        this.huisnrVan = value;
    }

    /**
     * Gets the value of the huisnrTm property.
     * 
     */
    public int getHuisnrTm() {
        return huisnrTm;
    }

    /**
     * Sets the value of the huisnrTm property.
     * 
     */
    public void setHuisnrTm(int value) {
        this.huisnrTm = value;
    }

    /**
     * Gets the value of the reeksindicatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReeksindicatie() {
        return reeksindicatie;
    }

    /**
     * Sets the value of the reeksindicatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReeksindicatie(String value) {
        this.reeksindicatie = value;
    }

    /**
     * Gets the value of the gemeente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeente() {
        return gemeente;
    }

    /**
     * Sets the value of the gemeente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeente(String value) {
        this.gemeente = value;
    }

    /**
     * Gets the value of the koopsommen property.
     * 
     * @return
     *     possible object is
     *     {@link KoopsomArray }
     *     
     */
    public KoopsomArray getKoopsommen() {
        return koopsommen;
    }

    /**
     * Sets the value of the koopsommen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KoopsomArray }
     *     
     */
    public void setKoopsommen(KoopsomArray value) {
        this.koopsommen = value;
    }

}
