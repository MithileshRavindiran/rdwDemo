
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarDataV3Result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarDataV3Result">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="car_data" type="{http://www.webservices.nl/soap/}CarV3"/>
 *         &lt;element name="types" type="{http://www.webservices.nl/soap/}CarTypeArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarDataV3Result", propOrder = {

})
public class CarDataV3Result {

    @XmlElement(name = "car_data", required = true)
    protected CarV3 carData;
    @XmlElement(required = true)
    protected CarTypeArray types;

    /**
     * Gets the value of the carData property.
     * 
     * @return
     *     possible object is
     *     {@link CarV3 }
     *     
     */
    public CarV3 getCarData() {
        return carData;
    }

    /**
     * Sets the value of the carData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarV3 }
     *     
     */
    public void setCarData(CarV3 value) {
        this.carData = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link CarTypeArray }
     *     
     */
    public CarTypeArray getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarTypeArray }
     *     
     */
    public void setTypes(CarTypeArray value) {
        this.types = value;
    }

}
