
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeBalanceSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBalanceSheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="year_end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="number_of_weeks" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consolidated_accounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="land_and_buildings" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="plant_and_machinery" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_tangible_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_tangible_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="goodwill" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_intangible_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_intangible_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="investments" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="loans_to_group" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_loans" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="miscellaneous_fixed_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_other_fixed_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_fixed_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="raw_materials" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="work_in_progress" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="finished_goods" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_inventories" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_inventories" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trade_receivables" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="group_receivables" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="receivables_due_after1year" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="miscellaneous_receivables" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_receivables" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="cash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_current_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_current_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_assets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trade_payables" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bank_liabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_loans_or_finance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="group_payables" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="miscellaneous_liabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_current_liabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trade_payables_due_after1year" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bank_liabilities_due_after1year" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_loans_or_finance_due_after1year" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="group_payables_due_after1year" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="miscellaneous_liabilities_due_after1year" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_long_term_liabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_liabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="called_up_share_capital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="share_premium" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="revenue_reserves" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="other_reserves" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="total_shareholders_equity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBalanceSheet", propOrder = {

})
public class CreditsafeBalanceSheet {

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
    @XmlElement(name = "land_and_buildings")
    protected BigDecimal landAndBuildings;
    @XmlElement(name = "plant_and_machinery")
    protected BigDecimal plantAndMachinery;
    @XmlElement(name = "other_tangible_assets")
    protected BigDecimal otherTangibleAssets;
    @XmlElement(name = "total_tangible_assets")
    protected BigDecimal totalTangibleAssets;
    protected BigDecimal goodwill;
    @XmlElement(name = "other_intangible_assets")
    protected BigDecimal otherIntangibleAssets;
    @XmlElement(name = "total_intangible_assets")
    protected BigDecimal totalIntangibleAssets;
    protected BigDecimal investments;
    @XmlElement(name = "loans_to_group")
    protected BigDecimal loansToGroup;
    @XmlElement(name = "other_loans")
    protected BigDecimal otherLoans;
    @XmlElement(name = "miscellaneous_fixed_assets")
    protected BigDecimal miscellaneousFixedAssets;
    @XmlElement(name = "total_other_fixed_assets")
    protected BigDecimal totalOtherFixedAssets;
    @XmlElement(name = "total_fixed_assets")
    protected BigDecimal totalFixedAssets;
    @XmlElement(name = "raw_materials")
    protected BigDecimal rawMaterials;
    @XmlElement(name = "work_in_progress")
    protected BigDecimal workInProgress;
    @XmlElement(name = "finished_goods")
    protected BigDecimal finishedGoods;
    @XmlElement(name = "other_inventories")
    protected BigDecimal otherInventories;
    @XmlElement(name = "total_inventories")
    protected BigDecimal totalInventories;
    @XmlElement(name = "trade_receivables")
    protected BigDecimal tradeReceivables;
    @XmlElement(name = "group_receivables")
    protected BigDecimal groupReceivables;
    @XmlElement(name = "receivables_due_after1year")
    protected BigDecimal receivablesDueAfter1Year;
    @XmlElement(name = "miscellaneous_receivables")
    protected BigDecimal miscellaneousReceivables;
    @XmlElement(name = "total_receivables")
    protected BigDecimal totalReceivables;
    protected BigDecimal cash;
    @XmlElement(name = "other_current_assets")
    protected BigDecimal otherCurrentAssets;
    @XmlElement(name = "total_current_assets")
    protected BigDecimal totalCurrentAssets;
    @XmlElement(name = "total_assets")
    protected BigDecimal totalAssets;
    @XmlElement(name = "trade_payables")
    protected BigDecimal tradePayables;
    @XmlElement(name = "bank_liabilities")
    protected BigDecimal bankLiabilities;
    @XmlElement(name = "other_loans_or_finance")
    protected BigDecimal otherLoansOrFinance;
    @XmlElement(name = "group_payables")
    protected BigDecimal groupPayables;
    @XmlElement(name = "miscellaneous_liabilities")
    protected BigDecimal miscellaneousLiabilities;
    @XmlElement(name = "total_current_liabilities")
    protected BigDecimal totalCurrentLiabilities;
    @XmlElement(name = "trade_payables_due_after1year")
    protected BigDecimal tradePayablesDueAfter1Year;
    @XmlElement(name = "bank_liabilities_due_after1year")
    protected BigDecimal bankLiabilitiesDueAfter1Year;
    @XmlElement(name = "other_loans_or_finance_due_after1year")
    protected BigDecimal otherLoansOrFinanceDueAfter1Year;
    @XmlElement(name = "group_payables_due_after1year")
    protected BigDecimal groupPayablesDueAfter1Year;
    @XmlElement(name = "miscellaneous_liabilities_due_after1year")
    protected BigDecimal miscellaneousLiabilitiesDueAfter1Year;
    @XmlElement(name = "total_long_term_liabilities")
    protected BigDecimal totalLongTermLiabilities;
    @XmlElement(name = "total_liabilities")
    protected BigDecimal totalLiabilities;
    @XmlElement(name = "called_up_share_capital")
    protected BigDecimal calledUpShareCapital;
    @XmlElement(name = "share_premium")
    protected BigDecimal sharePremium;
    @XmlElement(name = "revenue_reserves")
    protected BigDecimal revenueReserves;
    @XmlElement(name = "other_reserves")
    protected BigDecimal otherReserves;
    @XmlElement(name = "total_shareholders_equity")
    protected BigDecimal totalShareholdersEquity;

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
     * Gets the value of the landAndBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLandAndBuildings() {
        return landAndBuildings;
    }

