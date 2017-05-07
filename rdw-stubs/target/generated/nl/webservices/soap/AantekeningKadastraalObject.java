
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AantekeningKadastraalObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AantekeningKadastraalObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="stuk_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="betrokkene_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="omschrijving_aantekening" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beschrijving_aantekening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AantekeningKadastraalObject", propOrder = {

})
public class AantekeningKadastraalObject {

    @XmlElement(name = "stuk_id", required = true)
    protected String stukId;
    @XmlElement(name = "betrokkene_id")
    protected String betrokkeneId;
    @XmlElement(name = "omschrijving_aantekening", required = true)
    protected String omschrijvingAantekening;
    @XmlElement(name = "beschrijving_aantekening")
    protected String beschrijvingAantekening;

    /**
     * Gets the value of the stukId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStukId() {
        return stukId;
    }

    /**
     * Sets the value of the stukId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStukId(String value) {
        this.stukId = value;
    }

    /**
     * Gets the value of the betrokkeneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetrokkeneId() {
        return betrokkeneId;
    }

    /**
     * Sets the value of the betrokkeneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetrokkeneId(String value) {
        this.betrokkeneId = value;
    }

    /**
     * Gets the value of the omschrijvingAantekening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijvingAantekening() {
        return omschrijvingAantekening;
    }

    /**
     * Sets the value of the omschrijvingAantekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijvingAantekening(String value) {
        this.omschrijvingAantekening = value;
    }

    /**
     * Gets the value of the beschrijvingAantekening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschrijvingAantekening() {
        return beschrijvingAantekening;
    }

    /**
     * Sets the value of the beschrijvingAantekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschrijvingAantekening(String value) {
        this.beschrijvingAantekening = value;
    }

}
