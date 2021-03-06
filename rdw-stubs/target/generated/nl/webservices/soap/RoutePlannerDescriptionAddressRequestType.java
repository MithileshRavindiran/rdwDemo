
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerDescriptionAddressRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerDescriptionAddressRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="routetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_postalcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_houseno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_postalcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_houseno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerDescriptionAddressRequestType", propOrder = {

})
public class RoutePlannerDescriptionAddressRequestType {

    @XmlElement(required = true)
    protected String routetype;
    @XmlElement(name = "from_postalcode", required = true)
    protected String fromPostalcode;
    @XmlElement(name = "from_houseno", required = true)
    protected String fromHouseno;
    @XmlElement(name = "from_street", required = true)
    protected String fromStreet;
    @XmlElement(name = "from_city", required = true)
    protected String fromCity;
    @XmlElement(name = "from_country", required = true)
    protected String fromCountry;
    @XmlElement(name = "to_postalcode", required = true)
    protected String toPostalcode;
    @XmlElement(name = "to_houseno", required = true)
    protected String toHouseno;
    @XmlElement(name = "to_street", required = true)
    protected String toStreet;
    @XmlElement(name = "to_city", required = true)
    protected String toCity;
    @XmlElement(name = "to_country", required = true)
    protected String toCountry;
    @XmlElement(required = true)
    protected String language;

    /**
     * Gets the value of the routetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutetype() {
        return routetype;
    }

    /**
     * Sets the value of the routetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutetype(String value) {
        this.routetype = value;
    }

    /**
     * Gets the value of the fromPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalcode() {
        return fromPostalcode;
    }

    /**
     * Sets the value of the fromPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalcode(String value) {
        this.fromPostalcode = value;
    }

    /**
     * Gets the value of the fromHouseno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromHouseno() {
        return fromHouseno;
    }

    /**
     * Sets the value of the fromHouseno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromHouseno(String value) {
        this.fromHouseno = value;
    }

    /**
     * Gets the value of the fromStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromStreet() {
        return fromStreet;
    }

    /**
     * Sets the value of the fromStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromStreet(String value) {
        this.fromStreet = value;
    }

    /**
     * Gets the value of the fromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * Sets the value of the fromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCity(String value) {
        this.fromCity = value;
    }

    /**
     * Gets the value of the fromCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCountry() {
        return fromCountry;
    }

    /**
     * Sets the value of the fromCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCountry(String value) {
        this.fromCountry = value;
    }

    /**
     * Gets the value of the toPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostalcode() {
        return toPostalcode;
    }

    /**
     * Sets the value of the toPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostalcode(String value) {
        this.toPostalcode = value;
    }

    /**
     * Gets the value of the toHouseno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToHouseno() {
        return toHouseno;
    }

    /**
     * Sets the value of the toHouseno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToHouseno(String value) {
        this.toHouseno = value;
    }

    /**
     * Gets the value of the toStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToStreet() {
        return toStreet;
    }

    /**
     * Sets the value of the toStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToStreet(String value) {
        this.toStreet = value;
    }

    /**
     * Gets the value of the toCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Sets the value of the toCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

    /**
     * Gets the value of the toCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCountry() {
        return toCountry;
    }

    /**
     * Sets the value of the toCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCountry(String value) {
        this.toCountry = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
