
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeLtdCompanyBasicInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdCompanyBasicInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registered_company_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company_registration_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vat_registration_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vat_registration_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateof_company_registration" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateof_starting_operations" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="commercial_court" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeof_ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="report_currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="principal_activity" type="{http://www.webservices.nl/soap/}CreditsafeCompanyActivity" minOccurs="0"/>
 *         &lt;element name="contact_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_telephone_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdCompanyBasicInformation", propOrder = {

})
public class CreditsafeLtdCompanyBasicInformation {

    @XmlElement(name = "business_name", required = true)
    protected String businessName;
    @XmlElement(name = "registered_company_name", required = true)
    protected String registeredCompanyName;
    @XmlElement(name = "company_registration_number")
    protected String companyRegistrationNumber;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(name = "vat_registration_number")
    protected String vatRegistrationNumber;
    @XmlElement(name = "vat_registration_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vatRegistrationDate;
    @XmlElement(name = "dateof_company_registration")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateofCompanyRegistration;
    @XmlElement(name = "dateof_starting_operations")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateofStartingOperations;
    @XmlElement(name = "commercial_court")
    protected String commercialCourt;
    @XmlElement(name = "legal_form")
    protected String legalForm;
    @XmlElement(name = "typeof_ownership")
    protected String typeofOwnership;
    @XmlElement(name = "company_status")
    protected String companyStatus;
    @XmlElement(name = "report_currency", required = true)
    protected String reportCurrency;
    @XmlElement(name = "principal_activity")
    protected CreditsafeCompanyActivity principalActivity;
    @XmlElement(name = "contact_address", required = true)
    protected String contactAddress;
    @XmlElement(name = "contact_telephone_number")
    protected String contactTelephoneNumber;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the registeredCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredCompanyName() {
        return registeredCompanyName;
    }

    /**
     * Sets the value of the registeredCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredCompanyName(String value) {
        this.registeredCompanyName = value;
    }

    /**
     * Gets the value of the companyRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    /**
     * Sets the value of the companyRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegistrationNumber(String value) {
        this.companyRegistrationNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the vatRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRegistrationNumber() {
        return vatRegistrationNumber;
    }

    /**
     * Sets the value of the vatRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRegistrationNumber(String value) {
        this.vatRegistrationNumber = value;
    }

    /**
     * Gets the value of the vatRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVatRegistrationDate() {
        return vatRegistrationDate;
    }

    /**
     * Sets the value of the vatRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVatRegistrationDate(XMLGregorianCalendar value) {
        this.vatRegistrationDate = value;
    }

    /**
     * Gets the value of the dateofCompanyRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateofCompanyRegistration() {
        return dateofCompanyRegistration;
    }

    /**
     * Sets the value of the dateofCompanyRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateofCompanyRegistration(XMLGregorianCalendar value) {
        this.dateofCompanyRegistration = value;
    }

    /**
     * Gets the value of the dateofStartingOperations property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateofStartingOperations() {
        return dateofStartingOperations;
    }

    /**
     * Sets the value of the dateofStartingOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateofStartingOperations(XMLGregorianCalendar value) {
        this.dateofStartingOperations = value;
    }

    /**
     * Gets the value of the commercialCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialCourt() {
        return commercialCourt;
    }

    /**
     * Sets the value of the commercialCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialCourt(String value) {
        this.commercialCourt = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the typeofOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeofOwnership() {
        return typeofOwnership;
    }

    /**
     * Sets the value of the typeofOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeofOwnership(String value) {
        this.typeofOwnership = value;
    }

    /**
     * Gets the value of the companyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStatus() {
        return companyStatus;
    }

    /**
     * Sets the value of the companyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStatus(String value) {
        this.companyStatus = value;
    }

    /**
     * Gets the value of the reportCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportCurrency() {
        return reportCurrency;
    }

    /**
     * Sets the value of the reportCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportCurrency(String value) {
        this.reportCurrency = value;
    }

    /**
     * Gets the value of the principalActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyActivity }
     *     
     */
    public CreditsafeCompanyActivity getPrincipalActivity() {
        return principalActivity;
    }

    /**
     * Sets the value of the principalActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyActivity }
     *     
     */
    public void setPrincipalActivity(CreditsafeCompanyActivity value) {
        this.principalActivity = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddress(String value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the contactTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTelephoneNumber() {
        return contactTelephoneNumber;
    }

    /**
     * Sets the value of the contactTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTelephoneNumber(String value) {
        this.contactTelephoneNumber = value;
    }

}
