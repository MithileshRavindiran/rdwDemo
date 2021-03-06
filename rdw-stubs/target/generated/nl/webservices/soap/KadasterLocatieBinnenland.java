
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterLocatieBinnenland complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterLocatieBinnenland">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="straatnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="huisnummer_toevoeging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="huisletter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterLocatieBinnenland", propOrder = {

})
public class KadasterLocatieBinnenland {

    protected String plaats;
    protected String straatnaam;
    protected String postcode;
    protected Integer huisnummer;
    @XmlElement(name = "huisnummer_toevoeging")
    protected String huisnummerToevoeging;
    protected String huisletter;
    protected String positie;

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
     * Gets the value of the huisletter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisletter() {
        return huisletter;
    }

    /**
     * Sets the value of the huisletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisletter(String value) {
        this.huisletter = value;
    }

    /**
     * Gets the value of the positie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositie() {
        return positie;
    }

    /**
     * Sets the value of the positie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositie(String value) {
        this.positie = value;
    }

}
