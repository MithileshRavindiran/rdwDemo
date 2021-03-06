
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessSBICodeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSBICodeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="section" type="{http://www.webservices.nl/soap/}BusinessSBISection"/>
 *         &lt;element name="sbicodes" type="{http://www.webservices.nl/soap/}BusinessSBICodeArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSBICodeInfo", propOrder = {

})
public class BusinessSBICodeInfo {

    @XmlElement(required = true)
    protected BusinessSBISection section;
    @XmlElement(required = true)
    protected BusinessSBICodeArray sbicodes;

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSBISection }
     *     
     */
    public BusinessSBISection getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSBISection }
     *     
     */
    public void setSection(BusinessSBISection value) {
        this.section = value;
    }

    /**
     * Gets the value of the sbicodes property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessSBICodeArray }
     *     
     */
    public BusinessSBICodeArray getSbicodes() {
        return sbicodes;
    }

    /**
     * Sets the value of the sbicodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSBICodeArray }
     *     
     */
    public void setSbicodes(BusinessSBICodeArray value) {
        this.sbicodes = value;
    }

}
