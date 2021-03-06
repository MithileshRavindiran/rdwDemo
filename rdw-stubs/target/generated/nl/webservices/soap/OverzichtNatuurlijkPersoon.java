
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverzichtNatuurlijkPersoon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverzichtNatuurlijkPersoon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voorvoegsel_geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voornamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverzichtNatuurlijkPersoon", propOrder = {

})
public class OverzichtNatuurlijkPersoon {

    @XmlElement(required = true)
    protected String geslachtsnaam;
    @XmlElement(name = "voorvoegsel_geslachtsnaam")
    protected String voorvoegselGeslachtsnaam;
    protected String voornamen;

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

}
