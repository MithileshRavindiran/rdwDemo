
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBEnterpriseManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBEnterpriseManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="quickcheck" type="{http://www.webservices.nl/soap/}DNBQuickCheck"/>
 *         &lt;element name="main_branch_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indate_indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="registration_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="import_indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="export_indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="location_ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claims_indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="paydex_score_earlier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="average_high_credit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="high_credit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total_payments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="headquarters" type="{http://www.webservices.nl/soap/}DNBRelatedBusiness" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://www.webservices.nl/soap/}DNBRelatedBusiness" minOccurs="0"/>
 *         &lt;element name="domestic_ultimate" type="{http://www.webservices.nl/soap/}DNBRelatedBusiness" minOccurs="0"/>
 *         &lt;element name="global_ultimate" type="{http://www.webservices.nl/soap/}DNBRelatedBusiness" minOccurs="0"/>
 *         &lt;element name="is_subsidiary_location" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="location_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accounts_audited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="statement_consolidated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_estimated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_forecast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="year_period" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_final" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="opening_statement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_proforma" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trial_balance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_signed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_restated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_unbalanced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="figures_qualified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="accounts_receivable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="liquid_assets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inventory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total_current_assets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total_assets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="accounts_payable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total_current_liabilities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total_liabilities" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="net_income" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quick_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="current_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="previous_net_worth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="previous_sales" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="previous_statement_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="line_of_business" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failure_score" type="{http://www.webservices.nl/soap/}DNBScoreGroupArray"/>
 *         &lt;element name="credit_score" type="{http://www.webservices.nl/soap/}DNBScoreGroupArray"/>
 *         &lt;element name="global_failure_score" type="{http://www.webservices.nl/soap/}DNBScoreGroupArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBEnterpriseManagement", propOrder = {

})
public class DNBEnterpriseManagement {

    @XmlElement(required = true)
    protected DNBQuickCheck quickcheck;
    @XmlElement(name = "main_branch_indication")
    protected Boolean mainBranchIndication;
    @XmlElement(name = "indate_indicator")
    protected Boolean indateIndicator;
    @XmlElement(name = "registration_type")
    protected String registrationType;
    @XmlElement(name = "import_indicator")
    protected Boolean importIndicator;
    @XmlElement(name = "export_indicator")
    protected Boolean exportIndicator;
    @XmlElement(name = "location_ownership")
    protected String locationOwnership;
    @XmlElement(name = "claims_indicator")
    protected Boolean claimsIndicator;
    @XmlElement(name = "paydex_score_earlier")
    protected Integer paydexScoreEarlier;
    @XmlElement(name = "average_high_credit")
    protected Integer averageHighCredit;
    @XmlElement(name = "high_credit")
    protected Integer highCredit;
    @XmlElement(name = "total_payments")
    protected Integer totalPayments;
    protected DNBRelatedBusiness headquarters;
    protected DNBRelatedBusiness parent;
    @XmlElement(name = "domestic_ultimate")
    protected DNBRelatedBusiness domesticUltimate;
    @XmlElement(name = "global_ultimate")
    protected DNBRelatedBusiness globalUltimate;
    @XmlElement(name = "is_subsidiary_location")
    protected Boolean isSubsidiaryLocation;
    @XmlElement(name = "location_status")
    protected String locationStatus;
    @XmlElement(name = "accounts_audited")
    protected Boolean accountsAudited;
    @XmlElement(name = "statement_consolidated")
    protected Boolean statementConsolidated;
    @XmlElement(name = "figures_estimated")
    protected Boolean figuresEstimated;
    @XmlElement(name = "figures_forecast")
    protected Boolean figuresForecast;
    @XmlElement(name = "year_period")
    protected Boolean yearPeriod;
    @XmlElement(name = "figures_final")
    protected Boolean figuresFinal;
    @XmlElement(name = "opening_statement")
    protected Boolean openingStatement;
    @XmlElement(name = "figures_proforma")
    protected Boolean figuresProforma;
    @XmlElement(name = "trial_balance")
    protected Boolean trialBalance;
    @XmlElement(name = "figures_signed")
    protected Boolean figuresSigned;
    @XmlElement(name = "figures_restated")
    protected Boolean figuresRestated;
    @XmlElement(name = "figures_unbalanced")
    protected Boolean figuresUnbalanced;
    @XmlElement(name = "figures_qualified")
    protected Boolean figuresQualified;
    @XmlElement(name = "accounts_receivable")
    protected Integer accountsReceivable;
    @XmlElement(name = "liquid_assets")
    protected Integer liquidAssets;
    protected Integer inventory;
    @XmlElement(name = "total_current_assets")
    protected Integer totalCurrentAssets;
    @XmlElement(name = "total_assets")
    protected Integer totalAssets;
    @XmlElement(name = "accounts_payable")
    protected Integer accountsPayable;
    @XmlElement(name = "total_current_liabilities")
    protected Integer totalCurrentLiabilities;
    @XmlElement(name = "total_liabilities")
    protected Integer totalLiabilities;
    @XmlElement(name = "net_income")
    protected Integer netIncome;
    @XmlElement(name = "quick_ratio")
    protected BigDecimal quickRatio;
    @XmlElement(name = "current_ratio")
    protected BigDecimal currentRatio;
    @XmlElement(name = "previous_net_worth")
    protected Integer previousNetWorth;
    @XmlElement(name = "previous_sales")
    protected Integer previousSales;
    @XmlElement(name = "previous_statement_date")
    protected String previousStatementDate;
    @XmlElement(name = "line_of_business")
    protected String lineOfBusiness;
    @XmlElement(name = "failure_score", required = true)
    protected DNBScoreGroupArray failureScore;
    @XmlElement(name = "credit_score", required = true)
    protected DNBScoreGroupArray creditScore;
    @XmlElement(name = "global_failure_score", required = true)
    protected DNBScoreGroupArray globalFailureScore;

