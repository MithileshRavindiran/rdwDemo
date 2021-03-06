
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nbwoEstimateValueRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nbwoEstimateValueRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="huisnummer_toevoeging" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prijspeil_datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="woningtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inhoud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grootte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nbwoEstimateValueRequestType", propOrder = {

})
public class NbwoEstimateValueRequestType {

    @XmlElement(required = true)
    protected String postcode;
    protected int huisnummer;
    @XmlElement(name = "huisnummer_toevoeging", required = true)
    protected String huisnummerToevoeging;
    @XmlElement(name = "prijspeil_datum", required = true)
    protected String prijspeilDatum;
    @XmlElement(required = true)
    protected String woningtype;
    protected int inhoud;
    protected int grootte;

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
     * Gets the value of the prijspeilDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrijspeilDatum() {
        return prijspeilDatum;
    }

    /**
     * Sets the value of the prijspeilDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrijspeilDatum(String value) {
        this.prijspeilDatum = value;
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
     * Gets the value of the inhoud property.
     * 
     */
    public int getInhoud() {
        return inhoud;
    }

    /**
     * Sets the value of the inhoud property.
     * 
     */
    public void setInhoud(int value) {
        this.inhoud = value;
    }

    /**
     * Gets the value of the grootte property.
     * 
     */
    public int getGrootte() {
        return grootte;
    }

    /**
     * Sets the value of the grootte property.
     * 
     */
    public void setGrootte(int value) {
        this.grootte = value;
    }

}
