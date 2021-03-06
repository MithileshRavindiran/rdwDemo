
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleAxle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleAxle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indication_driven_axle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indication_bogie_lift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="max_axle_load" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="max_axle_load_technical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="location_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="track_width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="road_behavior_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="road_behavior_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleAxle", propOrder = {

})
public class DutchVehicleAxle {

    protected Integer number;
    @XmlElement(name = "indication_driven_axle")
    protected Boolean indicationDrivenAxle;
    @XmlElement(name = "indication_bogie_lift")
    protected Boolean indicationBogieLift;
    @XmlElement(name = "max_axle_load")
    protected Integer maxAxleLoad;
    @XmlElement(name = "max_axle_load_technical")
    protected Integer maxAxleLoadTechnical;
    @XmlElement(name = "location_code")
    protected String locationCode;
    @XmlElement(name = "track_width")
    protected Integer trackWidth;
    @XmlElement(name = "road_behavior_code")
    protected String roadBehaviorCode;
    @XmlElement(name = "road_behavior_description")
    protected String roadBehaviorDescription;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the indicationDrivenAxle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicationDrivenAxle() {
        return indicationDrivenAxle;
    }

    /**
     * Sets the value of the indicationDrivenAxle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicationDrivenAxle(Boolean value) {
        this.indicationDrivenAxle = value;
    }

    /**
     * Gets the value of the indicationBogieLift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicationBogieLift() {
        return indicationBogieLift;
    }

    /**
     * Sets the value of the indicationBogieLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicationBogieLift(Boolean value) {
        this.indicationBogieLift = value;
    }

    /**
     * Gets the value of the maxAxleLoad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAxleLoad() {
        return maxAxleLoad;
    }

    /**
     * Sets the value of the maxAxleLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAxleLoad(Integer value) {
        this.maxAxleLoad = value;
    }

    /**
     * Gets the value of the maxAxleLoadTechnical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAxleLoadTechnical() {
        return maxAxleLoadTechnical;
    }

    /**
     * Sets the value of the maxAxleLoadTechnical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAxleLoadTechnical(Integer value) {
        this.maxAxleLoadTechnical = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the trackWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackWidth() {
        return trackWidth;
    }

    /**
     * Sets the value of the trackWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackWidth(Integer value) {
        this.trackWidth = value;
    }

    /**
     * Gets the value of the roadBehaviorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadBehaviorCode() {
        return roadBehaviorCode;
    }

    /**
     * Sets the value of the roadBehaviorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadBehaviorCode(String value) {
        this.roadBehaviorCode = value;
    }

    /**
     * Gets the value of the roadBehaviorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadBehaviorDescription() {
        return roadBehaviorDescription;
    }

    /**
     * Sets the value of the roadBehaviorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadBehaviorDescription(String value) {
        this.roadBehaviorDescription = value;
    }

}
