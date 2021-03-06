
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerGetRouteResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerGetRouteResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="route" type="{http://www.webservices.nl/soap/}RoutePlannerRoute"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerGetRouteResponseType", propOrder = {

})
public class RoutePlannerGetRouteResponseType {

    @XmlElement(required = true)
    protected RoutePlannerRoute route;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePlannerRoute }
     *     
     */
    public RoutePlannerRoute getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePlannerRoute }
     *     
     */
    public void setRoute(RoutePlannerRoute value) {
        this.route = value;
    }

}
