
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerInformationDutchAddressRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerInformationDutchAddressRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="routetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_postalcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_housno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_postalcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_housno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerInformationDutchAddressRequestType", propOrder = {

})
public class RoutePlannerInformationDutchAddressRequestType {

    @XmlElement(required = true)
    protected String routetype;
    @XmlElement(name = "from_postalcode", required = true)
    protected String fromPostalcode;
    @XmlElement(name = "from_housno", required = true)
    protected String fromHousno;
    @XmlElement(name = "from_street", required = true)
    protected String fromStreet;
    @XmlElement(name = "from_city", required = true)
    protected String fromCity;
    @XmlElement(name = "to_postalcode", required = true)
    protected String toPostalcode;
    @XmlElement(name = "to_housno", required = true)
    protected String toHousno;
    @XmlElement(name = "to_street", required = true)
    protected String toStreet;
    @XmlElement(name = "to_city", required = true)
    protected String toCity;

    /**
     * Gets the value of the routetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutetype() {
        return routetype;
    }

    /**
     * Sets the value of the routetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutetype(String value) {
        this.routetype = value;
    }

    /**
     * Gets the value of the fromPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPostalcode() {
        return fromPostalcode;
    }

    /**
     * Sets the value of the fromPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPostalcode(String value) {
        this.fromPostalcode = value;
    }

    /**
     * Gets the value of the fromHousno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromHousno() {
        return fromHousno;
    }

    /**
     * Sets the value of the fromHousno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromHousno(String value) {
        this.fromHousno = value;
    }

    /**
     * Gets the value of the fromStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromStreet() {
        return fromStreet;
    }

    /**
     * Sets the value of the fromStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromStreet(String value) {
        this.fromStreet = value;
    }

    /**
     * Gets the value of the fromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * Sets the value of the fromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCity(String value) {
        this.fromCity = value;
    }

    /**
     * Gets the value of the toPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToPostalcode() {
        return toPostalcode;
    }

    /**
     * Sets the value of the toPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToPostalcode(String value) {
        this.toPostalcode = value;
    }

    /**
     * Gets the value of the toHousno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToHousno() {
        return toHousno;
    }

    /**
     * Sets the value of the toHousno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToHousno(String value) {
        this.toHousno = value;
    }

    /**
     * Gets the value of the toStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToStreet() {
        return toStreet;
    }

    /**
     * Sets the value of the toStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToStreet(String value) {
        this.toStreet = value;
    }

    /**
     * Gets the value of the toCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Sets the value of the toCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

}
