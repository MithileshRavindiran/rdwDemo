
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userSessionRemoveRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userSessionRemoveRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reactid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userSessionRemoveRequestType", propOrder = {

})
public class UserSessionRemoveRequestType {

    protected int userid;
    @XmlElement(required = true)
    protected String reactid;

    /**
     * Gets the value of the userid property.
     * 
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     */
    public void setUserid(int value) {
        this.userid = value;
    }

    /**
     * Gets the value of the reactid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReactid() {
        return reactid;
    }

    /**
     * Sets the value of the reactid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReactid(String value) {
        this.reactid = value;
    }

}
