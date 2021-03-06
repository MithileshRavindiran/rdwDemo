
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessEstablishment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessEstablishment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="main_establishment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbi_codes" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="sbi_codes_text" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="establishment_postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_house_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="establishment_house_number_addition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correspondence_postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correspondence_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correspondence_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correspondence_house_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correspondence_house_number_addition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correspondence_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curator_postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curator_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curator_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curator_house_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="curator_house_number_addition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curator_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="fax_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="email_addresses" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="domain_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="establishment_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="date_since" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="personnel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessEstablishment", propOrder = {

})
public class DutchBusinessEstablishment {

    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    @XmlElement(name = "main_establishment")
    protected Boolean mainEstablishment;
    protected String status;
    @XmlElement(name = "legal_form_text")
    protected String legalFormText;
    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;
    protected String activity;
    protected String description;
    @XmlElement(name = "sbi_codes")
    protected StringArray sbiCodes;
    @XmlElement(name = "sbi_codes_text")
    protected StringArray sbiCodesText;
    @XmlElement(name = "establishment_postcode")
    protected String establishmentPostcode;
    @XmlElement(name = "establishment_city")
    protected String establishmentCity;
    @XmlElement(name = "establishment_street")
    protected String establishmentStreet;
    @XmlElement(name = "establishment_house_number")
    protected Integer establishmentHouseNumber;
    @XmlElement(name = "establishment_house_number_addition")
    protected String establishmentHouseNumberAddition;
    @XmlElement(name = "establishment_country")
    protected String establishmentCountry;
    @XmlElement(name = "correspondence_postcode")
    protected String correspondencePostcode;
    @XmlElement(name = "correspondence_city")
    protected String correspondenceCity;
    @XmlElement(name = "correspondence_street")
    protected String correspondenceStreet;
    @XmlElement(name = "correspondence_house_number")
    protected Integer correspondenceHouseNumber;
    @XmlElement(name = "correspondence_house_number_addition")
    protected String correspondenceHouseNumberAddition;
    @XmlElement(name = "correspondence_country")
    protected String correspondenceCountry;
    @XmlElement(name = "curator_postcode")
    protected String curatorPostcode;
    @XmlElement(name = "curator_city")
    protected String curatorCity;
    @XmlElement(name = "curator_street")
    protected String curatorStreet;
    @XmlElement(name = "curator_house_number")
    protected Integer curatorHouseNumber;
    @XmlElement(name = "curator_house_number_addition")
    protected String curatorHouseNumberAddition;
    @XmlElement(name = "curator_country")
    protected String curatorCountry;
    @XmlElement(name = "telephone_numbers")
    protected StringArray telephoneNumbers;
    @XmlElement(name = "fax_numbers")
    protected StringArray faxNumbers;
    @XmlElement(name = "email_addresses")
    protected StringArray emailAddresses;
    @XmlElement(name = "domain_names")
    protected StringArray domainNames;
    @XmlElement(name = "establishment_date")
    protected DutchBusinessDate establishmentDate;
    @XmlElement(name = "date_since")
    protected DutchBusinessDate dateSince;
    protected Integer personnel;

