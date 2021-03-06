
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessLegalEntityV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessLegalEntityV3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rsin_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternative_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortened_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_change" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreign_legal_form_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_arrangement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statutory_seat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="founding_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="discontinuation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="dissolution_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="dissolution_reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="removal_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="registration_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="legal_entity_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="liquidation_closure_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="liquidation_reopening_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="deed_incorporation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="deed_last_statutes_amendment_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="last_statutes_amendment_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="liability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merger_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annual_report_submission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorized_share_capital" type="{http://www.webservices.nl/soap/}DutchBusinessMoneyV3" minOccurs="0"/>
 *         &lt;element name="issued_share_capital" type="{http://www.webservices.nl/soap/}DutchBusinessMoneyV3" minOccurs="0"/>
 *         &lt;element name="paid_up_share_capital" type="{http://www.webservices.nl/soap/}DutchBusinessMoneyV3" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="shares" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="share_holders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="establishment_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="correspondence_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="telephone_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="fax_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="email_addresses" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="domain_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="sbi_codes" type="{http://www.webservices.nl/soap/}DutchBusinessSbiCodeV3Array" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessLegalEntityV3", propOrder = {

})
public class DutchBusinessLegalEntityV3 {

    @XmlElement(name = "rsin_number")
    protected String rsinNumber;
    protected String name;
    @XmlElement(name = "alternative_name")
    protected String alternativeName;
    @XmlElement(name = "shortened_name")
    protected String shortenedName;
    protected String registration;
    @XmlElement(name = "legal_form_text")
    protected String legalFormText;
    @XmlElement(name = "legal_form_change")
    protected String legalFormChange;
    @XmlElement(name = "foreign_legal_form_description")
    protected String foreignLegalFormDescription;
    protected String activity;
    @XmlElement(name = "company_arrangement")
    protected String companyArrangement;
    @XmlElement(name = "legal_name")
    protected String legalName;
    @XmlElement(name = "statutory_seat")
    protected String statutorySeat;
    @XmlElement(name = "registration_date")
    protected DutchBusinessDateV3 registrationDate;
    @XmlElement(name = "founding_date")
    protected DutchBusinessDateV3 foundingDate;
    @XmlElement(name = "discontinuation_date")
    protected DutchBusinessDateV3 discontinuationDate;
    @XmlElement(name = "dissolution_date")
    protected DutchBusinessDateV3 dissolutionDate;
    @XmlElement(name = "dissolution_reason")
    protected String dissolutionReason;
    @XmlElement(name = "removal_date")
    protected DutchBusinessDateV3 removalDate;
    @XmlElement(name = "registration_end_date")
    protected DutchBusinessDateV3 registrationEndDate;
    @XmlElement(name = "legal_entity_end_date")
    protected DutchBusinessDateV3 legalEntityEndDate;
    @XmlElement(name = "liquidation_closure_date")
    protected DutchBusinessDateV3 liquidationClosureDate;
    @XmlElement(name = "liquidation_reopening_date")
    protected DutchBusinessDateV3 liquidationReopeningDate;
    @XmlElement(name = "deed_incorporation_date")
    protected DutchBusinessDateV3 deedIncorporationDate;
    @XmlElement(name = "deed_last_statutes_amendment_date")
    protected DutchBusinessDateV3 deedLastStatutesAmendmentDate;
    @XmlElement(name = "last_statutes_amendment_date")
    protected DutchBusinessDateV3 lastStatutesAmendmentDate;
    protected String liability;
    @XmlElement(name = "merger_description")
    protected String mergerDescription;
    @XmlElement(name = "annual_report_submission")
    protected String annualReportSubmission;
    @XmlElement(name = "authorized_share_capital")
    protected DutchBusinessMoneyV3 authorizedShareCapital;
    @XmlElement(name = "issued_share_capital")
    protected DutchBusinessMoneyV3 issuedShareCapital;
    @XmlElement(name = "paid_up_share_capital")
    protected DutchBusinessMoneyV3 paidUpShareCapital;
    protected String duration;
    @XmlElement(name = "duration_end_date")
    protected DutchBusinessDateV3 durationEndDate;
    protected String shares;
    @XmlElement(name = "share_holders")
    protected String shareHolders;
    protected StringArray remarks;
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
    @XmlElement(name = "sbi_codes")
    protected DutchBusinessSbiCodeV3Array sbiCodes;

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
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setRegistrationDate(DutchBusinessDateV3 value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the foundingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getFoundingDate() {
        return foundingDate;
    }

    /**
     * Sets the value of the foundingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setFoundingDate(DutchBusinessDateV3 value) {
        this.foundingDate = value;
    }

    /**
     * Gets the value of the discontinuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDiscontinuationDate() {
        return discontinuationDate;
    }

    /**
     * Sets the value of the discontinuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDiscontinuationDate(DutchBusinessDateV3 value) {
        this.discontinuationDate = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDissolutionDate(DutchBusinessDateV3 value) {
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
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getRemovalDate() {
        return removalDate;
    }

    /**
     * Sets the value of the removalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setRemovalDate(DutchBusinessDateV3 value) {
        this.removalDate = value;
    }

    /**
     * Gets the value of the registrationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getRegistrationEndDate() {
        return registrationEndDate;
    }

    /**
     * Sets the value of the registrationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setRegistrationEndDate(DutchBusinessDateV3 value) {
        this.registrationEndDate = value;
    }

    /**
     * Gets the value of the legalEntityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getLegalEntityEndDate() {
        return legalEntityEndDate;
    }

    /**
     * Sets the value of the legalEntityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setLegalEntityEndDate(DutchBusinessDateV3 value) {
        this.legalEntityEndDate = value;
    }

    /**
     * Gets the value of the liquidationClosureDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getLiquidationClosureDate() {
        return liquidationClosureDate;
    }

    /**
     * Sets the value of the liquidationClosureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setLiquidationClosureDate(DutchBusinessDateV3 value) {
        this.liquidationClosureDate = value;
    }

    /**
     * Gets the value of the liquidationReopeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getLiquidationReopeningDate() {
        return liquidationReopeningDate;
    }

    /**
     * Sets the value of the liquidationReopeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setLiquidationReopeningDate(DutchBusinessDateV3 value) {
        this.liquidationReopeningDate = value;
    }

    /**
     * Gets the value of the deedIncorporationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDeedIncorporationDate() {
        return deedIncorporationDate;
    }

    /**
     * Sets the value of the deedIncorporationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDeedIncorporationDate(DutchBusinessDateV3 value) {
        this.deedIncorporationDate = value;
    }

    /**
     * Gets the value of the deedLastStatutesAmendmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDeedLastStatutesAmendmentDate() {
        return deedLastStatutesAmendmentDate;
    }

    /**
     * Sets the value of the deedLastStatutesAmendmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDeedLastStatutesAmendmentDate(DutchBusinessDateV3 value) {
        this.deedLastStatutesAmendmentDate = value;
    }

    /**
     * Gets the value of the lastStatutesAmendmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getLastStatutesAmendmentDate() {
        return lastStatutesAmendmentDate;
    }

    /**
     * Sets the value of the lastStatutesAmendmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setLastStatutesAmendmentDate(DutchBusinessDateV3 value) {
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
     *     {@link DutchBusinessMoneyV3 }
     *     
     */
    public DutchBusinessMoneyV3 getAuthorizedShareCapital() {
        return authorizedShareCapital;
    }

    /**
     * Sets the value of the authorizedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessMoneyV3 }
     *     
     */
    public void setAuthorizedShareCapital(DutchBusinessMoneyV3 value) {
        this.authorizedShareCapital = value;
    }

    /**
     * Gets the value of the issuedShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessMoneyV3 }
     *     
     */
    public DutchBusinessMoneyV3 getIssuedShareCapital() {
        return issuedShareCapital;
    }

    /**
     * Sets the value of the issuedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessMoneyV3 }
     *     
     */
    public void setIssuedShareCapital(DutchBusinessMoneyV3 value) {
        this.issuedShareCapital = value;
    }

    /**
     * Gets the value of the paidUpShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessMoneyV3 }
     *     
     */
    public DutchBusinessMoneyV3 getPaidUpShareCapital() {
        return paidUpShareCapital;
    }

    /**
     * Sets the value of the paidUpShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessMoneyV3 }
     *     
     */
    public void setPaidUpShareCapital(DutchBusinessMoneyV3 value) {
        this.paidUpShareCapital = value;
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
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDurationEndDate() {
        return durationEndDate;
    }

    /**
     * Sets the value of the durationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDurationEndDate(DutchBusinessDateV3 value) {
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

}
