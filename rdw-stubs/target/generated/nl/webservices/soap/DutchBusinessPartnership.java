
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessPartnership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessPartnership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rsin_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="founding_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="dissolution_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="function_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDate" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limited_partnership_capital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="limited_partnership_capital_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_house_number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="establishment_house_number_addition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="silent_partners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessPartnership", propOrder = {

})
public class DutchBusinessPartnership {

    @XmlElement(name = "dossier_number")
    protected String dossierNumber;
    @XmlElement(name = "rsin_number")
    protected String rsinNumber;
    protected String name;
    protected String registration;
    protected String status;
    @XmlElement(name = "legal_form_text")
    protected String legalFormText;
    @XmlElement(name = "founding_date")
    protected DutchBusinessDate foundingDate;
    @XmlElement(name = "dissolution_date")
    protected DutchBusinessDate dissolutionDate;
    @XmlElement(name = "function_start_date")
    protected DutchBusinessDate functionStartDate;
    protected String duration;
    @XmlElement(name = "limited_partnership_capital")
    protected Long limitedPartnershipCapital;
    @XmlElement(name = "limited_partnership_capital_currency")
    protected String limitedPartnershipCapitalCurrency;
    @XmlElement(name = "establishment_postcode")
    protected String establishmentPostcode;
    @XmlElement(name = "establishment_city")
    protected String establishmentCity;
    @XmlElement(name = "establishment_street")
    protected String establishmentStreet;
    @XmlElement(name = "establishment_house_number")
    protected Integer establishmentHouseNumber;
    @XmlElement(name = "establishment_house_number_addition")
    protected String establishmentHouseNumberAddition;
    @XmlElement(name = "establishment_country")
    protected String establishmentCountry;
    @XmlElement(name = "silent_partners")
    protected Integer silentPartners;

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
     * Gets the value of the rsinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsinNumber() {
        return rsinNumber;
    }

    /**
     * Sets the value of the rsinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsinNumber(String value) {
        this.rsinNumber = value;
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
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistration(String value) {
        this.registration = value;
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

    /**
     * Gets the value of the legalFormText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormText() {
        return legalFormText;
    }

    /**
     * Sets the value of the legalFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormText(String value) {
        this.legalFormText = value;
    }

    /**
     * Gets the value of the foundingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getFoundingDate() {
        return foundingDate;
    }

    /**
     * Sets the value of the foundingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setFoundingDate(DutchBusinessDate value) {
        this.foundingDate = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDate }
     *     
     */
    public DutchBusinessDate getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDate }
     *     
     */
    public void setDissolutionDate(DutchBusinessDate value) {
        this.dissolutionDate = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the limitedPartnershipCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimitedPartnershipCapital() {
        return limitedPartnershipCapital;
    }

    /**
     * Sets the value of the limitedPartnershipCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimitedPartnershipCapital(Long value) {
        this.limitedPartnershipCapital = value;
    }

    /**
     * Gets the value of the limitedPartnershipCapitalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedPartnershipCapitalCurrency() {
        return limitedPartnershipCapitalCurrency;
    }

    /**
     * Sets the value of the limitedPartnershipCapitalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedPartnershipCapitalCurrency(String value) {
        this.limitedPartnershipCapitalCurrency = value;
    }

    /**
     * Gets the value of the establishmentPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentPostcode() {
        return establishmentPostcode;
    }

    /**
     * Sets the value of the establishmentPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentPostcode(String value) {
        this.establishmentPostcode = value;
    }

    /**
     * Gets the value of the establishmentCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCity() {
        return establishmentCity;
    }

    /**
     * Sets the value of the establishmentCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCity(String value) {
        this.establishmentCity = value;
    }

    /**
     * Gets the value of the establishmentStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentStreet() {
        return establishmentStreet;
    }

    /**
     * Sets the value of the establishmentStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentStreet(String value) {
        this.establishmentStreet = value;
    }

    /**
     * Gets the value of the establishmentHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstablishmentHouseNumber() {
        return establishmentHouseNumber;
    }

    /**
     * Sets the value of the establishmentHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstablishmentHouseNumber(Integer value) {
        this.establishmentHouseNumber = value;
    }

    /**
     * Gets the value of the establishmentHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentHouseNumberAddition() {
        return establishmentHouseNumberAddition;
    }

    /**
     * Sets the value of the establishmentHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentHouseNumberAddition(String value) {
        this.establishmentHouseNumberAddition = value;
    }

    /**
     * Gets the value of the establishmentCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCountry() {
        return establishmentCountry;
    }

    /**
     * Sets the value of the establishmentCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCountry(String value) {
        this.establishmentCountry = value;
    }

    /**
     * Gets the value of the silentPartners property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSilentPartners() {
        return silentPartners;
    }

    /**
     * Sets the value of the silentPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSilentPartners(Integer value) {
        this.silentPartners = value;
    }

}
