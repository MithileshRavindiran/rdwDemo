
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessDossierV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessDossierV3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="update_info" type="{http://www.webservices.nl/soap/}DutchBusinessUpdateReference"/>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="main_establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indication_main_establishment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rsin_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chamber_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legal_form_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indication_organisation_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legal_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trade_name_45" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trade_name_full" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="establishment_address" type="{http://www.webservices.nl/soap/}DutchBusinessFormattedAddress" minOccurs="0"/>
 *         &lt;element name="correspondence_address" type="{http://www.webservices.nl/soap/}DutchBusinessFormattedAddress" minOccurs="0"/>
 *         &lt;element name="telephone_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domain_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_title1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_title2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_initials" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primary_sbi_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondary_sbi_code1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondary_sbi_code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primary_sbi_code_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondary_sbi_code1_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondary_sbi_code2_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personnel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="class_personnel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="personnel_fulltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="class_personnel_fulltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="personnel_reference_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="personnel_ci" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="class_personnel_ci" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="personnel_ci_reference_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="indication_import" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indication_export" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indication_economically_active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indication_non_mailing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indication_bankruptcy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="indication_dip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insolvencies" type="{http://www.webservices.nl/soap/}DutchBusinessInsolvencyArray" minOccurs="0"/>
 *         &lt;element name="authorized_share_capital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="authorized_share_capital_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paid_up_share_capital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paid_up_share_capital_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issued_share_capital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="issued_share_capital_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="founding_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="discontinuation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="continuation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="establishment_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="annual_financial_statement_summary" type="{http://www.webservices.nl/soap/}DutchBusinessAnnualFinancialStatementSummary" minOccurs="0"/>
 *         &lt;element name="structure" type="{http://www.webservices.nl/soap/}DutchBusinessStructure" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessDossierV3", propOrder = {

})
public class DutchBusinessDossierV3 {

    @XmlElement(name = "update_info", required = true)
    protected DutchBusinessUpdateReference updateInfo;
    @XmlElement(name = "dossier_number", required = true)
    protected String dossierNumber;
    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    @XmlElement(name = "main_establishment_number")
    protected String mainEstablishmentNumber;
    @XmlElement(name = "indication_main_establishment")
    protected boolean indicationMainEstablishment;
    @XmlElement(name = "rsin_number")
    protected String rsinNumber;
    @XmlElement(name = "chamber_number", required = true)
    protected String chamberNumber;
    @XmlElement(name = "legal_form_code", required = true)
    protected String legalFormCode;
    @XmlElement(name = "legal_form_text", required = true)
    protected String legalFormText;
    @XmlElement(name = "indication_organisation_code", required = true)
    protected String indicationOrganisationCode;
    @XmlElement(name = "legal_name", required = true)
    protected String legalName;
    @XmlElement(name = "trade_name_45", required = true)
    protected String tradeName45;
    @XmlElement(name = "trade_name_full", required = true)
    protected String tradeNameFull;
    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;
    @XmlElement(name = "establishment_address")
    protected DutchBusinessFormattedAddress establishmentAddress;
    @XmlElement(name = "correspondence_address")
    protected DutchBusinessFormattedAddress correspondenceAddress;
    @XmlElement(name = "telephone_number", required = true)
    protected String telephoneNumber;
    @XmlElement(name = "mobile_number", required = true)
    protected String mobileNumber;
    @XmlElement(name = "domain_name", required = true)
    protected String domainName;
    @XmlElement(name = "contact_title1", required = true)
    protected String contactTitle1;
    @XmlElement(name = "contact_title2", required = true)
    protected String contactTitle2;
    @XmlElement(name = "contact_initials", required = true)
    protected String contactInitials;
    @XmlElement(name = "contact_prefix", required = true)
    protected String contactPrefix;
    @XmlElement(name = "contact_surname", required = true)
    protected String contactSurname;
    @XmlElement(name = "contact_gender", required = true)
    protected String contactGender;
    @XmlElement(name = "primary_sbi_code", required = true)
    protected String primarySbiCode;
    @XmlElement(name = "secondary_sbi_code1", required = true)
    protected String secondarySbiCode1;
    @XmlElement(name = "secondary_sbi_code2", required = true)
    protected String secondarySbiCode2;
    @XmlElement(name = "primary_sbi_code_text", required = true)
    protected String primarySbiCodeText;
    @XmlElement(name = "secondary_sbi_code1_text", required = true)
    protected String secondarySbiCode1Text;
    @XmlElement(name = "secondary_sbi_code2_text", required = true)
    protected String secondarySbiCode2Text;
    protected int personnel;
    @XmlElement(name = "class_personnel")
    protected int classPersonnel;
    @XmlElement(name = "personnel_fulltime")
    protected int personnelFulltime;
    @XmlElement(name = "class_personnel_fulltime")
    protected int classPersonnelFulltime;
    @XmlElement(name = "personnel_reference_date")
    protected DutchBusinessDateV3 personnelReferenceDate;
    @XmlElement(name = "personnel_ci")
    protected int personnelCi;
    @XmlElement(name = "class_personnel_ci")
    protected int classPersonnelCi;
    @XmlElement(name = "personnel_ci_reference_date")
    protected DutchBusinessDateV3 personnelCiReferenceDate;
    @XmlElement(name = "indication_import")
    protected Boolean indicationImport;
    @XmlElement(name = "indication_export")
    protected Boolean indicationExport;
    @XmlElement(name = "indication_economically_active")
    protected boolean indicationEconomicallyActive;
    @XmlElement(name = "indication_non_mailing")
    protected boolean indicationNonMailing;
    @XmlElement(name = "indication_bankruptcy")
    protected boolean indicationBankruptcy;
    @XmlElement(name = "indication_dip")
    protected boolean indicationDip;
    protected DutchBusinessInsolvencyArray insolvencies;
    @XmlElement(name = "authorized_share_capital")
    protected Long authorizedShareCapital;
    @XmlElement(name = "authorized_share_capital_currency")
    protected String authorizedShareCapitalCurrency;
    @XmlElement(name = "paid_up_share_capital")
    protected Long paidUpShareCapital;
    @XmlElement(name = "paid_up_share_capital_currency")
    protected String paidUpShareCapitalCurrency;
    @XmlElement(name = "issued_share_capital")
    protected Long issuedShareCapital;
    @XmlElement(name = "issued_share_capital_currency")
    protected String issuedShareCapitalCurrency;
    @XmlElement(name = "founding_date")
    protected DutchBusinessDateV3 foundingDate;
    @XmlElement(name = "discontinuation_date")
    protected DutchBusinessDateV3 discontinuationDate;
    @XmlElement(name = "continuation_date")
    protected DutchBusinessDateV3 continuationDate;
    @XmlElement(name = "establishment_date")
    protected DutchBusinessDateV3 establishmentDate;
    @XmlElement(name = "annual_financial_statement_summary")
    protected DutchBusinessAnnualFinancialStatementSummary annualFinancialStatementSummary;
    protected DutchBusinessStructure structure;

