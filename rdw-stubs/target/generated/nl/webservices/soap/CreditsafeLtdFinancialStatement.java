
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeLtdFinancialStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdFinancialStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="profit_and_loss" type="{http://www.webservices.nl/soap/}CreditsafeProfitAndLossFigures" minOccurs="0"/>
 *         &lt;element name="balance_sheet" type="{http://www.webservices.nl/soap/}CreditsafeBalanceSheet" minOccurs="0"/>
 *         &lt;element name="other_financials" type="{http://www.webservices.nl/soap/}CreditsafeOtherFinancials" minOccurs="0"/>
 *         &lt;element name="ratios" type="{http://www.webservices.nl/soap/}CreditsafeFinancialRatios" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdFinancialStatement", propOrder = {

})
public class CreditsafeLtdFinancialStatement {

    @XmlElement(name = "profit_and_loss")
    protected CreditsafeProfitAndLossFigures profitAndLoss;
    @XmlElement(name = "balance_sheet")
    protected CreditsafeBalanceSheet balanceSheet;
    @XmlElement(name = "other_financials")
    protected CreditsafeOtherFinancials otherFinancials;
    protected CreditsafeFinancialRatios ratios;

    /**
     * Gets the value of the profitAndLoss property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeProfitAndLossFigures }
     *     
     */
    public CreditsafeProfitAndLossFigures getProfitAndLoss() {
        return profitAndLoss;
    }

    /**
     * Sets the value of the profitAndLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeProfitAndLossFigures }
     *     
     */
    public void setProfitAndLoss(CreditsafeProfitAndLossFigures value) {
        this.profitAndLoss = value;
    }

    /**
     * Gets the value of the balanceSheet property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBalanceSheet }
     *     
     */
    public CreditsafeBalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    /**
     * Sets the value of the balanceSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBalanceSheet }
     *     
     */
    public void setBalanceSheet(CreditsafeBalanceSheet value) {
        this.balanceSheet = value;
    }

    /**
     * Gets the value of the otherFinancials property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeOtherFinancials }
     *     
     */
    public CreditsafeOtherFinancials getOtherFinancials() {
        return otherFinancials;
    }

    /**
     * Sets the value of the otherFinancials property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeOtherFinancials }
     *     
     */
    public void setOtherFinancials(CreditsafeOtherFinancials value) {
        this.otherFinancials = value;
    }

    /**
     * Gets the value of the ratios property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeFinancialRatios }
     *     
     */
    public CreditsafeFinancialRatios getRatios() {
        return ratios;
    }

    /**
     * Sets the value of the ratios property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeFinancialRatios }
     *     
     */
    public void setRatios(CreditsafeFinancialRatios value) {
        this.ratios = value;
    }

}
