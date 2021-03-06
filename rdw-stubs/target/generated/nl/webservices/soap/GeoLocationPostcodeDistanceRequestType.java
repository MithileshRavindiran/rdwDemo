
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationPostcodeDistanceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationPostcodeDistanceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcodefrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcodeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationPostcodeDistanceRequestType", propOrder = {

})
public class GeoLocationPostcodeDistanceRequestType {

    @XmlElement(required = true)
    protected String postcodefrom;
    @XmlElement(required = true)
    protected String postcodeto;

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
     * Gets the value of the postcodeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeto() {
        return postcodeto;
    }

    /**
     * Sets the value of the postcodeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeto(String value) {
        this.postcodeto = value;
    }

}
