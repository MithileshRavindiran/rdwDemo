
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insolvencySearchPublicationsByCoCNumberRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insolvencySearchPublicationsByCoCNumberRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="coc_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insolvencySearchPublicationsByCoCNumberRequestType", propOrder = {

})
public class InsolvencySearchPublicationsByCoCNumberRequestType {

    @XmlElement(name = "coc_number", required = true)
    protected String cocNumber;

    /**
     * Gets the value of the cocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCocNumber() {
        return cocNumber;
    }

    /**
     * Sets the value of the cocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCocNumber(String value) {
        this.cocNumber = value;
    }

}
