
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StukMetKadastraleAanduiding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StukMetKadastraleAanduiding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kadastrale_aanduiding" type="{http://www.webservices.nl/soap/}KadastraleAanduiding" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StukMetKadastraleAanduiding", propOrder = {

})
public class StukMetKadastraleAanduiding {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "kadastrale_aanduiding")
    protected KadastraleAanduiding kadastraleAanduiding;

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
     * Gets the value of the kadastraleAanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public KadastraleAanduiding getKadastraleAanduiding() {
        return kadastraleAanduiding;
    }

    /**
     * Sets the value of the kadastraleAanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public void setKadastraleAanduiding(KadastraleAanduiding value) {
        this.kadastraleAanduiding = value;
    }

}
