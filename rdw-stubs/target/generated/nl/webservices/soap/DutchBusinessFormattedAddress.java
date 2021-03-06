
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessFormattedAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessFormattedAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="original" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="official" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *         &lt;element name="formatted" type="{http://www.webservices.nl/soap/}DutchBusinessAddressV3" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessFormattedAddress", propOrder = {

})
public class DutchBusinessFormattedAddress {

    protected DutchBusinessAddressV3 original;
    protected DutchBusinessAddressV3 official;
    protected DutchBusinessAddressV3 formatted;

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setOriginal(DutchBusinessAddressV3 value) {
        this.original = value;
    }

    /**
     * Gets the value of the official property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getOfficial() {
        return official;
    }

    /**
     * Sets the value of the official property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setOfficial(DutchBusinessAddressV3 value) {
        this.official = value;
    }

    /**
     * Gets the value of the formatted property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public DutchBusinessAddressV3 getFormatted() {
        return formatted;
    }

    /**
     * Sets the value of the formatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessAddressV3 }
     *     
     */
    public void setFormatted(DutchBusinessAddressV3 value) {
        this.formatted = value;
    }

}
