
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessLegalEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessLegalEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rsin_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternative_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortened_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_change" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreign_legal_form_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbi_codes" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="sbi_codes_text" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_arrangement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statutory_seat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="founding_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="discontinuation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="dissolution_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="dissolution_reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="removal_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="registration_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="legal_entity_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="liquidation_closure_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="liquidation_reopening_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="deed_incorporation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="deed_last_statutes_amendment_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="last_statutes_amendment_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="liability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merger_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annual_report_submission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorized_share_capital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="authorized_share_capital_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issued_share_capital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="issued_share_capital_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paid_up_share_capital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paid_up_share_capital_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="shares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="share_holders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="fax_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="email_addresses" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="domain_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessLegalEntity", propOrder = {

})
public class DutchBusinessLegalEntity {

    @XmlElement(name = "rsin_number")
    protected String rsinNumber;
    protected String name;
    @XmlElement(name = "alternative_name")
    protected String alternativeName;
    @XmlElement(name = "shortened_name")
    protected String shortenedName;
    protected String registration;
    protected String status;
    @XmlElement(name = "legal_form_text")
    protected String legalFormText;
    @XmlElement(name = "legal_form_change")
    protected String legalFormChange;
    @XmlElement(name = "foreign_legal_form_description")
    protected String foreignLegalFormDescription;
    @XmlElement(name = "sbi_codes")
    protected StringArray sbiCodes;
    @XmlElement(name = "sbi_codes_text")
    protected StringArray sbiCodesText;
    protected String activity;
    @XmlElement(name = "company_arrangement")
    protected String companyArrangement;
    @XmlElement(name = "legal_name")
    protected String legalName;
    @XmlElement(name = "statutory_seat")
    protected String statutorySeat;
    @XmlElement(name = "registration_date")
    protected DutchBusinessDate registrationDate;
    @XmlElement(name = "founding_date")
    protected DutchBusinessDate foundingDate;
    @XmlElement(name = "discontinuation_date")
    protected DutchBusinessDate discontinuationDate;
    @XmlElement(name = "dissolution_date")
    protected DutchBusinessDate dissolutionDate;
    @XmlElement(name = "dissolution_reason")
    protected String dissolutionReason;
    @XmlElement(name = "removal_date")
    protected DutchBusinessDate removalDate;
    @XmlElement(name = "registration_end_date")
    protected DutchBusinessDate registrationEndDate;
    @XmlElement(name = "legal_entity_end_date")
    protected DutchBusinessDate legalEntityEndDate;
    @XmlElement(name = "liquidation_closure_date")
    protected DutchBusinessDate liquidationClosureDate;
    @XmlElement(name = "liquidation_reopening_date")
    protected DutchBusinessDate liquidationReopeningDate;
    @XmlElement(name = "deed_incorporation_date")
    protected DutchBusinessDate deedIncorporationDate;
    @XmlElement(name = "deed_last_statutes_amendment_date")
    protected DutchBusinessDate deedLastStatutesAmendmentDate;
    @XmlElement(name = "last_statutes_amendment_date")
    protected DutchBusinessDate lastStatutesAmendmentDate;
    protected String liability;
    @XmlElement(name = "merger_description")
    protected String mergerDescription;
    @XmlElement(name = "annual_report_submission")
    protected String annualReportSubmission;
    @XmlElement(name = "authorized_share_capital")
    protected Long authorizedShareCapital;
    @XmlElement(name = "authorized_share_capital_currency")
    protected String authorizedShareCapitalCurrency;
    @XmlElement(name = "issued_share_capital")
    protected Long issuedShareCapital;
    @XmlElement(name = "issued_share_capital_currency")
    protected String issuedShareCapitalCurrency;
    @XmlElement(name = "paid_up_share_capital")
    protected Long paidUpShareCapital;
    @XmlElement(name = "paid_up_share_capital_currency")
    protected String paidUpShareCapitalCurrency;
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
    protected String duration;
    @XmlElement(name = "duration_end_date")
    protected DutchBusinessDate durationEndDate;
    protected String shares;
    @XmlElement(name = "share_holders")
    protected String shareHolders;
    @XmlElement(name = "telephone_numbers")
    protected StringArray telephoneNumbers;
    @XmlElement(name = "fax_numbers")
    protected StringArray faxNumbers;
    @XmlElement(name = "email_addresses")
    protected StringArray emailAddresses;
    @XmlElement(name = "domain_names")
    protected StringArray domainNames;

