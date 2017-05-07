
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleMarketValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleMarketValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="valuations" type="{http://www.webservices.nl/soap/}DutchVehiclePriceValuationArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleMarketValue", propOrder = {

})
public class DutchVehicleMarketValue {

    protected DutchVehiclePriceValuationArray valuations;

    /**
     * Gets the value of the valuations property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehiclePriceValuationArray }
     *     
     */
    public DutchVehiclePriceValuationArray getValuations() {
        return valuations;
    }

    /**
     * Sets the value of the valuations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehiclePriceValuationArray }
     *     
     */
    public void setValuations(DutchVehiclePriceValuationArray value) {
        this.valuations = value;
    }

}
