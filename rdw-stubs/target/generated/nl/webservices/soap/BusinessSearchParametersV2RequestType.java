
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSearchParametersV2RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSearchParametersV2RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="tradename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="housenoaddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephoneno" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "businessSearchParametersV2RequestType", propOrder = {

})
public class BusinessSearchParametersV2RequestType {

    @XmlElement(required = true)
    protected String tradename;
    @XmlElement(required = true)
    protected String cityname;
    @XmlElement(required = true)
    protected String streetname;
    @XmlElement(required = true)
    protected String postcode;
    protected int houseno;
    @XmlElement(required = true)
    protected String housenoaddition;
    @XmlElement(required = true)
    protected String telephoneno;
    protected int page;

    /**
     * Gets the value of the tradename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradename() {
        return tradename;
    }

    /**
     * Sets the value of the tradename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradename(String value) {
        this.tradename = value;
    }

    /**
     * Gets the value of the cityname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * Sets the value of the cityname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityname(String value) {
        this.cityname = value;
    }

    /**
     * Gets the value of the streetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetname() {
        return streetname;
    }

    /**
     * Sets the value of the streetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetname(String value) {
        this.streetname = value;
    }

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
     * Gets the value of the houseno property.
     * 
     */
    public int getHouseno() {
        return houseno;
    }

    /**
     * Sets the value of the houseno property.
     * 
     */
    public void setHouseno(int value) {
        this.houseno = value;
    }

    /**
     * Gets the value of the housenoaddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousenoaddition() {
        return housenoaddition;
    }

    /**
     * Sets the value of the housenoaddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousenoaddition(String value) {
        this.housenoaddition = value;
    }

    /**
     * Gets the value of the telephoneno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneno() {
        return telephoneno;
    }

    /**
     * Sets the value of the telephoneno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneno(String value) {
        this.telephoneno = value;
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
