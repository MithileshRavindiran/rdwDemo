
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for driveInfoTimeLookupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="driveInfoTimeLookupRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nbcodefrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nbcodeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driveInfoTimeLookupRequestType", propOrder = {

})
public class DriveInfoTimeLookupRequestType {

    @XmlElement(required = true)
    protected String nbcodefrom;
    @XmlElement(required = true)
    protected String nbcodeto;

    /**
     * Gets the value of the nbcodefrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbcodefrom() {
        return nbcodefrom;
    }

    /**
     * Sets the value of the nbcodefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbcodefrom(String value) {
        this.nbcodefrom = value;
    }

    /**
     * Gets the value of the nbcodeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbcodeto() {
        return nbcodeto;
    }

    /**
     * Sets the value of the nbcodeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbcodeto(String value) {
        this.nbcodeto = value;
    }

}
