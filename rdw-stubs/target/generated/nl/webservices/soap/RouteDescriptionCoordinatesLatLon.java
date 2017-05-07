
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteDescriptionCoordinatesLatLon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteDescriptionCoordinatesLatLon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="routecoordinates" type="{http://www.webservices.nl/soap/}RouteCoordinatesLatLon"/>
 *         &lt;element name="parts" type="{http://www.webservices.nl/soap/}RoutePartArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteDescriptionCoordinatesLatLon", propOrder = {

})
public class RouteDescriptionCoordinatesLatLon {

    @XmlElement(required = true)
    protected RouteCoordinatesLatLon routecoordinates;
    @XmlElement(required = true)
    protected RoutePartArray parts;

    /**
     * Gets the value of the routecoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link RouteCoordinatesLatLon }
     *     
     */
    public RouteCoordinatesLatLon getRoutecoordinates() {
        return routecoordinates;
    }

    /**
     * Sets the value of the routecoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteCoordinatesLatLon }
     *     
     */
    public void setRoutecoordinates(RouteCoordinatesLatLon value) {
        this.routecoordinates = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePartArray }
     *     
     */
    public RoutePartArray getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePartArray }
     *     
     */
    public void setParts(RoutePartArray value) {
        this.parts = value;
    }

}
