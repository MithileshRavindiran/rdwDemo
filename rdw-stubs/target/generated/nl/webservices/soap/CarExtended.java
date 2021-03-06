
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarExtended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="license_plate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="check_code_status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brand_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="body_style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colors" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="fuel_types" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="cylinders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cylinder_capacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standing_room" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unladen_mass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gross_vehicle_mass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mass_ready" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximum_mass_payload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximum_mass_unbraked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximum_mass_braked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximum_mass_trailer_braked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximum_mass_self_braked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximum_mass_axle_braked" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date_first_issuing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_first_admission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_latest_name_registration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apk_due_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bpm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="g3_indicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="particulate_filter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="co2_emission_combined" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emission_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="top_speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuel_consumption_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuel_consumption_freeway" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuel_consumption_combined" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="energy_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stolen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="insured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="license_plate_signal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="awaiting_inspection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="catalog_price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="european_type_approval_mark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="types" type="{http://www.webservices.nl/soap/}CarTypeArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarExtended", propOrder = {

})
public class CarExtended {

    @XmlElement(name = "license_plate", required = true)
    protected String licensePlate;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(name = "check_code_status")
    protected boolean checkCodeStatus;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String brand;
    @XmlElement(name = "brand_code", required = true)
    protected String brandCode;
    @XmlElement(required = true)
    protected StringArray model;
    @XmlElement(name = "body_style", required = true)
    protected String bodyStyle;
    @XmlElement(required = true)
    protected StringArray colors;
    @XmlElement(name = "fuel_types", required = true)
    protected StringArray fuelTypes;
    protected int cylinders;
    @XmlElement(name = "cylinder_capacity")
    protected int cylinderCapacity;
    protected int seats;
    @XmlElement(name = "standing_room")
    protected int standingRoom;
    @XmlElement(name = "unladen_mass")
    protected int unladenMass;
    @XmlElement(name = "gross_vehicle_mass")
    protected int grossVehicleMass;
    @XmlElement(name = "mass_ready")
    protected int massReady;
    @XmlElement(name = "maximum_mass_payload")
    protected int maximumMassPayload;
    @XmlElement(name = "maximum_mass_unbraked")
    protected int maximumMassUnbraked;
    @XmlElement(name = "maximum_mass_braked")
    protected int maximumMassBraked;
    @XmlElement(name = "maximum_mass_trailer_braked")
    protected int maximumMassTrailerBraked;
    @XmlElement(name = "maximum_mass_self_braked")
    protected int maximumMassSelfBraked;
    @XmlElement(name = "maximum_mass_axle_braked")
    protected int maximumMassAxleBraked;
    @XmlElement(name = "date_first_issuing", required = true)
    protected String dateFirstIssuing;
    @XmlElement(name = "date_first_admission", required = true)
    protected String dateFirstAdmission;
    @XmlElement(name = "date_latest_name_registration", required = true)
    protected String dateLatestNameRegistration;
    @XmlElement(name = "apk_due_date", required = true)
    protected String apkDueDate;
    protected int bpm;
    protected int power;
    @XmlElement(name = "g3_indicator", required = true)
    protected String g3Indicator;
    @XmlElement(name = "particulate_filter", required = true)
    protected String particulateFilter;
    @XmlElement(name = "co2_emission_combined", required = true)
    protected String co2EmissionCombined;
    @XmlElement(name = "emission_code", required = true)
    protected String emissionCode;
    @XmlElement(name = "top_speed")
    protected int topSpeed;
    @XmlElement(name = "fuel_consumption_city", required = true)
    protected String fuelConsumptionCity;
    @XmlElement(name = "fuel_consumption_freeway", required = true)
    protected String fuelConsumptionFreeway;
    @XmlElement(name = "fuel_consumption_combined", required = true)
    protected String fuelConsumptionCombined;
    @XmlElement(name = "energy_label", required = true)
    protected String energyLabel;
    protected boolean stolen;
    protected boolean insured;
    @XmlElement(name = "license_plate_signal")
    protected boolean licensePlateSignal;
    @XmlElement(name = "awaiting_inspection")
    protected boolean awaitingInspection;
    @XmlElement(name = "catalog_price", required = true)
    protected String catalogPrice;
    @XmlElement(name = "european_type_approval_mark", required = true)
    protected String europeanTypeApprovalMark;
    protected CarTypeArray types;

    /**
     * Gets the value of the licensePlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Sets the value of the licensePlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlate(String value) {
        this.licensePlate = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the checkCodeStatus property.
     * 
     */
    public boolean isCheckCodeStatus() {
        return checkCodeStatus;
    }

