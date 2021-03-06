
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="car_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gearbox" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="first_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="last_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarType", propOrder = {

})
public class CarType {

    @XmlElement(name = "car_id", required = true)
    protected String carId;
    @XmlElement(required = true)
    protected String brand;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String gearbox;
    @XmlElement(name = "first_year")
    protected int firstYear;
    @XmlElement(name = "last_year")
    protected int lastYear;

    /**
     * Gets the value of the carId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarId(String value) {
        this.carId = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the gearbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearbox() {
        return gearbox;
    }

    /**
     * Sets the value of the gearbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearbox(String value) {
        this.gearbox = value;
    }

    /**
     * Gets the value of the firstYear property.
     * 
     */
    public int getFirstYear() {
        return firstYear;
    }

    /**
     * Sets the value of the firstYear property.
     * 
     */
    public void setFirstYear(int value) {
        this.firstYear = value;
    }

    /**
     * Gets the value of the lastYear property.
     * 
     */
    public int getLastYear() {
        return lastYear;
    }

    /**
     * Sets the value of the lastYear property.
     * 
     */
    public void setLastYear(int value) {
        this.lastYear = value;
    }

}
