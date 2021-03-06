
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="function_registration_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="function_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="function_authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_authorization_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_authorization_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="function_authorization_signing_power" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_authorization_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="authorization_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorization_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="authorization_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="inauguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inauguration_function" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inauguration_duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inauguration_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="inauguration_body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="under_receivership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rights_against_third_parties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="release_of_covenant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_deceased" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="date_of_birth" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="place_of_birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country_of_birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="house_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="house_number_addition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone_numbers" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="date_since" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="date_joined" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessPosition", propOrder = {

})
public class DutchBusinessPosition {

    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;
    @XmlElement(name = "dossier_number")
    protected String dossierNumber;
    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    protected String name;
    @XmlElement(name = "first_name")
    protected String firstName;
    protected String title;
    protected String initials;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "function_type")
    protected String functionType;
    @XmlElement(name = "function_description")
    protected String functionDescription;
    @XmlElement(name = "function_title")
    protected String functionTitle;
    @XmlElement(name = "function_start_date")
    protected DutchBusinessDate functionStartDate;
    @XmlElement(name = "function_registration_date")
    protected DutchBusinessDate functionRegistrationDate;
    @XmlElement(name = "function_end_date")
    protected DutchBusinessDate functionEndDate;
    @XmlElement(name = "function_authorization")
    protected String functionAuthorization;
    @XmlElement(name = "function_authorization_description")
    protected String functionAuthorizationDescription;
    @XmlElement(name = "function_authorization_start_date")
    protected DutchBusinessDate functionAuthorizationStartDate;
    @XmlElement(name = "function_authorization_signing_power")
    protected String functionAuthorizationSigningPower;
    @XmlElement(name = "function_authorization_end_date")
    protected DutchBusinessDate functionAuthorizationEndDate;
    @XmlElement(name = "authorization_description")
    protected String authorizationDescription;
    @XmlElement(name = "authorization_start_date")
    protected DutchBusinessDate authorizationStartDate;
    @XmlElement(name = "authorization_end_date")
    protected DutchBusinessDate authorizationEndDate;
    protected String inauguration;
    @XmlElement(name = "inauguration_function")
    protected String inaugurationFunction;
    @XmlElement(name = "inauguration_duration")
    protected String inaugurationDuration;
    @XmlElement(name = "inauguration_date")
    protected DutchBusinessDate inaugurationDate;
    @XmlElement(name = "inauguration_body")
    protected String inaugurationBody;
    @XmlElement(name = "under_receivership")
    protected String underReceivership;
    @XmlElement(name = "rights_against_third_parties")
    protected String rightsAgainstThirdParties;
    @XmlElement(name = "release_of_covenant")
    protected String releaseOfCovenant;
    @XmlElement(name = "date_deceased")
    protected DutchBusinessDate dateDeceased;
    @XmlElement(name = "date_of_birth")
    protected DutchBusinessDate dateOfBirth;
    @XmlElement(name = "place_of_birth")
    protected String placeOfBirth;
    @XmlElement(name = "country_of_birth")
    protected String countryOfBirth;
    protected String postcode;
    protected String city;
    protected String street;
    @XmlElement(name = "house_number")
    protected Integer houseNumber;
    @XmlElement(name = "house_number_addition")
    protected String houseNumberAddition;
    protected String country;
    @XmlElement(name = "telephone_numbers")
    protected StringArray telephoneNumbers;
    @XmlElement(name = "date_since")
    protected DutchBusinessDate dateSince;
    @XmlElement(name = "date_joined")
    protected DutchBusinessDate dateJoined;
    protected String status;

    /**
     * Gets the value of the tradeNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getTradeNames() {
        return tradeNames;
    }

    /**
     * Sets the value of the tradeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setTradeNames(StringArray value) {
        this.tradeNames = value;
    }

    /**
     * Gets the value of the dossierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNumber() {
        return dossierNumber;
    }

    /**
     * Sets the value of the dossierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNumber(String value) {
        this.dossierNumber = value;
    }

    /**
     * Gets the value of the establishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentNumber() {
        return establishmentNumber;
    }

    /**
     * Sets the value of the establishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentNumber(String value) {
        this.establishmentNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the functionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionType() {
        return functionType;
    }

    /**
     * Sets the value of the functionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionType(String value) {
        this.functionType = value;
    }

    /**
     * Gets the value of the functionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionDescription() {
        return functionDescription;
    }

    /**
     * Sets the value of the functionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionDescription(String value) {
        this.functionDescription = value;
    }

    /**
     * Gets the value of the functionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionTitle() {
        return functionTitle;
    }

    /**
     * Sets the value of the functionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionTitle(String value) {
        this.functionTitle = value;
    }

    /**
     * Gets the value of the functionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getFunctionStartDate() {
        return functionStartDate;
    }

    /**
     * Sets the value of the functionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setFunctionStartDate(DutchBusinessDate value) {
        this.functionStartDate = value;
    }

    /**
     * Gets the value of the functionRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getFunctionRegistrationDate() {
        return functionRegistrationDate;
    }

    /**
     * Sets the value of the functionRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setFunctionRegistrationDate(DutchBusinessDate value) {
        this.functionRegistrationDate = value;
    }

    /**
     * Gets the value of the functionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getFunctionEndDate() {
        return functionEndDate;
    }

    /**
     * Sets the value of the functionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setFunctionEndDate(DutchBusinessDate value) {
        this.functionEndDate = value;
    }

    /**
     * Gets the value of the functionAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionAuthorization() {
        return functionAuthorization;
    }

    /**
     * Sets the value of the functionAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionAuthorization(String value) {
        this.functionAuthorization = value;
    }

    /**
     * Gets the value of the functionAuthorizationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionAuthorizationDescription() {
        return functionAuthorizationDescription;
    }

    /**
     * Sets the value of the functionAuthorizationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionAuthorizationDescription(String value) {
        this.functionAuthorizationDescription = value;
    }

    /**
     * Gets the value of the functionAuthorizationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getFunctionAuthorizationStartDate() {
        return functionAuthorizationStartDate;
    }

    /**
     * Sets the value of the functionAuthorizationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setFunctionAuthorizationStartDate(DutchBusinessDate value) {
        this.functionAuthorizationStartDate = value;
    }

    /**
     * Gets the value of the functionAuthorizationSigningPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionAuthorizationSigningPower() {
        return functionAuthorizationSigningPower;
    }

    /**
     * Sets the value of the functionAuthorizationSigningPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionAuthorizationSigningPower(String value) {
        this.functionAuthorizationSigningPower = value;
    }

    /**
     * Gets the value of the functionAuthorizationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getFunctionAuthorizationEndDate() {
        return functionAuthorizationEndDate;
    }

    /**
     * Sets the value of the functionAuthorizationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setFunctionAuthorizationEndDate(DutchBusinessDate value) {
        this.functionAuthorizationEndDate = value;
    }

    /**
     * Gets the value of the authorizationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationDescription() {
        return authorizationDescription;
    }

    /**
     * Sets the value of the authorizationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationDescription(String value) {
        this.authorizationDescription = value;
    }

    /**
     * Gets the value of the authorizationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getAuthorizationStartDate() {
        return authorizationStartDate;
    }

    /**
     * Sets the value of the authorizationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setAuthorizationStartDate(DutchBusinessDate value) {
        this.authorizationStartDate = value;
    }

    /**
     * Gets the value of the authorizationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getAuthorizationEndDate() {
        return authorizationEndDate;
    }

    /**
     * Sets the value of the authorizationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setAuthorizationEndDate(DutchBusinessDate value) {
        this.authorizationEndDate = value;
    }

    /**
     * Gets the value of the inauguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInauguration() {
        return inauguration;
    }

    /**
     * Sets the value of the inauguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInauguration(String value) {
        this.inauguration = value;
    }

    /**
     * Gets the value of the inaugurationFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInaugurationFunction() {
        return inaugurationFunction;
    }

    /**
     * Sets the value of the inaugurationFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInaugurationFunction(String value) {
        this.inaugurationFunction = value;
    }

    /**
     * Gets the value of the inaugurationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInaugurationDuration() {
        return inaugurationDuration;
    }

    /**
     * Sets the value of the inaugurationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInaugurationDuration(String value) {
        this.inaugurationDuration = value;
    }

    /**
     * Gets the value of the inaugurationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getInaugurationDate() {
        return inaugurationDate;
    }

    /**
     * Sets the value of the inaugurationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setInaugurationDate(DutchBusinessDate value) {
        this.inaugurationDate = value;
    }

    /**
     * Gets the value of the inaugurationBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInaugurationBody() {
        return inaugurationBody;
    }

    /**
     * Sets the value of the inaugurationBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInaugurationBody(String value) {
        this.inaugurationBody = value;
    }

    /**
     * Gets the value of the underReceivership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderReceivership() {
        return underReceivership;
    }

    /**
     * Sets the value of the underReceivership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderReceivership(String value) {
        this.underReceivership = value;
    }

    /**
     * Gets the value of the rightsAgainstThirdParties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsAgainstThirdParties() {
        return rightsAgainstThirdParties;
    }

    /**
     * Sets the value of the rightsAgainstThirdParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsAgainstThirdParties(String value) {
        this.rightsAgainstThirdParties = value;
    }

    /**
     * Gets the value of the releaseOfCovenant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseOfCovenant() {
        return releaseOfCovenant;
    }

    /**
     * Sets the value of the releaseOfCovenant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseOfCovenant(String value) {
        this.releaseOfCovenant = value;
    }

    /**
     * Gets the value of the dateDeceased property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDateDeceased() {
        return dateDeceased;
    }

    /**
     * Sets the value of the dateDeceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDateDeceased(DutchBusinessDate value) {
        this.dateDeceased = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDateOfBirth(DutchBusinessDate value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfBirth(String value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHouseNumber(Integer value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumberAddition() {
        return houseNumberAddition;
    }

    /**
     * Sets the value of the houseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumberAddition(String value) {
        this.houseNumberAddition = value;
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
     * Gets the value of the telephoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getTelephoneNumbers() {
        return telephoneNumbers;
    }

    /**
     * Sets the value of the telephoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setTelephoneNumbers(StringArray value) {
        this.telephoneNumbers = value;
    }

    /**
     * Gets the value of the dateSince property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDateSince() {
        return dateSince;
    }

    /**
     * Sets the value of the dateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDateSince(DutchBusinessDate value) {
        this.dateSince = value;
    }

    /**
     * Gets the value of the dateJoined property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDateJoined() {
        return dateJoined;
    }

    /**
     * Sets the value of the dateJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDateJoined(DutchBusinessDate value) {
        this.dateJoined = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