    /**
     * Sets the value of the checkCodeStatus property.
     * 
     */
    public void setCheckCodeStatus(boolean value) {
        this.checkCodeStatus = value;
    }

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
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setModel(StringArray value) {
        this.model = value;
    }

    /**
     * Gets the value of the bodyStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyStyle() {
        return bodyStyle;
    }

    /**
     * Sets the value of the bodyStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyStyle(String value) {
        this.bodyStyle = value;
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
     */
    public int getCylinders() {
        return cylinders;
    }

    /**
     * Sets the value of the cylinders property.
     * 
     */
    public void setCylinders(int value) {
        this.cylinders = value;
    }

    /**
     * Gets the value of the cylinderCapacity property.
     * 
     */
    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * Sets the value of the cylinderCapacity property.
     * 
     */
    public void setCylinderCapacity(int value) {
        this.cylinderCapacity = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     */
    public void setSeats(int value) {
        this.seats = value;
    }

    /**
     * Gets the value of the standingRoom property.
     * 
     */
    public int getStandingRoom() {
        return standingRoom;
    }

    /**
     * Sets the value of the standingRoom property.
     * 
     */
    public void setStandingRoom(int value) {
        this.standingRoom = value;
    }

    /**
     * Gets the value of the unladenMass property.
     * 
     */
    public int getUnladenMass() {
        return unladenMass;
    }

    /**
     * Sets the value of the unladenMass property.
     * 
     */
    public void setUnladenMass(int value) {
        this.unladenMass = value;
    }

    /**
     * Gets the value of the grossVehicleMass property.
     * 
     */
    public int getGrossVehicleMass() {
        return grossVehicleMass;
    }

    /**
     * Sets the value of the grossVehicleMass property.
     * 
     */
    public void setGrossVehicleMass(int value) {
        this.grossVehicleMass = value;
    }

    /**
     * Gets the value of the massReady property.
     * 
     */
    public int getMassReady() {
        return massReady;
    }

    /**
     * Sets the value of the massReady property.
     * 
     */
    public void setMassReady(int value) {
        this.massReady = value;
    }

    /**
     * Gets the value of the maximumMassPayload property.
     * 
     */
    public int getMaximumMassPayload() {
        return maximumMassPayload;
    }

    /**
     * Sets the value of the maximumMassPayload property.
     * 
     */
    public void setMaximumMassPayload(int value) {
        this.maximumMassPayload = value;
    }

    /**
     * Gets the value of the maximumMassUnbraked property.
     * 
     */
    public int getMaximumMassUnbraked() {
        return maximumMassUnbraked;
    }

    /**
     * Sets the value of the maximumMassUnbraked property.
     * 
     */
    public void setMaximumMassUnbraked(int value) {
        this.maximumMassUnbraked = value;
    }

    /**
     * Gets the value of the maximumMassBraked property.
     * 
     */
    public int getMaximumMassBraked() {
        return maximumMassBraked;
    }

    /**
     * Sets the value of the maximumMassBraked property.
     * 
     */
    public void setMaximumMassBraked(int value) {
        this.maximumMassBraked = value;
    }

    /**
     * Gets the value of the maximumMassTrailerBraked property.
     * 
     */
    public int getMaximumMassTrailerBraked() {
        return maximumMassTrailerBraked;
    }

    /**
     * Sets the value of the maximumMassTrailerBraked property.
     * 
     */
    public void setMaximumMassTrailerBraked(int value) {
        this.maximumMassTrailerBraked = value;
    }

    /**
     * Gets the value of the maximumMassSelfBraked property.
     * 
     */
    public int getMaximumMassSelfBraked() {
        return maximumMassSelfBraked;
    }

    /**
     * Sets the value of the maximumMassSelfBraked property.
     * 
     */
    public void setMaximumMassSelfBraked(int value) {
        this.maximumMassSelfBraked = value;
    }

    /**
     * Gets the value of the maximumMassAxleBraked property.
     * 
     */
    public int getMaximumMassAxleBraked() {
        return maximumMassAxleBraked;
    }

    /**
     * Sets the value of the maximumMassAxleBraked property.
     * 
     */
    public void setMaximumMassAxleBraked(int value) {
        this.maximumMassAxleBraked = value;
    }

    /**
     * Gets the value of the dateFirstIssuing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFirstIssuing() {
        return dateFirstIssuing;
    }

    /**
     * Sets the value of the dateFirstIssuing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFirstIssuing(String value) {
        this.dateFirstIssuing = value;
    }

    /**
     * Gets the value of the dateFirstAdmission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFirstAdmission() {
        return dateFirstAdmission;
    }

    /**
     * Sets the value of the dateFirstAdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFirstAdmission(String value) {
        this.dateFirstAdmission = value;
    }

    /**
     * Gets the value of the dateLatestNameRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLatestNameRegistration() {
        return dateLatestNameRegistration;
    }

    /**
     * Sets the value of the dateLatestNameRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLatestNameRegistration(String value) {
        this.dateLatestNameRegistration = value;
    }

    /**
     * Gets the value of the apkDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApkDueDate() {
        return apkDueDate;
    }

    /**
     * Sets the value of the apkDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApkDueDate(String value) {
        this.apkDueDate = value;
    }

    /**
     * Gets the value of the bpm property.
     * 
     */
    public int getBpm() {
        return bpm;
    }

    /**
     * Sets the value of the bpm property.
     * 
     */
    public void setBpm(int value) {
        this.bpm = value;
    }

    /**
     * Gets the value of the power property.
     * 
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     */
    public void setPower(int value) {
        this.power = value;
    }

    /**
     * Gets the value of the g3Indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG3Indicator() {
        return g3Indicator;
    }

    /**
     * Sets the value of the g3Indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG3Indicator(String value) {
        this.g3Indicator = value;
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
     * Gets the value of the co2EmissionCombined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCo2EmissionCombined() {
        return co2EmissionCombined;
    }

    /**
     * Sets the value of the co2EmissionCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCo2EmissionCombined(String value) {
        this.co2EmissionCombined = value;
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
     * Gets the value of the topSpeed property.
     * 
     */
    public int getTopSpeed() {
        return topSpeed;
    }

    /**
     * Sets the value of the topSpeed property.
     * 
     */
    public void setTopSpeed(int value) {
        this.topSpeed = value;
    }

    /**
     * Gets the value of the fuelConsumptionCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelConsumptionCity() {
        return fuelConsumptionCity;
    }

    /**
     * Sets the value of the fuelConsumptionCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelConsumptionCity(String value) {
        this.fuelConsumptionCity = value;
    }

    /**
     * Gets the value of the fuelConsumptionFreeway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelConsumptionFreeway() {
        return fuelConsumptionFreeway;
    }

    /**
     * Sets the value of the fuelConsumptionFreeway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelConsumptionFreeway(String value) {
        this.fuelConsumptionFreeway = value;
    }

    /**
     * Gets the value of the fuelConsumptionCombined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelConsumptionCombined() {
        return fuelConsumptionCombined;
    }

    /**
     * Sets the value of the fuelConsumptionCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelConsumptionCombined(String value) {
        this.fuelConsumptionCombined = value;
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
     * Gets the value of the stolen property.
     * 
     */
    public boolean isStolen() {
        return stolen;
    }

    /**
     * Sets the value of the stolen property.
     * 
     */
    public void setStolen(boolean value) {
        this.stolen = value;
    }

    /**
     * Gets the value of the insured property.
     * 
     */
    public boolean isInsured() {
        return insured;
    }

    /**
     * Sets the value of the insured property.
     * 
     */
    public void setInsured(boolean value) {
        this.insured = value;
    }

    /**
     * Gets the value of the licensePlateSignal property.
     * 
     */
    public boolean isLicensePlateSignal() {
        return licensePlateSignal;
    }

    /**
     * Sets the value of the licensePlateSignal property.
     * 
     */
    public void setLicensePlateSignal(boolean value) {
        this.licensePlateSignal = value;
    }

    /**
     * Gets the value of the awaitingInspection property.
     * 
     */
    public boolean isAwaitingInspection() {
        return awaitingInspection;
    }

    /**
     * Sets the value of the awaitingInspection property.
     * 
     */
    public void setAwaitingInspection(boolean value) {
        this.awaitingInspection = value;
    }

    /**
     * Gets the value of the catalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogPrice() {
        return catalogPrice;
    }

    /**
     * Sets the value of the catalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogPrice(String value) {
        this.catalogPrice = value;
    }

    /**
     * Gets the value of the europeanTypeApprovalMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuropeanTypeApprovalMark() {
        return europeanTypeApprovalMark;
    }

    /**
     * Sets the value of the europeanTypeApprovalMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuropeanTypeApprovalMark(String value) {
        this.europeanTypeApprovalMark = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link CarTypeArray }
     *     
     */
    public CarTypeArray getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarTypeArray }
     *     
     */
    public void setTypes(CarTypeArray value) {
        this.types = value;
    }

}
