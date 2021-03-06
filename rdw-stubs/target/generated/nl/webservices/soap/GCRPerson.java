
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_person_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="personal_details" type="{http://www.webservices.nl/soap/}GCRPersonalDetails" minOccurs="0"/>
 *         &lt;element name="telephone_number" type="{http://www.webservices.nl/soap/}GCRTelephoneNumber" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.webservices.nl/soap/}GCRAddress" minOccurs="0"/>
 *         &lt;element name="birth_information" type="{http://www.webservices.nl/soap/}GCRBirthInformation" minOccurs="0"/>
 *         &lt;element name="job_titles" type="{http://www.webservices.nl/soap/}GCRJobTitleArray" minOccurs="0"/>
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
@XmlType(name = "GCRPerson", propOrder = {

})
public class GCRPerson {

    @XmlElement(name = "graydon_person_id", required = true)
    protected BigInteger graydonPersonId;
    @XmlElement(name = "personal_details")
    protected GCRPersonalDetails personalDetails;
    @XmlElement(name = "telephone_number")
    protected GCRTelephoneNumber telephoneNumber;
    protected GCRAddress address;
    @XmlElement(name = "birth_information")
    protected GCRBirthInformation birthInformation;
    @XmlElement(name = "job_titles")
    protected GCRJobTitleArray jobTitles;
    @XmlElement(name = "financial_calamities")
    protected GCRFinancialCalamityArray financialCalamities;

    /**
     * Gets the value of the graydonPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGraydonPersonId() {
        return graydonPersonId;
    }

    /**
     * Sets the value of the graydonPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGraydonPersonId(BigInteger value) {
        this.graydonPersonId = value;
    }

    /**
     * Gets the value of the personalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPersonalDetails }
     *     
     */
    public GCRPersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    /**
     * Sets the value of the personalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPersonalDetails }
     *     
     */
    public void setPersonalDetails(GCRPersonalDetails value) {
        this.personalDetails = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link GCRTelephoneNumber }
     *     
     */
    public GCRTelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRTelephoneNumber }
     *     
     */
    public void setTelephoneNumber(GCRTelephoneNumber value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAddress }
     *     
     */
    public GCRAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAddress }
     *     
     */
    public void setAddress(GCRAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the birthInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GCRBirthInformation }
     *     
     */
    public GCRBirthInformation getBirthInformation() {
        return birthInformation;
    }

    /**
     * Sets the value of the birthInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRBirthInformation }
     *     
     */
    public void setBirthInformation(GCRBirthInformation value) {
        this.birthInformation = value;
    }

    /**
     * Gets the value of the jobTitles property.
     * 
     * @return
     *     possible object is
     *     {@link GCRJobTitleArray }
     *     
     */
    public GCRJobTitleArray getJobTitles() {
        return jobTitles;
    }

    /**
     * Sets the value of the jobTitles property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRJobTitleArray }
     *     
     */
    public void setJobTitles(GCRJobTitleArray value) {
        this.jobTitles = value;
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
