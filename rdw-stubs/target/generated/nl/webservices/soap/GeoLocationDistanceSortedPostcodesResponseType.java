
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationDistanceSortedPostcodesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationDistanceSortedPostcodesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcodes" type="{http://www.webservices.nl/soap/}SortedPostcodeArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationDistanceSortedPostcodesResponseType", propOrder = {

})
public class GeoLocationDistanceSortedPostcodesResponseType {

    @XmlElement(required = true)
    protected SortedPostcodeArray postcodes;

    /**
     * Gets the value of the postcodes property.
     * 
     * @return
     *     possible object is
     *     {@link SortedPostcodeArray }
     *     
     */
    public SortedPostcodeArray getPostcodes() {
        return postcodes;
    }

    /**
     * Sets the value of the postcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedPostcodeArray }
     *     
     */
    public void setPostcodes(SortedPostcodeArray value) {
        this.postcodes = value;
    }

}
