
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBQuickCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBQuickCheck">
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
 *         &lt;element name="ceo_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ceo_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principal_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="principal_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statement_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debtor_inpossession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criminal_proceedings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="suit_judgement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="financial_embarrassment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="financial_legal_events" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="operational_events" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="other_events" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disaster" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="secured_filings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="out_of_business" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="history_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="history_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="income_statement_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="income_statement_date_start" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="income_statement_date_end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financial_statement_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incorporation_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="current_control_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="local_activity_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local_activity_code_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local_activity_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sic_activity_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sic_activity_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sic_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legal_form" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="legal_form_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paydex_norm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paydex_score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dnb_rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maximum_credit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intangible_assets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="net_worth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tangible_net_worth" type="{http://www.webservices.nl/soap/}DNBMonetaryAmount" minOccurs="0"/>
 *         &lt;element name="sales" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="annual_sales" type="{http://www.webservices.nl/soap/}DNBMonetaryAmount" minOccurs="0"/>
 *         &lt;element name="employees_primary" type="{http://www.webservices.nl/soap/}DNBEmployeeCount" minOccurs="0"/>
 *         &lt;element name="employees_total" type="{http://www.webservices.nl/soap/}DNBEmployeeCount" minOccurs="0"/>
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
@XmlType(name = "DNBQuickCheck", propOrder = {

})
public class DNBQuickCheck {

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
    @XmlElement(name = "ceo_name")
    protected String ceoName;
    @XmlElement(name = "ceo_title")
    protected String ceoTitle;
    @XmlElement(name = "principal_name")
    protected String principalName;
    @XmlElement(name = "principal_title")
    protected String principalTitle;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(name = "statement_currency")
    protected String statementCurrency;
    @XmlElement(name = "debtor_inpossession")
    protected Boolean debtorInpossession;
    @XmlElement(name = "criminal_proceedings")
    protected Boolean criminalProceedings;
    @XmlElement(name = "suit_judgement")
    protected Boolean suitJudgement;
    @XmlElement(name = "financial_embarrassment")
    protected Boolean financialEmbarrassment;
    @XmlElement(name = "financial_legal_events")
    protected Boolean financialLegalEvents;
    @XmlElement(name = "operational_events")
    protected Boolean operationalEvents;
    @XmlElement(name = "other_events")
    protected Boolean otherEvents;
    protected Boolean disaster;
    @XmlElement(name = "secured_filings")
    protected Boolean securedFilings;
    @XmlElement(name = "out_of_business")
    protected Boolean outOfBusiness;
    @XmlElement(name = "history_indicator")
    protected String historyIndicator;
    @XmlElement(name = "history_description")
    protected String historyDescription;
    @XmlElement(name = "income_statement_date")
    protected String incomeStatementDate;
    @XmlElement(name = "income_statement_date_start")
    protected String incomeStatementDateStart;
    @XmlElement(name = "income_statement_date_end")
    protected String incomeStatementDateEnd;
    @XmlElement(name = "financial_statement_date")
    protected String financialStatementDate;
    @XmlElement(name = "incorporation_year")
    protected Integer incorporationYear;
    @XmlElement(name = "start_year")
    protected Integer startYear;
    @XmlElement(name = "current_control_year")
    protected Integer currentControlYear;
    @XmlElement(name = "local_activity_code")
    protected String localActivityCode;
    @XmlElement(name = "local_activity_code_type")
    protected String localActivityCodeType;
    @XmlElement(name = "local_activity_description")
    protected String localActivityDescription;
    @XmlElement(name = "sic_activity_code", required = true)
    protected String sicActivityCode;
    @XmlElement(name = "sic_activity_description", required = true)
    protected String sicActivityDescription;
    @XmlElement(name = "sic_version", required = true)
    protected String sicVersion;
    @XmlElement(name = "legal_form", required = true)
    protected String legalForm;
    @XmlElement(name = "legal_form_description", required = true)
    protected String legalFormDescription;
    @XmlElement(name = "paydex_norm")
    protected Integer paydexNorm;
    @XmlElement(name = "paydex_score")
    protected Integer paydexScore;
    @XmlElement(name = "dnb_rating", required = true)
    protected String dnbRating;
    @XmlElement(name = "maximum_credit")
    protected Integer maximumCredit;
    @XmlElement(name = "maximum_credit_currency")
    protected String maximumCreditCurrency;
    @XmlElement(name = "intangible_assets")
    protected Integer intangibleAssets;
    @XmlElement(name = "net_worth")
    protected Integer netWorth;
    @XmlElement(name = "tangible_net_worth")
    protected DNBMonetaryAmount tangibleNetWorth;
    protected Integer sales;
    @XmlElement(name = "annual_sales")
    protected DNBMonetaryAmount annualSales;
    @XmlElement(name = "employees_primary")
    protected DNBEmployeeCount employeesPrimary;
    @XmlElement(name = "employees_total")
    protected DNBEmployeeCount employeesTotal;
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
     * Gets the value of the ceoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeoName() {
        return ceoName;
    }

