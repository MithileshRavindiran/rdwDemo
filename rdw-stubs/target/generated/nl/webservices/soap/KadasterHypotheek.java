
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterHypotheek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypotheek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="hoofdsom" type="{http://www.webservices.nl/soap/}kadasterBedrag"/>
 *         &lt;element name="rentevoet" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="meerdere_rentevoet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterHypotheek", propOrder = {

})
public class KadasterHypotheek {

    @XmlElement(required = true)
    protected KadasterBedrag hoofdsom;
    protected Float rentevoet;
    @XmlElement(name = "meerdere_rentevoet")
    protected Boolean meerdereRentevoet;

    /**
     * Gets the value of the hoofdsom property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterBedrag }
     *     
     */
    public KadasterBedrag getHoofdsom() {
        return hoofdsom;
    }

    /**
     * Sets the value of the hoofdsom property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterBedrag }
     *     
     */
    public void setHoofdsom(KadasterBedrag value) {
        this.hoofdsom = value;
    }

    /**
     * Gets the value of the rentevoet property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRentevoet() {
        return rentevoet;
    }

    /**
     * Sets the value of the rentevoet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRentevoet(Float value) {
        this.rentevoet = value;
    }

    /**
     * Gets the value of the meerdereRentevoet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeerdereRentevoet() {
        return meerdereRentevoet;
    }

    /**
     * Sets the value of the meerdereRentevoet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeerdereRentevoet(Boolean value) {
        this.meerdereRentevoet = value;
    }

}
