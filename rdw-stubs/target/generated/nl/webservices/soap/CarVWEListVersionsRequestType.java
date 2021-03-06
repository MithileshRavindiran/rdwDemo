
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carVWEListVersionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carVWEListVersionsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="production_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kind_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="brand_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuel_type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="body_style_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="doors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gear_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carVWEListVersionsRequestType", propOrder = {

})
public class CarVWEListVersionsRequestType {

    @XmlElement(name = "production_year")
    protected int productionYear;
    @XmlElement(name = "kind_id")
    protected int kindId;
    @XmlElement(name = "brand_id")
    protected int brandId;
    @XmlElement(name = "model_id")
    protected int modelId;
    @XmlElement(name = "fuel_type_id")
    protected int fuelTypeId;
    @XmlElement(name = "body_style_id")
    protected int bodyStyleId;
    protected int doors;
    @XmlElement(name = "gear_id")
    protected int gearId;
    protected int page;

    /**
     * Gets the value of the productionYear property.
     * 
     */
    public int getProductionYear() {
        return productionYear;
    }

    /**
     * Sets the value of the productionYear property.
     * 
     */
    public void setProductionYear(int value) {
        this.productionYear = value;
    }

    /**
     * Gets the value of the kindId property.
     * 
     */
    public int getKindId() {
        return kindId;
    }

    /**
     * Sets the value of the kindId property.
     * 
     */
    public void setKindId(int value) {
        this.kindId = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     */
    public void setBrandId(int value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     */
    public void setModelId(int value) {
        this.modelId = value;
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
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
