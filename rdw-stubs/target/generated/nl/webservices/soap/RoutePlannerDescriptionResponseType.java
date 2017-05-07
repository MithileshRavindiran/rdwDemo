
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerDescriptionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerDescriptionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="route" type="{http://www.webservices.nl/soap/}RoutePartArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerDescriptionResponseType", propOrder = {

})
public class RoutePlannerDescriptionResponseType {

    @XmlElement(required = true)
    protected RoutePartArray route;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePartArray }
     *     
     */
    public RoutePartArray getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePartArray }
     *     
     */
    public void setRoute(RoutePartArray value) {
        this.route = value;
    }

}
