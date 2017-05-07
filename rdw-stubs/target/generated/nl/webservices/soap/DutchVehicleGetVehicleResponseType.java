
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dutchVehicleGetVehicleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchVehicleGetVehicleResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}DutchVehicle"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchVehicleGetVehicleResponseType", propOrder = {

})
public class DutchVehicleGetVehicleResponseType {

    @XmlElement(required = true)
    protected DutchVehicle out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicle }
     *     
     */
    public DutchVehicle getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicle }
     *     
     */
    public void setOut(DutchVehicle value) {
        this.out = value;
    }

}
