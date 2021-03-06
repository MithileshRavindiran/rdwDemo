
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarBPV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarBPV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="car_data" type="{http://www.webservices.nl/soap/}CarBP"/>
 *         &lt;element name="types" type="{http://www.webservices.nl/soap/}CarTypeArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarBPV2", propOrder = {

})
public class CarBPV2 {

    @XmlElement(name = "car_data", required = true)
    protected CarBP carData;
    protected CarTypeArray types;

    /**
     * Gets the value of the carData property.
     * 
     * @return
     *     possible object is
     *     {@link CarBP }
     *     
     */
    public CarBP getCarData() {
        return carData;
    }

    /**
     * Sets the value of the carData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarBP }
     *     
     */
    public void setCarData(CarBP value) {
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
