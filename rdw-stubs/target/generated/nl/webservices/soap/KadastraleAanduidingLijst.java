
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadastraleAanduidingLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadastraleAanduidingLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="kadastrale_aanduidingen" type="{http://www.webservices.nl/soap/}KadastraleAanduidingArray"/>
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
@XmlType(name = "KadastraleAanduidingLijst", propOrder = {

})
public class KadastraleAanduidingLijst {

    @XmlElement(name = "kadastrale_aanduidingen", required = true)
    protected KadastraleAanduidingArray kadastraleAanduidingen;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the kadastraleAanduidingen property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduidingArray }
     *     
     */
    public KadastraleAanduidingArray getKadastraleAanduidingen() {
        return kadastraleAanduidingen;
    }

    /**
     * Sets the value of the kadastraleAanduidingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduidingArray }
     *     
     */
    public void setKadastraleAanduidingen(KadastraleAanduidingArray value) {
        this.kadastraleAanduidingen = value;
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
