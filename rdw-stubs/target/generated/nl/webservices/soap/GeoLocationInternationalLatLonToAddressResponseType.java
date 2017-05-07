
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationInternationalLatLonToAddressResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationInternationalLatLonToAddressResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="address" type="{http://www.webservices.nl/soap/}GeoLocationInternationalAddress"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationInternationalLatLonToAddressResponseType", propOrder = {

})
public class GeoLocationInternationalLatLonToAddressResponseType {

    @XmlElement(required = true)
    protected GeoLocationInternationalAddress address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationInternationalAddress }
     *     
     */
    public GeoLocationInternationalAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationInternationalAddress }
     *     
     */
    public void setAddress(GeoLocationInternationalAddress value) {
        this.address = value;
    }

}
