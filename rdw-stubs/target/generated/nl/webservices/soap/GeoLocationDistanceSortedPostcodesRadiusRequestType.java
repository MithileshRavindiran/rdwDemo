
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationDistanceSortedPostcodesRadiusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationDistanceSortedPostcodesRadiusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcodefrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationDistanceSortedPostcodesRadiusRequestType", propOrder = {

})
public class GeoLocationDistanceSortedPostcodesRadiusRequestType {

    @XmlElement(required = true)
    protected String postcodefrom;
    @XmlElement(required = true)
    protected BigInteger radius;
    @XmlElement(required = true)
    protected BigInteger page;

    /**
     * Gets the value of the postcodefrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodefrom() {
        return postcodefrom;
    }

    /**
     * Sets the value of the postcodefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodefrom(String value) {
        this.postcodefrom = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPage(BigInteger value) {
        this.page = value;
    }

}
