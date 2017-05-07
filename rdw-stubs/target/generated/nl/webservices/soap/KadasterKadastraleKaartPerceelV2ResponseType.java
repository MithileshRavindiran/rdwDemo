
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterKadastraleKaartPerceelV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterKadastraleKaartPerceelV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}KadasterKadastraleKaartResultaatV2"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterKadastraleKaartPerceelV2ResponseType", propOrder = {

})
public class KadasterKadastraleKaartPerceelV2ResponseType {

    @XmlElement(required = true)
    protected KadasterKadastraleKaartResultaatV2 out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterKadastraleKaartResultaatV2 }
     *     
     */
    public KadasterKadastraleKaartResultaatV2 getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterKadastraleKaartResultaatV2 }
     *     
     */
    public void setOut(KadasterKadastraleKaartResultaatV2 value) {
        this.out = value;
    }

}
