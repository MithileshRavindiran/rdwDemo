
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nbwoEstimateValueResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nbwoEstimateValueResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}NbwoWaarde"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nbwoEstimateValueResponseType", propOrder = {

})
public class NbwoEstimateValueResponseType {

    @XmlElement(required = true)
    protected NbwoWaarde out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link NbwoWaarde }
     *     
     */
    public NbwoWaarde getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link NbwoWaarde }
     *     
     */
    public void setOut(NbwoWaarde value) {
        this.out = value;
    }

}
