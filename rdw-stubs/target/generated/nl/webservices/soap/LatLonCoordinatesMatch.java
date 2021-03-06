
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LatLonCoordinatesMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LatLonCoordinatesMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="citymatch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetmatch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatLonCoordinatesMatch", propOrder = {

})
public class LatLonCoordinatesMatch {

    protected float latitude;
    protected float longitude;
    @XmlElement(required = true)
    protected String citymatch;
    @XmlElement(required = true)
    protected String streetmatch;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the citymatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitymatch() {
        return citymatch;
    }

    /**
     * Sets the value of the citymatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitymatch(String value) {
        this.citymatch = value;
    }

    /**
     * Gets the value of the streetmatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetmatch() {
        return streetmatch;
    }

    /**
     * Sets the value of the streetmatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetmatch(String value) {
        this.streetmatch = value;
    }

}
