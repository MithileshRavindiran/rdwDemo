
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterKoopsommenOverzichtRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterKoopsommenOverzichtRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterKoopsommenOverzichtRequestType", propOrder = {

})
public class KadasterKoopsommenOverzichtRequestType {

    @XmlElement(required = true)
    protected String postcode;
    protected int huisnummer;

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     */
    public int getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     */
    public void setHuisnummer(int value) {
        this.huisnummer = value;
    }

}
