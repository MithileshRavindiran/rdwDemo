
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationDistanceSortedNeighborhoodCodesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationDistanceSortedNeighborhoodCodesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nbcodes" type="{http://www.webservices.nl/soap/}SortedPostcodeArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationDistanceSortedNeighborhoodCodesResponseType", propOrder = {

})
public class GeoLocationDistanceSortedNeighborhoodCodesResponseType {

    @XmlElement(required = true)
    protected SortedPostcodeArray nbcodes;

    /**
     * Gets the value of the nbcodes property.
     * 
     * @return
     *     possible object is
     *     {@link SortedPostcodeArray }
     *     
     */
    public SortedPostcodeArray getNbcodes() {
        return nbcodes;
    }

    /**
     * Sets the value of the nbcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedPostcodeArray }
     *     
     */
    public void setNbcodes(SortedPostcodeArray value) {
        this.nbcodes = value;
    }

}
