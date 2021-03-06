
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RDCoordinatesMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RDCoordinatesMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "RDCoordinatesMatch", propOrder = {

})
public class RDCoordinatesMatch {

    protected int x;
    protected int y;
    @XmlElement(required = true)
    protected String citymatch;
    @XmlElement(required = true)
    protected String streetmatch;

    /**
     * Gets the value of the x property.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(int value) {
        this.y = value;
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
