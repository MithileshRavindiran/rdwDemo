
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverzichtPersoonV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverzichtPersoonV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natuurlijk_persoon" type="{http://www.webservices.nl/soap/}OverzichtNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="niet_natuurlijk_persoon" type="{http://www.webservices.nl/soap/}OverzichtNietNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="melding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverzichtPersoonV2", propOrder = {

})
public class OverzichtPersoonV2 {

    protected String id;
    @XmlElement(name = "natuurlijk_persoon")
    protected OverzichtNatuurlijkPersoon natuurlijkPersoon;
    @XmlElement(name = "niet_natuurlijk_persoon")
    protected OverzichtNietNatuurlijkPersoon nietNatuurlijkPersoon;
    protected String melding;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the natuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link OverzichtNatuurlijkPersoon }
     *     
     */
    public OverzichtNatuurlijkPersoon getNatuurlijkPersoon() {
        return natuurlijkPersoon;
    }

    /**
     * Sets the value of the natuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtNatuurlijkPersoon }
     *     
     */
    public void setNatuurlijkPersoon(OverzichtNatuurlijkPersoon value) {
        this.natuurlijkPersoon = value;
    }

    /**
     * Gets the value of the nietNatuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link OverzichtNietNatuurlijkPersoon }
     *     
     */
    public OverzichtNietNatuurlijkPersoon getNietNatuurlijkPersoon() {
        return nietNatuurlijkPersoon;
    }

    /**
     * Sets the value of the nietNatuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtNietNatuurlijkPersoon }
     *     
     */
    public void setNietNatuurlijkPersoon(OverzichtNietNatuurlijkPersoon value) {
        this.nietNatuurlijkPersoon = value;
    }

    /**
     * Gets the value of the melding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMelding() {
        return melding;
    }

    /**
     * Sets the value of the melding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMelding(String value) {
        this.melding = value;
    }

}
