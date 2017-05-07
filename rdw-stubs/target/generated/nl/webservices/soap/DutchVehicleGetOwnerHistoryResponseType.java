
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dutchVehicleGetOwnerHistoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchVehicleGetOwnerHistoryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}DutchVehicleOwnerHistory"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchVehicleGetOwnerHistoryResponseType", propOrder = {

})
public class DutchVehicleGetOwnerHistoryResponseType {

    @XmlElement(required = true)
    protected DutchVehicleOwnerHistory out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleOwnerHistory }
     *     
     */
    public DutchVehicleOwnerHistory getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleOwnerHistory }
     *     
     */
    public void setOut(DutchVehicleOwnerHistory value) {
        this.out = value;
    }

}
