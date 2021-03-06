
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDossierExtendedPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDossierExtendedPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MainBranchIndication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MainBranchDossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MainBranchSubDossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ImportIndication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExportIndication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactTitle1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactTitle2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactInitials" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactSurname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactGender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuthorizedShareCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AuthorizedShareCapitalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaidUpShareCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaidUpShareCapitalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedShareCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IssuedShareCapitalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FoundingDate" type="{http://www.webservices.nl/soap/}BusinessDate" minOccurs="0"/>
 *         &lt;element name="ContinuationDate" type="{http://www.webservices.nl/soap/}BusinessDate" minOccurs="0"/>
 *         &lt;element name="EstablishmentDate" type="{http://www.webservices.nl/soap/}BusinessDate" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDossierExtendedPart", propOrder = {

})
public class BusinessDossierExtendedPart {

    @XmlElement(name = "MainBranchIndication")
    protected Boolean mainBranchIndication;
    @XmlElement(name = "MainBranchDossierNo", required = true)
    protected String mainBranchDossierNo;
    @XmlElement(name = "MainBranchSubDossierNo", required = true)
    protected String mainBranchSubDossierNo;
    @XmlElement(name = "ImportIndication")
    protected Boolean importIndication;
    @XmlElement(name = "ExportIndication")
    protected Boolean exportIndication;
    @XmlElement(name = "LegalName", required = true)
    protected String legalName;
    @XmlElement(name = "ContactTitle1", required = true)
    protected String contactTitle1;
    @XmlElement(name = "ContactTitle2", required = true)
    protected String contactTitle2;
    @XmlElement(name = "ContactInitials", required = true)
    protected String contactInitials;
    @XmlElement(name = "ContactPrefix", required = true)
    protected String contactPrefix;
    @XmlElement(name = "ContactSurname", required = true)
    protected String contactSurname;
    @XmlElement(name = "ContactGender", required = true)
    protected String contactGender;
    @XmlElement(name = "AuthorizedShareCapital")
    protected Long authorizedShareCapital;
    @XmlElement(name = "AuthorizedShareCapitalCurrency")
    protected String authorizedShareCapitalCurrency;
    @XmlElement(name = "PaidUpShareCapital")
    protected Long paidUpShareCapital;
    @XmlElement(name = "PaidUpShareCapitalCurrency")
    protected String paidUpShareCapitalCurrency;
    @XmlElement(name = "IssuedShareCapital")
    protected Long issuedShareCapital;
    @XmlElement(name = "IssuedShareCapitalCurrency")
    protected String issuedShareCapitalCurrency;
    @XmlElement(name = "FoundingDate")
    protected BusinessDate foundingDate;
    @XmlElement(name = "ContinuationDate")
    protected BusinessDate continuationDate;
    @XmlElement(name = "EstablishmentDate")
    protected BusinessDate establishmentDate;

    /**
     * Gets the value of the mainBranchIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainBranchIndication() {
        return mainBranchIndication;
    }

    /**
     * Sets the value of the mainBranchIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainBranchIndication(Boolean value) {
        this.mainBranchIndication = value;
    }

    /**
     * Gets the value of the mainBranchDossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainBranchDossierNo() {
        return mainBranchDossierNo;
    }

    /**
     * Sets the value of the mainBranchDossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainBranchDossierNo(String value) {
        this.mainBranchDossierNo = value;
    }

    /**
     * Gets the value of the mainBranchSubDossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainBranchSubDossierNo() {
        return mainBranchSubDossierNo;
    }

    /**
     * Sets the value of the mainBranchSubDossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainBranchSubDossierNo(String value) {
        this.mainBranchSubDossierNo = value;
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
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the contactTitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTitle1() {
        return contactTitle1;
    }

    /**
     * Sets the value of the contactTitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTitle1(String value) {
        this.contactTitle1 = value;
    }

    /**
     * Gets the value of the contactTitle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTitle2() {
        return contactTitle2;
    }

    /**
     * Sets the value of the contactTitle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTitle2(String value) {
        this.contactTitle2 = value;
    }

    /**
     * Gets the value of the contactInitials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInitials() {
        return contactInitials;
    }

    /**
     * Sets the value of the contactInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInitials(String value) {
        this.contactInitials = value;
    }

    /**
     * Gets the value of the contactPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPrefix() {
        return contactPrefix;
    }

    /**
     * Sets the value of the contactPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPrefix(String value) {
        this.contactPrefix = value;
    }

    /**
     * Gets the value of the contactSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSurname() {
        return contactSurname;
    }

    /**
     * Sets the value of the contactSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSurname(String value) {
        this.contactSurname = value;
    }

    /**
     * Gets the value of the contactGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactGender() {
        return contactGender;
    }

    /**
     * Sets the value of the contactGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactGender(String value) {
        this.contactGender = value;
    }

    /**
     * Gets the value of the authorizedShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthorizedShareCapital() {
        return authorizedShareCapital;
    }

    /**
     * Sets the value of the authorizedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthorizedShareCapital(Long value) {
        this.authorizedShareCapital = value;
    }

    /**
     * Gets the value of the authorizedShareCapitalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedShareCapitalCurrency() {
        return authorizedShareCapitalCurrency;
    }

    /**
     * Sets the value of the authorizedShareCapitalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedShareCapitalCurrency(String value) {
        this.authorizedShareCapitalCurrency = value;
    }

    /**
     * Gets the value of the paidUpShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaidUpShareCapital() {
        return paidUpShareCapital;
    }

    /**
     * Sets the value of the paidUpShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaidUpShareCapital(Long value) {
        this.paidUpShareCapital = value;
    }

    /**
     * Gets the value of the paidUpShareCapitalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidUpShareCapitalCurrency() {
        return paidUpShareCapitalCurrency;
    }

    /**
     * Sets the value of the paidUpShareCapitalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidUpShareCapitalCurrency(String value) {
        this.paidUpShareCapitalCurrency = value;
    }

    /**
     * Gets the value of the issuedShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssuedShareCapital() {
        return issuedShareCapital;
    }

    /**
     * Sets the value of the issuedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssuedShareCapital(Long value) {
        this.issuedShareCapital = value;
    }

    /**
     * Gets the value of the issuedShareCapitalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedShareCapitalCurrency() {
        return issuedShareCapitalCurrency;
    }

    /**
     * Sets the value of the issuedShareCapitalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedShareCapitalCurrency(String value) {
        this.issuedShareCapitalCurrency = value;
    }

    /**
     * Gets the value of the foundingDate property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDate }
     *     
     */
    public BusinessDate getFoundingDate() {
        return foundingDate;
    }

    /**
     * Sets the value of the foundingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDate }
     *     
     */
    public void setFoundingDate(BusinessDate value) {
        this.foundingDate = value;
    }

    /**
     * Gets the value of the continuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDate }
     *     
     */
    public BusinessDate getContinuationDate() {
        return continuationDate;
    }

    /**
     * Sets the value of the continuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDate }
     *     
     */
    public void setContinuationDate(BusinessDate value) {
        this.continuationDate = value;
    }

    /**
     * Gets the value of the establishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDate }
     *     
     */
    public BusinessDate getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     * Sets the value of the establishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDate }
     *     
     */
    public void setEstablishmentDate(BusinessDate value) {
        this.establishmentDate = value;
    }

}
