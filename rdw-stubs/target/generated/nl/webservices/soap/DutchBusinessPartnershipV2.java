
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessPartnershipV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessPartnershipV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rsin_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="founding_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV2" minOccurs="0"/>
 *         &lt;element name="dissolution_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV2" minOccurs="0"/>
 *         &lt;element name="function_start_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV2" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limited_partnership_capital" type="{http://www.webservices.nl/soap/}DutchBusinessMoneyV2" minOccurs="0"/>
 *         &lt;element name="establishment_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV2" minOccurs="0"/>
 *         &lt;element name="correspondence_address" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV2" minOccurs="0"/>
 *         &lt;element name="silent_partners" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "DutchBusinessPartnershipV2", propOrder = {

})
public class DutchBusinessPartnershipV2 {

    @XmlElement(name = "dossier_number")
    protected String dossierNumber;
    @XmlElement(name = "rsin_number")
    protected String rsinNumber;
    protected String name;
    protected String registration;
    @XmlElement(name = "legal_form_text")
    protected String legalFormText;
    @XmlElement(name = "founding_date")
    protected DutchBusinessDateV2 foundingDate;
    @XmlElement(name = "dissolution_date")
    protected DutchBusinessDateV2 dissolutionDate;
    @XmlElement(name = "function_start_date")
    protected DutchBusinessDateV2 functionStartDate;
    protected String duration;
    @XmlElement(name = "limited_partnership_capital")
    protected DutchBusinessMoneyV2 limitedPartnershipCapital;
    @XmlElement(name = "establishment_address")
    protected DutchBusinessAddressV2 establishmentAddress;
    @XmlElement(name = "correspondence_address")
    protected DutchBusinessAddressV2 correspondenceAddress;
    @XmlElement(name = "silent_partners")
    protected Integer silentPartners;
    protected StringArray remarks;

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
     *     {@link DutchBusinessDateV2 }
     *     
     */
    public DutchBusinessDateV2 getFoundingDate() {
        return foundingDate;
    }

    /**
     * Sets the value of the foundingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV2 }
     *     
     */
    public void setFoundingDate(DutchBusinessDateV2 value) {
        this.foundingDate = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV2 }
     *     
     */
    public DutchBusinessDateV2 getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV2 }
     *     
     */
    public void setDissolutionDate(DutchBusinessDateV2 value) {
        this.dissolutionDate = value;
    }

    /**
     * Gets the value of the functionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV2 }
     *     
     */
    public DutchBusinessDateV2 getFunctionStartDate() {
        return functionStartDate;
    }

    /**
     * Sets the value of the functionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV2 }
     *     
     */
    public void setFunctionStartDate(DutchBusinessDateV2 value) {
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
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public DutchBusinessMoneyV2 getLimitedPartnershipCapital() {
        return limitedPartnershipCapital;
    }

    /**
     * Sets the value of the limitedPartnershipCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public void setLimitedPartnershipCapital(DutchBusinessMoneyV2 value) {
        this.limitedPartnershipCapital = value;
    }

    /**
     * Gets the value of the establishmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV2 }
     *     
     */
    public DutchBusinessAddressV2 getEstablishmentAddress() {
        return establishmentAddress;
    }

    /**
     * Sets the value of the establishmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV2 }
     *     
     */
    public void setEstablishmentAddress(DutchBusinessAddressV2 value) {
        this.establishmentAddress = value;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV2 }
     *     
     */
    public DutchBusinessAddressV2 getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV2 }
     *     
     */
    public void setCorrespondenceAddress(DutchBusinessAddressV2 value) {
        this.correspondenceAddress = value;
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
