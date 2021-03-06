
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeBeBankruptcyEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBeBankruptcyEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bankruptcy_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street_of_registered_office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city_of_registered_office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode_of_registered_office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nace_bel_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nace_bel_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commercial_court" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_of_decreee_of_bankruptcy" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="closing_date_of_summons" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="name_of_trustee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street_of_trustee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city_of_trustee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode_of_trustee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBeBankruptcyEvent", propOrder = {

})
public class CreditsafeBeBankruptcyEvent {

    @XmlElement(name = "bankruptcy_type")
    protected String bankruptcyType;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "street_of_registered_office")
    protected String streetOfRegisteredOffice;
    @XmlElement(name = "city_of_registered_office")
    protected String cityOfRegisteredOffice;
    @XmlElement(name = "postcode_of_registered_office")
    protected String postcodeOfRegisteredOffice;
    @XmlElement(name = "nace_bel_code")
    protected String naceBelCode;
    @XmlElement(name = "nace_bel_description")
    protected String naceBelDescription;
    @XmlElement(name = "commercial_court")
    protected String commercialCourt;
    @XmlElement(name = "source_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sourceDate;
    protected String source;
    @XmlElement(name = "date_of_decreee_of_bankruptcy")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDecreeeOfBankruptcy;
    @XmlElement(name = "closing_date_of_summons")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closingDateOfSummons;
    @XmlElement(name = "name_of_trustee")
    protected String nameOfTrustee;
    @XmlElement(name = "street_of_trustee")
    protected String streetOfTrustee;
    @XmlElement(name = "city_of_trustee")
    protected String cityOfTrustee;
    @XmlElement(name = "postcode_of_trustee")
    protected String postcodeOfTrustee;

    /**
     * Gets the value of the bankruptcyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankruptcyType() {
        return bankruptcyType;
    }

    /**
     * Sets the value of the bankruptcyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankruptcyType(String value) {
        this.bankruptcyType = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the streetOfRegisteredOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetOfRegisteredOffice() {
        return streetOfRegisteredOffice;
    }

    /**
     * Sets the value of the streetOfRegisteredOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetOfRegisteredOffice(String value) {
        this.streetOfRegisteredOffice = value;
    }

    /**
     * Gets the value of the cityOfRegisteredOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfRegisteredOffice() {
        return cityOfRegisteredOffice;
    }

    /**
     * Sets the value of the cityOfRegisteredOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfRegisteredOffice(String value) {
        this.cityOfRegisteredOffice = value;
    }

    /**
     * Gets the value of the postcodeOfRegisteredOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeOfRegisteredOffice() {
        return postcodeOfRegisteredOffice;
    }

    /**
     * Sets the value of the postcodeOfRegisteredOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeOfRegisteredOffice(String value) {
        this.postcodeOfRegisteredOffice = value;
    }

    /**
     * Gets the value of the naceBelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaceBelCode() {
        return naceBelCode;
    }

    /**
     * Sets the value of the naceBelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaceBelCode(String value) {
        this.naceBelCode = value;
    }

    /**
     * Gets the value of the naceBelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaceBelDescription() {
        return naceBelDescription;
    }

    /**
     * Sets the value of the naceBelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaceBelDescription(String value) {
        this.naceBelDescription = value;
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
     * Gets the value of the sourceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceDate() {
        return sourceDate;
    }

    /**
     * Sets the value of the sourceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceDate(XMLGregorianCalendar value) {
        this.sourceDate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the dateOfDecreeeOfBankruptcy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDecreeeOfBankruptcy() {
        return dateOfDecreeeOfBankruptcy;
    }

    /**
     * Sets the value of the dateOfDecreeeOfBankruptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDecreeeOfBankruptcy(XMLGregorianCalendar value) {
        this.dateOfDecreeeOfBankruptcy = value;
    }

    /**
     * Gets the value of the closingDateOfSummons property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingDateOfSummons() {
        return closingDateOfSummons;
    }

    /**
     * Sets the value of the closingDateOfSummons property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosingDateOfSummons(XMLGregorianCalendar value) {
        this.closingDateOfSummons = value;
    }

    /**
     * Gets the value of the nameOfTrustee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfTrustee() {
        return nameOfTrustee;
    }

    /**
     * Sets the value of the nameOfTrustee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfTrustee(String value) {
        this.nameOfTrustee = value;
    }

    /**
     * Gets the value of the streetOfTrustee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetOfTrustee() {
        return streetOfTrustee;
    }

    /**
     * Sets the value of the streetOfTrustee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetOfTrustee(String value) {
        this.streetOfTrustee = value;
    }

    /**
     * Gets the value of the cityOfTrustee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfTrustee() {
        return cityOfTrustee;
    }

    /**
     * Sets the value of the cityOfTrustee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfTrustee(String value) {
        this.cityOfTrustee = value;
    }

    /**
     * Gets the value of the postcodeOfTrustee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeOfTrustee() {
        return postcodeOfTrustee;
    }

    /**
     * Sets the value of the postcodeOfTrustee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeOfTrustee(String value) {
        this.postcodeOfTrustee = value;
    }

}
