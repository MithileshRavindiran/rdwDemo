
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeBeNegativeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBeNegativeInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nsso_details" type="{http://www.webservices.nl/soap/}CreditsafeBeNSSODetailArray" minOccurs="0"/>
 *         &lt;element name="protested_bills" type="{http://www.webservices.nl/soap/}CreditsafeBeProtestedBillArray" minOccurs="0"/>
 *         &lt;element name="bankruptcy_events" type="{http://www.webservices.nl/soap/}CreditsafeBeBankruptcyEventArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBeNegativeInformation", propOrder = {

})
public class CreditsafeBeNegativeInformation {

    @XmlElement(name = "nsso_details")
    protected CreditsafeBeNSSODetailArray nssoDetails;
    @XmlElement(name = "protested_bills")
    protected CreditsafeBeProtestedBillArray protestedBills;
    @XmlElement(name = "bankruptcy_events")
    protected CreditsafeBeBankruptcyEventArray bankruptcyEvents;

    /**
     * Gets the value of the nssoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeNSSODetailArray }
     *     
     */
    public CreditsafeBeNSSODetailArray getNssoDetails() {
        return nssoDetails;
    }

    /**
     * Sets the value of the nssoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeNSSODetailArray }
     *     
     */
    public void setNssoDetails(CreditsafeBeNSSODetailArray value) {
        this.nssoDetails = value;
    }

    /**
     * Gets the value of the protestedBills property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeProtestedBillArray }
     *     
     */
    public CreditsafeBeProtestedBillArray getProtestedBills() {
        return protestedBills;
    }

    /**
     * Sets the value of the protestedBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeProtestedBillArray }
     *     
     */
    public void setProtestedBills(CreditsafeBeProtestedBillArray value) {
        this.protestedBills = value;
    }

    /**
     * Gets the value of the bankruptcyEvents property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeBankruptcyEventArray }
     *     
     */
    public CreditsafeBeBankruptcyEventArray getBankruptcyEvents() {
        return bankruptcyEvents;
    }

    /**
     * Sets the value of the bankruptcyEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeBankruptcyEventArray }
     *     
     */
    public void setBankruptcyEvents(CreditsafeBeBankruptcyEventArray value) {
        this.bankruptcyEvents = value;
    }

}
