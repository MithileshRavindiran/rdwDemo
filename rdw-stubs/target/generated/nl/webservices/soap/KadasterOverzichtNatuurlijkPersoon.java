
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterOverzichtNatuurlijkPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterOverzichtNatuurlijkPersoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voorvoegsel_geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voornamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geslacht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterOverzichtNatuurlijkPersoon", propOrder = {

})
public class KadasterOverzichtNatuurlijkPersoon {

    protected String bsn;
    @XmlElement(required = true)
    protected String geslachtsnaam;
    @XmlElement(name = "voorvoegsel_geslachtsnaam")
    protected String voorvoegselGeslachtsnaam;
    protected String voornamen;
    protected String geslacht;

    /**
     * Gets the value of the bsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsn() {
        return bsn;
    }

    /**
     * Sets the value of the bsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsn(String value) {
        this.bsn = value;
    }

    /**
     * Gets the value of the geslachtsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslachtsnaam() {
        return geslachtsnaam;
    }

    /**
     * Sets the value of the geslachtsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslachtsnaam(String value) {
        this.geslachtsnaam = value;
    }

    /**
     * Gets the value of the voorvoegselGeslachtsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorvoegselGeslachtsnaam() {
        return voorvoegselGeslachtsnaam;
    }

    /**
     * Sets the value of the voorvoegselGeslachtsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorvoegselGeslachtsnaam(String value) {
        this.voorvoegselGeslachtsnaam = value;
    }

    /**
     * Gets the value of the voornamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoornamen() {
        return voornamen;
    }

    /**
     * Sets the value of the voornamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoornamen(String value) {
        this.voornamen = value;
    }

    /**
     * Gets the value of the geslacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslacht() {
        return geslacht;
    }

    /**
     * Sets the value of the geslacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslacht(String value) {
        this.geslacht = value;
    }

}
