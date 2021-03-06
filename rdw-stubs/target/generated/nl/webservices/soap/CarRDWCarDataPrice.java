
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarRDWCarDataPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarRDWCarDataPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="basic_car_data" type="{http://www.webservices.nl/soap/}CarV3"/>
 *         &lt;element name="environment_data" type="{http://www.webservices.nl/soap/}CarEnvironment"/>
 *         &lt;element name="status_data" type="{http://www.webservices.nl/soap/}CarStatus"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fuel_types" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="top_speed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="catalog_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bpm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bodies" type="{http://www.webservices.nl/soap/}CarBodyArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarRDWCarDataPrice", propOrder = {

})
public class CarRDWCarDataPrice {

    @XmlElement(name = "basic_car_data", required = true)
    protected CarV3 basicCarData;
    @XmlElement(name = "environment_data", required = true)
    protected CarEnvironment environmentData;
    @XmlElement(name = "status_data", required = true)
    protected CarStatus statusData;
    protected BigDecimal power;
    @XmlElement(name = "fuel_types", required = true)
    protected StringArray fuelTypes;
    @XmlElement(name = "top_speed")
    protected Integer topSpeed;
    @XmlElement(name = "catalog_price")
    protected Integer catalogPrice;
    protected Integer bpm;
    @XmlElement(required = true)
    protected CarBodyArray bodies;

    /**
     * Gets the value of the basicCarData property.
     * 
     * @return
     *     possible object is
     *     {@link CarV3 }
     *     
     */
    public CarV3 getBasicCarData() {
        return basicCarData;
    }

    /**
     * Sets the value of the basicCarData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarV3 }
     *     
     */
    public void setBasicCarData(CarV3 value) {
        this.basicCarData = value;
    }

    /**
     * Gets the value of the environmentData property.
     * 
     * @return
     *     possible object is
     *     {@link CarEnvironment }
     *     
     */
    public CarEnvironment getEnvironmentData() {
        return environmentData;
    }

    /**
     * Sets the value of the environmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarEnvironment }
     *     
     */
    public void setEnvironmentData(CarEnvironment value) {
        this.environmentData = value;
    }

    /**
     * Gets the value of the statusData property.
     * 
     * @return
     *     possible object is
     *     {@link CarStatus }
     *     
     */
    public CarStatus getStatusData() {
        return statusData;
    }

    /**
     * Sets the value of the statusData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarStatus }
     *     
     */
    public void setStatusData(CarStatus value) {
        this.statusData = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPower(BigDecimal value) {
        this.power = value;
    }

    /**
     * Gets the value of the fuelTypes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getFuelTypes() {
        return fuelTypes;
    }

    /**
     * Sets the value of the fuelTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setFuelTypes(StringArray value) {
        this.fuelTypes = value;
    }

    /**
     * Gets the value of the topSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopSpeed() {
        return topSpeed;
    }

    /**
     * Sets the value of the topSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopSpeed(Integer value) {
        this.topSpeed = value;
    }

    /**
     * Gets the value of the catalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatalogPrice() {
        return catalogPrice;
    }

    /**
     * Sets the value of the catalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatalogPrice(Integer value) {
        this.catalogPrice = value;
    }

    /**
     * Gets the value of the bpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBpm() {
        return bpm;
    }

    /**
     * Sets the value of the bpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBpm(Integer value) {
        this.bpm = value;
    }

    /**
     * Gets the value of the bodies property.
     * 
     * @return
     *     possible object is
     *     {@link CarBodyArray }
     *     
     */
    public CarBodyArray getBodies() {
        return bodies;
    }

    /**
     * Sets the value of the bodies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarBodyArray }
     *     
     */
    public void setBodies(CarBodyArray value) {
        this.bodies = value;
    }

}