    /**
     * Sets the value of the landAndBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLandAndBuildings(BigDecimal value) {
        this.landAndBuildings = value;
    }

    /**
     * Gets the value of the plantAndMachinery property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlantAndMachinery() {
        return plantAndMachinery;
    }

    /**
     * Sets the value of the plantAndMachinery property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlantAndMachinery(BigDecimal value) {
        this.plantAndMachinery = value;
    }

    /**
     * Gets the value of the otherTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherTangibleAssets() {
        return otherTangibleAssets;
    }

    /**
     * Sets the value of the otherTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherTangibleAssets(BigDecimal value) {
        this.otherTangibleAssets = value;
    }

    /**
     * Gets the value of the totalTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTangibleAssets() {
        return totalTangibleAssets;
    }

    /**
     * Sets the value of the totalTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTangibleAssets(BigDecimal value) {
        this.totalTangibleAssets = value;
    }

    /**
     * Gets the value of the goodwill property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGoodwill() {
        return goodwill;
    }

    /**
     * Sets the value of the goodwill property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGoodwill(BigDecimal value) {
        this.goodwill = value;
    }

    /**
     * Gets the value of the otherIntangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherIntangibleAssets() {
        return otherIntangibleAssets;
    }

    /**
     * Sets the value of the otherIntangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherIntangibleAssets(BigDecimal value) {
        this.otherIntangibleAssets = value;
    }

    /**
     * Gets the value of the totalIntangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIntangibleAssets() {
        return totalIntangibleAssets;
    }

    /**
     * Sets the value of the totalIntangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIntangibleAssets(BigDecimal value) {
        this.totalIntangibleAssets = value;
    }

    /**
     * Gets the value of the investments property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvestments() {
        return investments;
    }

    /**
     * Sets the value of the investments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvestments(BigDecimal value) {
        this.investments = value;
    }

    /**
     * Gets the value of the loansToGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoansToGroup() {
        return loansToGroup;
    }

    /**
     * Sets the value of the loansToGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoansToGroup(BigDecimal value) {
        this.loansToGroup = value;
    }

    /**
     * Gets the value of the otherLoans property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherLoans() {
        return otherLoans;
    }

    /**
     * Sets the value of the otherLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherLoans(BigDecimal value) {
        this.otherLoans = value;
    }

    /**
     * Gets the value of the miscellaneousFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscellaneousFixedAssets() {
        return miscellaneousFixedAssets;
    }

    /**
     * Sets the value of the miscellaneousFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscellaneousFixedAssets(BigDecimal value) {
        this.miscellaneousFixedAssets = value;
    }

    /**
     * Gets the value of the totalOtherFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOtherFixedAssets() {
        return totalOtherFixedAssets;
    }

    /**
     * Sets the value of the totalOtherFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOtherFixedAssets(BigDecimal value) {
        this.totalOtherFixedAssets = value;
    }

    /**
     * Gets the value of the totalFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFixedAssets() {
        return totalFixedAssets;
    }

    /**
     * Sets the value of the totalFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFixedAssets(BigDecimal value) {
        this.totalFixedAssets = value;
    }

    /**
     * Gets the value of the rawMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRawMaterials() {
        return rawMaterials;
    }

    /**
     * Sets the value of the rawMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRawMaterials(BigDecimal value) {
        this.rawMaterials = value;
    }

    /**
     * Gets the value of the workInProgress property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkInProgress() {
        return workInProgress;
    }

    /**
     * Sets the value of the workInProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkInProgress(BigDecimal value) {
        this.workInProgress = value;
    }

    /**
     * Gets the value of the finishedGoods property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinishedGoods() {
        return finishedGoods;
    }

    /**
     * Sets the value of the finishedGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinishedGoods(BigDecimal value) {
        this.finishedGoods = value;
    }

    /**
     * Gets the value of the otherInventories property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherInventories() {
        return otherInventories;
    }

    /**
     * Sets the value of the otherInventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherInventories(BigDecimal value) {
        this.otherInventories = value;
    }

    /**
     * Gets the value of the totalInventories property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalInventories() {
        return totalInventories;
    }

    /**
     * Sets the value of the totalInventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalInventories(BigDecimal value) {
        this.totalInventories = value;
    }

    /**
     * Gets the value of the tradeReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradeReceivables() {
        return tradeReceivables;
    }

    /**
     * Sets the value of the tradeReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradeReceivables(BigDecimal value) {
        this.tradeReceivables = value;
    }

    /**
     * Gets the value of the groupReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupReceivables() {
        return groupReceivables;
    }

    /**
     * Sets the value of the groupReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupReceivables(BigDecimal value) {
        this.groupReceivables = value;
    }

    /**
     * Gets the value of the receivablesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivablesDueAfter1Year() {
        return receivablesDueAfter1Year;
    }

    /**
     * Sets the value of the receivablesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivablesDueAfter1Year(BigDecimal value) {
        this.receivablesDueAfter1Year = value;
    }

    /**
     * Gets the value of the miscellaneousReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscellaneousReceivables() {
        return miscellaneousReceivables;
    }

    /**
     * Sets the value of the miscellaneousReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscellaneousReceivables(BigDecimal value) {
        this.miscellaneousReceivables = value;
    }

    /**
     * Gets the value of the totalReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalReceivables() {
        return totalReceivables;
    }

    /**
     * Sets the value of the totalReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalReceivables(BigDecimal value) {
        this.totalReceivables = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCash(BigDecimal value) {
        this.cash = value;
    }

    /**
     * Gets the value of the otherCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    /**
     * Sets the value of the otherCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCurrentAssets(BigDecimal value) {
        this.otherCurrentAssets = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentAssets(BigDecimal value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAssets(BigDecimal value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the tradePayables property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradePayables() {
        return tradePayables;
    }

    /**
     * Sets the value of the tradePayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradePayables(BigDecimal value) {
        this.tradePayables = value;
    }

    /**
     * Gets the value of the bankLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankLiabilities() {
        return bankLiabilities;
    }

    /**
     * Sets the value of the bankLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankLiabilities(BigDecimal value) {
        this.bankLiabilities = value;
    }

    /**
     * Gets the value of the otherLoansOrFinance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherLoansOrFinance() {
        return otherLoansOrFinance;
    }

    /**
     * Sets the value of the otherLoansOrFinance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherLoansOrFinance(BigDecimal value) {
        this.otherLoansOrFinance = value;
    }

    /**
     * Gets the value of the groupPayables property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupPayables() {
        return groupPayables;
    }

    /**
     * Sets the value of the groupPayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupPayables(BigDecimal value) {
        this.groupPayables = value;
    }

    /**
     * Gets the value of the miscellaneousLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscellaneousLiabilities() {
        return miscellaneousLiabilities;
    }

    /**
     * Sets the value of the miscellaneousLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscellaneousLiabilities(BigDecimal value) {
        this.miscellaneousLiabilities = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentLiabilities(BigDecimal value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the tradePayablesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradePayablesDueAfter1Year() {
        return tradePayablesDueAfter1Year;
    }

    /**
     * Sets the value of the tradePayablesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradePayablesDueAfter1Year(BigDecimal value) {
        this.tradePayablesDueAfter1Year = value;
    }

    /**
     * Gets the value of the bankLiabilitiesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankLiabilitiesDueAfter1Year() {
        return bankLiabilitiesDueAfter1Year;
    }

    /**
     * Sets the value of the bankLiabilitiesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankLiabilitiesDueAfter1Year(BigDecimal value) {
        this.bankLiabilitiesDueAfter1Year = value;
    }

    /**
     * Gets the value of the otherLoansOrFinanceDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherLoansOrFinanceDueAfter1Year() {
        return otherLoansOrFinanceDueAfter1Year;
    }

    /**
     * Sets the value of the otherLoansOrFinanceDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherLoansOrFinanceDueAfter1Year(BigDecimal value) {
        this.otherLoansOrFinanceDueAfter1Year = value;
    }

    /**
     * Gets the value of the groupPayablesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupPayablesDueAfter1Year() {
        return groupPayablesDueAfter1Year;
    }

    /**
     * Sets the value of the groupPayablesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupPayablesDueAfter1Year(BigDecimal value) {
        this.groupPayablesDueAfter1Year = value;
    }

    /**
     * Gets the value of the miscellaneousLiabilitiesDueAfter1Year property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscellaneousLiabilitiesDueAfter1Year() {
        return miscellaneousLiabilitiesDueAfter1Year;
    }

    /**
     * Sets the value of the miscellaneousLiabilitiesDueAfter1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscellaneousLiabilitiesDueAfter1Year(BigDecimal value) {
        this.miscellaneousLiabilitiesDueAfter1Year = value;
    }

    /**
     * Gets the value of the totalLongTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLongTermLiabilities() {
        return totalLongTermLiabilities;
    }

    /**
     * Sets the value of the totalLongTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLongTermLiabilities(BigDecimal value) {
        this.totalLongTermLiabilities = value;
    }

    /**
     * Gets the value of the totalLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLiabilities() {
        return totalLiabilities;
    }

    /**
     * Sets the value of the totalLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLiabilities(BigDecimal value) {
        this.totalLiabilities = value;
    }

    /**
     * Gets the value of the calledUpShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalledUpShareCapital() {
        return calledUpShareCapital;
    }

    /**
     * Sets the value of the calledUpShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalledUpShareCapital(BigDecimal value) {
        this.calledUpShareCapital = value;
    }

    /**
     * Gets the value of the sharePremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSharePremium() {
        return sharePremium;
    }

    /**
     * Sets the value of the sharePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSharePremium(BigDecimal value) {
        this.sharePremium = value;
    }

    /**
     * Gets the value of the revenueReserves property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRevenueReserves() {
        return revenueReserves;
    }

    /**
     * Sets the value of the revenueReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRevenueReserves(BigDecimal value) {
        this.revenueReserves = value;
    }

    /**
     * Gets the value of the otherReserves property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherReserves() {
        return otherReserves;
    }

    /**
     * Sets the value of the otherReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherReserves(BigDecimal value) {
        this.otherReserves = value;
    }

    /**
     * Gets the value of the totalShareholdersEquity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalShareholdersEquity() {
        return totalShareholdersEquity;
    }

    /**
     * Sets the value of the totalShareholdersEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalShareholdersEquity(BigDecimal value) {
        this.totalShareholdersEquity = value;
    }

}
