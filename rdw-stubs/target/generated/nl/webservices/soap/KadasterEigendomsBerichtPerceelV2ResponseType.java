
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterEigendomsBerichtPerceelV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterEigendomsBerichtPerceelV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="berichtobjectresultaat" type="{http://www.webservices.nl/soap/}BerichtObjectResultaatV2"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterEigendomsBerichtPerceelV2ResponseType", propOrder = {

})
public class KadasterEigendomsBerichtPerceelV2ResponseType {

    @XmlElement(required = true)
    protected BerichtObjectResultaatV2 berichtobjectresultaat;

    /**
     * Gets the value of the berichtobjectresultaat property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtObjectResultaatV2 }
     *     
     */
    public BerichtObjectResultaatV2 getBerichtobjectresultaat() {
        return berichtobjectresultaat;
    }

    /**
     * Sets the value of the berichtobjectresultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtObjectResultaatV2 }
     *     
     */
    public void setBerichtobjectresultaat(BerichtObjectResultaatV2 value) {
        this.berichtobjectresultaat = value;
    }

}
