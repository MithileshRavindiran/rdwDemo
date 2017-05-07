
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carVWEListModelsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carVWEListModelsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="production_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kind_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="brand_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "carVWEListModelsRequestType", propOrder = {

})
public class CarVWEListModelsRequestType {

    @XmlElement(name = "production_year")
    protected int productionYear;
    @XmlElement(name = "kind_id")
    protected int kindId;
    @XmlElement(name = "brand_id")
    protected int brandId;
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
