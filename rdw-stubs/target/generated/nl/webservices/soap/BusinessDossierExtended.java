
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDossierExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDossierExtended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BasicDossierPart" type="{http://www.webservices.nl/soap/}BusinessDossierV3"/>
 *         &lt;element name="ExtendedDossierPart" type="{http://www.webservices.nl/soap/}BusinessDossierExtendedPart"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDossierExtended", propOrder = {

})
public class BusinessDossierExtended {

    @XmlElement(name = "BasicDossierPart", required = true)
    protected BusinessDossierV3 basicDossierPart;
    @XmlElement(name = "ExtendedDossierPart", required = true)
    protected BusinessDossierExtendedPart extendedDossierPart;

    /**
     * Gets the value of the basicDossierPart property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDossierV3 }
     *     
     */
    public BusinessDossierV3 getBasicDossierPart() {
        return basicDossierPart;
    }

    /**
     * Sets the value of the basicDossierPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDossierV3 }
     *     
     */
    public void setBasicDossierPart(BusinessDossierV3 value) {
        this.basicDossierPart = value;
    }

    /**
     * Gets the value of the extendedDossierPart property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDossierExtendedPart }
     *     
     */
    public BusinessDossierExtendedPart getExtendedDossierPart() {
        return extendedDossierPart;
    }

    /**
     * Sets the value of the extendedDossierPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDossierExtendedPart }
     *     
     */
    public void setExtendedDossierPart(BusinessDossierExtendedPart value) {
        this.extendedDossierPart = value;
    }

}
