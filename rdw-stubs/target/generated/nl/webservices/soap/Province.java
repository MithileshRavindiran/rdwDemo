
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Province complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Province">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="provinciecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provincienaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Province", propOrder = {

})
public class Province {

    @XmlElement(required = true)
    protected String provinciecode;
    @XmlElement(required = true)
    protected String provincienaam;

    /**
     * Gets the value of the provinciecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciecode() {
        return provinciecode;
    }

    /**
     * Sets the value of the provinciecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciecode(String value) {
        this.provinciecode = value;
    }

    /**
     * Gets the value of the provincienaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincienaam() {
        return provincienaam;
    }

    /**
     * Sets the value of the provincienaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincienaam(String value) {
        this.provincienaam = value;
    }

}
