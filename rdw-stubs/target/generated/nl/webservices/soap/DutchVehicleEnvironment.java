
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleEnvironment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleEnvironment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fuel_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuel_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usage_city" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="usage_highway" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="usage_combined" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="max_power" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="max_power_continuous" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="noise_level_stationary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noise_level_stationary_rpm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noise_level_driving" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="emission_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="co2_emission_combined" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="co2_emission_weighted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="particulate_emission" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="particulate_filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emission_particles_light" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="emission_particles_heavy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleEnvironment", propOrder = {

})
public class DutchVehicleEnvironment {

    @XmlElement(name = "fuel_type")
    protected String fuelType;
    @XmlElement(name = "fuel_code")
    protected String fuelCode;
    @XmlElement(name = "usage_city")
    protected BigDecimal usageCity;
    @XmlElement(name = "usage_highway")
    protected BigDecimal usageHighway;
    @XmlElement(name = "usage_combined")
    protected BigDecimal usageCombined;
    @XmlElement(name = "max_power")
    protected BigDecimal maxPower;
    @XmlElement(name = "max_power_continuous")
    protected BigDecimal maxPowerContinuous;
    @XmlElement(name = "noise_level_stationary")
    protected Integer noiseLevelStationary;
    @XmlElement(name = "noise_level_stationary_rpm")
    protected Integer noiseLevelStationaryRpm;
    @XmlElement(name = "noise_level_driving")
    protected Integer noiseLevelDriving;
    @XmlElement(name = "emission_code")
    protected String emissionCode;
    @XmlElement(name = "co2_emission_combined")
    protected Integer co2EmissionCombined;
    @XmlElement(name = "co2_emission_weighted")
    protected Integer co2EmissionWeighted;
    @XmlElement(name = "particulate_emission")
    protected BigDecimal particulateEmission;
    @XmlElement(name = "particulate_filter")
    protected String particulateFilter;
    @XmlElement(name = "emission_particles_light")
    protected BigDecimal emissionParticlesLight;
    @XmlElement(name = "emission_particles_heavy")
    protected BigDecimal emissionParticlesHeavy;

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the fuelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelCode() {
        return fuelCode;
    }

    /**
     * Sets the value of the fuelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelCode(String value) {
        this.fuelCode = value;
    }

    /**
     * Gets the value of the usageCity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsageCity() {
        return usageCity;
    }

    /**
     * Sets the value of the usageCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsageCity(BigDecimal value) {
        this.usageCity = value;
    }

    /**
     * Gets the value of the usageHighway property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsageHighway() {
        return usageHighway;
    }

    /**
     * Sets the value of the usageHighway property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsageHighway(BigDecimal value) {
        this.usageHighway = value;
    }

    /**
     * Gets the value of the usageCombined property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsageCombined() {
        return usageCombined;
    }

    /**
     * Sets the value of the usageCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsageCombined(BigDecimal value) {
        this.usageCombined = value;
    }

    /**
     * Gets the value of the maxPower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPower() {
        return maxPower;
    }

    /**
     * Sets the value of the maxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPower(BigDecimal value) {
        this.maxPower = value;
    }

    /**
     * Gets the value of the maxPowerContinuous property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPowerContinuous() {
        return maxPowerContinuous;
    }

    /**
     * Sets the value of the maxPowerContinuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPowerContinuous(BigDecimal value) {
        this.maxPowerContinuous = value;
    }

    /**
     * Gets the value of the noiseLevelStationary property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoiseLevelStationary() {
        return noiseLevelStationary;
    }

    /**
     * Sets the value of the noiseLevelStationary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoiseLevelStationary(Integer value) {
        this.noiseLevelStationary = value;
    }

    /**
     * Gets the value of the noiseLevelStationaryRpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoiseLevelStationaryRpm() {
        return noiseLevelStationaryRpm;
    }

    /**
     * Sets the value of the noiseLevelStationaryRpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoiseLevelStationaryRpm(Integer value) {
        this.noiseLevelStationaryRpm = value;
    }

    /**
     * Gets the value of the noiseLevelDriving property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoiseLevelDriving() {
        return noiseLevelDriving;
    }

    /**
     * Sets the value of the noiseLevelDriving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoiseLevelDriving(Integer value) {
        this.noiseLevelDriving = value;
    }

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
     * Gets the value of the co2EmissionCombined property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCo2EmissionCombined() {
        return co2EmissionCombined;
    }

    /**
     * Sets the value of the co2EmissionCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCo2EmissionCombined(Integer value) {
        this.co2EmissionCombined = value;
    }

    /**
     * Gets the value of the co2EmissionWeighted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCo2EmissionWeighted() {
        return co2EmissionWeighted;
    }

    /**
     * Sets the value of the co2EmissionWeighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCo2EmissionWeighted(Integer value) {
        this.co2EmissionWeighted = value;
    }

    /**
     * Gets the value of the particulateEmission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParticulateEmission() {
        return particulateEmission;
    }

    /**
     * Sets the value of the particulateEmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParticulateEmission(BigDecimal value) {
        this.particulateEmission = value;
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
     * Gets the value of the emissionParticlesLight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmissionParticlesLight() {
        return emissionParticlesLight;
    }

    /**
     * Sets the value of the emissionParticlesLight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmissionParticlesLight(BigDecimal value) {
        this.emissionParticlesLight = value;
    }

    /**
     * Gets the value of the emissionParticlesHeavy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmissionParticlesHeavy() {
        return emissionParticlesHeavy;
    }

    /**
     * Sets the value of the emissionParticlesHeavy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmissionParticlesHeavy(BigDecimal value) {
        this.emissionParticlesHeavy = value;
    }

}
