
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterUittrekselKadastraleKaartPerceelV3ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterUittrekselKadastraleKaartPerceelV3ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}KadasterUittrekselKadastraleKaartResultaatV2"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterUittrekselKadastraleKaartPerceelV3ResponseType", propOrder = {

})
public class KadasterUittrekselKadastraleKaartPerceelV3ResponseType {

    @XmlElement(required = true)
    protected KadasterUittrekselKadastraleKaartResultaatV2 out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterUittrekselKadastraleKaartResultaatV2 }
     *     
     */
    public KadasterUittrekselKadastraleKaartResultaatV2 getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterUittrekselKadastraleKaartResultaatV2 }
     *     
     */
    public void setOut(KadasterUittrekselKadastraleKaartResultaatV2 value) {
        this.out = value;
    }

}