    /**
     * Gets the value of the updateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessUpdateReference }
     *     
     */
    public DutchBusinessUpdateReference getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets the value of the updateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessUpdateReference }
     *     
     */
    public void setUpdateInfo(DutchBusinessUpdateReference value) {
        this.updateInfo = value;
    }

    /**
     * Gets the value of the dossierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNumber() {
        return dossierNumber;
    }

    /**
     * Sets the value of the dossierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNumber(String value) {
        this.dossierNumber = value;
    }

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
     * Gets the value of the mainEstablishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainEstablishmentNumber() {
        return mainEstablishmentNumber;
    }

    /**
     * Sets the value of the mainEstablishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainEstablishmentNumber(String value) {
        this.mainEstablishmentNumber = value;
    }

    /**
     * Gets the value of the indicationMainEstablishment property.
     * 
     */
    public boolean isIndicationMainEstablishment() {
        return indicationMainEstablishment;
    }

    /**
     * Sets the value of the indicationMainEstablishment property.
     * 
     */
    public void setIndicationMainEstablishment(boolean value) {
        this.indicationMainEstablishment = value;
    }

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
     * Gets the value of the chamberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamberNumber() {
        return chamberNumber;
    }

    /**
     * Sets the value of the chamberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamberNumber(String value) {
        this.chamberNumber = value;
    }

    /**
     * Gets the value of the legalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormCode() {
        return legalFormCode;
    }

    /**
     * Sets the value of the legalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormCode(String value) {
        this.legalFormCode = value;
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
     * Gets the value of the indicationOrganisationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicationOrganisationCode() {
        return indicationOrganisationCode;
    }

    /**
     * Sets the value of the indicationOrganisationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicationOrganisationCode(String value) {
        this.indicationOrganisationCode = value;
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
     * Gets the value of the tradeName45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName45() {
        return tradeName45;
    }

    /**
     * Sets the value of the tradeName45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName45(String value) {
        this.tradeName45 = value;
    }

    /**
     * Gets the value of the tradeNameFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeNameFull() {
        return tradeNameFull;
    }

    /**
     * Sets the value of the tradeNameFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeNameFull(String value) {
        this.tradeNameFull = value;
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
     * Gets the value of the establishmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessFormattedAddress }
     *     
     */
    public DutchBusinessFormattedAddress getEstablishmentAddress() {
        return establishmentAddress;
    }

    /**
     * Sets the value of the establishmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessFormattedAddress }
     *     
     */
    public void setEstablishmentAddress(DutchBusinessFormattedAddress value) {
        this.establishmentAddress = value;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessFormattedAddress }
     *     
     */
    public DutchBusinessFormattedAddress getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessFormattedAddress }
     *     
     */
    public void setCorrespondenceAddress(DutchBusinessFormattedAddress value) {
        this.correspondenceAddress = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the contactTitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTitle1() {
        return contactTitle1;
    }

    /**
     * Sets the value of the contactTitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTitle1(String value) {
        this.contactTitle1 = value;
    }

    /**
     * Gets the value of the contactTitle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTitle2() {
        return contactTitle2;
    }

    /**
     * Sets the value of the contactTitle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTitle2(String value) {
        this.contactTitle2 = value;
    }

    /**
     * Gets the value of the contactInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInitials() {
        return contactInitials;
    }

    /**
     * Sets the value of the contactInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInitials(String value) {
        this.contactInitials = value;
    }

    /**
     * Gets the value of the contactPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPrefix() {
        return contactPrefix;
    }

    /**
     * Sets the value of the contactPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPrefix(String value) {
        this.contactPrefix = value;
    }

    /**
     * Gets the value of the contactSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSurname() {
        return contactSurname;
    }

    /**
     * Sets the value of the contactSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSurname(String value) {
        this.contactSurname = value;
    }

    /**
     * Gets the value of the contactGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactGender() {
        return contactGender;
    }

    /**
     * Sets the value of the contactGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactGender(String value) {
        this.contactGender = value;
    }

    /**
     * Gets the value of the primarySbiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySbiCode() {
        return primarySbiCode;
    }

    /**
     * Sets the value of the primarySbiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySbiCode(String value) {
        this.primarySbiCode = value;
    }

    /**
     * Gets the value of the secondarySbiCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySbiCode1() {
        return secondarySbiCode1;
    }

    /**
     * Sets the value of the secondarySbiCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySbiCode1(String value) {
        this.secondarySbiCode1 = value;
    }

    /**
     * Gets the value of the secondarySbiCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySbiCode2() {
        return secondarySbiCode2;
    }

    /**
     * Sets the value of the secondarySbiCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySbiCode2(String value) {
        this.secondarySbiCode2 = value;
    }

    /**
     * Gets the value of the primarySbiCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySbiCodeText() {
        return primarySbiCodeText;
    }

    /**
     * Sets the value of the primarySbiCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySbiCodeText(String value) {
        this.primarySbiCodeText = value;
    }

    /**
     * Gets the value of the secondarySbiCode1Text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySbiCode1Text() {
        return secondarySbiCode1Text;
    }

    /**
     * Sets the value of the secondarySbiCode1Text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySbiCode1Text(String value) {
        this.secondarySbiCode1Text = value;
    }

    /**
     * Gets the value of the secondarySbiCode2Text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySbiCode2Text() {
        return secondarySbiCode2Text;
    }

    /**
     * Sets the value of the secondarySbiCode2Text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySbiCode2Text(String value) {
        this.secondarySbiCode2Text = value;
    }

    /**
     * Gets the value of the personnel property.
     * 
     */
    public int getPersonnel() {
        return personnel;
    }

    /**
     * Sets the value of the personnel property.
     * 
     */
    public void setPersonnel(int value) {
        this.personnel = value;
    }

    /**
     * Gets the value of the classPersonnel property.
     * 
     */
    public int getClassPersonnel() {
        return classPersonnel;
    }

    /**
     * Sets the value of the classPersonnel property.
     * 
     */
    public void setClassPersonnel(int value) {
        this.classPersonnel = value;
    }

    /**
     * Gets the value of the personnelFulltime property.
     * 
     */
    public int getPersonnelFulltime() {
        return personnelFulltime;
    }

    /**
     * Sets the value of the personnelFulltime property.
     * 
     */
    public void setPersonnelFulltime(int value) {
        this.personnelFulltime = value;
    }

    /**
     * Gets the value of the classPersonnelFulltime property.
     * 
     */
    public int getClassPersonnelFulltime() {
        return classPersonnelFulltime;
    }

    /**
     * Sets the value of the classPersonnelFulltime property.
     * 
     */
    public void setClassPersonnelFulltime(int value) {
        this.classPersonnelFulltime = value;
    }

    /**
     * Gets the value of the personnelReferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getPersonnelReferenceDate() {
        return personnelReferenceDate;
    }

    /**
     * Sets the value of the personnelReferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setPersonnelReferenceDate(DutchBusinessDateV3 value) {
        this.personnelReferenceDate = value;
    }

    /**
     * Gets the value of the personnelCi property.
     * 
     */
    public int getPersonnelCi() {
        return personnelCi;
    }

    /**
     * Sets the value of the personnelCi property.
     * 
     */
    public void setPersonnelCi(int value) {
        this.personnelCi = value;
    }

    /**
     * Gets the value of the classPersonnelCi property.
     * 
     */
    public int getClassPersonnelCi() {
        return classPersonnelCi;
    }

    /**
     * Sets the value of the classPersonnelCi property.
     * 
     */
    public void setClassPersonnelCi(int value) {
        this.classPersonnelCi = value;
    }

    /**
     * Gets the value of the personnelCiReferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getPersonnelCiReferenceDate() {
        return personnelCiReferenceDate;
    }

    /**
     * Sets the value of the personnelCiReferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setPersonnelCiReferenceDate(DutchBusinessDateV3 value) {
        this.personnelCiReferenceDate = value;
    }

    /**
     * Gets the value of the indicationImport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicationImport() {
        return indicationImport;
    }

    /**
     * Sets the value of the indicationImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicationImport(Boolean value) {
        this.indicationImport = value;
    }

    /**
     * Gets the value of the indicationExport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicationExport() {
        return indicationExport;
    }

    /**
     * Sets the value of the indicationExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicationExport(Boolean value) {
        this.indicationExport = value;
    }

    /**
     * Gets the value of the indicationEconomicallyActive property.
     * 
     */
    public boolean isIndicationEconomicallyActive() {
        return indicationEconomicallyActive;
    }

    /**
     * Sets the value of the indicationEconomicallyActive property.
     * 
     */
    public void setIndicationEconomicallyActive(boolean value) {
        this.indicationEconomicallyActive = value;
    }

    /**
     * Gets the value of the indicationNonMailing property.
     * 
     */
    public boolean isIndicationNonMailing() {
        return indicationNonMailing;
    }

    /**
     * Sets the value of the indicationNonMailing property.
     * 
     */
    public void setIndicationNonMailing(boolean value) {
        this.indicationNonMailing = value;
    }

    /**
     * Gets the value of the indicationBankruptcy property.
     * 
     */
    public boolean isIndicationBankruptcy() {
        return indicationBankruptcy;
    }

    /**
     * Sets the value of the indicationBankruptcy property.
     * 
     */
    public void setIndicationBankruptcy(boolean value) {
        this.indicationBankruptcy = value;
    }

    /**
     * Gets the value of the indicationDip property.
     * 
     */
    public boolean isIndicationDip() {
        return indicationDip;
    }

    /**
     * Sets the value of the indicationDip property.
     * 
     */
    public void setIndicationDip(boolean value) {
        this.indicationDip = value;
    }

    /**
     * Gets the value of the insolvencies property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessInsolvencyArray }
     *     
     */
    public DutchBusinessInsolvencyArray getInsolvencies() {
        return insolvencies;
    }

    /**
     * Sets the value of the insolvencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessInsolvencyArray }
     *     
     */
    public void setInsolvencies(DutchBusinessInsolvencyArray value) {
        this.insolvencies = value;
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
     * Gets the value of the continuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getContinuationDate() {
        return continuationDate;
    }

    /**
     * Sets the value of the continuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setContinuationDate(DutchBusinessDateV3 value) {
        this.continuationDate = value;
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
     * Gets the value of the annualFinancialStatementSummary property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAnnualFinancialStatementSummary }
     *     
     */
    public DutchBusinessAnnualFinancialStatementSummary getAnnualFinancialStatementSummary() {
        return annualFinancialStatementSummary;
    }

    /**
     * Sets the value of the annualFinancialStatementSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAnnualFinancialStatementSummary }
     *     
     */
    public void setAnnualFinancialStatementSummary(DutchBusinessAnnualFinancialStatementSummary value) {
        this.annualFinancialStatementSummary = value;
    }

    /**
     * Gets the value of the structure property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessStructure }
     *     
     */
    public DutchBusinessStructure getStructure() {
        return structure;
    }

    /**
     * Sets the value of the structure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessStructure }
     *     
     */
    public void setStructure(DutchBusinessStructure value) {
        this.structure = value;
    }

}
