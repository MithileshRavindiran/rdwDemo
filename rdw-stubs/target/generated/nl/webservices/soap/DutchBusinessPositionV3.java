
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessPositionV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessPositionV3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="functionary" type="{http://www.webservices.nl/soap/}DutchBusinessPersonV3" minOccurs="0"/>
 *         &lt;element name="organisation" type="{http://www.webservices.nl/soap/}DutchBusinessOrganizationReferenceV3" minOccurs="0"/>
 *         &lt;element name="residential_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="correspondence_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="establishment_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="longest_serving" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="function_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="function_registration_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="function_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="function_authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_authorization_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_authorization_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="function_authorization_signing_power" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_authorization_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="authorization_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorization_establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorization_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="authorization_end_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="authorization_constraints" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="inauguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inauguration_function" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inauguration_duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inauguration_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="inauguration_body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="under_receivership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rights_against_third_parties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="release_of_covenant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_since" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="date_joined" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessPositionV3", propOrder = {

})
public class DutchBusinessPositionV3 {

    protected DutchBusinessPersonV3 functionary;
    protected DutchBusinessOrganizationReferenceV3 organisation;
    @XmlElement(name = "residential_address")
    protected DutchBusinessAddressV3 residentialAddress;
    @XmlElement(name = "correspondence_address")
    protected DutchBusinessAddressV3 correspondenceAddress;
    @XmlElement(name = "establishment_address")
    protected DutchBusinessAddressV3 establishmentAddress;
    @XmlElement(name = "longest_serving")
    protected Boolean longestServing;
    @XmlElement(name = "function_type")
    protected String functionType;
    @XmlElement(name = "function_description")
    protected String functionDescription;
    @XmlElement(name = "function_title")
    protected String functionTitle;
    @XmlElement(name = "function_start_date")
    protected DutchBusinessDateV3 functionStartDate;
    @XmlElement(name = "function_registration_date")
    protected DutchBusinessDateV3 functionRegistrationDate;
    @XmlElement(name = "function_end_date")
    protected DutchBusinessDateV3 functionEndDate;
    @XmlElement(name = "function_authorization")
    protected String functionAuthorization;
    @XmlElement(name = "function_authorization_description")
    protected String functionAuthorizationDescription;
    @XmlElement(name = "function_authorization_start_date")
    protected DutchBusinessDateV3 functionAuthorizationStartDate;
    @XmlElement(name = "function_authorization_signing_power")
    protected String functionAuthorizationSigningPower;
    @XmlElement(name = "function_authorization_end_date")
    protected DutchBusinessDateV3 functionAuthorizationEndDate;
    @XmlElement(name = "authorization_description")
    protected String authorizationDescription;
    @XmlElement(name = "authorization_establishment_number")
    protected String authorizationEstablishmentNumber;
    @XmlElement(name = "authorization_start_date")
    protected DutchBusinessDateV3 authorizationStartDate;
    @XmlElement(name = "authorization_end_date")
    protected DutchBusinessDateV3 authorizationEndDate;
    @XmlElement(name = "authorization_constraints")
    protected StringArray authorizationConstraints;
    protected String inauguration;
    @XmlElement(name = "inauguration_function")
    protected String inaugurationFunction;
    @XmlElement(name = "inauguration_duration")
    protected String inaugurationDuration;
    @XmlElement(name = "inauguration_date")
    protected DutchBusinessDateV3 inaugurationDate;
    @XmlElement(name = "inauguration_body")
    protected String inaugurationBody;
    @XmlElement(name = "under_receivership")
    protected String underReceivership;
    @XmlElement(name = "rights_against_third_parties")
    protected String rightsAgainstThirdParties;
    @XmlElement(name = "release_of_covenant")
    protected String releaseOfCovenant;
    @XmlElement(name = "date_since")
    protected DutchBusinessDateV3 dateSince;
    @XmlElement(name = "date_joined")
    protected DutchBusinessDateV3 dateJoined;
    protected StringArray remarks;

    /**
     * Gets the value of the functionary property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPersonV3 }
     *     
     */
    public DutchBusinessPersonV3 getFunctionary() {
        return functionary;
    }

