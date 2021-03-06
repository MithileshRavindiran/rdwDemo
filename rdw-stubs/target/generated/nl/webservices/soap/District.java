
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for District complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="District">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="gemeenteid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gemeentenaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeentecode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="provinciecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "District", propOrder = {

})
public class District {

    protected int gemeenteid;
    @XmlElement(required = true)
    protected String gemeentenaam;
    protected int gemeentecode;
    @XmlElement(required = true)
    protected String provinciecode;

    /**
     * Gets the value of the gemeenteid property.
     * 
     */
    public int getGemeenteid() {
        return gemeenteid;
    }

    /**
     * Sets the value of the gemeenteid property.
     * 
     */
    public void setGemeenteid(int value) {
        this.gemeenteid = value;
    }

    /**
     * Gets the value of the gemeentenaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeentenaam() {
        return gemeentenaam;
    }

    /**
     * Sets the value of the gemeentenaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeentenaam(String value) {
        this.gemeentenaam = value;
    }

    /**
     * Gets the value of the gemeentecode property.
     * 
     */
    public int getGemeentecode() {
        return gemeentecode;
    }

    /**
     * Sets the value of the gemeentecode property.
     * 
     */
    public void setGemeentecode(int value) {
        this.gemeentecode = value;
    }

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

}
