
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterHypothecairBerichtPerceelV2RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterHypothecairBerichtPerceelV2RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="gemeentecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeentenaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sectie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perceelnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relatiecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="volgnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterHypothecairBerichtPerceelV2RequestType", propOrder = {

})
public class KadasterHypothecairBerichtPerceelV2RequestType {

    @XmlElement(required = true)
    protected String gemeentecode;
    @XmlElement(required = true)
    protected String gemeentenaam;
    @XmlElement(required = true)
    protected String sectie;
    @XmlElement(required = true)
    protected String perceelnummer;
    @XmlElement(required = true)
    protected String relatiecode;
    @XmlElement(required = true)
    protected String volgnummer;
    @XmlElement(required = true)
    protected String format;

    /**
     * Gets the value of the gemeentecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeentecode() {
        return gemeentecode;
    }

    /**
     * Sets the value of the gemeentecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeentecode(String value) {
        this.gemeentecode = value;
    }

    /**
     * Gets the value of the gemeentenaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeentenaam() {
        return gemeentenaam;
    }

    /**
     * Sets the value of the gemeentenaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeentenaam(String value) {
        this.gemeentenaam = value;
    }

    /**
     * Gets the value of the sectie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectie() {
        return sectie;
    }

    /**
     * Sets the value of the sectie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectie(String value) {
        this.sectie = value;
    }

    /**
     * Gets the value of the perceelnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerceelnummer() {
        return perceelnummer;
    }

    /**
     * Sets the value of the perceelnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerceelnummer(String value) {
        this.perceelnummer = value;
    }

    /**
     * Gets the value of the relatiecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatiecode() {
        return relatiecode;
    }

    /**
     * Sets the value of the relatiecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatiecode(String value) {
        this.relatiecode = value;
    }

    /**
     * Gets the value of the volgnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolgnummer() {
        return volgnummer;
    }

    /**
     * Sets the value of the volgnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolgnummer(String value) {
        this.volgnummer = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
