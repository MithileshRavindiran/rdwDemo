
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}GCRTradeNameArray" minOccurs="0"/>
 *         &lt;element name="addresses" type="{http://www.webservices.nl/soap/}GCRAddressArray" minOccurs="0"/>
 *         &lt;element name="telephone_numbers" type="{http://www.webservices.nl/soap/}GCRTelephoneNumberArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRContactDetails", propOrder = {

})
public class GCRContactDetails {

    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "trade_names")
    protected GCRTradeNameArray tradeNames;
    protected GCRAddressArray addresses;
    @XmlElement(name = "telephone_numbers")
    protected GCRTelephoneNumberArray telephoneNumbers;

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
     * Gets the value of the tradeNames property.
     * 
     * @return
     *     possible object is
     *     {@link GCRTradeNameArray }
     *     
     */
    public GCRTradeNameArray getTradeNames() {
        return tradeNames;
    }

    /**
     * Sets the value of the tradeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRTradeNameArray }
     *     
     */
    public void setTradeNames(GCRTradeNameArray value) {
        this.tradeNames = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAddressArray }
     *     
     */
    public GCRAddressArray getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAddressArray }
     *     
     */
    public void setAddresses(GCRAddressArray value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the telephoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link GCRTelephoneNumberArray }
     *     
     */
    public GCRTelephoneNumberArray getTelephoneNumbers() {
        return telephoneNumbers;
    }

    /**
     * Sets the value of the telephoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRTelephoneNumberArray }
     *     
     */
    public void setTelephoneNumbers(GCRTelephoneNumberArray value) {
        this.telephoneNumbers = value;
    }

}
