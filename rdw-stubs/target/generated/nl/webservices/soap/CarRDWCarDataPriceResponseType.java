
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carRDWCarDataPriceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carRDWCarDataPriceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}CarRDWCarDataPrice"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carRDWCarDataPriceResponseType", propOrder = {

})
public class CarRDWCarDataPriceResponseType {

    @XmlElement(required = true)
    protected CarRDWCarDataPrice out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link CarRDWCarDataPrice }
     *     
     */
    public CarRDWCarDataPrice getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRDWCarDataPrice }
     *     
     */
    public void setOut(CarRDWCarDataPrice value) {
        this.out = value;
    }

}
