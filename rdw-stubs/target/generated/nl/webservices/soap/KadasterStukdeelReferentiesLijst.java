
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterStukdeelReferentiesLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterStukdeelReferentiesLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="stukdelen" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="indicatie_compleet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterStukdeelReferentiesLijst", propOrder = {

})
public class KadasterStukdeelReferentiesLijst {

    @XmlElement(required = true)
    protected StringArray stukdelen;
    @XmlElement(name = "indicatie_compleet")
    protected Boolean indicatieCompleet;

    /**
     * Gets the value of the stukdelen property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getStukdelen() {
        return stukdelen;
    }

    /**
     * Sets the value of the stukdelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setStukdelen(StringArray value) {
        this.stukdelen = value;
    }

    /**
     * Gets the value of the indicatieCompleet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicatieCompleet() {
        return indicatieCompleet;
    }

    /**
     * Sets the value of the indicatieCompleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicatieCompleet(Boolean value) {
        this.indicatieCompleet = value;
    }

}
