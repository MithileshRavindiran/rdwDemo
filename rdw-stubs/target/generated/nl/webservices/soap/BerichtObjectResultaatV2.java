
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BerichtObjectResultaatV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerichtObjectResultaatV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}OverzichtV2" minOccurs="0"/>
 *         &lt;element name="eigendomsbericht" type="{http://www.webservices.nl/soap/}BerichtObjectV2" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtObjectResultaatV2", propOrder = {

})
public class BerichtObjectResultaatV2 {

    protected OverzichtV2 overzicht;
    protected BerichtObjectV2 eigendomsbericht;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link OverzichtV2 }
     *     
     */
    public OverzichtV2 getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtV2 }
     *     
     */
    public void setOverzicht(OverzichtV2 value) {
        this.overzicht = value;
    }

    /**
     * Gets the value of the eigendomsbericht property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtObjectV2 }
     *     
     */
    public BerichtObjectV2 getEigendomsbericht() {
        return eigendomsbericht;
    }

    /**
     * Sets the value of the eigendomsbericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtObjectV2 }
     *     
     */
    public void setEigendomsbericht(BerichtObjectV2 value) {
        this.eigendomsbericht = value;
    }

}
