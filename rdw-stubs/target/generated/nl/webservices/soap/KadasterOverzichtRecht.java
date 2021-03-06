
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterOverzichtRecht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterOverzichtRecht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gerechtigde_akr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gerechtigde_kadastrale_identificatie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterOverzichtRecht", propOrder = {

})
public class KadasterOverzichtRecht {

    @XmlElement(name = "object_id", required = true)
    protected String objectId;
    @XmlElement(name = "gerechtigde_akr", required = true)
    protected String gerechtigdeAkr;
    @XmlElement(name = "gerechtigde_kadastrale_identificatie")
    protected String gerechtigdeKadastraleIdentificatie;

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
     * Gets the value of the gerechtigdeAkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerechtigdeAkr() {
        return gerechtigdeAkr;
    }

    /**
     * Sets the value of the gerechtigdeAkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerechtigdeAkr(String value) {
        this.gerechtigdeAkr = value;
    }

    /**
     * Gets the value of the gerechtigdeKadastraleIdentificatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerechtigdeKadastraleIdentificatie() {
        return gerechtigdeKadastraleIdentificatie;
    }

    /**
     * Sets the value of the gerechtigdeKadastraleIdentificatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerechtigdeKadastraleIdentificatie(String value) {
        this.gerechtigdeKadastraleIdentificatie = value;
    }

}
