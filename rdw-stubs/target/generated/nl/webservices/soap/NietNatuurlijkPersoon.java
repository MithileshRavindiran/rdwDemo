
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NietNatuurlijkPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NietNatuurlijkPersoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statutaire_zetel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leden_lijst" type="{http://www.webservices.nl/soap/}LidLijst" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NietNatuurlijkPersoon", propOrder = {

})
public class NietNatuurlijkPersoon {

    protected String naam;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(name = "statutaire_zetel")
    protected String statutaireZetel;
    @XmlElement(name = "leden_lijst")
    protected LidLijst ledenLijst;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the statutaireZetel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatutaireZetel() {
        return statutaireZetel;
    }

    /**
     * Sets the value of the statutaireZetel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatutaireZetel(String value) {
        this.statutaireZetel = value;
    }

    /**
     * Gets the value of the ledenLijst property.
     * 
     * @return
     *     possible object is
     *     {@link LidLijst }
     *     
     */
    public LidLijst getLedenLijst() {
        return ledenLijst;
    }

    /**
     * Sets the value of the ledenLijst property.
     * 
     * @param value
     *     allowed object is
     *     {@link LidLijst }
     *     
     */
    public void setLedenLijst(LidLijst value) {
        this.ledenLijst = value;
    }

}
