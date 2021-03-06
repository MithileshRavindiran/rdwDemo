
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="contact_details" type="{http://www.webservices.nl/soap/}GCRContactDetails" minOccurs="0"/>
 *         &lt;element name="official_data" type="{http://www.webservices.nl/soap/}GCROfficialData" minOccurs="0"/>
 *         &lt;element name="history" type="{http://www.webservices.nl/soap/}GCRHistory" minOccurs="0"/>
 *         &lt;element name="sectors_of_industry" type="{http://www.webservices.nl/soap/}GCRSectorOfIndustryArray" minOccurs="0"/>
 *         &lt;element name="positions_in_other_companies" type="{http://www.webservices.nl/soap/}GCRJobTitleArray" minOccurs="0"/>
 *         &lt;element name="annual_figures" type="{http://www.webservices.nl/soap/}GCRAnnualFiguresArray" minOccurs="0"/>
 *         &lt;element name="financial_details" type="{http://www.webservices.nl/soap/}GCRFinancialDetails" minOccurs="0"/>
 *         &lt;element name="financial_calamities" type="{http://www.webservices.nl/soap/}GCRFinancialCalamityArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCompany", propOrder = {

})
public class GCRCompany {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "contact_details")
    protected GCRContactDetails contactDetails;
    @XmlElement(name = "official_data")
    protected GCROfficialData officialData;
    protected GCRHistory history;
    @XmlElement(name = "sectors_of_industry")
    protected GCRSectorOfIndustryArray sectorsOfIndustry;
    @XmlElement(name = "positions_in_other_companies")
    protected GCRJobTitleArray positionsInOtherCompanies;
    @XmlElement(name = "annual_figures")
    protected GCRAnnualFiguresArray annualFigures;
    @XmlElement(name = "financial_details")
    protected GCRFinancialDetails financialDetails;
    @XmlElement(name = "financial_calamities")
    protected GCRFinancialCalamityArray financialCalamities;

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

}
