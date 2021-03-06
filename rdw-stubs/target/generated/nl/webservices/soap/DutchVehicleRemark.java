
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleRemark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleRemark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="vehicle_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variable_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleRemark", propOrder = {

})
public class DutchVehicleRemark {

    @XmlElement(name = "vehicle_code")
    protected String vehicleCode;
    @XmlElement(name = "variable_code")
    protected String variableCode;
    protected String description;

    /**
     * Gets the value of the vehicleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCode() {
        return vehicleCode;
    }

    /**
     * Sets the value of the vehicleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCode(String value) {
        this.vehicleCode = value;
    }

    /**
     * Gets the value of the variableCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableCode() {
        return variableCode;
    }

    /**
     * Sets the value of the variableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableCode(String value) {
        this.variableCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
