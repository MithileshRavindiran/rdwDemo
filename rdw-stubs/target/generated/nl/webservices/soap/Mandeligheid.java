
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mandeligheid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mandeligheid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="mandelige_percelen" type="{http://www.webservices.nl/soap/}KadastraleAanduidingLijst" minOccurs="0"/>
 *         &lt;element name="hoofd_percelen" type="{http://www.webservices.nl/soap/}KadastraleAanduidingLijst" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mandeligheid", propOrder = {

})
public class Mandeligheid {

    @XmlElement(name = "mandelige_percelen")
    protected KadastraleAanduidingLijst mandeligePercelen;
    @XmlElement(name = "hoofd_percelen")
    protected KadastraleAanduidingLijst hoofdPercelen;

    /**
     * Gets the value of the mandeligePercelen property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduidingLijst }
     *     
     */
    public KadastraleAanduidingLijst getMandeligePercelen() {
        return mandeligePercelen;
    }

    /**
     * Sets the value of the mandeligePercelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduidingLijst }
     *     
     */
    public void setMandeligePercelen(KadastraleAanduidingLijst value) {
        this.mandeligePercelen = value;
    }

    /**
     * Gets the value of the hoofdPercelen property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduidingLijst }
     *     
     */
    public KadastraleAanduidingLijst getHoofdPercelen() {
        return hoofdPercelen;
    }

    /**
     * Sets the value of the hoofdPercelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduidingLijst }
     *     
     */
    public void setHoofdPercelen(KadastraleAanduidingLijst value) {
        this.hoofdPercelen = value;
    }

}
