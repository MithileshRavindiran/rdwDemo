
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompanyItselfCalamity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanyItselfCalamity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="contact_details" type="{http://www.webservices.nl/soap/}GCRContactDetails" minOccurs="0"/>
 *         &lt;element name="official_data" type="{http://www.webservices.nl/soap/}GCROfficialData" minOccurs="0"/>
 *         &lt;element name="history" type="{http://www.webservices.nl/soap/}GCRHistory" minOccurs="0"/>
 *         &lt;element name="sectors_of_industry" type="{http://www.webservices.nl/soap/}GCRSectorOfIndustryArray" minOccurs="0"/>
 *         &lt;element name="share_holders" type="{http://www.webservices.nl/soap/}GCRShareHolderArray" minOccurs="0"/>
 *         &lt;element name="branch_offices" type="{http://www.webservices.nl/soap/}GCRBranchOfficeArray" minOccurs="0"/>
 *         &lt;element name="participations" type="{http://www.webservices.nl/soap/}GCRParticipationArray" minOccurs="0"/>
 *         &lt;element name="import_export" type="{http://www.webservices.nl/soap/}GCRImportExport" minOccurs="0"/>
 *         &lt;element name="special_company_information" type="{http://www.webservices.nl/soap/}GCRSpecialCompanyInformationArray" minOccurs="0"/>
 *         &lt;element name="financial_calamities" type="{http://www.webservices.nl/soap/}GCRFinancialCalamityArray" minOccurs="0"/>
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
@XmlType(name = "GCRCompanyItselfCalamity", propOrder = {

})
public class GCRCompanyItselfCalamity {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "contact_details")
    protected GCRContactDetails contactDetails;
    @XmlElement(name = "official_data")
    protected GCROfficialData officialData;
    protected GCRHistory history;
    @XmlElement(name = "sectors_of_industry")
    protected GCRSectorOfIndustryArray sectorsOfIndustry;
    @XmlElement(name = "share_holders")
    protected GCRShareHolderArray shareHolders;
    @XmlElement(name = "branch_offices")
    protected GCRBranchOfficeArray branchOffices;
    protected GCRParticipationArray participations;
    @XmlElement(name = "import_export")
    protected GCRImportExport importExport;
    @XmlElement(name = "special_company_information")
    protected GCRSpecialCompanyInformationArray specialCompanyInformation;
    @XmlElement(name = "financial_calamities")
    protected GCRFinancialCalamityArray financialCalamities;
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
     * Gets the value of the shareHolders property.
     * 
     * @return
     *     possible object is
     *     {@link GCRShareHolderArray }
     *     
     */
    public GCRShareHolderArray getShareHolders() {
        return shareHolders;
    }

    /**
     * Sets the value of the shareHolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRShareHolderArray }
     *     
     */
    public void setShareHolders(GCRShareHolderArray value) {
        this.shareHolders = value;
    }

    /**
     * Gets the value of the branchOffices property.
     * 
     * @return
     *     possible object is
     *     {@link GCRBranchOfficeArray }
     *     
     */
    public GCRBranchOfficeArray getBranchOffices() {
        return branchOffices;
    }

    /**
     * Sets the value of the branchOffices property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRBranchOfficeArray }
     *     
     */
    public void setBranchOffices(GCRBranchOfficeArray value) {
        this.branchOffices = value;
    }

    /**
     * Gets the value of the participations property.
     * 
     * @return
     *     possible object is
     *     {@link GCRParticipationArray }
     *     
     */
    public GCRParticipationArray getParticipations() {
        return participations;
    }

    /**
     * Sets the value of the participations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRParticipationArray }
     *     
     */
    public void setParticipations(GCRParticipationArray value) {
        this.participations = value;
    }

    /**
     * Gets the value of the importExport property.
     * 
     * @return
     *     possible object is
     *     {@link GCRImportExport }
     *     
     */
    public GCRImportExport getImportExport() {
        return importExport;
    }

    /**
     * Sets the value of the importExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRImportExport }
     *     
     */
    public void setImportExport(GCRImportExport value) {
        this.importExport = value;
    }

    /**
     * Gets the value of the specialCompanyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GCRSpecialCompanyInformationArray }
     *     
     */
    public GCRSpecialCompanyInformationArray getSpecialCompanyInformation() {
        return specialCompanyInformation;
    }

    /**
     * Sets the value of the specialCompanyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRSpecialCompanyInformationArray }
     *     
     */
    public void setSpecialCompanyInformation(GCRSpecialCompanyInformationArray value) {
        this.specialCompanyInformation = value;
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
