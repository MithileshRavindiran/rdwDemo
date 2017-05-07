
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerDescriptionCoordinatesRDRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerDescriptionCoordinatesRDRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="postcodefrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postcodeto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="english" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerDescriptionCoordinatesRDRequestType", propOrder = {

})
public class RoutePlannerDescriptionCoordinatesRDRequestType {

    @XmlElement(required = true)
    protected String postcodefrom;
    @XmlElement(required = true)
    protected String postcodeto;
    @XmlElement(required = true)
    protected String routetype;
    protected boolean english;

    /**
     * Gets the value of the postcodefrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodefrom() {
        return postcodefrom;
    }

    /**
     * Sets the value of the postcodefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodefrom(String value) {
        this.postcodefrom = value;
    }

    /**
     * Gets the value of the postcodeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeto() {
        return postcodeto;
    }

    /**
     * Sets the value of the postcodeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeto(String value) {
        this.postcodeto = value;
    }

    /**
     * Gets the value of the routetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutetype() {
        return routetype;
    }

    /**
     * Sets the value of the routetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutetype(String value) {
        this.routetype = value;
    }

    /**
     * Gets the value of the english property.
     * 
     */
    public boolean isEnglish() {
        return english;
    }

    /**
     * Sets the value of the english property.
     * 
     */
    public void setEnglish(boolean value) {
        this.english = value;
    }

}
