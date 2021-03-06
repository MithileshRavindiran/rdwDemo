
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBBusinessReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBBusinessReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dnb_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trade_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="main_branch_indication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="confidence_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBBusinessReference", propOrder = {

})
public class DNBBusinessReference {

    @XmlElement(name = "dnb_key", required = true)
    protected String dnbKey;
    @XmlElement(name = "trade_name", required = true)
    protected String tradeName;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(name = "phone_number", required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(name = "main_branch_indication")
    protected boolean mainBranchIndication;
    @XmlElement(name = "confidence_code")
    protected int confidenceCode;
    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;

    /**
     * Gets the value of the dnbKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnbKey() {
        return dnbKey;
    }

    /**
     * Sets the value of the dnbKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnbKey(String value) {
        this.dnbKey = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the mainBranchIndication property.
     * 
     */
    public boolean isMainBranchIndication() {
        return mainBranchIndication;
    }

    /**
     * Sets the value of the mainBranchIndication property.
     * 
     */
    public void setMainBranchIndication(boolean value) {
        this.mainBranchIndication = value;
    }

    /**
     * Gets the value of the confidenceCode property.
     * 
     */
    public int getConfidenceCode() {
        return confidenceCode;
    }

    /**
     * Sets the value of the confidenceCode property.
     * 
     */
    public void setConfidenceCode(int value) {
        this.confidenceCode = value;
    }

    /**
     * Gets the value of the tradeNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getTradeNames() {
        return tradeNames;
    }

    /**
     * Sets the value of the tradeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setTradeNames(StringArray value) {
        this.tradeNames = value;
    }

}
