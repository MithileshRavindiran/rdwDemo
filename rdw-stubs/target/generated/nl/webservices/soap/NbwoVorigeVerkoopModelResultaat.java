
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NbwoVorigeVerkoopModelResultaat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NbwoVorigeVerkoopModelResultaat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="huisnummer_toevoeging" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vorige_verkoop_datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="koopsom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vorige_verkoop_waarde" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NbwoVorigeVerkoopModelResultaat", propOrder = {

})
public class NbwoVorigeVerkoopModelResultaat {

    @XmlElement(required = true)
    protected String postcode;
    protected int huisnummer;
    @XmlElement(name = "huisnummer_toevoeging", required = true)
    protected String huisnummerToevoeging;
    @XmlElement(name = "vorige_verkoop_datum", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vorigeVerkoopDatum;
    protected int koopsom;
    @XmlElement(name = "vorige_verkoop_waarde")
    protected int vorigeVerkoopWaarde;

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
     * Gets the value of the vorigeVerkoopDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVorigeVerkoopDatum() {
        return vorigeVerkoopDatum;
    }

    /**
     * Sets the value of the vorigeVerkoopDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVorigeVerkoopDatum(XMLGregorianCalendar value) {
        this.vorigeVerkoopDatum = value;
    }

    /**
     * Gets the value of the koopsom property.
     * 
     */
    public int getKoopsom() {
        return koopsom;
    }

    /**
     * Sets the value of the koopsom property.
     * 
     */
    public void setKoopsom(int value) {
        this.koopsom = value;
    }

    /**
     * Gets the value of the vorigeVerkoopWaarde property.
     * 
     */
    public int getVorigeVerkoopWaarde() {
        return vorigeVerkoopWaarde;
    }

    /**
     * Sets the value of the vorigeVerkoopWaarde property.
     * 
     */
    public void setVorigeVerkoopWaarde(int value) {
        this.vorigeVerkoopWaarde = value;
    }

}
