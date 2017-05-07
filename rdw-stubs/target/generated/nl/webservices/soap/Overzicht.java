
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Overzicht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Overzicht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="onroerende_zaken" type="{http://www.webservices.nl/soap/}OverzichtOnroerendeZaakArray"/>
 *         &lt;element name="rechten" type="{http://www.webservices.nl/soap/}OverzichtRechtArray"/>
 *         &lt;element name="personen" type="{http://www.webservices.nl/soap/}OverzichtPersoonArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Overzicht", propOrder = {

})
public class Overzicht {

    @XmlElement(name = "onroerende_zaken", required = true)
    protected OverzichtOnroerendeZaakArray onroerendeZaken;
    @XmlElement(required = true)
    protected OverzichtRechtArray rechten;
    protected OverzichtPersoonArray personen;

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
     *     {@link OverzichtPersoonArray }
     *     
     */
    public OverzichtPersoonArray getPersonen() {
        return personen;
    }

    /**
     * Sets the value of the personen property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverzichtPersoonArray }
     *     
     */
    public void setPersonen(OverzichtPersoonArray value) {
        this.personen = value;
    }

}
