
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createTestUserResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createTestUserResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="user_credentials" type="{http://www.webservices.nl/soap/}UserCredentials"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTestUserResponseType", propOrder = {

})
public class CreateTestUserResponseType {

    @XmlElement(name = "user_credentials", required = true)
    protected UserCredentials userCredentials;

    /**
     * Gets the value of the userCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link UserCredentials }
     *     
     */
    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    /**
     * Sets the value of the userCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCredentials }
     *     
     */
    public void setUserCredentials(UserCredentials value) {
        this.userCredentials = value;
    }

}
