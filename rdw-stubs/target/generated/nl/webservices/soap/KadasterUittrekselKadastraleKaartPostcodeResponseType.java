
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterUittrekselKadastraleKaartPostcodeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterUittrekselKadastraleKaartPostcodeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="uittreksel" type="{http://www.webservices.nl/soap/}UittrekselKadastraleKaart"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterUittrekselKadastraleKaartPostcodeResponseType", propOrder = {

})
public class KadasterUittrekselKadastraleKaartPostcodeResponseType {

    @XmlElement(required = true)
    protected UittrekselKadastraleKaart uittreksel;

    /**
     * Gets the value of the uittreksel property.
     * 
     * @return
     *     possible object is
     *     {@link UittrekselKadastraleKaart }
     *     
     */
    public UittrekselKadastraleKaart getUittreksel() {
        return uittreksel;
    }

    /**
     * Sets the value of the uittreksel property.
     * 
     * @param value
     *     allowed object is
     *     {@link UittrekselKadastraleKaart }
     *     
     */
    public void setUittreksel(UittrekselKadastraleKaart value) {
        this.uittreksel = value;
    }

}
