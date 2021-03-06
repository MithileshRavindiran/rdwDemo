
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRBankAndInsurerKeyFigures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRBankAndInsurerKeyFigures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="balance_sheet_total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equity_capital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_equity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liable_equity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technical_provisions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entrusted_funds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debt_securities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attracted_bankers_funds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issued_bankers_funds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premium_income" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other_income" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_benefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yield_on_investments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operating_investments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holding_gain_of_accounts_receivable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result_before_taxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group_profit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="net_profit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRBankAndInsurerKeyFigures", propOrder = {

})
public class GCRBankAndInsurerKeyFigures {

    @XmlElement(name = "balance_sheet_total")
    protected String balanceSheetTotal;
    @XmlElement(name = "equity_capital")
    protected String equityCapital;
    @XmlElement(name = "group_equity")
    protected String groupEquity;
    @XmlElement(name = "liable_equity")
    protected String liableEquity;
    @XmlElement(name = "technical_provisions")
    protected String technicalProvisions;
    @XmlElement(name = "entrusted_funds")
    protected String entrustedFunds;
    @XmlElement(name = "debt_securities")
    protected String debtSecurities;
    protected String credits;
    @XmlElement(name = "attracted_bankers_funds")
    protected String attractedBankersFunds;
    @XmlElement(name = "issued_bankers_funds")
    protected String issuedBankersFunds;
    protected String interest;
    @XmlElement(name = "premium_income")
    protected String premiumIncome;
    @XmlElement(name = "other_income")
    protected String otherIncome;
    @XmlElement(name = "total_benefits")
    protected String totalBenefits;
    @XmlElement(name = "yield_on_investments")
    protected String yieldOnInvestments;
    @XmlElement(name = "operating_investments")
    protected String operatingInvestments;
    @XmlElement(name = "holding_gain_of_accounts_receivable")
    protected String holdingGainOfAccountsReceivable;
    @XmlElement(name = "result_before_taxes")
    protected String resultBeforeTaxes;
    @XmlElement(name = "group_profit")
    protected String groupProfit;
    @XmlElement(name = "net_profit")
    protected String netProfit;

    /**
     * Gets the value of the balanceSheetTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceSheetTotal() {
        return balanceSheetTotal;
    }

    /**
     * Sets the value of the balanceSheetTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceSheetTotal(String value) {
        this.balanceSheetTotal = value;
    }

    /**
     * Gets the value of the equityCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquityCapital() {
        return equityCapital;
    }

    /**
     * Sets the value of the equityCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquityCapital(String value) {
        this.equityCapital = value;
    }

    /**
     * Gets the value of the groupEquity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupEquity() {
        return groupEquity;
    }

    /**
     * Sets the value of the groupEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupEquity(String value) {
        this.groupEquity = value;
    }

    /**
     * Gets the value of the liableEquity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiableEquity() {
        return liableEquity;
    }

    /**
     * Sets the value of the liableEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiableEquity(String value) {
        this.liableEquity = value;
    }

    /**
     * Gets the value of the technicalProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalProvisions() {
        return technicalProvisions;
    }

    /**
     * Sets the value of the technicalProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalProvisions(String value) {
        this.technicalProvisions = value;
    }

    /**
     * Gets the value of the entrustedFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrustedFunds() {
        return entrustedFunds;
    }

    /**
     * Sets the value of the entrustedFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrustedFunds(String value) {
        this.entrustedFunds = value;
    }

    /**
     * Gets the value of the debtSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtSecurities() {
        return debtSecurities;
    }

    /**
     * Sets the value of the debtSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtSecurities(String value) {
        this.debtSecurities = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredits() {
        return credits;
    }

    /**
     * Sets the value of the credits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredits(String value) {
        this.credits = value;
    }

    /**
     * Gets the value of the attractedBankersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttractedBankersFunds() {
        return attractedBankersFunds;
    }

    /**
     * Sets the value of the attractedBankersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttractedBankersFunds(String value) {
        this.attractedBankersFunds = value;
    }

    /**
     * Gets the value of the issuedBankersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedBankersFunds() {
        return issuedBankersFunds;
    }

    /**
     * Sets the value of the issuedBankersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedBankersFunds(String value) {
        this.issuedBankersFunds = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterest(String value) {
        this.interest = value;
    }

    /**
     * Gets the value of the premiumIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumIncome() {
        return premiumIncome;
    }

    /**
     * Sets the value of the premiumIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumIncome(String value) {
        this.premiumIncome = value;
    }

    /**
     * Gets the value of the otherIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherIncome() {
        return otherIncome;
    }

    /**
     * Sets the value of the otherIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIncome(String value) {
        this.otherIncome = value;
    }

    /**
     * Gets the value of the totalBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBenefits() {
        return totalBenefits;
    }

    /**
     * Sets the value of the totalBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBenefits(String value) {
        this.totalBenefits = value;
    }

    /**
     * Gets the value of the yieldOnInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYieldOnInvestments() {
        return yieldOnInvestments;
    }

    /**
     * Sets the value of the yieldOnInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYieldOnInvestments(String value) {
        this.yieldOnInvestments = value;
    }

    /**
     * Gets the value of the operatingInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingInvestments() {
        return operatingInvestments;
    }

    /**
     * Sets the value of the operatingInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingInvestments(String value) {
        this.operatingInvestments = value;
    }

    /**
     * Gets the value of the holdingGainOfAccountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldingGainOfAccountsReceivable() {
        return holdingGainOfAccountsReceivable;
    }

    /**
     * Sets the value of the holdingGainOfAccountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldingGainOfAccountsReceivable(String value) {
        this.holdingGainOfAccountsReceivable = value;
    }

    /**
     * Gets the value of the resultBeforeTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultBeforeTaxes() {
        return resultBeforeTaxes;
    }

    /**
     * Sets the value of the resultBeforeTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultBeforeTaxes(String value) {
        this.resultBeforeTaxes = value;
    }

    /**
     * Gets the value of the groupProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupProfit() {
        return groupProfit;
    }

    /**
     * Sets the value of the groupProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupProfit(String value) {
        this.groupProfit = value;
    }

    /**
     * Gets the value of the netProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetProfit() {
        return netProfit;
    }

    /**
     * Sets the value of the netProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetProfit(String value) {
        this.netProfit = value;
    }

}
