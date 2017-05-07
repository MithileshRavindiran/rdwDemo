
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StukMetKadastraleAanduidingLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StukMetKadastraleAanduidingLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="stukken" type="{http://www.webservices.nl/soap/}StukMetKadastraleAanduidingArray"/>
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
@XmlType(name = "StukMetKadastraleAanduidingLijst", propOrder = {

})
public class StukMetKadastraleAanduidingLijst {

    @XmlElement(required = true)
    protected StukMetKadastraleAanduidingArray stukken;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the stukken property.
     * 
     * @return
     *     possible object is
     *     {@link StukMetKadastraleAanduidingArray }
     *     
     */
    public StukMetKadastraleAanduidingArray getStukken() {
        return stukken;
    }

    /**
     * Sets the value of the stukken property.
     * 
     * @param value
     *     allowed object is
     *     {@link StukMetKadastraleAanduidingArray }
     *     
     */
    public void setStukken(StukMetKadastraleAanduidingArray value) {
        this.stukken = value;
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
