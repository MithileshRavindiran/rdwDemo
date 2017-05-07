
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dnbSearchReferenceV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dnbSearchReferenceV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}DNBBusinessReferenceV2PagedResult"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dnbSearchReferenceV2ResponseType", propOrder = {

})
public class DnbSearchReferenceV2ResponseType {

    @XmlElement(required = true)
    protected DNBBusinessReferenceV2PagedResult out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link DNBBusinessReferenceV2PagedResult }
     *     
     */
    public DNBBusinessReferenceV2PagedResult getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBBusinessReferenceV2PagedResult }
     *     
     */
    public void setOut(DNBBusinessReferenceV2PagedResult value) {
        this.out = value;
    }

}
