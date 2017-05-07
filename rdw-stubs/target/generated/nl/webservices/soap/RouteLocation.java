
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="address" type="{http://www.webservices.nl/soap/}RouteAddress"/>
 *         &lt;element name="coordinates" type="{http://www.webservices.nl/soap/}RouteCoordinates"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLocation", propOrder = {

})
public class RouteLocation {

    @XmlElement(required = true)
    protected RouteAddress address;
    @XmlElement(required = true)
    protected RouteCoordinates coordinates;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link RouteAddress }
     *     
     */
    public RouteAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteAddress }
     *     
     */
    public void setAddress(RouteAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link RouteCoordinates }
     *     
     */
    public RouteCoordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteCoordinates }
     *     
     */
    public void setCoordinates(RouteCoordinates value) {
        this.coordinates = value;
    }

}
