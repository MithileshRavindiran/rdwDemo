
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRTelephoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRTelephoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="telephone_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="telephone_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="net_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriber_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRTelephoneNumber", propOrder = {

})
public class GCRTelephoneNumber {

    @XmlElement(name = "telephone_code")
    protected int telephoneCode;
    @XmlElement(name = "telephone_text", required = true)
    protected String telephoneText;
    @XmlElement(name = "country_number")
    protected String countryNumber;
    @XmlElement(name = "net_number")
    protected String netNumber;
    @XmlElement(name = "subscriber_number", required = true)
    protected String subscriberNumber;

    /**
     * Gets the value of the telephoneCode property.
     * 
     */
    public int getTelephoneCode() {
        return telephoneCode;
    }

    /**
     * Sets the value of the telephoneCode property.
     * 
     */
    public void setTelephoneCode(int value) {
        this.telephoneCode = value;
    }

    /**
     * Gets the value of the telephoneText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneText() {
        return telephoneText;
    }

    /**
     * Sets the value of the telephoneText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneText(String value) {
        this.telephoneText = value;
    }

    /**
     * Gets the value of the countryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNumber() {
        return countryNumber;
    }

    /**
     * Sets the value of the countryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNumber(String value) {
        this.countryNumber = value;
    }

    /**
     * Gets the value of the netNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetNumber() {
        return netNumber;
    }

    /**
     * Sets the value of the netNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetNumber(String value) {
        this.netNumber = value;
    }

    /**
     * Gets the value of the subscriberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Sets the value of the subscriberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNumber(String value) {
        this.subscriberNumber = value;
    }

}
