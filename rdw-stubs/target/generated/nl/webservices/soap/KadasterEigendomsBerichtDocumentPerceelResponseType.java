
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterEigendomsBerichtDocumentPerceelResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterEigendomsBerichtDocumentPerceelResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="berichtobjectresultaat" type="{http://www.webservices.nl/soap/}BerichtObjectDocumentResultaat"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterEigendomsBerichtDocumentPerceelResponseType", propOrder = {

})
public class KadasterEigendomsBerichtDocumentPerceelResponseType {

    @XmlElement(required = true)
    protected BerichtObjectDocumentResultaat berichtobjectresultaat;

    /**
     * Gets the value of the berichtobjectresultaat property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtObjectDocumentResultaat }
     *     
     */
    public BerichtObjectDocumentResultaat getBerichtobjectresultaat() {
        return berichtobjectresultaat;
    }

    /**
     * Sets the value of the berichtobjectresultaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtObjectDocumentResultaat }
     *     
     */
    public void setBerichtobjectresultaat(BerichtObjectDocumentResultaat value) {
        this.berichtobjectresultaat = value;
    }

}
