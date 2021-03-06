
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarVWEVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="atl_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="version_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuel_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuel_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="body_style_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="body_style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="power" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gear_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valid_from" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="valid_until" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEVersion", propOrder = {

})
public class CarVWEVersion {

    @XmlElement(name = "atl_code")
    protected int atlCode;
    @XmlElement(name = "version_name", required = true)
    protected String versionName;
    @XmlElement(name = "fuel_type_id")
    protected int fuelTypeId;
    @XmlElement(name = "fuel_type", required = true)
    protected String fuelType;
    @XmlElement(name = "body_style_id")
    protected int bodyStyleId;
    @XmlElement(name = "body_style", required = true)
    protected String bodyStyle;
    protected int doors;
    protected int power;
    @XmlElement(name = "gear_id")
    protected int gearId;
    @XmlElement(required = true)
    protected String gear;
    @XmlElement(name = "valid_from", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "valid_until")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validUntil;

    /**
     * Gets the value of the atlCode property.
     * 
     */
    public int getAtlCode() {
        return atlCode;
    }

    /**
     * Sets the value of the atlCode property.
     * 
     */
    public void setAtlCode(int value) {
        this.atlCode = value;
    }

    /**
     * Gets the value of the versionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * Sets the value of the versionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionName(String value) {
        this.versionName = value;
    }

    /**
     * Gets the value of the fuelTypeId property.
     * 
     */
    public int getFuelTypeId() {
        return fuelTypeId;
    }

    /**
     * Sets the value of the fuelTypeId property.
     * 
     */
    public void setFuelTypeId(int value) {
        this.fuelTypeId = value;
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
     * Gets the value of the bodyStyleId property.
     * 
     */
    public int getBodyStyleId() {
        return bodyStyleId;
    }

    /**
     * Sets the value of the bodyStyleId property.
     * 
     */
    public void setBodyStyleId(int value) {
        this.bodyStyleId = value;
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
     * Gets the value of the doors property.
     * 
     */
    public int getDoors() {
        return doors;
    }

    /**
     * Sets the value of the doors property.
     * 
     */
    public void setDoors(int value) {
        this.doors = value;
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
     * Gets the value of the gearId property.
     * 
     */
    public int getGearId() {
        return gearId;
    }

    /**
     * Sets the value of the gearId property.
     * 
     */
    public void setGearId(int value) {
        this.gearId = value;
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
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

}
