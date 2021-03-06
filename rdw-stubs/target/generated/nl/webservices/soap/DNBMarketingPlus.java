
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBMarketingPlus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBMarketingPlus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="correspondence_address" type="{http://www.webservices.nl/soap/}DNBAddress" minOccurs="0"/>
 *         &lt;element name="correspondence_deliverability_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="establishment_deliverability_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="location_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="is_subsidiary_location" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="legal_form" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="line_of_business" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sic_activity_codes" type="{http://www.webservices.nl/soap/}DNBSICCodeArray" minOccurs="0"/>
 *         &lt;element name="sic8_activity_codes" type="{http://www.webservices.nl/soap/}DNBSICCodeArray" minOccurs="0"/>
 *         &lt;element name="local_activity_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local_activity_code_type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ceo_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ceo_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executive_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="statement_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annual_sales" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="annual_sales_us" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="annual_sales_indication" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="net_worth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="net_worth_us" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="net_income" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="net_income_us" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="import_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="export_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agent_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="employees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employees_indication" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employees_total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employees_total_indication" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employees_total_includes_principals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="report_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="out_of_business" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBMarketingPlus", propOrder = {

})
public class DNBMarketingPlus {

    @XmlElement(name = "correspondence_address")
    protected DNBAddress correspondenceAddress;
    @XmlElement(name = "correspondence_deliverability_indication")
    protected Boolean correspondenceDeliverabilityIndication;
    @XmlElement(name = "establishment_deliverability_indication")
    protected Boolean establishmentDeliverabilityIndication;
    @XmlElement(name = "location_status")
    protected String locationStatus;
    @XmlElement(name = "is_subsidiary_location")
    protected Boolean isSubsidiaryLocation;
    @XmlElement(name = "legal_form")
    protected Integer legalForm;
    @XmlElement(name = "line_of_business")
    protected String lineOfBusiness;
    @XmlElement(name = "sic_activity_codes")
    protected DNBSICCodeArray sicActivityCodes;
    @XmlElement(name = "sic8_activity_codes")
    protected DNBSICCodeArray sic8ActivityCodes;
    @XmlElement(name = "local_activity_code")
    protected String localActivityCode;
    @XmlElement(name = "local_activity_code_type")
    protected Integer localActivityCodeType;
    @XmlElement(name = "start_year")
    protected Integer startYear;
    @XmlElement(name = "ceo_name")
    protected String ceoName;
    @XmlElement(name = "ceo_title")
    protected String ceoTitle;
    @XmlElement(name = "executive_names")
    protected StringArray executiveNames;
    @XmlElement(name = "statement_date")
    protected String statementDate;
    protected String currency;
    @XmlElement(name = "annual_sales")
    protected Long annualSales;
    @XmlElement(name = "annual_sales_us")
    protected Long annualSalesUs;
    @XmlElement(name = "annual_sales_indication")
    protected Integer annualSalesIndication;
    @XmlElement(name = "net_worth")
    protected Long netWorth;
    @XmlElement(name = "net_worth_us")
    protected Long netWorthUs;
    @XmlElement(name = "net_income")
    protected Long netIncome;
    @XmlElement(name = "net_income_us")
    protected Long netIncomeUs;
    @XmlElement(name = "import_indication")
    protected Boolean importIndication;
    @XmlElement(name = "export_indication")
    protected Boolean exportIndication;
    @XmlElement(name = "agent_indication")
    protected Boolean agentIndication;
    protected Integer employees;
    @XmlElement(name = "employees_indication")
    protected Integer employeesIndication;
    @XmlElement(name = "employees_total")
    protected Integer employeesTotal;
    @XmlElement(name = "employees_total_indication")
    protected Integer employeesTotalIndication;
    @XmlElement(name = "employees_total_includes_principals")
    protected Boolean employeesTotalIncludesPrincipals;
    @XmlElement(name = "report_date")
    protected String reportDate;
    @XmlElement(name = "out_of_business")
    protected Boolean outOfBusiness;

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DNBAddress }
     *     
     */
    public DNBAddress getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBAddress }
     *     
     */
    public void setCorrespondenceAddress(DNBAddress value) {
        this.correspondenceAddress = value;
    }

    /**
     * Gets the value of the correspondenceDeliverabilityIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrespondenceDeliverabilityIndication() {
        return correspondenceDeliverabilityIndication;
    }

    /**
     * Sets the value of the correspondenceDeliverabilityIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrespondenceDeliverabilityIndication(Boolean value) {
        this.correspondenceDeliverabilityIndication = value;
    }

    /**
     * Gets the value of the establishmentDeliverabilityIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstablishmentDeliverabilityIndication() {
        return establishmentDeliverabilityIndication;
    }

    /**
     * Sets the value of the establishmentDeliverabilityIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstablishmentDeliverabilityIndication(Boolean value) {
        this.establishmentDeliverabilityIndication = value;
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
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegalForm(Integer value) {
        this.legalForm = value;
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
     * Gets the value of the sicActivityCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DNBSICCodeArray }
     *     
     */
    public DNBSICCodeArray getSicActivityCodes() {
        return sicActivityCodes;
    }

    /**
     * Sets the value of the sicActivityCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBSICCodeArray }
     *     
     */
    public void setSicActivityCodes(DNBSICCodeArray value) {
        this.sicActivityCodes = value;
    }

    /**
     * Gets the value of the sic8ActivityCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DNBSICCodeArray }
     *     
     */
    public DNBSICCodeArray getSic8ActivityCodes() {
        return sic8ActivityCodes;
    }

    /**
     * Sets the value of the sic8ActivityCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBSICCodeArray }
     *     
     */
    public void setSic8ActivityCodes(DNBSICCodeArray value) {
        this.sic8ActivityCodes = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getLocalActivityCodeType() {
        return localActivityCodeType;
    }

    /**
     * Sets the value of the localActivityCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalActivityCodeType(Integer value) {
        this.localActivityCodeType = value;
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
     * Gets the value of the executiveNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getExecutiveNames() {
        return executiveNames;
    }

    /**
     * Sets the value of the executiveNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setExecutiveNames(StringArray value) {
        this.executiveNames = value;
    }

    /**
     * Gets the value of the statementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementDate() {
        return statementDate;
    }

    /**
     * Sets the value of the statementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementDate(String value) {
        this.statementDate = value;
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
     * Gets the value of the annualSales property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnnualSales() {
        return annualSales;
    }

    /**
     * Sets the value of the annualSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnnualSales(Long value) {
        this.annualSales = value;
    }

    /**
     * Gets the value of the annualSalesUs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnnualSalesUs() {
        return annualSalesUs;
    }

    /**
     * Sets the value of the annualSalesUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnnualSalesUs(Long value) {
        this.annualSalesUs = value;
    }

    /**
     * Gets the value of the annualSalesIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnualSalesIndication() {
        return annualSalesIndication;
    }

    /**
     * Sets the value of the annualSalesIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnualSalesIndication(Integer value) {
        this.annualSalesIndication = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetWorth(Long value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the netWorthUs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetWorthUs() {
        return netWorthUs;
    }

    /**
     * Sets the value of the netWorthUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetWorthUs(Long value) {
        this.netWorthUs = value;
    }

    /**
     * Gets the value of the netIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetIncome() {
        return netIncome;
    }

    /**
     * Sets the value of the netIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetIncome(Long value) {
        this.netIncome = value;
    }

    /**
     * Gets the value of the netIncomeUs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetIncomeUs() {
        return netIncomeUs;
    }

    /**
     * Sets the value of the netIncomeUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetIncomeUs(Long value) {
        this.netIncomeUs = value;
    }

    /**
     * Gets the value of the importIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportIndication() {
        return importIndication;
    }

    /**
     * Sets the value of the importIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportIndication(Boolean value) {
        this.importIndication = value;
    }

    /**
     * Gets the value of the exportIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportIndication() {
        return exportIndication;
    }

    /**
     * Sets the value of the exportIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportIndication(Boolean value) {
        this.exportIndication = value;
    }

    /**
     * Gets the value of the agentIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgentIndication() {
        return agentIndication;
    }

    /**
     * Sets the value of the agentIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgentIndication(Boolean value) {
        this.agentIndication = value;
    }

    /**
     * Gets the value of the employees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployees() {
        return employees;
    }

    /**
     * Sets the value of the employees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployees(Integer value) {
        this.employees = value;
    }

    /**
     * Gets the value of the employeesIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeesIndication() {
        return employeesIndication;
    }

    /**
     * Sets the value of the employeesIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeesIndication(Integer value) {
        this.employeesIndication = value;
    }

    /**
     * Gets the value of the employeesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeesTotal() {
        return employeesTotal;
    }

    /**
     * Sets the value of the employeesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeesTotal(Integer value) {
        this.employeesTotal = value;
    }

    /**
     * Gets the value of the employeesTotalIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeesTotalIndication() {
        return employeesTotalIndication;
    }

    /**
     * Sets the value of the employeesTotalIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeesTotalIndication(Integer value) {
        this.employeesTotalIndication = value;
    }

    /**
     * Gets the value of the employeesTotalIncludesPrincipals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployeesTotalIncludesPrincipals() {
        return employeesTotalIncludesPrincipals;
    }

    /**
     * Sets the value of the employeesTotalIncludesPrincipals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployeesTotalIncludesPrincipals(Boolean value) {
        this.employeesTotalIncludesPrincipals = value;
    }

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDate(String value) {
        this.reportDate = value;
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

}
