
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterUittrekselKadastraleKaartPostcodeV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterUittrekselKadastraleKaartPostcodeV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}KadasterUittrekselKadastraleKaartResultaat"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterUittrekselKadastraleKaartPostcodeV2ResponseType", propOrder = {

})
public class KadasterUittrekselKadastraleKaartPostcodeV2ResponseType {

    @XmlElement(required = true)
    protected KadasterUittrekselKadastraleKaartResultaat out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterUittrekselKadastraleKaartResultaat }
     *     
     */
    public KadasterUittrekselKadastraleKaartResultaat getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterUittrekselKadastraleKaartResultaat }
     *     
     */
    public void setOut(KadasterUittrekselKadastraleKaartResultaat value) {
        this.out = value;
    }

}
