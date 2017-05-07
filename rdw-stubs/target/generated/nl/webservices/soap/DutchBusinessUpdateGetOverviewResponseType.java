
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dutchBusinessUpdateGetOverviewResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchBusinessUpdateGetOverviewResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}DutchBusinessUpdateSubscriptionPagedResult"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchBusinessUpdateGetOverviewResponseType", propOrder = {

})
public class DutchBusinessUpdateGetOverviewResponseType {

    @XmlElement(required = true)
    protected DutchBusinessUpdateSubscriptionPagedResult out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessUpdateSubscriptionPagedResult }
     *     
     */
    public DutchBusinessUpdateSubscriptionPagedResult getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessUpdateSubscriptionPagedResult }
     *     
     */
    public void setOut(DutchBusinessUpdateSubscriptionPagedResult value) {
        this.out = value;
    }

}
