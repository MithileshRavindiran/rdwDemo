
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeLtdCompanyIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdCompanyIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="basic_information" type="{http://www.webservices.nl/soap/}CreditsafeLtdCompanyBasicInformation"/>
 *         &lt;element name="activities" type="{http://www.webservices.nl/soap/}CreditsafeCompanyActivityArray" minOccurs="0"/>
 *         &lt;element name="previous_names" type="{http://www.webservices.nl/soap/}CreditsafeChangedStringArray" minOccurs="0"/>
 *         &lt;element name="previous_legal_forms" type="{http://www.webservices.nl/soap/}CreditsafeChangedStringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdCompanyIdentification", propOrder = {

})
public class CreditsafeLtdCompanyIdentification {

    @XmlElement(name = "basic_information", required = true)
    protected CreditsafeLtdCompanyBasicInformation basicInformation;
    protected CreditsafeCompanyActivityArray activities;
    @XmlElement(name = "previous_names")
    protected CreditsafeChangedStringArray previousNames;
    @XmlElement(name = "previous_legal_forms")
    protected CreditsafeChangedStringArray previousLegalForms;

    /**
     * Gets the value of the basicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdCompanyBasicInformation }
     *     
     */
    public CreditsafeLtdCompanyBasicInformation getBasicInformation() {
        return basicInformation;
    }

    /**
     * Sets the value of the basicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdCompanyBasicInformation }
     *     
     */
    public void setBasicInformation(CreditsafeLtdCompanyBasicInformation value) {
        this.basicInformation = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyActivityArray }
     *     
     */
    public CreditsafeCompanyActivityArray getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyActivityArray }
     *     
     */
    public void setActivities(CreditsafeCompanyActivityArray value) {
        this.activities = value;
    }

    /**
     * Gets the value of the previousNames property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeChangedStringArray }
     *     
     */
    public CreditsafeChangedStringArray getPreviousNames() {
        return previousNames;
    }

    /**
     * Sets the value of the previousNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeChangedStringArray }
     *     
     */
    public void setPreviousNames(CreditsafeChangedStringArray value) {
        this.previousNames = value;
    }

    /**
     * Gets the value of the previousLegalForms property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeChangedStringArray }
     *     
     */
    public CreditsafeChangedStringArray getPreviousLegalForms() {
        return previousLegalForms;
    }

    /**
     * Sets the value of the previousLegalForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeChangedStringArray }
     *     
     */
    public void setPreviousLegalForms(CreditsafeChangedStringArray value) {
        this.previousLegalForms = value;
    }

}
