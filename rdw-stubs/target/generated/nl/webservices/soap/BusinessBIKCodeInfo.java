
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessBIKCodeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessBIKCodeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="sections" type="{http://www.webservices.nl/soap/}BusinessBIKSectionArray"/>
 *         &lt;element name="bikcodes" type="{http://www.webservices.nl/soap/}BusinessBIKCodeArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessBIKCodeInfo", propOrder = {

})
public class BusinessBIKCodeInfo {

    @XmlElement(required = true)
    protected BusinessBIKSectionArray sections;
    @XmlElement(required = true)
    protected BusinessBIKCodeArray bikcodes;

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessBIKSectionArray }
     *     
     */
    public BusinessBIKSectionArray getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessBIKSectionArray }
     *     
     */
    public void setSections(BusinessBIKSectionArray value) {
        this.sections = value;
    }

    /**
     * Gets the value of the bikcodes property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessBIKCodeArray }
     *     
     */
    public BusinessBIKCodeArray getBikcodes() {
        return bikcodes;
    }

    /**
     * Sets the value of the bikcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessBIKCodeArray }
     *     
     */
    public void setBikcodes(BusinessBIKCodeArray value) {
        this.bikcodes = value;
    }

}