    /**
     * Sets the value of the ceoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeoName(String value) {
        this.ceoName = value;
    }

    /**
     * Gets the value of the ceoTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeoTitle() {
        return ceoTitle;
    }

    /**
     * Sets the value of the ceoTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeoTitle(String value) {
        this.ceoTitle = value;
    }

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalName(String value) {
        this.principalName = value;
    }

    /**
     * Gets the value of the principalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalTitle() {
        return principalTitle;
    }

    /**
     * Sets the value of the principalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalTitle(String value) {
        this.principalTitle = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the statementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementCurrency() {
        return statementCurrency;
    }

    /**
     * Sets the value of the statementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementCurrency(String value) {
        this.statementCurrency = value;
    }

    /**
     * Gets the value of the debtorInpossession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebtorInpossession() {
        return debtorInpossession;
    }

    /**
     * Sets the value of the debtorInpossession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebtorInpossession(Boolean value) {
        this.debtorInpossession = value;
    }

    /**
     * Gets the value of the criminalProceedings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCriminalProceedings() {
        return criminalProceedings;
    }

    /**
     * Sets the value of the criminalProceedings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCriminalProceedings(Boolean value) {
        this.criminalProceedings = value;
    }

    /**
     * Gets the value of the suitJudgement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitJudgement() {
        return suitJudgement;
    }

    /**
     * Sets the value of the suitJudgement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitJudgement(Boolean value) {
        this.suitJudgement = value;
    }

    /**
     * Gets the value of the financialEmbarrassment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialEmbarrassment() {
        return financialEmbarrassment;
    }

    /**
     * Sets the value of the financialEmbarrassment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialEmbarrassment(Boolean value) {
        this.financialEmbarrassment = value;
    }

    /**
     * Gets the value of the financialLegalEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialLegalEvents() {
        return financialLegalEvents;
    }

    /**
     * Sets the value of the financialLegalEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialLegalEvents(Boolean value) {
        this.financialLegalEvents = value;
    }

    /**
     * Gets the value of the operationalEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationalEvents() {
        return operationalEvents;
    }

    /**
     * Sets the value of the operationalEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationalEvents(Boolean value) {
        this.operationalEvents = value;
    }

    /**
     * Gets the value of the otherEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherEvents() {
        return otherEvents;
    }

    /**
     * Sets the value of the otherEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherEvents(Boolean value) {
        this.otherEvents = value;
    }

    /**
     * Gets the value of the disaster property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisaster() {
        return disaster;
    }

    /**
     * Sets the value of the disaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisaster(Boolean value) {
        this.disaster = value;
    }

    /**
     * Gets the value of the securedFilings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecuredFilings() {
        return securedFilings;
    }

    /**
     * Sets the value of the securedFilings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecuredFilings(Boolean value) {
        this.securedFilings = value;
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
     * Gets the value of the historyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryIndicator() {
        return historyIndicator;
    }

    /**
     * Sets the value of the historyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryIndicator(String value) {
        this.historyIndicator = value;
    }

    /**
     * Gets the value of the historyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryDescription() {
        return historyDescription;
    }

    /**
     * Sets the value of the historyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryDescription(String value) {
        this.historyDescription = value;
    }

    /**
     * Gets the value of the incomeStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeStatementDate() {
        return incomeStatementDate;
    }

    /**
     * Sets the value of the incomeStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeStatementDate(String value) {
        this.incomeStatementDate = value;
    }

    /**
     * Gets the value of the incomeStatementDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeStatementDateStart() {
        return incomeStatementDateStart;
    }

    /**
     * Sets the value of the incomeStatementDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeStatementDateStart(String value) {
        this.incomeStatementDateStart = value;
    }

    /**
     * Gets the value of the incomeStatementDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeStatementDateEnd() {
        return incomeStatementDateEnd;
    }

    /**
     * Sets the value of the incomeStatementDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeStatementDateEnd(String value) {
        this.incomeStatementDateEnd = value;
    }

    /**
     * Gets the value of the financialStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialStatementDate() {
        return financialStatementDate;
    }

    /**
     * Sets the value of the financialStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialStatementDate(String value) {
        this.financialStatementDate = value;
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
     * Gets the value of the currentControlYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentControlYear() {
        return currentControlYear;
    }

    /**
     * Sets the value of the currentControlYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentControlYear(Integer value) {
        this.currentControlYear = value;
    }

    /**
     * Gets the value of the localActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalActivityCode() {
        return localActivityCode;
    }

    /**
     * Sets the value of the localActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalActivityCode(String value) {
        this.localActivityCode = value;
    }

    /**
     * Gets the value of the localActivityCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalActivityCodeType() {
        return localActivityCodeType;
    }

    /**
     * Sets the value of the localActivityCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalActivityCodeType(String value) {
        this.localActivityCodeType = value;
    }

    /**
     * Gets the value of the localActivityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalActivityDescription() {
        return localActivityDescription;
    }

    /**
     * Sets the value of the localActivityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalActivityDescription(String value) {
        this.localActivityDescription = value;
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
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the legalFormDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormDescription() {
        return legalFormDescription;
    }

    /**
     * Sets the value of the legalFormDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormDescription(String value) {
        this.legalFormDescription = value;
    }

    /**
     * Gets the value of the paydexNorm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaydexNorm() {
        return paydexNorm;
    }

    /**
     * Sets the value of the paydexNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaydexNorm(Integer value) {
        this.paydexNorm = value;
    }

    /**
     * Gets the value of the paydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaydexScore() {
        return paydexScore;
    }

    /**
     * Sets the value of the paydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaydexScore(Integer value) {
        this.paydexScore = value;
    }

    /**
     * Gets the value of the dnbRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnbRating() {
        return dnbRating;
    }

    /**
     * Sets the value of the dnbRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnbRating(String value) {
        this.dnbRating = value;
    }

    /**
     * Gets the value of the maximumCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumCredit() {
        return maximumCredit;
    }

    /**
     * Sets the value of the maximumCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumCredit(Integer value) {
        this.maximumCredit = value;
    }

    /**
     * Gets the value of the maximumCreditCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCreditCurrency() {
        return maximumCreditCurrency;
    }

    /**
     * Sets the value of the maximumCreditCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCreditCurrency(String value) {
        this.maximumCreditCurrency = value;
    }

    /**
     * Gets the value of the intangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntangibleAssets() {
        return intangibleAssets;
    }

    /**
     * Sets the value of the intangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntangibleAssets(Integer value) {
        this.intangibleAssets = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetWorth(Integer value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the tangibleNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link DNBMonetaryAmount }
     *     
     */
    public DNBMonetaryAmount getTangibleNetWorth() {
        return tangibleNetWorth;
    }

