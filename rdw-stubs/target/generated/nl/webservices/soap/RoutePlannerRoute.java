
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutePlannerRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePlannerRoute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="start" type="{http://www.webservices.nl/soap/}RouteLocation"/>
 *         &lt;element name="destination" type="{http://www.webservices.nl/soap/}RouteLocation"/>
 *         &lt;element name="summary" type="{http://www.webservices.nl/soap/}RouteSummary"/>
 *         &lt;element name="description" type="{http://www.webservices.nl/soap/}RoutePartArray"/>
 *         &lt;element name="map" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePlannerRoute", propOrder = {

})
public class RoutePlannerRoute {

    @XmlElement(required = true)
    protected RouteLocation start;
    @XmlElement(required = true)
    protected RouteLocation destination;
    @XmlElement(required = true)
    protected RouteSummary summary;
    @XmlElement(required = true)
    protected RoutePartArray description;
    protected byte[] map;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link RouteLocation }
     *     
     */
    public RouteLocation getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteLocation }
     *     
     */
    public void setStart(RouteLocation value) {
        this.start = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link RouteLocation }
     *     
     */
    public RouteLocation getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteLocation }
     *     
     */
    public void setDestination(RouteLocation value) {
        this.destination = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link RouteSummary }
     *     
     */
    public RouteSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteSummary }
     *     
     */
    public void setSummary(RouteSummary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePartArray }
     *     
     */
    public RoutePartArray getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePartArray }
     *     
     */
    public void setDescription(RoutePartArray value) {
        this.description = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMap(byte[] value) {
        this.map = ((byte[]) value);
    }

}
