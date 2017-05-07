
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationNeighborhoodCoordinatesLatLonResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationNeighborhoodCoordinatesLatLonResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="coordinates" type="{http://www.webservices.nl/soap/}LatLonCoordinates"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationNeighborhoodCoordinatesLatLonResponseType", propOrder = {

})
public class GeoLocationNeighborhoodCoordinatesLatLonResponseType {

    @XmlElement(required = true)
    protected LatLonCoordinates coordinates;

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link LatLonCoordinates }
     *     
     */
    public LatLonCoordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonCoordinates }
     *     
     */
    public void setCoordinates(LatLonCoordinates value) {
        this.coordinates = value;
    }

}
