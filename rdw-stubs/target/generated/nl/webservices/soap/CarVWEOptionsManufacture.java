
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarVWEOptionsManufacture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEOptionsManufacture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="license_plate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="atl_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="options" type="{http://www.webservices.nl/soap/}CarVWEOptionArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEOptionsManufacture", propOrder = {

})
public class CarVWEOptionsManufacture {

    @XmlElement(name = "license_plate", required = true)
    protected String licensePlate;
    @XmlElement(name = "atl_code")
    protected int atlCode;
    @XmlElement(required = true)
    protected CarVWEOptionArray options;

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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link CarVWEOptionArray }
     *     
     */
    public CarVWEOptionArray getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVWEOptionArray }
     *     
     */
    public void setOptions(CarVWEOptionArray value) {
        this.options = value;
    }

}
