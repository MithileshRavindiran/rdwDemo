
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRBankAndInsurerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRBankAndInsurerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="financial_year" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="month_end_financial_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="day_end_financial_year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="length_financial_year_in_months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reliable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filing" type="{http://www.webservices.nl/soap/}GCRFiling" minOccurs="0"/>
 *         &lt;element name="financial_year_graydon" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="currency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scale_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scale_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_of_drawing_up" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="balance_sheet_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="balance_sheet_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank_and_insurer_key_figures" type="{http://www.webservices.nl/soap/}GCRBankAndInsurerKeyFigures" minOccurs="0"/>
 *         &lt;element name="ratios" type="{http://www.webservices.nl/soap/}GCRRatioArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRBankAndInsurerData", propOrder = {

})
public class GCRBankAndInsurerData {

    @XmlElement(name = "financial_year")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar financialYear;
    @XmlElement(name = "month_end_financial_year")
    protected Integer monthEndFinancialYear;
    @XmlElement(name = "day_end_financial_year")
    protected Integer dayEndFinancialYear;
    @XmlElement(name = "length_financial_year_in_months")
    protected Integer lengthFinancialYearInMonths;
    protected Boolean reliable;
    @XmlElement(name = "account_code")
    protected String accountCode;
    @XmlElement(name = "account_text")
    protected String accountText;
    protected GCRFiling filing;
    @XmlElement(name = "financial_year_graydon")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar financialYearGraydon;
    @XmlElement(name = "currency_code")
    protected String currencyCode;
    @XmlElement(name = "scale_code")
    protected String scaleCode;
    @XmlElement(name = "scale_text")
    protected String scaleText;
    @XmlElement(name = "date_of_drawing_up")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDrawingUp;
    @XmlElement(name = "balance_sheet_code")
    protected String balanceSheetCode;
    @XmlElement(name = "balance_sheet_text")
    protected String balanceSheetText;
    @XmlElement(name = "bank_and_insurer_key_figures")
    protected GCRBankAndInsurerKeyFigures bankAndInsurerKeyFigures;
    protected GCRRatioArray ratios;

    /**
     * Gets the value of the financialYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinancialYear() {
        return financialYear;
    }

    /**
     * Sets the value of the financialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinancialYear(XMLGregorianCalendar value) {
        this.financialYear = value;
    }

    /**
     * Gets the value of the monthEndFinancialYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonthEndFinancialYear() {
        return monthEndFinancialYear;
    }

    /**
     * Sets the value of the monthEndFinancialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonthEndFinancialYear(Integer value) {
        this.monthEndFinancialYear = value;
    }

    /**
     * Gets the value of the dayEndFinancialYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayEndFinancialYear() {
        return dayEndFinancialYear;
    }

    /**
     * Sets the value of the dayEndFinancialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayEndFinancialYear(Integer value) {
        this.dayEndFinancialYear = value;
    }

    /**
     * Gets the value of the lengthFinancialYearInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLengthFinancialYearInMonths() {
        return lengthFinancialYearInMonths;
    }

    /**
     * Sets the value of the lengthFinancialYearInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLengthFinancialYearInMonths(Integer value) {
        this.lengthFinancialYearInMonths = value;
    }

    /**
     * Gets the value of the reliable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReliable() {
        return reliable;
    }

    /**
     * Sets the value of the reliable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReliable(Boolean value) {
        this.reliable = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the accountText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountText() {
        return accountText;
    }

    /**
     * Sets the value of the accountText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountText(String value) {
        this.accountText = value;
    }

    /**
     * Gets the value of the filing property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFiling }
     *     
     */
    public GCRFiling getFiling() {
        return filing;
    }

    /**
     * Sets the value of the filing property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFiling }
     *     
     */
    public void setFiling(GCRFiling value) {
        this.filing = value;
    }

    /**
     * Gets the value of the financialYearGraydon property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinancialYearGraydon() {
        return financialYearGraydon;
    }

    /**
     * Sets the value of the financialYearGraydon property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinancialYearGraydon(XMLGregorianCalendar value) {
        this.financialYearGraydon = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the scaleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleCode() {
        return scaleCode;
    }

    /**
     * Sets the value of the scaleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleCode(String value) {
        this.scaleCode = value;
    }

    /**
     * Gets the value of the scaleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleText() {
        return scaleText;
    }

    /**
     * Sets the value of the scaleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleText(String value) {
        this.scaleText = value;
    }

    /**
     * Gets the value of the dateOfDrawingUp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDrawingUp() {
        return dateOfDrawingUp;
    }

    /**
     * Sets the value of the dateOfDrawingUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDrawingUp(XMLGregorianCalendar value) {
        this.dateOfDrawingUp = value;
    }

    /**
     * Gets the value of the balanceSheetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceSheetCode() {
        return balanceSheetCode;
    }

    /**
     * Sets the value of the balanceSheetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceSheetCode(String value) {
        this.balanceSheetCode = value;
    }

    /**
     * Gets the value of the balanceSheetText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceSheetText() {
        return balanceSheetText;
    }

    /**
     * Sets the value of the balanceSheetText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceSheetText(String value) {
        this.balanceSheetText = value;
    }

    /**
     * Gets the value of the bankAndInsurerKeyFigures property.
     * 
     * @return
     *     possible object is
     *     {@link GCRBankAndInsurerKeyFigures }
     *     
     */
    public GCRBankAndInsurerKeyFigures getBankAndInsurerKeyFigures() {
        return bankAndInsurerKeyFigures;
    }

    /**
     * Sets the value of the bankAndInsurerKeyFigures property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRBankAndInsurerKeyFigures }
     *     
     */
    public void setBankAndInsurerKeyFigures(GCRBankAndInsurerKeyFigures value) {
        this.bankAndInsurerKeyFigures = value;
    }

    /**
     * Gets the value of the ratios property.
     * 
     * @return
     *     possible object is
     *     {@link GCRRatioArray }
     *     
     */
    public GCRRatioArray getRatios() {
        return ratios;
    }

    /**
     * Sets the value of the ratios property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRRatioArray }
     *     
     */
    public void setRatios(GCRRatioArray value) {
        this.ratios = value;
    }

}
