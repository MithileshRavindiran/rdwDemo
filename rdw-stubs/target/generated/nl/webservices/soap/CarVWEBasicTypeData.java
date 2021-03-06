
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarVWEBasicTypeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEBasicTypeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand_rdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand_atl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model_rdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model_atl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="short_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colors" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="fuel_types" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="cylinders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cylinder_capacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="standing_room" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unladen_mass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gross_vehicle_mass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximum_mass_payload" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="date_first_issuing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_first_admission" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_latest_name_registration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="apk_due_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="bpm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bpm_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="g3_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="co2_emission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="emission_particles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="energy_label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emission_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interior_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interior_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tax_write_off" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parallel_import" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="license_plate_signal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand_approval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="top_speed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="types" type="{http://www.webservices.nl/soap/}CarVWEVersionPriceReferenceArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEBasicTypeData", propOrder = {

})
public class CarVWEBasicTypeData {

    protected String category;
    @XmlElement(name = "brand_rdw")
    protected String brandRdw;
    @XmlElement(name = "brand_atl")
    protected String brandAtl;
    @XmlElement(name = "model_rdw")
    protected String modelRdw;
    @XmlElement(name = "model_atl")
    protected String modelAtl;
    @XmlElement(name = "short_type")
    protected String shortType;
    @XmlElement(required = true)
    protected StringArray colors;
    @XmlElement(name = "fuel_types", required = true)
    protected StringArray fuelTypes;
    protected Integer cylinders;
    @XmlElement(name = "cylinder_capacity")
    protected Integer cylinderCapacity;
    protected Integer seats;
    @XmlElement(name = "standing_room")
    protected Integer standingRoom;
    @XmlElement(name = "unladen_mass")
    protected Integer unladenMass;
    @XmlElement(name = "gross_vehicle_mass")
    protected Integer grossVehicleMass;
    @XmlElement(name = "maximum_mass_payload")
    protected Integer maximumMassPayload;
    @XmlElement(name = "date_first_issuing")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFirstIssuing;
    @XmlElement(name = "date_first_admission")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFirstAdmission;
    @XmlElement(name = "date_latest_name_registration")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLatestNameRegistration;
    @XmlElement(name = "apk_due_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar apkDueDate;
    protected Integer bpm;
    @XmlElement(name = "bpm_currency")
    protected String bpmCurrency;
    protected Integer power;
    @XmlElement(name = "g3_indication")
    protected Boolean g3Indication;
    @XmlElement(name = "co2_emission")
    protected Integer co2Emission;
    @XmlElement(name = "emission_particles")
    protected String emissionParticles;
    @XmlElement(name = "energy_label")
    protected String energyLabel;
    @XmlElement(name = "emission_code")
    protected String emissionCode;
    @XmlElement(name = "interior_code")
    protected String interiorCode;
    @XmlElement(name = "interior_description")
    protected String interiorDescription;
    protected Integer doors;
    @XmlElement(name = "tax_write_off")
    protected String taxWriteOff;
    @XmlElement(name = "parallel_import")
    protected Boolean parallelImport;
    @XmlElement(name = "license_plate_signal")
    protected String licensePlateSignal;
    protected String gear;
    @XmlElement(name = "brand_approval")
    protected String brandApproval;
    @XmlElement(name = "top_speed")
    protected Integer topSpeed;
    @XmlElement(required = true)
    protected CarVWEVersionPriceReferenceArray types;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the brandRdw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandRdw() {
        return brandRdw;
    }

    /**
     * Sets the value of the brandRdw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandRdw(String value) {
        this.brandRdw = value;
    }

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
     * Gets the value of the modelRdw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelRdw() {
        return modelRdw;
    }

    /**
     * Sets the value of the modelRdw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelRdw(String value) {
        this.modelRdw = value;
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
     * Gets the value of the colors property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getColors() {
        return colors;
    }

    /**
     * Sets the value of the colors property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setColors(StringArray value) {
        this.colors = value;
    }

    /**
     * Gets the value of the fuelTypes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getFuelTypes() {
        return fuelTypes;
    }

    /**
     * Sets the value of the fuelTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setFuelTypes(StringArray value) {
        this.fuelTypes = value;
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
     * Gets the value of the standingRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStandingRoom() {
        return standingRoom;
    }

    /**
     * Sets the value of the standingRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStandingRoom(Integer value) {
        this.standingRoom = value;
    }

    /**
     * Gets the value of the unladenMass property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnladenMass() {
        return unladenMass;
    }

    /**
     * Sets the value of the unladenMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnladenMass(Integer value) {
        this.unladenMass = value;
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
     * Gets the value of the dateFirstIssuing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFirstIssuing() {
        return dateFirstIssuing;
    }

    /**
     * Sets the value of the dateFirstIssuing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFirstIssuing(XMLGregorianCalendar value) {
        this.dateFirstIssuing = value;
    }

    /**
     * Gets the value of the dateFirstAdmission property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFirstAdmission() {
        return dateFirstAdmission;
    }

    /**
     * Sets the value of the dateFirstAdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFirstAdmission(XMLGregorianCalendar value) {
        this.dateFirstAdmission = value;
    }

    /**
     * Gets the value of the dateLatestNameRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLatestNameRegistration() {
        return dateLatestNameRegistration;
    }

    /**
     * Sets the value of the dateLatestNameRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLatestNameRegistration(XMLGregorianCalendar value) {
        this.dateLatestNameRegistration = value;
    }

    /**
     * Gets the value of the apkDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApkDueDate() {
        return apkDueDate;
    }

    /**
     * Sets the value of the apkDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApkDueDate(XMLGregorianCalendar value) {
        this.apkDueDate = value;
    }

    /**
     * Gets the value of the bpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBpm() {
        return bpm;
    }

    /**
     * Sets the value of the bpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBpm(Integer value) {
        this.bpm = value;
    }

    /**
     * Gets the value of the bpmCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpmCurrency() {
        return bpmCurrency;
    }

    /**
     * Sets the value of the bpmCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpmCurrency(String value) {
        this.bpmCurrency = value;
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
     * Gets the value of the co2Emission property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCo2Emission() {
        return co2Emission;
    }

    /**
     * Sets the value of the co2Emission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCo2Emission(Integer value) {
        this.co2Emission = value;
    }

    /**
     * Gets the value of the emissionParticles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmissionParticles() {
        return emissionParticles;
    }

    /**
     * Sets the value of the emissionParticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmissionParticles(String value) {
        this.emissionParticles = value;
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
     * Gets the value of the interiorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteriorCode() {
        return interiorCode;
    }

    /**
     * Sets the value of the interiorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteriorCode(String value) {
        this.interiorCode = value;
    }

    /**
     * Gets the value of the interiorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteriorDescription() {
        return interiorDescription;
    }

    /**
     * Sets the value of the interiorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteriorDescription(String value) {
        this.interiorDescription = value;
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
     * Gets the value of the taxWriteOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxWriteOff() {
        return taxWriteOff;
    }

    /**
     * Sets the value of the taxWriteOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxWriteOff(String value) {
        this.taxWriteOff = value;
    }

    /**
     * Gets the value of the parallelImport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallelImport() {
        return parallelImport;
    }

    /**
     * Sets the value of the parallelImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelImport(Boolean value) {
        this.parallelImport = value;
    }

    /**
     * Gets the value of the licensePlateSignal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlateSignal() {
        return licensePlateSignal;
    }

    /**
     * Sets the value of the licensePlateSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlateSignal(String value) {
        this.licensePlateSignal = value;
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
     * Gets the value of the brandApproval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandApproval() {
        return brandApproval;
    }

    /**
     * Sets the value of the brandApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandApproval(String value) {
        this.brandApproval = value;
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
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link CarVWEVersionPriceReferenceArray }
     *     
     */
    public CarVWEVersionPriceReferenceArray getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVWEVersionPriceReferenceArray }
     *     
     */
    public void setTypes(CarVWEVersionPriceReferenceArray value) {
        this.types = value;
    }

}
