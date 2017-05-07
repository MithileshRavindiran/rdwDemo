
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessBIKToSBIRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessBIKToSBIRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bikcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessBIKToSBIRequestType", propOrder = {

})
public class BusinessBIKToSBIRequestType {

    @XmlElement(required = true)
    protected String bikcode;

    /**
     * Gets the value of the bikcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBikcode() {
        return bikcode;
    }

    /**
     * Sets the value of the bikcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBikcode(String value) {
        this.bikcode = value;
    }

}
