
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterHypothecairBerichtResultaatV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypothecairBerichtResultaatV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}kadasterOverzichtV2" minOccurs="0"/>
 *         &lt;element name="hypothecairbericht" type="{http://www.webservices.nl/soap/}kadasterHypothecairBerichtObject" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterHypothecairBerichtResultaatV2", propOrder = {

})
public class KadasterHypothecairBerichtResultaatV2 {

    protected KadasterOverzichtV2 overzicht;
    protected KadasterHypothecairBerichtObject hypothecairbericht;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzichtV2 }
     *     
     */
    public KadasterOverzichtV2 getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzichtV2 }
     *     
     */
    public void setOverzicht(KadasterOverzichtV2 value) {
        this.overzicht = value;
    }

    /**
     * Gets the value of the hypothecairbericht property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterHypothecairBerichtObject }
     *     
     */
    public KadasterHypothecairBerichtObject getHypothecairbericht() {
        return hypothecairbericht;
    }

    /**
     * Sets the value of the hypothecairbericht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterHypothecairBerichtObject }
     *     
     */
    public void setHypothecairbericht(KadasterHypothecairBerichtObject value) {
        this.hypothecairbericht = value;
    }

}
