
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBBusinessVerification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBBusinessVerification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="duns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dnb_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enquiry_duns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="business_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business_number_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business_number_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subregion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_calling_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="main_branch_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="out_of_business" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="incorporation_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sic_activity_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sic_activity_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sic_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DNBBusinessVerification", propOrder = {

})
public class DNBBusinessVerification {

    @XmlElement(required = true)
    protected String duns;
    @XmlElement(name = "dnb_key", required = true)
    protected String dnbKey;
    @XmlElement(name = "enquiry_duns", required = true)
    protected String enquiryDuns;
    @XmlElement(name = "business_number")
    protected String businessNumber;
    @XmlElement(name = "business_number_type")
    protected String businessNumberType;
    @XmlElement(name = "business_number_description")
    protected String businessNumberDescription;
    @XmlElement(name = "trade_name", required = true)
    protected String tradeName;
    @XmlElement(required = true)
    protected StringArray address;
    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(required = true)
    protected String city;
    protected String region;
    protected String subregion;
    @XmlElement(name = "country_calling_code", required = true)
    protected String countryCallingCode;
    @XmlElement(name = "phone_number")
    protected String phoneNumber;
    @XmlElement(name = "fax_number")
    protected String faxNumber;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(name = "main_branch_indication")
    protected Boolean mainBranchIndication;
    @XmlElement(name = "out_of_business")
    protected Boolean outOfBusiness;
    @XmlElement(name = "incorporation_year")
    protected Integer incorporationYear;
    @XmlElement(name = "start_year")
    protected Integer startYear;
    @XmlElement(name = "sic_activity_code", required = true)
    protected String sicActivityCode;
    @XmlElement(name = "sic_activity_description", required = true)
    protected String sicActivityDescription;
    @XmlElement(name = "sic_version", required = true)
    protected String sicVersion;
    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuns() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuns(String value) {
        this.duns = value;
    }

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
     * Gets the value of the enquiryDuns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquiryDuns() {
        return enquiryDuns;
    }

    /**
     * Sets the value of the enquiryDuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquiryDuns(String value) {
        this.enquiryDuns = value;
    }

    /**
     * Gets the value of the businessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNumber() {
        return businessNumber;
    }

    /**
     * Sets the value of the businessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNumber(String value) {
        this.businessNumber = value;
    }

    /**
     * Gets the value of the businessNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNumberType() {
        return businessNumberType;
    }

    /**
     * Sets the value of the businessNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNumberType(String value) {
        this.businessNumberType = value;
    }

    /**
     * Gets the value of the businessNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNumberDescription() {
        return businessNumberDescription;
    }

    /**
     * Sets the value of the businessNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNumberDescription(String value) {
        this.businessNumberDescription = value;
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
     *     {@link StringArray }
     *     
     */
    public StringArray getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setAddress(StringArray value) {
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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the subregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubregion() {
        return subregion;
    }

    /**
     * Sets the value of the subregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubregion(String value) {
        this.subregion = value;
    }

    /**
     * Gets the value of the countryCallingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    /**
     * Sets the value of the countryCallingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCallingCode(String value) {
        this.countryCallingCode = value;
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
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainBranchIndication() {
        return mainBranchIndication;
    }

    /**
     * Sets the value of the mainBranchIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainBranchIndication(Boolean value) {
        this.mainBranchIndication = value;
    }

    /**
     * Gets the value of the outOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfBusiness() {
        return outOfBusiness;
    }

    /**
     * Sets the value of the outOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfBusiness(Boolean value) {
        this.outOfBusiness = value;
    }

    /**
     * Gets the value of the incorporationYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncorporationYear() {
        return incorporationYear;
    }

    /**
     * Sets the value of the incorporationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncorporationYear(Integer value) {
        this.incorporationYear = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartYear(Integer value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the sicActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicActivityCode() {
        return sicActivityCode;
    }

    /**
     * Sets the value of the sicActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicActivityCode(String value) {
        this.sicActivityCode = value;
    }

    /**
     * Gets the value of the sicActivityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicActivityDescription() {
        return sicActivityDescription;
    }

    /**
     * Sets the value of the sicActivityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicActivityDescription(String value) {
        this.sicActivityDescription = value;
    }

    /**
     * Gets the value of the sicVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicVersion() {
        return sicVersion;
    }

    /**
     * Sets the value of the sicVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicVersion(String value) {
        this.sicVersion = value;
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
