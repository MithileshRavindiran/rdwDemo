
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleTechnicalWeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleTechnicalWeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="mass_ready" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gross_vehicle_mass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_mass_payload" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_mass_unbraked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_mass_braked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_mass_trailer_braked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_mass_self_braked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_mass_axle_braked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleTechnicalWeight", propOrder = {

})
public class DutchVehicleTechnicalWeight {

    @XmlElement(name = "mass_ready")
    protected Integer massReady;
    @XmlElement(name = "gross_vehicle_mass")
    protected Integer grossVehicleMass;
    @XmlElement(name = "maximum_mass_payload")
    protected Integer maximumMassPayload;
    @XmlElement(name = "maximum_mass_unbraked")
    protected Integer maximumMassUnbraked;
    @XmlElement(name = "maximum_mass_braked")
    protected Integer maximumMassBraked;
    @XmlElement(name = "maximum_mass_trailer_braked")
    protected Integer maximumMassTrailerBraked;
    @XmlElement(name = "maximum_mass_self_braked")
    protected Integer maximumMassSelfBraked;
    @XmlElement(name = "maximum_mass_axle_braked")
    protected Integer maximumMassAxleBraked;

    /**
     * Gets the value of the massReady property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMassReady() {
        return massReady;
    }

    /**
     * Sets the value of the massReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMassReady(Integer value) {
        this.massReady = value;
    }

    /**
     * Gets the value of the grossVehicleMass property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrossVehicleMass() {
        return grossVehicleMass;
    }

    /**
     * Sets the value of the grossVehicleMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrossVehicleMass(Integer value) {
        this.grossVehicleMass = value;
    }

    /**
     * Gets the value of the maximumMassPayload property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMassPayload() {
        return maximumMassPayload;
    }

    /**
     * Sets the value of the maximumMassPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMassPayload(Integer value) {
        this.maximumMassPayload = value;
    }

    /**
     * Gets the value of the maximumMassUnbraked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMassUnbraked() {
        return maximumMassUnbraked;
    }

    /**
     * Sets the value of the maximumMassUnbraked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMassUnbraked(Integer value) {
        this.maximumMassUnbraked = value;
    }

    /**
     * Gets the value of the maximumMassBraked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMassBraked() {
        return maximumMassBraked;
    }

    /**
     * Sets the value of the maximumMassBraked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMassBraked(Integer value) {
        this.maximumMassBraked = value;
    }

    /**
     * Gets the value of the maximumMassTrailerBraked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMassTrailerBraked() {
        return maximumMassTrailerBraked;
    }

    /**
     * Sets the value of the maximumMassTrailerBraked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMassTrailerBraked(Integer value) {
        this.maximumMassTrailerBraked = value;
    }

    /**
     * Gets the value of the maximumMassSelfBraked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMassSelfBraked() {
        return maximumMassSelfBraked;
    }

    /**
     * Sets the value of the maximumMassSelfBraked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMassSelfBraked(Integer value) {
        this.maximumMassSelfBraked = value;
    }

    /**
     * Gets the value of the maximumMassAxleBraked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumMassAxleBraked() {
        return maximumMassAxleBraked;
    }

    /**
     * Sets the value of the maximumMassAxleBraked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumMassAxleBraked(Integer value) {
        this.maximumMassAxleBraked = value;
    }

}
