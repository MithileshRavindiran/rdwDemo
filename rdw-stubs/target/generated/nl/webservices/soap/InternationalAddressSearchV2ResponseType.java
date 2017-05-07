
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for internationalAddressSearchV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="internationalAddressSearchV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}InternationalAddressSearchV2Result"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "internationalAddressSearchV2ResponseType", propOrder = {

})
public class InternationalAddressSearchV2ResponseType {

    @XmlElement(required = true)
    protected InternationalAddressSearchV2Result out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalAddressSearchV2Result }
     *     
     */
    public InternationalAddressSearchV2Result getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalAddressSearchV2Result }
     *     
     */
    public void setOut(InternationalAddressSearchV2Result value) {
        this.out = value;
    }

}
