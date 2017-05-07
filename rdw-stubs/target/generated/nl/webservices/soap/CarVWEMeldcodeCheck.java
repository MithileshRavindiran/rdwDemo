
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarVWEMeldcodeCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEMeldcodeCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="license_plate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEMeldcodeCheck", propOrder = {

})
public class CarVWEMeldcodeCheck {

    @XmlElement(name = "license_plate", required = true)
    protected String licensePlate;
    protected boolean correct;

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
     * Gets the value of the correct property.
     * 
     */
    public boolean isCorrect() {
        return correct;
    }

    /**
     * Sets the value of the correct property.
     * 
     */
    public void setCorrect(boolean value) {
        this.correct = value;
    }

}
