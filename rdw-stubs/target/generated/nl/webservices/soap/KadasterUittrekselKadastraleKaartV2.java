
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadasterUittrekselKadastraleKaartV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadasterUittrekselKadastraleKaartV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="kaart" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="afbeeldingen" type="{http://www.webservices.nl/soap/}base64BinaryArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadasterUittrekselKadastraleKaartV2", propOrder = {

})
public class KadasterUittrekselKadastraleKaartV2 {

    @XmlElement(required = true)
    protected byte[] kaart;
    protected Base64BinaryArray afbeeldingen;

    /**
     * Gets the value of the kaart property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKaart() {
        return kaart;
    }

    /**
     * Sets the value of the kaart property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKaart(byte[] value) {
        this.kaart = ((byte[]) value);
    }

    /**
     * Gets the value of the afbeeldingen property.
     * 
     * @return
     *     possible object is
     *     {@link Base64BinaryArray }
     *     
     */
    public Base64BinaryArray getAfbeeldingen() {
        return afbeeldingen;
    }

    /**
     * Sets the value of the afbeeldingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64BinaryArray }
     *     
     */
    public void setAfbeeldingen(Base64BinaryArray value) {
        this.afbeeldingen = value;
    }

}
