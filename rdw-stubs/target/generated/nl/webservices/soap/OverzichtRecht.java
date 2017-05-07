
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverzichtRecht complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverzichtRecht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gerechtigde_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverzichtRecht", propOrder = {

})
public class OverzichtRecht {

    @XmlElement(name = "object_id", required = true)
    protected String objectId;
    @XmlElement(name = "gerechtigde_id", required = true)
    protected String gerechtigdeId;

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the gerechtigdeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerechtigdeId() {
        return gerechtigdeId;
    }

    /**
     * Sets the value of the gerechtigdeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerechtigdeId(String value) {
        this.gerechtigdeId = value;
    }

}
