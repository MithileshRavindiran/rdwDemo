
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graydonCreditSearchPostcodeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graydonCreditSearchPostcodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="house_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="telephone_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_iso2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "graydonCreditSearchPostcodeRequestType", propOrder = {

})
public class GraydonCreditSearchPostcodeRequestType {

    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(name = "house_no")
    protected int houseNo;
    @XmlElement(name = "telephone_no", required = true)
    protected String telephoneNo;
    @XmlElement(name = "country_iso2", required = true)
    protected String countryIso2;

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the houseNo property.
     * 
     */
    public int getHouseNo() {
        return houseNo;
    }

    /**
     * Sets the value of the houseNo property.
     * 
     */
    public void setHouseNo(int value) {
        this.houseNo = value;
    }

    /**
     * Gets the value of the telephoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNo() {
        return telephoneNo;
    }

    /**
     * Sets the value of the telephoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNo(String value) {
        this.telephoneNo = value;
    }

    /**
     * Gets the value of the countryIso2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIso2() {
        return countryIso2;
    }

    /**
     * Sets the value of the countryIso2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIso2(String value) {
        this.countryIso2 = value;
    }

}
