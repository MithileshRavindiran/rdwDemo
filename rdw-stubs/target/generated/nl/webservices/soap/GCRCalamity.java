
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCalamity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCalamity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="calamity_events" type="{http://www.webservices.nl/soap/}GCRCalamityEventArray" minOccurs="0"/>
 *         &lt;element name="other_calamities" type="{http://www.webservices.nl/soap/}GCRCalamityOtherArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCalamity", propOrder = {

})
public class GCRCalamity {

    @XmlElement(name = "calamity_events")
    protected GCRCalamityEventArray calamityEvents;
    @XmlElement(name = "other_calamities")
    protected GCRCalamityOtherArray otherCalamities;

    /**
     * Gets the value of the calamityEvents property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCalamityEventArray }
     *     
     */
    public GCRCalamityEventArray getCalamityEvents() {
        return calamityEvents;
    }

    /**
     * Sets the value of the calamityEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCalamityEventArray }
     *     
     */
    public void setCalamityEvents(GCRCalamityEventArray value) {
        this.calamityEvents = value;
    }

    /**
     * Gets the value of the otherCalamities property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCalamityOtherArray }
     *     
     */
    public GCRCalamityOtherArray getOtherCalamities() {
        return otherCalamities;
    }

    /**
     * Sets the value of the otherCalamities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCalamityOtherArray }
     *     
     */
    public void setOtherCalamities(GCRCalamityOtherArray value) {
        this.otherCalamities = value;
    }

}
