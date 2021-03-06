
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterHypothecairBerichtPerceelV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypothecairBerichtPerceelV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}kadasterHypothecairBerichtResultaat"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterHypothecairBerichtPerceelV2ResponseType", propOrder = {

})
public class KadasterHypothecairBerichtPerceelV2ResponseType {

    @XmlElement(required = true)
    protected KadasterHypothecairBerichtResultaat out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterHypothecairBerichtResultaat }
     *     
     */
    public KadasterHypothecairBerichtResultaat getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterHypothecairBerichtResultaat }
     *     
     */
    public void setOut(KadasterHypothecairBerichtResultaat value) {
        this.out = value;
    }

}
