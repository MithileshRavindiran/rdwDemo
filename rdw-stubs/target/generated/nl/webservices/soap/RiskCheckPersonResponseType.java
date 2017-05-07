
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riskCheckPersonResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskCheckPersonResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}RiskResult"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskCheckPersonResponseType", propOrder = {

})
public class RiskCheckPersonResponseType {

    @XmlElement(required = true)
    protected RiskResult out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link RiskResult }
     *     
     */
    public RiskResult getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskResult }
     *     
     */
    public void setOut(RiskResult value) {
        this.out = value;
    }

}
