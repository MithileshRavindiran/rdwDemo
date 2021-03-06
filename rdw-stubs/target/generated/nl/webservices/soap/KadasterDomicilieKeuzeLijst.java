
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterDomicilieKeuzeLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterDomicilieKeuzeLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="domicilie_keuzes" type="{http://www.webservices.nl/soap/}kadasterDomicilieKeuzeArray"/>
 *         &lt;element name="indicatie_compleet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterDomicilieKeuzeLijst", propOrder = {

})
public class KadasterDomicilieKeuzeLijst {

    @XmlElement(name = "domicilie_keuzes", required = true)
    protected KadasterDomicilieKeuzeArray domicilieKeuzes;
    @XmlElement(name = "indicatie_compleet")
    protected Boolean indicatieCompleet;

    /**
     * Gets the value of the domicilieKeuzes property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterDomicilieKeuzeArray }
     *     
     */
    public KadasterDomicilieKeuzeArray getDomicilieKeuzes() {
        return domicilieKeuzes;
    }

    /**
     * Sets the value of the domicilieKeuzes property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterDomicilieKeuzeArray }
     *     
     */
    public void setDomicilieKeuzes(KadasterDomicilieKeuzeArray value) {
        this.domicilieKeuzes = value;
    }

    /**
     * Gets the value of the indicatieCompleet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicatieCompleet() {
        return indicatieCompleet;
    }

    /**
     * Sets the value of the indicatieCompleet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicatieCompleet(Boolean value) {
        this.indicatieCompleet = value;
    }

}
