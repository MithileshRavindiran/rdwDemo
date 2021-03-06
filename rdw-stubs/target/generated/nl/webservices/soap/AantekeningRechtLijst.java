
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AantekeningRechtLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AantekeningRechtLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="aantekeningen_recht" type="{http://www.webservices.nl/soap/}AantekeningRechtArray"/>
 *         &lt;element name="indicatie_compleet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AantekeningRechtLijst", propOrder = {

})
public class AantekeningRechtLijst {

    @XmlElement(name = "aantekeningen_recht", required = true)
    protected AantekeningRechtArray aantekeningenRecht;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the aantekeningenRecht property.
     * 
     * @return
     *     possible object is
     *     {@link AantekeningRechtArray }
     *     
     */
    public AantekeningRechtArray getAantekeningenRecht() {
        return aantekeningenRecht;
    }

    /**
     * Sets the value of the aantekeningenRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link AantekeningRechtArray }
     *     
     */
    public void setAantekeningenRecht(AantekeningRechtArray value) {
        this.aantekeningenRecht = value;
    }

    /**
     * Gets the value of the indicatieCompleet property.
     * 
     */
    public boolean isIndicatieCompleet() {
        return indicatieCompleet;
    }

    /**
     * Sets the value of the indicatieCompleet property.
     * 
     */
    public void setIndicatieCompleet(boolean value) {
        this.indicatieCompleet = value;
    }

}
