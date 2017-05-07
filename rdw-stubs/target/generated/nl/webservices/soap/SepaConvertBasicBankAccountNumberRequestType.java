
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sepaConvertBasicBankAccountNumberRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sepaConvertBasicBankAccountNumberRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bban" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_iso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sepaConvertBasicBankAccountNumberRequestType", propOrder = {

})
public class SepaConvertBasicBankAccountNumberRequestType {

    @XmlElement(required = true)
    protected String bban;
    @XmlElement(name = "country_iso", required = true)
    protected String countryIso;

    /**
     * Gets the value of the bban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBban() {
        return bban;
    }

    /**
     * Sets the value of the bban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBban(String value) {
        this.bban = value;
    }

    /**
     * Gets the value of the countryIso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIso() {
        return countryIso;
    }

    /**
     * Sets the value of the countryIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIso(String value) {
        this.countryIso = value;
    }

}