    /**
     * Sets the value of the tangibleNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBMonetaryAmount }
     *     
     */
    public void setTangibleNetWorth(DNBMonetaryAmount value) {
        this.tangibleNetWorth = value;
    }

    /**
     * Gets the value of the sales property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * Sets the value of the sales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSales(Integer value) {
        this.sales = value;
    }

    /**
     * Gets the value of the annualSales property.
     * 
     * @return
     *     possible object is
     *     {@link DNBMonetaryAmount }
     *     
     */
    public DNBMonetaryAmount getAnnualSales() {
        return annualSales;
    }

    /**
     * Sets the value of the annualSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBMonetaryAmount }
     *     
     */
    public void setAnnualSales(DNBMonetaryAmount value) {
        this.annualSales = value;
    }

    /**
     * Gets the value of the employeesPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link DNBEmployeeCount }
     *     
     */
    public DNBEmployeeCount getEmployeesPrimary() {
        return employeesPrimary;
    }

    /**
     * Sets the value of the employeesPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBEmployeeCount }
     *     
     */
    public void setEmployeesPrimary(DNBEmployeeCount value) {
        this.employeesPrimary = value;
    }

    /**
     * Gets the value of the employeesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link DNBEmployeeCount }
     *     
     */
    public DNBEmployeeCount getEmployeesTotal() {
        return employeesTotal;
    }

    /**
     * Sets the value of the employeesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBEmployeeCount }
     *     
     */
    public void setEmployeesTotal(DNBEmployeeCount value) {
        this.employeesTotal = value;
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
