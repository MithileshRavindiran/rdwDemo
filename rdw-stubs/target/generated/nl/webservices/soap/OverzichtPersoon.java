
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverzichtPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverzichtPersoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natuurlijk_persoon" type="{http://www.webservices.nl/soap/}OverzichtNatuurlijkPersoon" minOccurs="0"/>
 *         &lt;element name="niet_natuurlijk_persoon" type="{http://www.webservices.nl/soap/}OverzichtNietNatuurlijkPersoon" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverzichtPersoon", propOrder = {

})
public class OverzichtPersoon {

    protected String id;
    @XmlElement(name = "natuurlijk_persoon")
    protected OverzichtNatuurlijkPersoon natuurlijkPersoon;
    @XmlElement(name = "niet_natuurlijk_persoon")
    protected OverzichtNietNatuurlijkPersoon nietNatuurlijkPersoon;

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

}