    /**
     * Gets the value of the quickcheck property.
     * 
     * @return
     *     possible object is
     *     {@link DNBQuickCheck }
     *     
     */
    public DNBQuickCheck getQuickcheck() {
        return quickcheck;
    }

    /**
     * Sets the value of the quickcheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBQuickCheck }
     *     
     */
    public void setQuickcheck(DNBQuickCheck value) {
        this.quickcheck = value;
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
     * Gets the value of the indateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndateIndicator() {
        return indateIndicator;
    }

    /**
     * Sets the value of the indateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndateIndicator(Boolean value) {
        this.indateIndicator = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the importIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportIndicator() {
        return importIndicator;
    }

    /**
     * Sets the value of the importIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportIndicator(Boolean value) {
        this.importIndicator = value;
    }

    /**
     * Gets the value of the exportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportIndicator() {
        return exportIndicator;
    }

    /**
     * Sets the value of the exportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportIndicator(Boolean value) {
        this.exportIndicator = value;
    }

    /**
     * Gets the value of the locationOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationOwnership() {
        return locationOwnership;
    }

    /**
     * Sets the value of the locationOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationOwnership(String value) {
        this.locationOwnership = value;
    }

    /**
     * Gets the value of the claimsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimsIndicator() {
        return claimsIndicator;
    }

    /**
     * Sets the value of the claimsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimsIndicator(Boolean value) {
        this.claimsIndicator = value;
    }

    /**
     * Gets the value of the paydexScoreEarlier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaydexScoreEarlier() {
        return paydexScoreEarlier;
    }

    /**
     * Sets the value of the paydexScoreEarlier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaydexScoreEarlier(Integer value) {
        this.paydexScoreEarlier = value;
    }

    /**
     * Gets the value of the averageHighCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAverageHighCredit() {
        return averageHighCredit;
    }

    /**
     * Sets the value of the averageHighCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAverageHighCredit(Integer value) {
        this.averageHighCredit = value;
    }

    /**
     * Gets the value of the highCredit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighCredit() {
        return highCredit;
    }

    /**
     * Sets the value of the highCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighCredit(Integer value) {
        this.highCredit = value;
    }

    /**
     * Gets the value of the totalPayments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPayments() {
        return totalPayments;
    }

    /**
     * Sets the value of the totalPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPayments(Integer value) {
        this.totalPayments = value;
    }

    /**
     * Gets the value of the headquarters property.
     * 
     * @return
     *     possible object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public DNBRelatedBusiness getHeadquarters() {
        return headquarters;
    }

    /**
     * Sets the value of the headquarters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public void setHeadquarters(DNBRelatedBusiness value) {
        this.headquarters = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public DNBRelatedBusiness getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public void setParent(DNBRelatedBusiness value) {
        this.parent = value;
    }

    /**
     * Gets the value of the domesticUltimate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public DNBRelatedBusiness getDomesticUltimate() {
        return domesticUltimate;
    }

    /**
     * Sets the value of the domesticUltimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public void setDomesticUltimate(DNBRelatedBusiness value) {
        this.domesticUltimate = value;
    }

    /**
     * Gets the value of the globalUltimate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public DNBRelatedBusiness getGlobalUltimate() {
        return globalUltimate;
    }

    /**
     * Sets the value of the globalUltimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBRelatedBusiness }
     *     
     */
    public void setGlobalUltimate(DNBRelatedBusiness value) {
        this.globalUltimate = value;
    }

    /**
     * Gets the value of the isSubsidiaryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubsidiaryLocation() {
        return isSubsidiaryLocation;
    }

    /**
     * Sets the value of the isSubsidiaryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubsidiaryLocation(Boolean value) {
        this.isSubsidiaryLocation = value;
    }

    /**
     * Gets the value of the locationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationStatus() {
        return locationStatus;
    }

    /**
     * Sets the value of the locationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationStatus(String value) {
        this.locationStatus = value;
    }

    /**
     * Gets the value of the accountsAudited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountsAudited() {
        return accountsAudited;
    }

    /**
     * Sets the value of the accountsAudited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountsAudited(Boolean value) {
        this.accountsAudited = value;
    }

    /**
     * Gets the value of the statementConsolidated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatementConsolidated() {
        return statementConsolidated;
    }

    /**
     * Sets the value of the statementConsolidated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatementConsolidated(Boolean value) {
        this.statementConsolidated = value;
    }

    /**
     * Gets the value of the figuresEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresEstimated() {
        return figuresEstimated;
    }

    /**
     * Sets the value of the figuresEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresEstimated(Boolean value) {
        this.figuresEstimated = value;
    }

    /**
     * Gets the value of the figuresForecast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresForecast() {
        return figuresForecast;
    }

    /**
     * Sets the value of the figuresForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresForecast(Boolean value) {
        this.figuresForecast = value;
    }

    /**
     * Gets the value of the yearPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYearPeriod() {
        return yearPeriod;
    }

    /**
     * Sets the value of the yearPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYearPeriod(Boolean value) {
        this.yearPeriod = value;
    }

    /**
     * Gets the value of the figuresFinal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresFinal() {
        return figuresFinal;
    }

    /**
     * Sets the value of the figuresFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresFinal(Boolean value) {
        this.figuresFinal = value;
    }

    /**
     * Gets the value of the openingStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpeningStatement() {
        return openingStatement;
    }

    /**
     * Sets the value of the openingStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpeningStatement(Boolean value) {
        this.openingStatement = value;
    }

    /**
     * Gets the value of the figuresProforma property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresProforma() {
        return figuresProforma;
    }

    /**
     * Sets the value of the figuresProforma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresProforma(Boolean value) {
        this.figuresProforma = value;
    }

    /**
     * Gets the value of the trialBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrialBalance() {
        return trialBalance;
    }

    /**
     * Sets the value of the trialBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrialBalance(Boolean value) {
        this.trialBalance = value;
    }

    /**
     * Gets the value of the figuresSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresSigned() {
        return figuresSigned;
    }

    /**
     * Sets the value of the figuresSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresSigned(Boolean value) {
        this.figuresSigned = value;
    }

    /**
     * Gets the value of the figuresRestated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresRestated() {
        return figuresRestated;
    }

    /**
     * Sets the value of the figuresRestated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresRestated(Boolean value) {
        this.figuresRestated = value;
    }

    /**
     * Gets the value of the figuresUnbalanced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresUnbalanced() {
        return figuresUnbalanced;
    }

    /**
     * Sets the value of the figuresUnbalanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresUnbalanced(Boolean value) {
        this.figuresUnbalanced = value;
    }

    /**
     * Gets the value of the figuresQualified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiguresQualified() {
        return figuresQualified;
    }

    /**
     * Sets the value of the figuresQualified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFiguresQualified(Boolean value) {
        this.figuresQualified = value;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountsReceivable(Integer value) {
        this.accountsReceivable = value;
    }

    /**
     * Gets the value of the liquidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiquidAssets() {
        return liquidAssets;
    }

    /**
     * Sets the value of the liquidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiquidAssets(Integer value) {
        this.liquidAssets = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInventory(Integer value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCurrentAssets(Integer value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAssets(Integer value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the accountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountsPayable() {
        return accountsPayable;
    }

    /**
     * Sets the value of the accountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountsPayable(Integer value) {
        this.accountsPayable = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCurrentLiabilities(Integer value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the totalLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalLiabilities() {
        return totalLiabilities;
    }

    /**
     * Sets the value of the totalLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalLiabilities(Integer value) {
        this.totalLiabilities = value;
    }

    /**
     * Gets the value of the netIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetIncome() {
        return netIncome;
    }

    /**
     * Sets the value of the netIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetIncome(Integer value) {
        this.netIncome = value;
    }

    /**
     * Gets the value of the quickRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuickRatio() {
        return quickRatio;
    }

    /**
     * Sets the value of the quickRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuickRatio(BigDecimal value) {
        this.quickRatio = value;
    }

    /**
     * Gets the value of the currentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    /**
     * Sets the value of the currentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatio(BigDecimal value) {
        this.currentRatio = value;
    }

    /**
     * Gets the value of the previousNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousNetWorth() {
        return previousNetWorth;
    }

    /**
     * Sets the value of the previousNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousNetWorth(Integer value) {
        this.previousNetWorth = value;
    }

    /**
     * Gets the value of the previousSales property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviousSales() {
        return previousSales;
    }

    /**
     * Sets the value of the previousSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviousSales(Integer value) {
        this.previousSales = value;
    }

    /**
     * Gets the value of the previousStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousStatementDate() {
        return previousStatementDate;
    }

    /**
     * Sets the value of the previousStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousStatementDate(String value) {
        this.previousStatementDate = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineOfBusiness(String value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the failureScore property.
     * 
     * @return
     *     possible object is
     *     {@link DNBScoreGroupArray }
     *     
     */
    public DNBScoreGroupArray getFailureScore() {
        return failureScore;
    }

    /**
     * Sets the value of the failureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBScoreGroupArray }
     *     
     */
    public void setFailureScore(DNBScoreGroupArray value) {
        this.failureScore = value;
    }

    /**
     * Gets the value of the creditScore property.
     * 
     * @return
     *     possible object is
     *     {@link DNBScoreGroupArray }
     *     
     */
    public DNBScoreGroupArray getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBScoreGroupArray }
     *     
     */
    public void setCreditScore(DNBScoreGroupArray value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the globalFailureScore property.
     * 
     * @return
     *     possible object is
     *     {@link DNBScoreGroupArray }
     *     
     */
    public DNBScoreGroupArray getGlobalFailureScore() {
        return globalFailureScore;
    }

    /**
     * Sets the value of the globalFailureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBScoreGroupArray }
     *     
     */
    public void setGlobalFailureScore(DNBScoreGroupArray value) {
        this.globalFailureScore = value;
    }

}
