
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterStukdeelRecht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterStukdeelRecht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aandeel_in_recht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totaal_aandeel_in_recht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gerelateerd_recht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterStukdeelRecht", propOrder = {

})
public class KadasterStukdeelRecht {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String type;
    protected String omschrijving;
    @XmlElement(name = "aandeel_in_recht")
    protected String aandeelInRecht;
    @XmlElement(name = "totaal_aandeel_in_recht")
    protected String totaalAandeelInRecht;
    @XmlElement(name = "object_id", required = true)
    protected String objectId;
    @XmlElement(name = "gerelateerd_recht")
    protected String gerelateerdRecht;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

    /**
     * Gets the value of the aandeelInRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAandeelInRecht() {
        return aandeelInRecht;
    }

    /**
     * Sets the value of the aandeelInRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAandeelInRecht(String value) {
        this.aandeelInRecht = value;
    }

    /**
     * Gets the value of the totaalAandeelInRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotaalAandeelInRecht() {
        return totaalAandeelInRecht;
    }

    /**
     * Sets the value of the totaalAandeelInRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotaalAandeelInRecht(String value) {
        this.totaalAandeelInRecht = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the gerelateerdRecht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerelateerdRecht() {
        return gerelateerdRecht;
    }

    /**
     * Sets the value of the gerelateerdRecht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerelateerdRecht(String value) {
        this.gerelateerdRecht = value;
    }

}
