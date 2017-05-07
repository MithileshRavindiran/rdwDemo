
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bovagGetMemberByBovagIdRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bovagGetMemberByBovagIdRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bovag_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bovagGetMemberByBovagIdRequestType", propOrder = {

})
public class BovagGetMemberByBovagIdRequestType {

    @XmlElement(name = "bovag_id", required = true)
    protected String bovagId;

    /**
     * Gets the value of the bovagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBovagId() {
        return bovagId;
    }

    /**
     * Sets the value of the bovagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBovagId(String value) {
        this.bovagId = value;
    }

}