    /**
     * Sets the value of the functionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPersonV3 }
     *     
     */
    public void setFunctionary(DutchBusinessPersonV3 value) {
        this.functionary = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessOrganizationReferenceV3 }
     *     
     */
    public DutchBusinessOrganizationReferenceV3 getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessOrganizationReferenceV3 }
     *     
     */
    public void setOrganisation(DutchBusinessOrganizationReferenceV3 value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the residentialAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getResidentialAddress() {
        return residentialAddress;
    }

    /**
     * Sets the value of the residentialAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setResidentialAddress(DutchBusinessAddressV3 value) {
        this.residentialAddress = value;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setCorrespondenceAddress(DutchBusinessAddressV3 value) {
        this.correspondenceAddress = value;
    }

    /**
     * Gets the value of the establishmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getEstablishmentAddress() {
        return establishmentAddress;
    }

    /**
     * Sets the value of the establishmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setEstablishmentAddress(DutchBusinessAddressV3 value) {
        this.establishmentAddress = value;
    }

    /**
     * Gets the value of the longestServing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLongestServing() {
        return longestServing;
    }

    /**
     * Sets the value of the longestServing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLongestServing(Boolean value) {
        this.longestServing = value;
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
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getFunctionStartDate() {
        return functionStartDate;
    }

    /**
     * Sets the value of the functionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setFunctionStartDate(DutchBusinessDateV3 value) {
        this.functionStartDate = value;
    }

    /**
     * Gets the value of the functionRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getFunctionRegistrationDate() {
        return functionRegistrationDate;
    }

    /**
     * Sets the value of the functionRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setFunctionRegistrationDate(DutchBusinessDateV3 value) {
        this.functionRegistrationDate = value;
    }

    /**
     * Gets the value of the functionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getFunctionEndDate() {
        return functionEndDate;
    }

    /**
     * Sets the value of the functionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setFunctionEndDate(DutchBusinessDateV3 value) {
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
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getFunctionAuthorizationStartDate() {
        return functionAuthorizationStartDate;
    }

    /**
     * Sets the value of the functionAuthorizationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setFunctionAuthorizationStartDate(DutchBusinessDateV3 value) {
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
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getFunctionAuthorizationEndDate() {
        return functionAuthorizationEndDate;
    }

    /**
     * Sets the value of the functionAuthorizationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setFunctionAuthorizationEndDate(DutchBusinessDateV3 value) {
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
     * Gets the value of the authorizationEstablishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationEstablishmentNumber() {
        return authorizationEstablishmentNumber;
    }

    /**
     * Sets the value of the authorizationEstablishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationEstablishmentNumber(String value) {
        this.authorizationEstablishmentNumber = value;
    }

    /**
     * Gets the value of the authorizationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getAuthorizationStartDate() {
        return authorizationStartDate;
    }

    /**
     * Sets the value of the authorizationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setAuthorizationStartDate(DutchBusinessDateV3 value) {
        this.authorizationStartDate = value;
    }

    /**
     * Gets the value of the authorizationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getAuthorizationEndDate() {
        return authorizationEndDate;
    }

    /**
     * Sets the value of the authorizationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setAuthorizationEndDate(DutchBusinessDateV3 value) {
        this.authorizationEndDate = value;
    }

    /**
     * Gets the value of the authorizationConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getAuthorizationConstraints() {
        return authorizationConstraints;
    }

    /**
     * Sets the value of the authorizationConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setAuthorizationConstraints(StringArray value) {
        this.authorizationConstraints = value;
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
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getInaugurationDate() {
        return inaugurationDate;
    }

    /**
     * Sets the value of the inaugurationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setInaugurationDate(DutchBusinessDateV3 value) {
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
     * Gets the value of the dateSince property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDateSince() {
        return dateSince;
    }

    /**
     * Sets the value of the dateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDateSince(DutchBusinessDateV3 value) {
        this.dateSince = value;
    }

    /**
     * Gets the value of the dateJoined property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDateJoined() {
        return dateJoined;
    }

    /**
     * Sets the value of the dateJoined property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDateJoined(DutchBusinessDateV3 value) {
        this.dateJoined = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setRemarks(StringArray value) {
        this.remarks = value;
    }

}
