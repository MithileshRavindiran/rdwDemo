
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSearchAddressRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSearchAddressRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="streetname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="housenoaddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "businessSearchAddressRequestType", propOrder = {

})
public class BusinessSearchAddressRequestType {

    @XmlElement(required = true)
    protected String streetname;
    protected int houseno;
    @XmlElement(required = true)
    protected String housenoaddition;
    @XmlElement(required = true)
    protected String cityname;
    protected int page;

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
