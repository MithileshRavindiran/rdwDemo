
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company_id_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trade_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="house_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="house_no_addition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="residence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_iso2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraydonReference", propOrder = {

})
public class GraydonReference {

    @XmlElement(name = "company_id", required = true)
    protected String companyId;
    @XmlElement(name = "company_id_type", required = true)
    protected String companyIdType;
    @XmlElement(name = "trade_name", required = true)
    protected String tradeName;
    @XmlElement(required = true)
    protected String street;
    @XmlElement(name = "house_no")
    protected int houseNo;
    @XmlElement(name = "house_no_addition", required = true)
    protected String houseNoAddition;
    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(required = true)
    protected String residence;
    @XmlElement(name = "country_iso2", required = true)
    protected String countryIso2;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String email;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the companyIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdType() {
        return companyIdType;
    }

    /**
     * Sets the value of the companyIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdType(String value) {
        this.companyIdType = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the houseNo property.
     * 
     */
    public int getHouseNo() {
        return houseNo;
    }

    /**
     * Sets the value of the houseNo property.
     * 
     */
    public void setHouseNo(int value) {
        this.houseNo = value;
    }

    /**
     * Gets the value of the houseNoAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNoAddition() {
        return houseNoAddition;
    }

    /**
     * Sets the value of the houseNoAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNoAddition(String value) {
        this.houseNoAddition = value;
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
     * Gets the value of the residence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidence() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidence(String value) {
        this.residence = value;
    }

    /**
     * Gets the value of the countryIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIso2() {
        return countryIso2;
    }

    /**
     * Sets the value of the countryIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIso2(String value) {
        this.countryIso2 = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
