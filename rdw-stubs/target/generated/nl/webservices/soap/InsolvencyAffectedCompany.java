
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsolvencyAffectedCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyAffectedCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="trade_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coc_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coc_registered_city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresses" type="{http://www.webservices.nl/soap/}InsolvencyAddresses" minOccurs="0"/>
 *         &lt;element name="is_former" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyAffectedCompany", propOrder = {

})
public class InsolvencyAffectedCompany {

    @XmlElement(name = "trade_name", required = true)
    protected String tradeName;
    @XmlElement(name = "coc_number")
    protected String cocNumber;
    @XmlElement(name = "coc_registered_city")
    protected String cocRegisteredCity;
    protected InsolvencyAddresses addresses;
    @XmlElement(name = "is_former")
    protected Boolean isFormer;

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the cocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCocNumber() {
        return cocNumber;
    }

    /**
     * Sets the value of the cocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCocNumber(String value) {
        this.cocNumber = value;
    }

    /**
     * Gets the value of the cocRegisteredCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCocRegisteredCity() {
        return cocRegisteredCity;
    }

    /**
     * Sets the value of the cocRegisteredCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCocRegisteredCity(String value) {
        this.cocRegisteredCity = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyAddresses }
     *     
     */
    public InsolvencyAddresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyAddresses }
     *     
     */
    public void setAddresses(InsolvencyAddresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the isFormer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFormer() {
        return isFormer;
    }

    /**
     * Sets the value of the isFormer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFormer(Boolean value) {
        this.isFormer = value;
    }

}
