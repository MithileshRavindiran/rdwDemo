
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRBeperking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRBeperking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="stuk_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="betrokkene_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeente_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeentelijke_registratie_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="omschrijving_pr_beperking" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beschrijving_pr_beperking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splitsing_pr_beperking" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRBeperking", propOrder = {

})
public class PRBeperking {

    @XmlElement(name = "stuk_id", required = true)
    protected String stukId;
    @XmlElement(name = "betrokkene_id", required = true)
    protected String betrokkeneId;
    @XmlElement(name = "gemeente_id", required = true)
    protected String gemeenteId;
    @XmlElement(name = "gemeentelijke_registratie_id", required = true)
    protected String gemeentelijkeRegistratieId;
    @XmlElement(name = "omschrijving_pr_beperking", required = true)
    protected String omschrijvingPrBeperking;
    @XmlElement(name = "beschrijving_pr_beperking")
    protected String beschrijvingPrBeperking;
    @XmlElement(name = "splitsing_pr_beperking")
    protected String splitsingPrBeperking;

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
     * Gets the value of the gemeenteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeenteId() {
        return gemeenteId;
    }

    /**
     * Sets the value of the gemeenteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeenteId(String value) {
        this.gemeenteId = value;
    }

    /**
     * Gets the value of the gemeentelijkeRegistratieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeentelijkeRegistratieId() {
        return gemeentelijkeRegistratieId;
    }

    /**
     * Sets the value of the gemeentelijkeRegistratieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeentelijkeRegistratieId(String value) {
        this.gemeentelijkeRegistratieId = value;
    }

    /**
     * Gets the value of the omschrijvingPrBeperking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijvingPrBeperking() {
        return omschrijvingPrBeperking;
    }

    /**
     * Sets the value of the omschrijvingPrBeperking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijvingPrBeperking(String value) {
        this.omschrijvingPrBeperking = value;
    }

    /**
     * Gets the value of the beschrijvingPrBeperking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschrijvingPrBeperking() {
        return beschrijvingPrBeperking;
    }

    /**
     * Sets the value of the beschrijvingPrBeperking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschrijvingPrBeperking(String value) {
        this.beschrijvingPrBeperking = value;
    }

    /**
     * Gets the value of the splitsingPrBeperking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitsingPrBeperking() {
        return splitsingPrBeperking;
    }

    /**
     * Sets the value of the splitsingPrBeperking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitsingPrBeperking(String value) {
        this.splitsingPrBeperking = value;
    }

}
