
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsolvencyPublications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyPublications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="is_legacy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="event" type="{http://www.webservices.nl/soap/}InsolvencyPublicationArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyPublications", propOrder = {

})
public class InsolvencyPublications {

    @XmlElement(name = "is_legacy")
    protected boolean isLegacy;
    @XmlElement(required = true)
    protected InsolvencyPublicationArray event;

    /**
     * Gets the value of the isLegacy property.
     * 
     */
    public boolean isIsLegacy() {
        return isLegacy;
    }

    /**
     * Sets the value of the isLegacy property.
     * 
     */
    public void setIsLegacy(boolean value) {
        this.isLegacy = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyPublicationArray }
     *     
     */
    public InsolvencyPublicationArray getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyPublicationArray }
     *     
     */
    public void setEvent(InsolvencyPublicationArray value) {
        this.event = value;
    }

}
