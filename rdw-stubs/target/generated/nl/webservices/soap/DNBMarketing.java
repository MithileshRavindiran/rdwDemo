
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBMarketing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBMarketing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="duns" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="business_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="business_number_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="primary_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="former_duns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="former_primary_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_address" type="{http://www.webservices.nl/soap/}DNBAddress"/>
 *         &lt;element name="country_calling_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketability_indication" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBMarketing", propOrder = {

})
public class DNBMarketing {

    @XmlElement(required = true)
    protected String duns;
    @XmlElement(name = "business_number")
    protected String businessNumber;
    @XmlElement(name = "business_number_type")
    protected Integer businessNumberType;
    @XmlElement(name = "primary_name")
    protected String primaryName;
    @XmlElement(name = "trade_name")
    protected String tradeName;
    @XmlElement(name = "former_duns")
    protected String formerDuns;
    @XmlElement(name = "former_primary_name")
    protected String formerPrimaryName;
    @XmlElement(name = "establishment_address", required = true)
    protected DNBAddress establishmentAddress;
    @XmlElement(name = "country_calling_code")
    protected String countryCallingCode;
    @XmlElement(name = "phone_number")
    protected String phoneNumber;
    @XmlElement(name = "fax_number")
    protected String faxNumber;
    @XmlElement(name = "marketability_indication")
    protected boolean marketabilityIndication;

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
     *     {@link Integer }
     *     
     */
    public Integer getBusinessNumberType() {
        return businessNumberType;
    }

    /**
     * Sets the value of the businessNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessNumberType(Integer value) {
        this.businessNumberType = value;
    }

    /**
     * Gets the value of the primaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryName() {
        return primaryName;
    }

    /**
     * Sets the value of the primaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryName(String value) {
        this.primaryName = value;
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
     * Gets the value of the formerDuns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormerDuns() {
        return formerDuns;
    }

    /**
     * Sets the value of the formerDuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormerDuns(String value) {
        this.formerDuns = value;
    }

    /**
     * Gets the value of the formerPrimaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormerPrimaryName() {
        return formerPrimaryName;
    }

    /**
     * Sets the value of the formerPrimaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormerPrimaryName(String value) {
        this.formerPrimaryName = value;
    }

    /**
     * Gets the value of the establishmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DNBAddress }
     *     
     */
    public DNBAddress getEstablishmentAddress() {
        return establishmentAddress;
    }

    /**
     * Sets the value of the establishmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBAddress }
     *     
     */
    public void setEstablishmentAddress(DNBAddress value) {
        this.establishmentAddress = value;
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
     * Gets the value of the marketabilityIndication property.
     * 
     */
    public boolean isMarketabilityIndication() {
        return marketabilityIndication;
    }

    /**
     * Sets the value of the marketabilityIndication property.
     * 
     */
    public void setMarketabilityIndication(boolean value) {
        this.marketabilityIndication = value;
    }

}
