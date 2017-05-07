
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dutchBusinessGetOrganizationTreeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchBusinessGetOrganizationTreeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}DutchBusinessOrganizationTree"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchBusinessGetOrganizationTreeResponseType", propOrder = {

})
public class DutchBusinessGetOrganizationTreeResponseType {

    @XmlElement(required = true)
    protected DutchBusinessOrganizationTree out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessOrganizationTree }
     *     
     */
    public DutchBusinessOrganizationTree getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessOrganizationTree }
     *     
     */
    public void setOut(DutchBusinessOrganizationTree value) {
        this.out = value;
    }

}
