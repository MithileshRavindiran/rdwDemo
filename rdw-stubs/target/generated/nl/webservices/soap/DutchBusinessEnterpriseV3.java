
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessEnterpriseV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessEnterpriseV3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incorporation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="founding_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="discontinuation_date" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="date_since" type="{http://www.webservices.nl/soap/}DutchBusinessDateV3" minOccurs="0"/>
 *         &lt;element name="personnel" type="{http://www.webservices.nl/soap/}DutchBusinessPersonnelInfoV3" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="sbi_codes" type="{http://www.webservices.nl/soap/}DutchBusinessSbiCodeV3Array" minOccurs="0"/>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessEnterpriseV3", propOrder = {

})
public class DutchBusinessEnterpriseV3 {

    protected String name;
    protected String registration;
    @XmlElement(name = "legal_form_text")
    protected String legalFormText;
    protected String activity;
    protected String description;
    @XmlElement(name = "incorporation_date")
    protected DutchBusinessDateV3 incorporationDate;
    @XmlElement(name = "founding_date")
    protected DutchBusinessDateV3 foundingDate;
    @XmlElement(name = "discontinuation_date")
    protected DutchBusinessDateV3 discontinuationDate;
    @XmlElement(name = "date_since")
    protected DutchBusinessDateV3 dateSince;
    protected DutchBusinessPersonnelInfoV3 personnel;
    protected StringArray remarks;
    @XmlElement(name = "sbi_codes")
    protected DutchBusinessSbiCodeV3Array sbiCodes;
    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;

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
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the incorporationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getIncorporationDate() {
        return incorporationDate;
    }

    /**
     * Sets the value of the incorporationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setIncorporationDate(DutchBusinessDateV3 value) {
        this.incorporationDate = value;
    }

    /**
     * Gets the value of the foundingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getFoundingDate() {
        return foundingDate;
    }

    /**
     * Sets the value of the foundingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setFoundingDate(DutchBusinessDateV3 value) {
        this.foundingDate = value;
    }

    /**
     * Gets the value of the discontinuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public DutchBusinessDateV3 getDiscontinuationDate() {
        return discontinuationDate;
    }

    /**
     * Sets the value of the discontinuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDateV3 }
     *     
     */
    public void setDiscontinuationDate(DutchBusinessDateV3 value) {
        this.discontinuationDate = value;
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
     * Gets the value of the personnel property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPersonnelInfoV3 }
     *     
     */
    public DutchBusinessPersonnelInfoV3 getPersonnel() {
        return personnel;
    }

    /**
     * Sets the value of the personnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPersonnelInfoV3 }
     *     
     */
    public void setPersonnel(DutchBusinessPersonnelInfoV3 value) {
        this.personnel = value;
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

    /**
     * Gets the value of the sbiCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessSbiCodeV3Array }
     *     
     */
    public DutchBusinessSbiCodeV3Array getSbiCodes() {
        return sbiCodes;
    }

    /**
     * Sets the value of the sbiCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessSbiCodeV3Array }
     *     
     */
    public void setSbiCodes(DutchBusinessSbiCodeV3Array value) {
        this.sbiCodes = value;
    }

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

}
