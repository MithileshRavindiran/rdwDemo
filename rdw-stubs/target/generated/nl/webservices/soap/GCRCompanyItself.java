
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompanyItself complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanyItself">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="contact_details" type="{http://www.webservices.nl/soap/}GCRContactDetails" minOccurs="0"/>
 *         &lt;element name="official_data" type="{http://www.webservices.nl/soap/}GCROfficialData" minOccurs="0"/>
 *         &lt;element name="history" type="{http://www.webservices.nl/soap/}GCRHistory" minOccurs="0"/>
 *         &lt;element name="positions_in_other_companies" type="{http://www.webservices.nl/soap/}GCRJobTitleArray" minOccurs="0"/>
 *         &lt;element name="annual_figures" type="{http://www.webservices.nl/soap/}GCRAnnualFiguresArray" minOccurs="0"/>
 *         &lt;element name="financial_details" type="{http://www.webservices.nl/soap/}GCRFinancialDetails" minOccurs="0"/>
 *         &lt;element name="financial_calamities" type="{http://www.webservices.nl/soap/}GCRFinancialCalamityArray" minOccurs="0"/>
 *         &lt;element name="personnel" type="{http://www.webservices.nl/soap/}GCRPersonnel" minOccurs="0"/>
 *         &lt;element name="credit_advice_data" type="{http://www.webservices.nl/soap/}GCRCreditAdviceData" minOccurs="0"/>
 *         &lt;element name="sectors_of_industry" type="{http://www.webservices.nl/soap/}GCRSectorOfIndustryArray" minOccurs="0"/>
 *         &lt;element name="calamity" type="{http://www.webservices.nl/soap/}GCRCalamity" minOccurs="0"/>
 *         &lt;element name="payment_information" type="{http://www.webservices.nl/soap/}GCRPaymentInformationArray" minOccurs="0"/>
 *         &lt;element name="declarations_of_liability" type="{http://www.webservices.nl/soap/}GCRDeclarationOfLiabilityArray" minOccurs="0"/>
 *         &lt;element name="concern_liaisons" type="{http://www.webservices.nl/soap/}GCRLiaisonArray" minOccurs="0"/>
 *         &lt;element name="company_management" type="{http://www.webservices.nl/soap/}GCRCompanyManagement" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCompanyItself", propOrder = {

})
public class GCRCompanyItself {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "contact_details")
    protected GCRContactDetails contactDetails;
    @XmlElement(name = "official_data")
    protected GCROfficialData officialData;
    protected GCRHistory history;
    @XmlElement(name = "positions_in_other_companies")
    protected GCRJobTitleArray positionsInOtherCompanies;
    @XmlElement(name = "annual_figures")
    protected GCRAnnualFiguresArray annualFigures;
    @XmlElement(name = "financial_details")
    protected GCRFinancialDetails financialDetails;
    @XmlElement(name = "financial_calamities")
    protected GCRFinancialCalamityArray financialCalamities;
    protected GCRPersonnel personnel;
    @XmlElement(name = "credit_advice_data")
    protected GCRCreditAdviceData creditAdviceData;
    @XmlElement(name = "sectors_of_industry")
    protected GCRSectorOfIndustryArray sectorsOfIndustry;
    protected GCRCalamity calamity;
    @XmlElement(name = "payment_information")
    protected GCRPaymentInformationArray paymentInformation;
    @XmlElement(name = "declarations_of_liability")
    protected GCRDeclarationOfLiabilityArray declarationsOfLiability;
    @XmlElement(name = "concern_liaisons")
    protected GCRLiaisonArray concernLiaisons;
    @XmlElement(name = "company_management")
    protected GCRCompanyManagement companyManagement;

    /**
     * Gets the value of the graydonCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGraydonCompanyId() {
        return graydonCompanyId;
    }

    /**
     * Sets the value of the graydonCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGraydonCompanyId(BigInteger value) {
        this.graydonCompanyId = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GCRContactDetails }
     *     
     */
    public GCRContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRContactDetails }
     *     
     */
    public void setContactDetails(GCRContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the officialData property.
     * 
     * @return
     *     possible object is
     *     {@link GCROfficialData }
     *     
     */
    public GCROfficialData getOfficialData() {
        return officialData;
    }

    /**
     * Sets the value of the officialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCROfficialData }
     *     
     */
    public void setOfficialData(GCROfficialData value) {
        this.officialData = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link GCRHistory }
     *     
     */
    public GCRHistory getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRHistory }
     *     
     */
    public void setHistory(GCRHistory value) {
        this.history = value;
    }

    /**
     * Gets the value of the positionsInOtherCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link GCRJobTitleArray }
     *     
     */
    public GCRJobTitleArray getPositionsInOtherCompanies() {
        return positionsInOtherCompanies;
    }

    /**
     * Sets the value of the positionsInOtherCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRJobTitleArray }
     *     
     */
    public void setPositionsInOtherCompanies(GCRJobTitleArray value) {
        this.positionsInOtherCompanies = value;
    }

    /**
     * Gets the value of the annualFigures property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAnnualFiguresArray }
     *     
     */
    public GCRAnnualFiguresArray getAnnualFigures() {
        return annualFigures;
    }

    /**
     * Sets the value of the annualFigures property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAnnualFiguresArray }
     *     
     */
    public void setAnnualFigures(GCRAnnualFiguresArray value) {
        this.annualFigures = value;
    }

    /**
     * Gets the value of the financialDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFinancialDetails }
     *     
     */
    public GCRFinancialDetails getFinancialDetails() {
        return financialDetails;
    }

    /**
     * Sets the value of the financialDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFinancialDetails }
     *     
     */
    public void setFinancialDetails(GCRFinancialDetails value) {
        this.financialDetails = value;
    }

    /**
     * Gets the value of the financialCalamities property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFinancialCalamityArray }
     *     
     */
    public GCRFinancialCalamityArray getFinancialCalamities() {
        return financialCalamities;
    }

    /**
     * Sets the value of the financialCalamities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFinancialCalamityArray }
     *     
     */
    public void setFinancialCalamities(GCRFinancialCalamityArray value) {
        this.financialCalamities = value;
    }

    /**
     * Gets the value of the personnel property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPersonnel }
     *     
     */
    public GCRPersonnel getPersonnel() {
        return personnel;
    }

    /**
     * Sets the value of the personnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPersonnel }
     *     
     */
    public void setPersonnel(GCRPersonnel value) {
        this.personnel = value;
    }

    /**
     * Gets the value of the creditAdviceData property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCreditAdviceData }
     *     
     */
    public GCRCreditAdviceData getCreditAdviceData() {
        return creditAdviceData;
    }

    /**
     * Sets the value of the creditAdviceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCreditAdviceData }
     *     
     */
    public void setCreditAdviceData(GCRCreditAdviceData value) {
        this.creditAdviceData = value;
    }

    /**
     * Gets the value of the sectorsOfIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link GCRSectorOfIndustryArray }
     *     
     */
    public GCRSectorOfIndustryArray getSectorsOfIndustry() {
        return sectorsOfIndustry;
    }

    /**
     * Sets the value of the sectorsOfIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRSectorOfIndustryArray }
     *     
     */
    public void setSectorsOfIndustry(GCRSectorOfIndustryArray value) {
        this.sectorsOfIndustry = value;
    }

    /**
     * Gets the value of the calamity property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCalamity }
     *     
     */
    public GCRCalamity getCalamity() {
        return calamity;
    }

    /**
     * Sets the value of the calamity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCalamity }
     *     
     */
    public void setCalamity(GCRCalamity value) {
        this.calamity = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPaymentInformationArray }
     *     
     */
    public GCRPaymentInformationArray getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPaymentInformationArray }
     *     
     */
    public void setPaymentInformation(GCRPaymentInformationArray value) {
        this.paymentInformation = value;
    }

    /**
     * Gets the value of the declarationsOfLiability property.
     * 
     * @return
     *     possible object is
     *     {@link GCRDeclarationOfLiabilityArray }
     *     
     */
    public GCRDeclarationOfLiabilityArray getDeclarationsOfLiability() {
        return declarationsOfLiability;
    }

    /**
     * Sets the value of the declarationsOfLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRDeclarationOfLiabilityArray }
     *     
     */
    public void setDeclarationsOfLiability(GCRDeclarationOfLiabilityArray value) {
        this.declarationsOfLiability = value;
    }

    /**
     * Gets the value of the concernLiaisons property.
     * 
     * @return
     *     possible object is
     *     {@link GCRLiaisonArray }
     *     
     */
    public GCRLiaisonArray getConcernLiaisons() {
        return concernLiaisons;
    }

    /**
     * Sets the value of the concernLiaisons property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRLiaisonArray }
     *     
     */
    public void setConcernLiaisons(GCRLiaisonArray value) {
        this.concernLiaisons = value;
    }

    /**
     * Gets the value of the companyManagement property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyManagement }
     *     
     */
    public GCRCompanyManagement getCompanyManagement() {
        return companyManagement;
    }

    /**
     * Sets the value of the companyManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyManagement }
     *     
     */
    public void setCompanyManagement(GCRCompanyManagement value) {
        this.companyManagement = value;
    }

}
