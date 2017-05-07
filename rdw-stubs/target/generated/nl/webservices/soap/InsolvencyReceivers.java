
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsolvencyReceivers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyReceivers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="receiver" type="{http://www.webservices.nl/soap/}InsolvencyLegalPerformingPersonArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyReceivers", propOrder = {

})
public class InsolvencyReceivers {

    @XmlElement(required = true)
    protected InsolvencyLegalPerformingPersonArray receiver;

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyLegalPerformingPersonArray }
     *     
     */
    public InsolvencyLegalPerformingPersonArray getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyLegalPerformingPersonArray }
     *     
     */
    public void setReceiver(InsolvencyLegalPerformingPersonArray value) {
        this.receiver = value;
    }

}
