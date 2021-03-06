
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationHaversineDistanceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationHaversineDistanceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="latitude_coord_1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitude_coord_1" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="latitude_coord_2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitude_coord_2" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="in_radians" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationHaversineDistanceRequestType", propOrder = {

})
public class GeoLocationHaversineDistanceRequestType {

    @XmlElement(name = "latitude_coord_1")
    protected float latitudeCoord1;
    @XmlElement(name = "longitude_coord_1")
    protected float longitudeCoord1;
    @XmlElement(name = "latitude_coord_2")
    protected float latitudeCoord2;
    @XmlElement(name = "longitude_coord_2")
    protected float longitudeCoord2;
    @XmlElement(name = "in_radians")
    protected boolean inRadians;

    /**
     * Gets the value of the latitudeCoord1 property.
     * 
     */
    public float getLatitudeCoord1() {
        return latitudeCoord1;
    }

    /**
     * Sets the value of the latitudeCoord1 property.
     * 
     */
    public void setLatitudeCoord1(float value) {
        this.latitudeCoord1 = value;
    }

    /**
     * Gets the value of the longitudeCoord1 property.
     * 
     */
    public float getLongitudeCoord1() {
        return longitudeCoord1;
    }

    /**
     * Sets the value of the longitudeCoord1 property.
     * 
     */
    public void setLongitudeCoord1(float value) {
        this.longitudeCoord1 = value;
    }

    /**
     * Gets the value of the latitudeCoord2 property.
     * 
     */
    public float getLatitudeCoord2() {
        return latitudeCoord2;
    }

    /**
     * Sets the value of the latitudeCoord2 property.
     * 
     */
    public void setLatitudeCoord2(float value) {
        this.latitudeCoord2 = value;
    }

    /**
     * Gets the value of the longitudeCoord2 property.
     * 
     */
    public float getLongitudeCoord2() {
        return longitudeCoord2;
    }

    /**
     * Sets the value of the longitudeCoord2 property.
     * 
     */
    public void setLongitudeCoord2(float value) {
        this.longitudeCoord2 = value;
    }

    /**
     * Gets the value of the inRadians property.
     * 
     */
    public boolean isInRadians() {
        return inRadians;
    }

    /**
     * Sets the value of the inRadians property.
     * 
     */
    public void setInRadians(boolean value) {
        this.inRadians = value;
    }

}
