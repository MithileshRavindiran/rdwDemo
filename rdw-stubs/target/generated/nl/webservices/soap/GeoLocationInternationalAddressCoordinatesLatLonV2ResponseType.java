
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationInternationalAddressCoordinatesLatLonV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationInternationalAddressCoordinatesLatLonV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="coordinates" type="{http://www.webservices.nl/soap/}LatLonCoordinatesInternationalAddressArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationInternationalAddressCoordinatesLatLonV2ResponseType", propOrder = {

})
public class GeoLocationInternationalAddressCoordinatesLatLonV2ResponseType {

    @XmlElement(required = true)
    protected LatLonCoordinatesInternationalAddressArray coordinates;

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link LatLonCoordinatesInternationalAddressArray }
     *     
     */
    public LatLonCoordinatesInternationalAddressArray getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonCoordinatesInternationalAddressArray }
     *     
     */
    public void setCoordinates(LatLonCoordinatesInternationalAddressArray value) {
        this.coordinates = value;
    }

}
