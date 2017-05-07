
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationAddressCoordinatesRDResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationAddressCoordinatesRDResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="coordinates" type="{http://www.webservices.nl/soap/}RDCoordinatesMatch"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationAddressCoordinatesRDResponseType", propOrder = {

})
public class GeoLocationAddressCoordinatesRDResponseType {

    @XmlElement(required = true)
    protected RDCoordinatesMatch coordinates;

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link RDCoordinatesMatch }
     *     
     */
    public RDCoordinatesMatch getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RDCoordinatesMatch }
     *     
     */
    public void setCoordinates(RDCoordinatesMatch value) {
        this.coordinates = value;
    }

}
