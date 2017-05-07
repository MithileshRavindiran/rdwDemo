
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AantekeningKadastraalObjectLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AantekeningKadastraalObjectLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="aantekeningen" type="{http://www.webservices.nl/soap/}AantekeningKadastraalObjectArray"/>
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
@XmlType(name = "AantekeningKadastraalObjectLijst", propOrder = {

})
public class AantekeningKadastraalObjectLijst {

    @XmlElement(required = true)
    protected AantekeningKadastraalObjectArray aantekeningen;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the aantekeningen property.
     * 
     * @return
     *     possible object is
     *     {@link AantekeningKadastraalObjectArray }
     *     
     */
    public AantekeningKadastraalObjectArray getAantekeningen() {
        return aantekeningen;
    }

    /**
     * Sets the value of the aantekeningen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AantekeningKadastraalObjectArray }
     *     
     */
    public void setAantekeningen(AantekeningKadastraalObjectArray value) {
        this.aantekeningen = value;
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
