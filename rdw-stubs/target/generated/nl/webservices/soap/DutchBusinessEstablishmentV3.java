
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessEstablishmentV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessEstablishmentV3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="main_establishment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="date_since" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="personnel" type="{http://www.webservices.nl/soap/}DutchBusinessPersonnelInfoV3" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="sbi_codes" type="{http://www.webservices.nl/soap/}DutchBusinessSbiCodeV3Array" minOccurs="0"/>
 *         &lt;element name="establishment_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="correspondence_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="telephone_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="fax_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="email_addresses" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="domain_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
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
@XmlType(name = "DutchBusinessEstablishmentV3", propOrder = {

})
public class DutchBusinessEstablishmentV3 {

    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    @XmlElement(name = "main_establishment")
    protected Boolean mainEstablishment;
    @XmlElement(name = "legal_form_text")
    protected String legalFormText;
    protected String activity;
    protected String description;
    @XmlElement(name = "establishment_date")
    protected DutchBusinessDateV3 establishmentDate;
    @XmlElement(name = "date_since")
    protected DutchBusinessDateV3 dateSince;
    protected DutchBusinessPersonnelInfoV3 personnel;
    protected StringArray remarks;
    @XmlElement(name = "sbi_codes")
    protected DutchBusinessSbiCodeV3Array sbiCodes;
    @XmlElement(name = "establishment_address")
    protected DutchBusinessAddressV3 establishmentAddress;
    @XmlElement(name = "correspondence_address")
    protected DutchBusinessAddressV3 correspondenceAddress;
    @XmlElement(name = "telephone_numbers")
    protected StringArray telephoneNumbers;
    @XmlElement(name = "fax_numbers")
    protected StringArray faxNumbers;
    @XmlElement(name = "email_addresses")
    protected StringArray emailAddresses;
    @XmlElement(name = "domain_names")
    protected StringArray domainNames;
    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;

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
     * Gets the value of the establishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     * Sets the value of the establishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setEstablishmentDate(DutchBusinessDateV3 value) {
        this.establishmentDate = value;
    }

    /**
     * Gets the value of the dateSince property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDateSince() {
        return dateSince;
    }

    /**
     * Sets the value of the dateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDateSince(DutchBusinessDateV3 value) {
        this.dateSince = value;
    }

    /**
     * Gets the value of the personnel property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPersonnelInfoV3 }
     *     
     */
    public DutchBusinessPersonnelInfoV3 getPersonnel() {
        return personnel;
    }

    /**
     * Sets the value of the personnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPersonnelInfoV3 }
     *     
     */
    public void setPersonnel(DutchBusinessPersonnelInfoV3 value) {
        this.personnel = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setRemarks(StringArray value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the sbiCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessSbiCodeV3Array }
     *     
     */
    public DutchBusinessSbiCodeV3Array getSbiCodes() {
        return sbiCodes;
    }

    /**
     * Sets the value of the sbiCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessSbiCodeV3Array }
     *     
     */
    public void setSbiCodes(DutchBusinessSbiCodeV3Array value) {
        this.sbiCodes = value;
    }

    /**
     * Gets the value of the establishmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getEstablishmentAddress() {
        return establishmentAddress;
    }

    /**
     * Sets the value of the establishmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setEstablishmentAddress(DutchBusinessAddressV3 value) {
        this.establishmentAddress = value;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setCorrespondenceAddress(DutchBusinessAddressV3 value) {
        this.correspondenceAddress = value;
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
