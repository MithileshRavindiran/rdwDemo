
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AantekeningenKadastraalObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AantekeningenKadastraalObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="aantekeningen_lijst" type="{http://www.webservices.nl/soap/}AantekeningKadastraalObjectLijst" minOccurs="0"/>
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
@XmlType(name = "AantekeningenKadastraalObject", propOrder = {

})
public class AantekeningenKadastraalObject {

    @XmlElement(name = "aantekeningen_lijst")
    protected AantekeningKadastraalObjectLijst aantekeningenLijst;
    protected String melding;

    /**
     * Gets the value of the aantekeningenLijst property.
     * 
     * @return
     *     possible object is
     *     {@link AantekeningKadastraalObjectLijst }
     *     
     */
    public AantekeningKadastraalObjectLijst getAantekeningenLijst() {
        return aantekeningenLijst;
    }

    /**
     * Sets the value of the aantekeningenLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link AantekeningKadastraalObjectLijst }
     *     
     */
    public void setAantekeningenLijst(AantekeningKadastraalObjectLijst value) {
        this.aantekeningenLijst = value;
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