    /**
     * Gets the value of the establishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentNumber() {
        return establishmentNumber;
    }

    /**
     * Sets the value of the establishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentNumber(String value) {
        this.establishmentNumber = value;
    }

    /**
     * Gets the value of the mainEstablishment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainEstablishment() {
        return mainEstablishment;
    }

    /**
     * Sets the value of the mainEstablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainEstablishment(Boolean value) {
        this.mainEstablishment = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the legalFormText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormText() {
        return legalFormText;
    }

    /**
     * Sets the value of the legalFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormText(String value) {
        this.legalFormText = value;
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

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the sbiCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getSbiCodes() {
        return sbiCodes;
    }

    /**
     * Sets the value of the sbiCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setSbiCodes(StringArray value) {
        this.sbiCodes = value;
    }

    /**
     * Gets the value of the sbiCodesText property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getSbiCodesText() {
        return sbiCodesText;
    }

    /**
     * Sets the value of the sbiCodesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setSbiCodesText(StringArray value) {
        this.sbiCodesText = value;
    }

    /**
     * Gets the value of the establishmentPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentPostcode() {
        return establishmentPostcode;
    }

    /**
     * Sets the value of the establishmentPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentPostcode(String value) {
        this.establishmentPostcode = value;
    }

    /**
     * Gets the value of the establishmentCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCity() {
        return establishmentCity;
    }

    /**
     * Sets the value of the establishmentCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCity(String value) {
        this.establishmentCity = value;
    }

    /**
     * Gets the value of the establishmentStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentStreet() {
        return establishmentStreet;
    }

    /**
     * Sets the value of the establishmentStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentStreet(String value) {
        this.establishmentStreet = value;
    }

    /**
     * Gets the value of the establishmentHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstablishmentHouseNumber() {
        return establishmentHouseNumber;
    }

    /**
     * Sets the value of the establishmentHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstablishmentHouseNumber(Integer value) {
        this.establishmentHouseNumber = value;
    }

    /**
     * Gets the value of the establishmentHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentHouseNumberAddition() {
        return establishmentHouseNumberAddition;
    }

    /**
     * Sets the value of the establishmentHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentHouseNumberAddition(String value) {
        this.establishmentHouseNumberAddition = value;
    }

    /**
     * Gets the value of the establishmentCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCountry() {
        return establishmentCountry;
    }

    /**
     * Sets the value of the establishmentCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCountry(String value) {
        this.establishmentCountry = value;
    }

    /**
     * Gets the value of the correspondencePostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondencePostcode() {
        return correspondencePostcode;
    }

    /**
     * Sets the value of the correspondencePostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondencePostcode(String value) {
        this.correspondencePostcode = value;
    }

    /**
     * Gets the value of the correspondenceCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceCity() {
        return correspondenceCity;
    }

    /**
     * Sets the value of the correspondenceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceCity(String value) {
        this.correspondenceCity = value;
    }

    /**
     * Gets the value of the correspondenceStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceStreet() {
        return correspondenceStreet;
    }

    /**
     * Sets the value of the correspondenceStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceStreet(String value) {
        this.correspondenceStreet = value;
    }

    /**
     * Gets the value of the correspondenceHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrespondenceHouseNumber() {
        return correspondenceHouseNumber;
    }

    /**
     * Sets the value of the correspondenceHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrespondenceHouseNumber(Integer value) {
        this.correspondenceHouseNumber = value;
    }

    /**
     * Gets the value of the correspondenceHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceHouseNumberAddition() {
        return correspondenceHouseNumberAddition;
    }

    /**
     * Sets the value of the correspondenceHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceHouseNumberAddition(String value) {
        this.correspondenceHouseNumberAddition = value;
    }

    /**
     * Gets the value of the correspondenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceCountry() {
        return correspondenceCountry;
    }

    /**
     * Sets the value of the correspondenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceCountry(String value) {
        this.correspondenceCountry = value;
    }

    /**
     * Gets the value of the curatorPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuratorPostcode() {
        return curatorPostcode;
    }

    /**
     * Sets the value of the curatorPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuratorPostcode(String value) {
        this.curatorPostcode = value;
    }

    /**
     * Gets the value of the curatorCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuratorCity() {
        return curatorCity;
    }

    /**
     * Sets the value of the curatorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuratorCity(String value) {
        this.curatorCity = value;
    }

    /**
     * Gets the value of the curatorStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuratorStreet() {
        return curatorStreet;
    }

    /**
     * Sets the value of the curatorStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuratorStreet(String value) {
        this.curatorStreet = value;
    }

    /**
     * Gets the value of the curatorHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCuratorHouseNumber() {
        return curatorHouseNumber;
    }

    /**
     * Sets the value of the curatorHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCuratorHouseNumber(Integer value) {
        this.curatorHouseNumber = value;
    }

    /**
     * Gets the value of the curatorHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuratorHouseNumberAddition() {
        return curatorHouseNumberAddition;
    }

    /**
     * Sets the value of the curatorHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuratorHouseNumberAddition(String value) {
        this.curatorHouseNumberAddition = value;
    }

    /**
     * Gets the value of the curatorCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuratorCountry() {
        return curatorCountry;
    }

    /**
     * Sets the value of the curatorCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuratorCountry(String value) {
        this.curatorCountry = value;
    }

    /**
     * Gets the value of the telephoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getTelephoneNumbers() {
        return telephoneNumbers;
    }

    /**
     * Sets the value of the telephoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setTelephoneNumbers(StringArray value) {
        this.telephoneNumbers = value;
    }

    /**
     * Gets the value of the faxNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getFaxNumbers() {
        return faxNumbers;
    }

    /**
     * Sets the value of the faxNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setFaxNumbers(StringArray value) {
        this.faxNumbers = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setEmailAddresses(StringArray value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the domainNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getDomainNames() {
        return domainNames;
    }

    /**
     * Sets the value of the domainNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setDomainNames(StringArray value) {
        this.domainNames = value;
    }

    /**
     * Gets the value of the establishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     * Sets the value of the establishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setEstablishmentDate(DutchBusinessDate value) {
        this.establishmentDate = value;
    }

    /**
     * Gets the value of the dateSince property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDateSince() {
        return dateSince;
    }

    /**
     * Sets the value of the dateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDateSince(DutchBusinessDate value) {
        this.dateSince = value;
    }

    /**
     * Gets the value of the personnel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonnel() {
        return personnel;
    }

    /**
     * Sets the value of the personnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonnel(Integer value) {
        this.personnel = value;
    }

}
