
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mapViewRDRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapViewRDRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="center_x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="center_y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="extra_xy" type="{http://www.webservices.nl/soap/}RDCoordinatesArray"/>
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
@XmlType(name = "mapViewRDRequestType", propOrder = {

})
public class MapViewRDRequestType {

    @XmlElement(name = "center_x")
    protected int centerX;
    @XmlElement(name = "center_y")
    protected int centerY;
    @XmlElement(name = "extra_xy", required = true)
    protected RDCoordinatesArray extraXy;
    @XmlElement(required = true)
    protected String format;
    protected int width;
    protected int height;
    protected float zoom;

    /**
     * Gets the value of the centerX property.
     * 
     */
    public int getCenterX() {
        return centerX;
    }

    /**
     * Sets the value of the centerX property.
     * 
     */
    public void setCenterX(int value) {
        this.centerX = value;
    }

    /**
     * Gets the value of the centerY property.
     * 
     */
    public int getCenterY() {
        return centerY;
    }

    /**
     * Sets the value of the centerY property.
     * 
     */
    public void setCenterY(int value) {
        this.centerY = value;
    }

    /**
     * Gets the value of the extraXy property.
     * 
     * @return
     *     possible object is
     *     {@link RDCoordinatesArray }
     *     
     */
    public RDCoordinatesArray getExtraXy() {
        return extraXy;
    }

    /**
     * Sets the value of the extraXy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RDCoordinatesArray }
     *     
     */
    public void setExtraXy(RDCoordinatesArray value) {
        this.extraXy = value;
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
