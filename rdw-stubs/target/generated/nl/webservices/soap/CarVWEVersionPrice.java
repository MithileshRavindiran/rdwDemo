
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarVWEVersionPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEVersionPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="brand_atl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model_atl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="short_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fuel_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cylinder_capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="energy_label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emission_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="top_speed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="folder_weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="train_weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="design" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acceleration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sportivity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.webservices.nl/soap/}CarVWEVersionPriceReference"/>
 *         &lt;element name="prices" type="{http://www.webservices.nl/soap/}CarVWEPrices"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEVersionPrice", propOrder = {

})
public class CarVWEVersionPrice {

    @XmlElement(name = "brand_atl")
    protected String brandAtl;
    @XmlElement(name = "model_atl")
    protected String modelAtl;
    @XmlElement(name = "short_type")
    protected String shortType;
    @XmlElement(name = "fuel_type")
    protected String fuelType;
    @XmlElement(name = "cylinder_capacity")
    protected Integer cylinderCapacity;
    protected Integer seats;
    protected Integer power;
    @XmlElement(name = "energy_label")
    protected String energyLabel;
    @XmlElement(name = "emission_code")
    protected String emissionCode;
    protected Integer doors;
    protected String gear;
    @XmlElement(name = "top_speed")
    protected Integer topSpeed;
    @XmlElement(name = "folder_weight")
    protected Integer folderWeight;
    @XmlElement(name = "train_weight")
    protected Integer trainWeight;
    protected String layout;
    protected String design;
    protected BigDecimal acceleration;
    protected Float sportivity;
    @XmlElement(required = true)
    protected CarVWEVersionPriceReference version;
    @XmlElement(required = true)
    protected CarVWEPrices prices;

    /**
     * Gets the value of the brandAtl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandAtl() {
        return brandAtl;
    }

    /**
     * Sets the value of the brandAtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandAtl(String value) {
        this.brandAtl = value;
    }

    /**
     * Gets the value of the modelAtl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelAtl() {
        return modelAtl;
    }

    /**
     * Sets the value of the modelAtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelAtl(String value) {
        this.modelAtl = value;
    }

    /**
     * Gets the value of the shortType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortType() {
        return shortType;
    }

    /**
     * Sets the value of the shortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortType(String value) {
        this.shortType = value;
    }

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
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeats(Integer value) {
        this.seats = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPower(Integer value) {
        this.power = value;
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
     * Gets the value of the doors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDoors() {
        return doors;
    }

    /**
     * Sets the value of the doors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDoors(Integer value) {
        this.doors = value;
    }

    /**
     * Gets the value of the gear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGear() {
        return gear;
    }

    /**
     * Sets the value of the gear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGear(String value) {
        this.gear = value;
    }

    /**
     * Gets the value of the topSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopSpeed() {
        return topSpeed;
    }

    /**
     * Sets the value of the topSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopSpeed(Integer value) {
        this.topSpeed = value;
    }

    /**
     * Gets the value of the folderWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderWeight() {
        return folderWeight;
    }

    /**
     * Sets the value of the folderWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderWeight(Integer value) {
        this.folderWeight = value;
    }

    /**
     * Gets the value of the trainWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainWeight() {
        return trainWeight;
    }

    /**
     * Sets the value of the trainWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainWeight(Integer value) {
        this.trainWeight = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesign(String value) {
        this.design = value;
    }

    /**
     * Gets the value of the acceleration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcceleration() {
        return acceleration;
    }

    /**
     * Sets the value of the acceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcceleration(BigDecimal value) {
        this.acceleration = value;
    }

    /**
     * Gets the value of the sportivity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSportivity() {
        return sportivity;
    }

    /**
     * Sets the value of the sportivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSportivity(Float value) {
        this.sportivity = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link CarVWEVersionPriceReference }
     *     
     */
    public CarVWEVersionPriceReference getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVWEVersionPriceReference }
     *     
     */
    public void setVersion(CarVWEVersionPriceReference value) {
        this.version = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link CarVWEPrices }
     *     
     */
    public CarVWEPrices getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVWEPrices }
     *     
     */
    public void setPrices(CarVWEPrices value) {
        this.prices = value;
    }

}
