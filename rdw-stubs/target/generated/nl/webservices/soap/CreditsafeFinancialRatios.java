
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeFinancialRatios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeFinancialRatios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pre_tax_profit_margin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="return_on_capital_employed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="return_on_total_assets_employed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="return_on_net_assets_employed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sales_or_net_working_capital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stock_turnover_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="debtor_days" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditor_days" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="current_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="liquidity_ratio_or_acid_test" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="current_debt_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="gearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="equity_in_percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_debt_ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeFinancialRatios", propOrder = {

})
public class CreditsafeFinancialRatios {

    @XmlElement(name = "pre_tax_profit_margin")
    protected BigDecimal preTaxProfitMargin;
    @XmlElement(name = "return_on_capital_employed")
    protected BigDecimal returnOnCapitalEmployed;
    @XmlElement(name = "return_on_total_assets_employed")
    protected BigDecimal returnOnTotalAssetsEmployed;
    @XmlElement(name = "return_on_net_assets_employed")
    protected BigDecimal returnOnNetAssetsEmployed;
    @XmlElement(name = "sales_or_net_working_capital")
    protected BigDecimal salesOrNetWorkingCapital;
    @XmlElement(name = "stock_turnover_ratio")
    protected BigDecimal stockTurnoverRatio;
    @XmlElement(name = "debtor_days")
    protected BigDecimal debtorDays;
    @XmlElement(name = "creditor_days")
    protected BigDecimal creditorDays;
    @XmlElement(name = "current_ratio")
    protected BigDecimal currentRatio;
    @XmlElement(name = "liquidity_ratio_or_acid_test")
    protected BigDecimal liquidityRatioOrAcidTest;
    @XmlElement(name = "current_debt_ratio")
    protected BigDecimal currentDebtRatio;
    protected BigDecimal gearing;
    @XmlElement(name = "equity_in_percentage")
    protected BigDecimal equityInPercentage;
    @XmlElement(name = "total_debt_ratio")
    protected BigDecimal totalDebtRatio;

    /**
     * Gets the value of the preTaxProfitMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreTaxProfitMargin() {
        return preTaxProfitMargin;
    }

    /**
     * Sets the value of the preTaxProfitMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreTaxProfitMargin(BigDecimal value) {
        this.preTaxProfitMargin = value;
    }

    /**
     * Gets the value of the returnOnCapitalEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnCapitalEmployed() {
        return returnOnCapitalEmployed;
    }

    /**
     * Sets the value of the returnOnCapitalEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnCapitalEmployed(BigDecimal value) {
        this.returnOnCapitalEmployed = value;
    }

    /**
     * Gets the value of the returnOnTotalAssetsEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnTotalAssetsEmployed() {
        return returnOnTotalAssetsEmployed;
    }

    /**
     * Sets the value of the returnOnTotalAssetsEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnTotalAssetsEmployed(BigDecimal value) {
        this.returnOnTotalAssetsEmployed = value;
    }

    /**
     * Gets the value of the returnOnNetAssetsEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnNetAssetsEmployed() {
        return returnOnNetAssetsEmployed;
    }

    /**
     * Sets the value of the returnOnNetAssetsEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnNetAssetsEmployed(BigDecimal value) {
        this.returnOnNetAssetsEmployed = value;
    }

    /**
     * Gets the value of the salesOrNetWorkingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesOrNetWorkingCapital() {
        return salesOrNetWorkingCapital;
    }

    /**
     * Sets the value of the salesOrNetWorkingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesOrNetWorkingCapital(BigDecimal value) {
        this.salesOrNetWorkingCapital = value;
    }

    /**
     * Gets the value of the stockTurnoverRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockTurnoverRatio() {
        return stockTurnoverRatio;
    }

    /**
     * Sets the value of the stockTurnoverRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockTurnoverRatio(BigDecimal value) {
        this.stockTurnoverRatio = value;
    }

    /**
     * Gets the value of the debtorDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtorDays() {
        return debtorDays;
    }

    /**
     * Sets the value of the debtorDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtorDays(BigDecimal value) {
        this.debtorDays = value;
    }

    /**
     * Gets the value of the creditorDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditorDays() {
        return creditorDays;
    }

    /**
     * Sets the value of the creditorDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditorDays(BigDecimal value) {
        this.creditorDays = value;
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
     * Gets the value of the liquidityRatioOrAcidTest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiquidityRatioOrAcidTest() {
        return liquidityRatioOrAcidTest;
    }

    /**
     * Sets the value of the liquidityRatioOrAcidTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiquidityRatioOrAcidTest(BigDecimal value) {
        this.liquidityRatioOrAcidTest = value;
    }

    /**
     * Gets the value of the currentDebtRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentDebtRatio() {
        return currentDebtRatio;
    }

    /**
     * Sets the value of the currentDebtRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentDebtRatio(BigDecimal value) {
        this.currentDebtRatio = value;
    }

    /**
     * Gets the value of the gearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGearing() {
        return gearing;
    }

    /**
     * Sets the value of the gearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGearing(BigDecimal value) {
        this.gearing = value;
    }

    /**
     * Gets the value of the equityInPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquityInPercentage() {
        return equityInPercentage;
    }

    /**
     * Sets the value of the equityInPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquityInPercentage(BigDecimal value) {
        this.equityInPercentage = value;
    }

    /**
     * Gets the value of the totalDebtRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebtRatio() {
        return totalDebtRatio;
    }

    /**
     * Sets the value of the totalDebtRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebtRatio(BigDecimal value) {
        this.totalDebtRatio = value;
    }

}
