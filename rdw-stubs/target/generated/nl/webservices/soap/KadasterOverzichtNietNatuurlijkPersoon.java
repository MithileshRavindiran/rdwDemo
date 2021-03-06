
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterOverzichtNietNatuurlijkPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterOverzichtNietNatuurlijkPersoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rechtsvorm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bedrijven_nummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterOverzichtNietNatuurlijkPersoon", propOrder = {

})
public class KadasterOverzichtNietNatuurlijkPersoon {

    protected String naam;
    @XmlElement(required = true)
    protected String rechtsvorm;
    @XmlElement(name = "bedrijven_nummer")
    protected String bedrijvenNummer;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the rechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechtsvorm() {
        return rechtsvorm;
    }

    /**
     * Sets the value of the rechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechtsvorm(String value) {
        this.rechtsvorm = value;
    }

    /**
     * Gets the value of the bedrijvenNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedrijvenNummer() {
        return bedrijvenNummer;
    }

    /**
     * Sets the value of the bedrijvenNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedrijvenNummer(String value) {
        this.bedrijvenNummer = value;
    }

}
