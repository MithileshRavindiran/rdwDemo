
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadastraleAanduiding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadastraleAanduiding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="gemeentecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gemeentenaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perceelnummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relatiecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volgnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadastraleAanduiding", propOrder = {

})
public class KadastraleAanduiding {

    protected String gemeentecode;
    protected String gemeentenaam;
    @XmlElement(required = true)
    protected String sectie;
    @XmlElement(required = true)
    protected String perceelnummer;
    protected String relatiecode;
    protected String volgnummer;

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

}
