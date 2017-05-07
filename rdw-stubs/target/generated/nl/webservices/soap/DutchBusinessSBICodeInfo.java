
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessSBICodeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessSBICodeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="section" type="{http://www.webservices.nl/soap/}DutchBusinessSBISection"/>
 *         &lt;element name="sbi_codes" type="{http://www.webservices.nl/soap/}DutchBusinessSBICodeArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessSBICodeInfo", propOrder = {

})
public class DutchBusinessSBICodeInfo {

    @XmlElement(required = true)
    protected DutchBusinessSBISection section;
    @XmlElement(name = "sbi_codes", required = true)
    protected DutchBusinessSBICodeArray sbiCodes;

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessSBISection }
     *     
     */
    public DutchBusinessSBISection getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessSBISection }
     *     
     */
    public void setSection(DutchBusinessSBISection value) {
        this.section = value;
    }

    /**
     * Gets the value of the sbiCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessSBICodeArray }
     *     
     */
    public DutchBusinessSBICodeArray getSbiCodes() {
        return sbiCodes;
    }

    /**
     * Sets the value of the sbiCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessSBICodeArray }
     *     
     */
    public void setSbiCodes(DutchBusinessSBICodeArray value) {
        this.sbiCodes = value;
    }

}
