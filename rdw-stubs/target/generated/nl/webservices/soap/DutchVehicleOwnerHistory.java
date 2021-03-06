
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleOwnerHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleOwnerHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ownerships" type="{http://www.webservices.nl/soap/}DutchVehicleOwnershipArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleOwnerHistory", propOrder = {

})
public class DutchVehicleOwnerHistory {

    protected DutchVehicleOwnershipArray ownerships;

    /**
     * Gets the value of the ownerships property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleOwnershipArray }
     *     
     */
    public DutchVehicleOwnershipArray getOwnerships() {
        return ownerships;
    }

    /**
     * Sets the value of the ownerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleOwnershipArray }
     *     
     */
    public void setOwnerships(DutchVehicleOwnershipArray value) {
        this.ownerships = value;
    }

}
