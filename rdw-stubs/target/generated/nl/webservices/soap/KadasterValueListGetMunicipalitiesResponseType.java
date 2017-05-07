
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterValueListGetMunicipalitiesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterValueListGetMunicipalitiesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}KadasterValueList"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterValueListGetMunicipalitiesResponseType", propOrder = {

})
public class KadasterValueListGetMunicipalitiesResponseType {

    @XmlElement(required = true)
    protected KadasterValueList out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterValueList }
     *     
     */
    public KadasterValueList getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterValueList }
     *     
     */
    public void setOut(KadasterValueList value) {
        this.out = value;
    }

}
