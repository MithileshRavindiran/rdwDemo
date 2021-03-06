
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerEUMapRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerEUMapRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="latitudefrom" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitudefrom" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="latitudeto" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitudeto" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="routetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="view" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerEUMapRequestType", propOrder = {

})
public class RoutePlannerEUMapRequestType {

    protected float latitudefrom;
    protected float longitudefrom;
    protected float latitudeto;
    protected float longitudeto;
    @XmlElement(required = true)
    protected String routetype;
    @XmlElement(required = true)
    protected String language;
    @XmlElement(required = true)
    protected String format;
    protected int width;
    protected int height;
    @XmlElement(required = true)
    protected String view;

    /**
     * Gets the value of the latitudefrom property.
     * 
     */
    public float getLatitudefrom() {
        return latitudefrom;
    }

    /**
     * Sets the value of the latitudefrom property.
     * 
     */
    public void setLatitudefrom(float value) {
        this.latitudefrom = value;
    }

    /**
     * Gets the value of the longitudefrom property.
     * 
     */
    public float getLongitudefrom() {
        return longitudefrom;
    }

    /**
     * Sets the value of the longitudefrom property.
     * 
     */
    public void setLongitudefrom(float value) {
        this.longitudefrom = value;
    }

    /**
     * Gets the value of the latitudeto property.
     * 
     */
    public float getLatitudeto() {
        return latitudeto;
    }

    /**
     * Sets the value of the latitudeto property.
     * 
     */
    public void setLatitudeto(float value) {
        this.latitudeto = value;
    }

    /**
     * Gets the value of the longitudeto property.
     * 
     */
    public float getLongitudeto() {
        return longitudeto;
    }

    /**
     * Sets the value of the longitudeto property.
     * 
     */
    public void setLongitudeto(float value) {
        this.longitudeto = value;
    }

    /**
     * Gets the value of the routetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutetype() {
        return routetype;
    }

    /**
     * Sets the value of the routetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutetype(String value) {
        this.routetype = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
     * Gets the value of the view property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getView() {
        return view;
    }

    /**
     * Sets the value of the view property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setView(String value) {
        this.view = value;
    }

}
