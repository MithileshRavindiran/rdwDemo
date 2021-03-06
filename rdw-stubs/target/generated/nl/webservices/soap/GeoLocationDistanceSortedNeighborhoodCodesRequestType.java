
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geoLocationDistanceSortedNeighborhoodCodesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoLocationDistanceSortedNeighborhoodCodesRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nbcodefrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbcodes" type="{http://www.webservices.nl/soap/}stringArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoLocationDistanceSortedNeighborhoodCodesRequestType", propOrder = {

})
public class GeoLocationDistanceSortedNeighborhoodCodesRequestType {

    @XmlElement(required = true)
    protected String nbcodefrom;
    @XmlElement(required = true)
    protected StringArray nbcodes;

    /**
     * Gets the value of the nbcodefrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbcodefrom() {
        return nbcodefrom;
    }

    /**
     * Sets the value of the nbcodefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbcodefrom(String value) {
        this.nbcodefrom = value;
    }

    /**
     * Gets the value of the nbcodes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getNbcodes() {
        return nbcodes;
    }

    /**
     * Sets the value of the nbcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setNbcodes(StringArray value) {
        this.nbcodes = value;
    }

}
