
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationDistanceSortedPostcodesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationDistanceSortedPostcodesRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcodefrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcodes" type="{http://www.webservices.nl/soap/}stringArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationDistanceSortedPostcodesRequestType", propOrder = {

})
public class GeoLocationDistanceSortedPostcodesRequestType {

    @XmlElement(required = true)
    protected String postcodefrom;
    @XmlElement(required = true)
    protected StringArray postcodes;

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
     * Gets the value of the postcodes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getPostcodes() {
        return postcodes;
    }

    /**
     * Sets the value of the postcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setPostcodes(StringArray value) {
        this.postcodes = value;
    }

}
