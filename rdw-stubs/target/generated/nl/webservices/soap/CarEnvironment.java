
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarEnvironment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarEnvironment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="emission_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="energy_label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="g3_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="particulate_filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuel_usage_city" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fuel_usage_highway" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fuel_usage_combined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarEnvironment", propOrder = {

})
public class CarEnvironment {

    @XmlElement(name = "emission_code")
    protected String emissionCode;
    @XmlElement(name = "energy_label")
    protected String energyLabel;
    @XmlElement(name = "g3_indication")
    protected Boolean g3Indication;
    @XmlElement(name = "particulate_filter")
    protected String particulateFilter;
    @XmlElement(name = "fuel_usage_city")
    protected BigDecimal fuelUsageCity;
    @XmlElement(name = "fuel_usage_highway")
    protected BigDecimal fuelUsageHighway;
    @XmlElement(name = "fuel_usage_combined")
    protected BigDecimal fuelUsageCombined;

    /**
     * Gets the value of the emissionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissionCode() {
        return emissionCode;
    }

    /**
     * Sets the value of the emissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissionCode(String value) {
        this.emissionCode = value;
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
     * Gets the value of the particulateFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticulateFilter() {
        return particulateFilter;
    }

    /**
     * Sets the value of the particulateFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticulateFilter(String value) {
        this.particulateFilter = value;
    }

    /**
     * Gets the value of the fuelUsageCity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelUsageCity() {
        return fuelUsageCity;
    }

    /**
     * Sets the value of the fuelUsageCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelUsageCity(BigDecimal value) {
        this.fuelUsageCity = value;
    }

    /**
     * Gets the value of the fuelUsageHighway property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelUsageHighway() {
        return fuelUsageHighway;
    }

    /**
     * Sets the value of the fuelUsageHighway property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelUsageHighway(BigDecimal value) {
        this.fuelUsageHighway = value;
    }

    /**
     * Gets the value of the fuelUsageCombined property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelUsageCombined() {
        return fuelUsageCombined;
    }

    /**
     * Sets the value of the fuelUsageCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelUsageCombined(BigDecimal value) {
        this.fuelUsageCombined = value;
    }

}
