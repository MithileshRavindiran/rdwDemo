
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleEngine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleEngine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="cylinder_capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cylinders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="g3_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="energy_label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleEngine", propOrder = {

})
public class DutchVehicleEngine {

    @XmlElement(name = "cylinder_capacity")
    protected Integer cylinderCapacity;
    protected Integer cylinders;
    @XmlElement(name = "g3_indication")
    protected Boolean g3Indication;
    @XmlElement(name = "energy_label")
    protected String energyLabel;

    /**
     * Gets the value of the cylinderCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * Sets the value of the cylinderCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCylinderCapacity(Integer value) {
        this.cylinderCapacity = value;
    }

    /**
     * Gets the value of the cylinders property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCylinders() {
        return cylinders;
    }

    /**
     * Sets the value of the cylinders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCylinders(Integer value) {
        this.cylinders = value;
    }

    /**
     * Gets the value of the g3Indication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isG3Indication() {
        return g3Indication;
    }

    /**
     * Sets the value of the g3Indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setG3Indication(Boolean value) {
        this.g3Indication = value;
    }

    /**
     * Gets the value of the energyLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyLabel() {
        return energyLabel;
    }

    /**
     * Sets the value of the energyLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyLabel(String value) {
        this.energyLabel = value;
    }

}
