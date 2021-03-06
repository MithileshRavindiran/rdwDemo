
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Landinrichtingsrente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Landinrichtingsrente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bedrag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eindjaar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Landinrichtingsrente", propOrder = {

})
public class Landinrichtingsrente {

    @XmlElement(required = true)
    protected String bedrag;
    @XmlElement(required = true)
    protected String eindjaar;

    /**
     * Gets the value of the bedrag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedrag() {
        return bedrag;
    }

    /**
     * Sets the value of the bedrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedrag(String value) {
        this.bedrag = value;
    }

    /**
     * Gets the value of the eindjaar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEindjaar() {
        return eindjaar;
    }

    /**
     * Sets the value of the eindjaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEindjaar(String value) {
        this.eindjaar = value;
    }

}
