
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterHypothecairBerichtResultaat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypothecairBerichtResultaat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="overzicht" type="{http://www.webservices.nl/soap/}kadasterOverzicht" minOccurs="0"/>
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
@XmlType(name = "kadasterHypothecairBerichtResultaat", propOrder = {

})
public class KadasterHypothecairBerichtResultaat {

    protected KadasterOverzicht overzicht;
    protected KadasterHypothecairBerichtObject hypothecairbericht;

    /**
     * Gets the value of the overzicht property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzicht }
     *     
     */
    public KadasterOverzicht getOverzicht() {
        return overzicht;
    }

    /**
     * Sets the value of the overzicht property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzicht }
     *     
     */
    public void setOverzicht(KadasterOverzicht value) {
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
