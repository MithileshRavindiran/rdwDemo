
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressPerceelFullParameterSearchV2RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressPerceelFullParameterSearchV2RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="houseNoAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lettercombination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addresstype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressPerceelFullParameterSearchV2RequestType", propOrder = {

})
public class AddressPerceelFullParameterSearchV2RequestType {

    @XmlElement(required = true)
    protected String province;
    @XmlElement(required = true)
    protected String district;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String street;
    protected int houseNo;
    @XmlElement(required = true)
    protected String houseNoAddition;
    @XmlElement(required = true)
    protected String nbcode;
    @XmlElement(required = true)
    protected String lettercombination;
    @XmlElement(required = true)
    protected String addresstype;
    protected int page;

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
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
     * Gets the value of the houseNoAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNoAddition() {
        return houseNoAddition;
    }

    /**
     * Sets the value of the houseNoAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNoAddition(String value) {
        this.houseNoAddition = value;
    }

    /**
     * Gets the value of the nbcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbcode() {
        return nbcode;
    }

    /**
     * Sets the value of the nbcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbcode(String value) {
        this.nbcode = value;
    }

    /**
     * Gets the value of the lettercombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettercombination() {
        return lettercombination;
    }

    /**
     * Sets the value of the lettercombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettercombination(String value) {
        this.lettercombination = value;
    }

    /**
     * Gets the value of the addresstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresstype() {
        return addresstype;
    }

    /**
     * Sets the value of the addresstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresstype(String value) {
        this.addresstype = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
