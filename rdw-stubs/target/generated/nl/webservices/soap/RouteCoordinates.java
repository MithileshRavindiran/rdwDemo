
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteCoordinates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteCoordinates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="latlong" type="{http://www.webservices.nl/soap/}RouteCoordinateLatLong"/>
 *         &lt;element name="rd" type="{http://www.webservices.nl/soap/}RouteCoordinateRD" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteCoordinates", propOrder = {

})
public class RouteCoordinates {

    @XmlElement(required = true)
    protected RouteCoordinateLatLong latlong;
    protected RouteCoordinateRD rd;

    /**
     * Gets the value of the latlong property.
     * 
     * @return
     *     possible object is
     *     {@link RouteCoordinateLatLong }
     *     
     */
    public RouteCoordinateLatLong getLatlong() {
        return latlong;
    }

    /**
     * Sets the value of the latlong property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteCoordinateLatLong }
     *     
     */
    public void setLatlong(RouteCoordinateLatLong value) {
        this.latlong = value;
    }

    /**
     * Gets the value of the rd property.
     * 
     * @return
     *     possible object is
     *     {@link RouteCoordinateRD }
     *     
     */
    public RouteCoordinateRD getRd() {
        return rd;
    }

    /**
     * Sets the value of the rd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteCoordinateRD }
     *     
     */
    public void setRd(RouteCoordinateRD value) {
        this.rd = value;
    }

}
