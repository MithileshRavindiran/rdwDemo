
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="country_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCountry", propOrder = {

})
public class GCRCountry {

    @XmlElement(name = "country_code")
    protected int countryCode;
    @XmlElement(name = "country_text", required = true)
    protected String countryText;

    /**
     * Gets the value of the countryCode property.
     * 
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     */
    public void setCountryCode(int value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryText() {
        return countryText;
    }

    /**
     * Sets the value of the countryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryText(String value) {
        this.countryText = value;
    }

}
