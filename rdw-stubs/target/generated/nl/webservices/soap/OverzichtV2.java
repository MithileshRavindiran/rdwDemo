
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverzichtV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverzichtV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="onroerende_zaken" type="{http://www.webservices.nl/soap/}OverzichtOnroerendeZaakArray"/>
 *         &lt;element name="rechten" type="{http://www.webservices.nl/soap/}OverzichtRechtArray"/>
 *         &lt;element name="personen" type="{http://www.webservices.nl/soap/}OverzichtPersoonV2Array" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverzichtV2", propOrder = {

})
public class OverzichtV2 {

    @XmlElement(name = "onroerende_zaken", required = true)
    protected OverzichtOnroerendeZaakArray onroerendeZaken;
    @XmlElement(required = true)
    protected OverzichtRechtArray rechten;
    protected OverzichtPersoonV2Array personen;

    /**
     * Gets the value of the onroerendeZaken property.
     * 
     * @return
     *     possible object is
     *     {@link OverzichtOnroerendeZaakArray }
     *     
     */
    public OverzichtOnroerendeZaakArray getOnroerendeZaken() {
        return onroerendeZaken;
    }

    /**
     * Sets the value of the onroerendeZaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtOnroerendeZaakArray }
     *     
     */
    public void setOnroerendeZaken(OverzichtOnroerendeZaakArray value) {
        this.onroerendeZaken = value;
    }

    /**
     * Gets the value of the rechten property.
     * 
     * @return
     *     possible object is
     *     {@link OverzichtRechtArray }
     *     
     */
    public OverzichtRechtArray getRechten() {
        return rechten;
    }

    /**
     * Sets the value of the rechten property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtRechtArray }
     *     
     */
    public void setRechten(OverzichtRechtArray value) {
        this.rechten = value;
    }

    /**
     * Gets the value of the personen property.
     * 
     * @return
     *     possible object is
     *     {@link OverzichtPersoonV2Array }
     *     
     */
    public OverzichtPersoonV2Array getPersonen() {
        return personen;
    }

    /**
     * Sets the value of the personen property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtPersoonV2Array }
     *     
     */
    public void setPersonen(OverzichtPersoonV2Array value) {
        this.personen = value;
    }

}
