
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LidLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LidLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="leden" type="{http://www.webservices.nl/soap/}LidArray"/>
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
@XmlType(name = "LidLijst", propOrder = {

})
public class LidLijst {

    @XmlElement(required = true)
    protected LidArray leden;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the leden property.
     * 
     * @return
     *     possible object is
     *     {@link LidArray }
     *     
     */
    public LidArray getLeden() {
        return leden;
    }

    /**
     * Sets the value of the leden property.
     * 
     * @param value
     *     allowed object is
     *     {@link LidArray }
     *     
     */
    public void setLeden(LidArray value) {
        this.leden = value;
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
