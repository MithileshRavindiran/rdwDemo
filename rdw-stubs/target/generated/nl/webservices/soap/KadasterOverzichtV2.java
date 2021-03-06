
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterOverzichtV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterOverzichtV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="onroerende_zaken" type="{http://www.webservices.nl/soap/}kadasterOverzichtOnroerendeZaakArray"/>
 *         &lt;element name="rechten" type="{http://www.webservices.nl/soap/}kadasterOverzichtRechtArray"/>
 *         &lt;element name="personen" type="{http://www.webservices.nl/soap/}kadasterOverzichtPersoonV2Array"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterOverzichtV2", propOrder = {

})
public class KadasterOverzichtV2 {

    @XmlElement(name = "onroerende_zaken", required = true)
    protected KadasterOverzichtOnroerendeZaakArray onroerendeZaken;
    @XmlElement(required = true)
    protected KadasterOverzichtRechtArray rechten;
    @XmlElement(required = true)
    protected KadasterOverzichtPersoonV2Array personen;

    /**
     * Gets the value of the onroerendeZaken property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzichtOnroerendeZaakArray }
     *     
     */
    public KadasterOverzichtOnroerendeZaakArray getOnroerendeZaken() {
        return onroerendeZaken;
    }

    /**
     * Sets the value of the onroerendeZaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzichtOnroerendeZaakArray }
     *     
     */
    public void setOnroerendeZaken(KadasterOverzichtOnroerendeZaakArray value) {
        this.onroerendeZaken = value;
    }

    /**
     * Gets the value of the rechten property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzichtRechtArray }
     *     
     */
    public KadasterOverzichtRechtArray getRechten() {
        return rechten;
    }

    /**
     * Sets the value of the rechten property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzichtRechtArray }
     *     
     */
    public void setRechten(KadasterOverzichtRechtArray value) {
        this.rechten = value;
    }

    /**
     * Gets the value of the personen property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterOverzichtPersoonV2Array }
     *     
     */
    public KadasterOverzichtPersoonV2Array getPersonen() {
        return personen;
    }

    /**
     * Sets the value of the personen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterOverzichtPersoonV2Array }
     *     
     */
    public void setPersonen(KadasterOverzichtPersoonV2Array value) {
        this.personen = value;
    }

}
