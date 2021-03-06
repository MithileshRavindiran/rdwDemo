
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for graydonCreditSearchIdentificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="graydonCreditSearchIdentificationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company_id_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "graydonCreditSearchIdentificationRequestType", propOrder = {

})
public class GraydonCreditSearchIdentificationRequestType {

    @XmlElement(name = "company_id", required = true)
    protected String companyId;
    @XmlElement(name = "company_id_type", required = true)
    protected String companyIdType;
    @XmlElement(name = "country_iso2", required = true)
    protected String countryIso2;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the companyIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdType() {
        return companyIdType;
    }

    /**
     * Sets the value of the companyIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdType(String value) {
        this.companyIdType = value;
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
