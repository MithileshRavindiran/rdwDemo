
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarVWEOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="options_standard" type="{http://www.webservices.nl/soap/}CarVWEOptionsStandard" minOccurs="0"/>
 *         &lt;element name="options_manufacture" type="{http://www.webservices.nl/soap/}CarVWEOptionsManufacture" minOccurs="0"/>
 *         &lt;element name="options_package" type="{http://www.webservices.nl/soap/}CarVWEOptionsPackage" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEOptions", propOrder = {

})
public class CarVWEOptions {

    @XmlElement(name = "options_standard")
    protected CarVWEOptionsStandard optionsStandard;
    @XmlElement(name = "options_manufacture")
    protected CarVWEOptionsManufacture optionsManufacture;
    @XmlElement(name = "options_package")
    protected CarVWEOptionsPackage optionsPackage;

    /**
     * Gets the value of the optionsStandard property.
     * 
     * @return
     *     possible object is
     *     {@link CarVWEOptionsStandard }
     *     
     */
    public CarVWEOptionsStandard getOptionsStandard() {
        return optionsStandard;
    }

    /**
     * Sets the value of the optionsStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVWEOptionsStandard }
     *     
     */
    public void setOptionsStandard(CarVWEOptionsStandard value) {
        this.optionsStandard = value;
    }

    /**
     * Gets the value of the optionsManufacture property.
     * 
     * @return
     *     possible object is
     *     {@link CarVWEOptionsManufacture }
     *     
     */
    public CarVWEOptionsManufacture getOptionsManufacture() {
        return optionsManufacture;
    }

    /**
     * Sets the value of the optionsManufacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVWEOptionsManufacture }
     *     
     */
    public void setOptionsManufacture(CarVWEOptionsManufacture value) {
        this.optionsManufacture = value;
    }

    /**
     * Gets the value of the optionsPackage property.
     * 
     * @return
     *     possible object is
     *     {@link CarVWEOptionsPackage }
     *     
     */
    public CarVWEOptionsPackage getOptionsPackage() {
        return optionsPackage;
    }

    /**
     * Sets the value of the optionsPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVWEOptionsPackage }
     *     
     */
    public void setOptionsPackage(CarVWEOptionsPackage value) {
        this.optionsPackage = value;
    }

}
