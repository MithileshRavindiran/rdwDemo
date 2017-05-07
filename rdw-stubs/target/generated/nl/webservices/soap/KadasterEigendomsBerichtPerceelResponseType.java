
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterEigendomsBerichtPerceelResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterEigendomsBerichtPerceelResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="berichtobjectresultaat" type="{http://www.webservices.nl/soap/}BerichtObjectResultaat"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterEigendomsBerichtPerceelResponseType", propOrder = {

})
public class KadasterEigendomsBerichtPerceelResponseType {

    @XmlElement(required = true)
    protected BerichtObjectResultaat berichtobjectresultaat;

    /**
     * Gets the value of the berichtobjectresultaat property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtObjectResultaat }
     *     
     */
    public BerichtObjectResultaat getBerichtobjectresultaat() {
        return berichtobjectresultaat;
    }

    /**
     * Sets the value of the berichtobjectresultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtObjectResultaat }
     *     
     */
    public void setBerichtobjectresultaat(BerichtObjectResultaat value) {
        this.berichtobjectresultaat = value;
    }

}
