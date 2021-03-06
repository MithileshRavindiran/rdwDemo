
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerceelDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerceelDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="perceel" type="{http://www.webservices.nl/soap/}KadastraalPerceel" minOccurs="0"/>
 *         &lt;element name="appartementsrecht" type="{http://www.webservices.nl/soap/}VerenigingVanEigenaren" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerceelDetails", propOrder = {

})
public class PerceelDetails {

    protected KadastraalPerceel perceel;
    protected VerenigingVanEigenaren appartementsrecht;

    /**
     * Gets the value of the perceel property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraalPerceel }
     *     
     */
    public KadastraalPerceel getPerceel() {
        return perceel;
    }

    /**
     * Sets the value of the perceel property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraalPerceel }
     *     
     */
    public void setPerceel(KadastraalPerceel value) {
        this.perceel = value;
    }

    /**
     * Gets the value of the appartementsrecht property.
     * 
     * @return
     *     possible object is
     *     {@link VerenigingVanEigenaren }
     *     
     */
    public VerenigingVanEigenaren getAppartementsrecht() {
        return appartementsrecht;
    }

    /**
     * Sets the value of the appartementsrecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerenigingVanEigenaren }
     *     
     */
    public void setAppartementsrecht(VerenigingVanEigenaren value) {
        this.appartementsrecht = value;
    }

}
