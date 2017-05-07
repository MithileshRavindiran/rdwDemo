
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerenigingVanEigenaren complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerenigingVanEigenaren">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bestuurder_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerenigingVanEigenaren", propOrder = {

})
public class VerenigingVanEigenaren {

    @XmlElement(required = true)
    protected String naam;
    @XmlElement(name = "bestuurder_id")
    protected String bestuurderId;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the bestuurderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestuurderId() {
        return bestuurderId;
    }

    /**
     * Sets the value of the bestuurderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestuurderId(String value) {
        this.bestuurderId = value;
    }

}
