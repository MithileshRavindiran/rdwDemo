
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carVWEPhotosRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carVWEPhotosRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="atl_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carVWEPhotosRequestType", propOrder = {

})
public class CarVWEPhotosRequestType {

    @XmlElement(name = "atl_code")
    protected int atlCode;

    /**
     * Gets the value of the atlCode property.
     * 
     */
    public int getAtlCode() {
        return atlCode;
    }

    /**
     * Sets the value of the atlCode property.
     * 
     */
    public void setAtlCode(int value) {
        this.atlCode = value;
    }

}
