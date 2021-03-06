
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mapViewLatLonRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapViewLatLonRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="center_lat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="center_lon" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="extra_latlon" type="{http://www.webservices.nl/soap/}LatLonCoordinatesArray"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zoom" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapViewLatLonRequestType", propOrder = {

})
public class MapViewLatLonRequestType {

    @XmlElement(name = "center_lat")
    protected float centerLat;
    @XmlElement(name = "center_lon")
    protected float centerLon;
    @XmlElement(name = "extra_latlon", required = true)
    protected LatLonCoordinatesArray extraLatlon;
    @XmlElement(required = true)
    protected String format;
    protected int width;
    protected int height;
    protected float zoom;

    /**
     * Gets the value of the centerLat property.
     * 
     */
    public float getCenterLat() {
        return centerLat;
    }

    /**
     * Sets the value of the centerLat property.
     * 
     */
    public void setCenterLat(float value) {
        this.centerLat = value;
    }

    /**
     * Gets the value of the centerLon property.
     * 
     */
    public float getCenterLon() {
        return centerLon;
    }

    /**
     * Sets the value of the centerLon property.
     * 
     */
    public void setCenterLon(float value) {
        this.centerLon = value;
    }

    /**
     * Gets the value of the extraLatlon property.
     * 
     * @return
     *     possible object is
     *     {@link LatLonCoordinatesArray }
     *     
     */
    public LatLonCoordinatesArray getExtraLatlon() {
        return extraLatlon;
    }

    /**
     * Sets the value of the extraLatlon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonCoordinatesArray }
     *     
     */
    public void setExtraLatlon(LatLonCoordinatesArray value) {
        this.extraLatlon = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the zoom property.
     * 
     */
    public float getZoom() {
        return zoom;
    }

    /**
     * Sets the value of the zoom property.
     * 
     */
    public void setZoom(float value) {
        this.zoom = value;
    }

}
