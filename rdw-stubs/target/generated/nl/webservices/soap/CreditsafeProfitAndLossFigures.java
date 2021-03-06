
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeProfitAndLossFigures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeProfitAndLossFigures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="year_end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="number_of_weeks" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consolidated_accounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="operating_costs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="operating_profit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="wages_and_salaries" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pension_costs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="depreciation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="amortisation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="financial_income" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="financial_expenses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="extraordinary_income" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="extraordinary_costs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="profit_before_tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="profit_after_tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dividends" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minority_interests" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_appropriations" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="retained_profit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeProfitAndLossFigures", propOrder = {

})
public class CreditsafeProfitAndLossFigures {

    @XmlElement(name = "year_end_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar yearEndDate;
    @XmlElement(name = "number_of_weeks")
    @XmlSchemaType(name = "unsignedInt")
    protected long numberOfWeeks;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(name = "consolidated_accounts")
    protected Boolean consolidatedAccounts;
    protected BigDecimal revenue;
    @XmlElement(name = "operating_costs")
    protected BigDecimal operatingCosts;
    @XmlElement(name = "operating_profit")
    protected BigDecimal operatingProfit;
    @XmlElement(name = "wages_and_salaries")
    protected BigDecimal wagesAndSalaries;
    @XmlElement(name = "pension_costs")
    protected BigDecimal pensionCosts;
    protected BigDecimal depreciation;
    protected BigDecimal amortisation;
    @XmlElement(name = "financial_income")
    protected BigDecimal financialIncome;
    @XmlElement(name = "financial_expenses")
    protected BigDecimal financialExpenses;
    @XmlElement(name = "extraordinary_income")
    protected BigDecimal extraordinaryIncome;
    @XmlElement(name = "extraordinary_costs")
    protected BigDecimal extraordinaryCosts;
    @XmlElement(name = "profit_before_tax")
    protected BigDecimal profitBeforeTax;
    protected BigDecimal tax;
    @XmlElement(name = "profit_after_tax")
    protected BigDecimal profitAfterTax;
    protected BigDecimal dividends;
    @XmlElement(name = "minority_interests")
    protected BigDecimal minorityInterests;
    @XmlElement(name = "other_appropriations")
    protected BigDecimal otherAppropriations;
    @XmlElement(name = "retained_profit")
    protected BigDecimal retainedProfit;

    /**
     * Gets the value of the yearEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearEndDate() {
        return yearEndDate;
    }

    /**
     * Sets the value of the yearEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearEndDate(XMLGregorianCalendar value) {
        this.yearEndDate = value;
    }

    /**
     * Gets the value of the numberOfWeeks property.
     * 
     */
    public long getNumberOfWeeks() {
        return numberOfWeeks;
    }

    /**
     * Sets the value of the numberOfWeeks property.
     * 
     */
    public void setNumberOfWeeks(long value) {
        this.numberOfWeeks = value;
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
     * Gets the value of the consolidatedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidatedAccounts() {
        return consolidatedAccounts;
    }

    /**
     * Sets the value of the consolidatedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidatedAccounts(Boolean value) {
        this.consolidatedAccounts = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRevenue(BigDecimal value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the operatingCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperatingCosts() {
        return operatingCosts;
    }

    /**
     * Sets the value of the operatingCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperatingCosts(BigDecimal value) {
        this.operatingCosts = value;
    }

    /**
     * Gets the value of the operatingProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperatingProfit() {
        return operatingProfit;
    }

    /**
     * Sets the value of the operatingProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperatingProfit(BigDecimal value) {
        this.operatingProfit = value;
    }

    /**
     * Gets the value of the wagesAndSalaries property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWagesAndSalaries() {
        return wagesAndSalaries;
    }

    /**
     * Sets the value of the wagesAndSalaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWagesAndSalaries(BigDecimal value) {
        this.wagesAndSalaries = value;
    }

    /**
     * Gets the value of the pensionCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPensionCosts() {
        return pensionCosts;
    }

    /**
     * Sets the value of the pensionCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPensionCosts(BigDecimal value) {
        this.pensionCosts = value;
    }

    /**
     * Gets the value of the depreciation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepreciation() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepreciation(BigDecimal value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the amortisation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmortisation() {
        return amortisation;
    }

    /**
     * Sets the value of the amortisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmortisation(BigDecimal value) {
        this.amortisation = value;
    }

    /**
     * Gets the value of the financialIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinancialIncome() {
        return financialIncome;
    }

    /**
     * Sets the value of the financialIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinancialIncome(BigDecimal value) {
        this.financialIncome = value;
    }

    /**
     * Gets the value of the financialExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinancialExpenses() {
        return financialExpenses;
    }

    /**
     * Sets the value of the financialExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinancialExpenses(BigDecimal value) {
        this.financialExpenses = value;
    }

    /**
     * Gets the value of the extraordinaryIncome property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraordinaryIncome() {
        return extraordinaryIncome;
    }

    /**
     * Sets the value of the extraordinaryIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraordinaryIncome(BigDecimal value) {
        this.extraordinaryIncome = value;
    }

    /**
     * Gets the value of the extraordinaryCosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraordinaryCosts() {
        return extraordinaryCosts;
    }

    /**
     * Sets the value of the extraordinaryCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraordinaryCosts(BigDecimal value) {
        this.extraordinaryCosts = value;
    }

    /**
     * Gets the value of the profitBeforeTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitBeforeTax() {
        return profitBeforeTax;
    }

    /**
     * Sets the value of the profitBeforeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitBeforeTax(BigDecimal value) {
        this.profitBeforeTax = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the profitAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitAfterTax() {
        return profitAfterTax;
    }

    /**
     * Sets the value of the profitAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitAfterTax(BigDecimal value) {
        this.profitAfterTax = value;
    }

    /**
     * Gets the value of the dividends property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDividends(BigDecimal value) {
        this.dividends = value;
    }

    /**
     * Gets the value of the minorityInterests property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinorityInterests() {
        return minorityInterests;
    }

    /**
     * Sets the value of the minorityInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinorityInterests(BigDecimal value) {
        this.minorityInterests = value;
    }

    /**
     * Gets the value of the otherAppropriations property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherAppropriations() {
        return otherAppropriations;
    }

    /**
     * Sets the value of the otherAppropriations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherAppropriations(BigDecimal value) {
        this.otherAppropriations = value;
    }

    /**
     * Gets the value of the retainedProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRetainedProfit() {
        return retainedProfit;
    }

    /**
     * Sets the value of the retainedProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRetainedProfit(BigDecimal value) {
        this.retainedProfit = value;
    }

}
