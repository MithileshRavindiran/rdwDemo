
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRBeperkingenKadastraalObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRBeperkingenKadastraalObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pr_beperkingen_lijst" type="{http://www.webservices.nl/soap/}PRBeperkingLijst" minOccurs="0"/>
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
@XmlType(name = "PRBeperkingenKadastraalObject", propOrder = {

})
public class PRBeperkingenKadastraalObject {

    @XmlElement(name = "pr_beperkingen_lijst")
    protected PRBeperkingLijst prBeperkingenLijst;
    protected String melding;

    /**
     * Gets the value of the prBeperkingenLijst property.
     * 
     * @return
     *     possible object is
     *     {@link PRBeperkingLijst }
     *     
     */
    public PRBeperkingLijst getPrBeperkingenLijst() {
        return prBeperkingenLijst;
    }

    /**
     * Sets the value of the prBeperkingenLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRBeperkingLijst }
     *     
     */
    public void setPrBeperkingenLijst(PRBeperkingLijst value) {
        this.prBeperkingenLijst = value;
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
