
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternationalV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternationalV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="address" type="{http://www.webservices.nl/soap/}InternationalFormattedAddress"/>
 *         &lt;element name="element_match_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="element_result_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalV2", propOrder = {

})
public class InternationalV2 {

    @XmlElement(required = true)
    protected InternationalFormattedAddress address;
    @XmlElement(name = "element_match_status", required = true)
    protected String elementMatchStatus;
    @XmlElement(name = "element_result_status", required = true)
    protected String elementResultStatus;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalFormattedAddress }
     *     
     */
    public InternationalFormattedAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalFormattedAddress }
     *     
     */
    public void setAddress(InternationalFormattedAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the elementMatchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementMatchStatus() {
        return elementMatchStatus;
    }

    /**
     * Sets the value of the elementMatchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementMatchStatus(String value) {
        this.elementMatchStatus = value;
    }

    /**
     * Gets the value of the elementResultStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementResultStatus() {
        return elementResultStatus;
    }

    /**
     * Sets the value of the elementResultStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementResultStatus(String value) {
        this.elementResultStatus = value;
    }

}
