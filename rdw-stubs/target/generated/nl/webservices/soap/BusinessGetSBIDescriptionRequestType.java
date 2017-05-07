
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessGetSBIDescriptionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessGetSBIDescriptionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sbicode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessGetSBIDescriptionRequestType", propOrder = {

})
public class BusinessGetSBIDescriptionRequestType {

    @XmlElement(required = true)
    protected String sbicode;

    /**
     * Gets the value of the sbicode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbicode() {
        return sbicode;
    }

    /**
     * Sets the value of the sbicode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbicode(String value) {
        this.sbicode = value;
    }

}
