
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarBP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarBP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="license_plate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="colors" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuel_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarBP", propOrder = {

})
public class CarBP {

    @XmlElement(name = "license_plate", required = true)
    protected String licensePlate;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String brand;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(required = true)
    protected String colors;
    @XmlElement(name = "fuel_type", required = true)
    protected String fuelType;
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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColors() {
        return colors;
    }

    /**
     * Sets the value of the colors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColors(String value) {
        this.colors = value;
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

}
