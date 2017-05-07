
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dnbEnterpriseManagementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dnbEnterpriseManagementResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}DNBEnterpriseManagement"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dnbEnterpriseManagementResponseType", propOrder = {

})
public class DnbEnterpriseManagementResponseType {

    @XmlElement(required = true)
    protected DNBEnterpriseManagement out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link DNBEnterpriseManagement }
     *     
     */
    public DNBEnterpriseManagement getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBEnterpriseManagement }
     *     
     */
    public void setOut(DNBEnterpriseManagement value) {
        this.out = value;
    }

}
