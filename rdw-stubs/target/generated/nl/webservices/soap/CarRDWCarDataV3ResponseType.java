
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carRDWCarDataV3ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carRDWCarDataV3ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}CarDataV3Result"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carRDWCarDataV3ResponseType", propOrder = {

})
public class CarRDWCarDataV3ResponseType {

    @XmlElement(required = true)
    protected CarDataV3Result out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link CarDataV3Result }
     *     
     */
    public CarDataV3Result getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarDataV3Result }
     *     
     */
    public void setOut(CarDataV3Result value) {
        this.out = value;
    }

}