    /**
     * Gets the value of the rsinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsinNumber() {
        return rsinNumber;
    }

    /**
     * Sets the value of the rsinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsinNumber(String value) {
        this.rsinNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the alternativeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeName() {
        return alternativeName;
    }

    /**
     * Sets the value of the alternativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeName(String value) {
        this.alternativeName = value;
    }

    /**
     * Gets the value of the shortenedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortenedName() {
        return shortenedName;
    }

    /**
     * Sets the value of the shortenedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortenedName(String value) {
        this.shortenedName = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistration(String value) {
        this.registration = value;
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
     * Gets the value of the legalFormChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormChange() {
        return legalFormChange;
    }

    /**
     * Sets the value of the legalFormChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormChange(String value) {
        this.legalFormChange = value;
    }

    /**
     * Gets the value of the foreignLegalFormDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignLegalFormDescription() {
        return foreignLegalFormDescription;
    }

    /**
     * Sets the value of the foreignLegalFormDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignLegalFormDescription(String value) {
        this.foreignLegalFormDescription = value;
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
     * Gets the value of the companyArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyArrangement() {
        return companyArrangement;
    }

    /**
     * Sets the value of the companyArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyArrangement(String value) {
        this.companyArrangement = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the statutorySeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatutorySeat() {
        return statutorySeat;
    }

    /**
     * Sets the value of the statutorySeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatutorySeat(String value) {
        this.statutorySeat = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setRegistrationDate(DutchBusinessDate value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the foundingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getFoundingDate() {
        return foundingDate;
    }

    /**
     * Sets the value of the foundingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setFoundingDate(DutchBusinessDate value) {
        this.foundingDate = value;
    }

    /**
     * Gets the value of the discontinuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDiscontinuationDate() {
        return discontinuationDate;
    }

    /**
     * Sets the value of the discontinuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDiscontinuationDate(DutchBusinessDate value) {
        this.discontinuationDate = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDissolutionDate(DutchBusinessDate value) {
        this.dissolutionDate = value;
    }

    /**
     * Gets the value of the dissolutionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDissolutionReason() {
        return dissolutionReason;
    }

    /**
     * Sets the value of the dissolutionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDissolutionReason(String value) {
        this.dissolutionReason = value;
    }

    /**
     * Gets the value of the removalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getRemovalDate() {
        return removalDate;
    }

    /**
     * Sets the value of the removalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setRemovalDate(DutchBusinessDate value) {
        this.removalDate = value;
    }

    /**
     * Gets the value of the registrationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getRegistrationEndDate() {
        return registrationEndDate;
    }

    /**
     * Sets the value of the registrationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setRegistrationEndDate(DutchBusinessDate value) {
        this.registrationEndDate = value;
    }

    /**
     * Gets the value of the legalEntityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getLegalEntityEndDate() {
        return legalEntityEndDate;
    }

    /**
     * Sets the value of the legalEntityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setLegalEntityEndDate(DutchBusinessDate value) {
        this.legalEntityEndDate = value;
    }

    /**
     * Gets the value of the liquidationClosureDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getLiquidationClosureDate() {
        return liquidationClosureDate;
    }

    /**
     * Sets the value of the liquidationClosureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setLiquidationClosureDate(DutchBusinessDate value) {
        this.liquidationClosureDate = value;
    }

    /**
     * Gets the value of the liquidationReopeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getLiquidationReopeningDate() {
        return liquidationReopeningDate;
    }

    /**
     * Sets the value of the liquidationReopeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setLiquidationReopeningDate(DutchBusinessDate value) {
        this.liquidationReopeningDate = value;
    }

    /**
     * Gets the value of the deedIncorporationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDeedIncorporationDate() {
        return deedIncorporationDate;
    }

    /**
     * Sets the value of the deedIncorporationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDeedIncorporationDate(DutchBusinessDate value) {
        this.deedIncorporationDate = value;
    }

    /**
     * Gets the value of the deedLastStatutesAmendmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDeedLastStatutesAmendmentDate() {
        return deedLastStatutesAmendmentDate;
    }

    /**
     * Sets the value of the deedLastStatutesAmendmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDeedLastStatutesAmendmentDate(DutchBusinessDate value) {
        this.deedLastStatutesAmendmentDate = value;
    }

    /**
     * Gets the value of the lastStatutesAmendmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getLastStatutesAmendmentDate() {
        return lastStatutesAmendmentDate;
    }

    /**
     * Sets the value of the lastStatutesAmendmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setLastStatutesAmendmentDate(DutchBusinessDate value) {
        this.lastStatutesAmendmentDate = value;
    }

    /**
     * Gets the value of the liability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiability() {
        return liability;
    }

    /**
     * Sets the value of the liability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiability(String value) {
        this.liability = value;
    }

    /**
     * Gets the value of the mergerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergerDescription() {
        return mergerDescription;
    }

    /**
     * Sets the value of the mergerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergerDescription(String value) {
        this.mergerDescription = value;
    }

    /**
     * Gets the value of the annualReportSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualReportSubmission() {
        return annualReportSubmission;
    }

    /**
     * Sets the value of the annualReportSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualReportSubmission(String value) {
        this.annualReportSubmission = value;
    }

    /**
     * Gets the value of the authorizedShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthorizedShareCapital() {
        return authorizedShareCapital;
    }

    /**
     * Sets the value of the authorizedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthorizedShareCapital(Long value) {
        this.authorizedShareCapital = value;
    }

    /**
     * Gets the value of the authorizedShareCapitalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedShareCapitalCurrency() {
        return authorizedShareCapitalCurrency;
    }

    /**
     * Sets the value of the authorizedShareCapitalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedShareCapitalCurrency(String value) {
        this.authorizedShareCapitalCurrency = value;
    }

    /**
     * Gets the value of the issuedShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssuedShareCapital() {
        return issuedShareCapital;
    }

    /**
     * Sets the value of the issuedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssuedShareCapital(Long value) {
        this.issuedShareCapital = value;
    }

    /**
     * Gets the value of the issuedShareCapitalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedShareCapitalCurrency() {
        return issuedShareCapitalCurrency;
    }

    /**
     * Sets the value of the issuedShareCapitalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedShareCapitalCurrency(String value) {
        this.issuedShareCapitalCurrency = value;
    }

    /**
     * Gets the value of the paidUpShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaidUpShareCapital() {
        return paidUpShareCapital;
    }

    /**
     * Sets the value of the paidUpShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaidUpShareCapital(Long value) {
        this.paidUpShareCapital = value;
    }

    /**
     * Gets the value of the paidUpShareCapitalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidUpShareCapitalCurrency() {
        return paidUpShareCapitalCurrency;
    }

    /**
     * Sets the value of the paidUpShareCapitalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidUpShareCapitalCurrency(String value) {
        this.paidUpShareCapitalCurrency = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDurationEndDate() {
        return durationEndDate;
    }

    /**
     * Sets the value of the durationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDurationEndDate(DutchBusinessDate value) {
        this.durationEndDate = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShares(String value) {
        this.shares = value;
    }

    /**
     * Gets the value of the shareHolders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareHolders() {
        return shareHolders;
    }

    /**
     * Sets the value of the shareHolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareHolders(String value) {
        this.shareHolders = value;
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

}
