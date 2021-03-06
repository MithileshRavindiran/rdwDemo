
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeLtdContactInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdContactInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="main_address" type="{http://www.webservices.nl/soap/}CreditsafeStreetAddressWithTelephone"/>
 *         &lt;element name="other_addresses" type="{http://www.webservices.nl/soap/}CreditsafeStreetAddressWithTelephoneArray" minOccurs="0"/>
 *         &lt;element name="previous_addresses" type="{http://www.webservices.nl/soap/}CreditsafeStreetAddressArray" minOccurs="0"/>
 *         &lt;element name="email_addresses" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="websites" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdContactInformation", propOrder = {

})
public class CreditsafeLtdContactInformation {

    @XmlElement(name = "main_address", required = true)
    protected CreditsafeStreetAddressWithTelephone mainAddress;
    @XmlElement(name = "other_addresses")
    protected CreditsafeStreetAddressWithTelephoneArray otherAddresses;
    @XmlElement(name = "previous_addresses")
    protected CreditsafeStreetAddressArray previousAddresses;
    @XmlElement(name = "email_addresses")
    protected StringArray emailAddresses;
    protected StringArray websites;

    /**
     * Gets the value of the mainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeStreetAddressWithTelephone }
     *     
     */
    public CreditsafeStreetAddressWithTelephone getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the value of the mainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeStreetAddressWithTelephone }
     *     
     */
    public void setMainAddress(CreditsafeStreetAddressWithTelephone value) {
        this.mainAddress = value;
    }

    /**
     * Gets the value of the otherAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeStreetAddressWithTelephoneArray }
     *     
     */
    public CreditsafeStreetAddressWithTelephoneArray getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * Sets the value of the otherAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeStreetAddressWithTelephoneArray }
     *     
     */
    public void setOtherAddresses(CreditsafeStreetAddressWithTelephoneArray value) {
        this.otherAddresses = value;
    }

    /**
     * Gets the value of the previousAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeStreetAddressArray }
     *     
     */
    public CreditsafeStreetAddressArray getPreviousAddresses() {
        return previousAddresses;
    }

    /**
     * Sets the value of the previousAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeStreetAddressArray }
     *     
     */
    public void setPreviousAddresses(CreditsafeStreetAddressArray value) {
        this.previousAddresses = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setEmailAddresses(StringArray value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the websites property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getWebsites() {
        return websites;
    }

    /**
     * Sets the value of the websites property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setWebsites(StringArray value) {
        this.websites = value;
    }

}
