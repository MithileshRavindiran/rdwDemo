
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountViewV2RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountViewV2RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="accountid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountViewV2RequestType", propOrder = {

})
public class AccountViewV2RequestType {

    protected int accountid;

    /**
     * Gets the value of the accountid property.
     * 
     */
    public int getAccountid() {
        return accountid;
    }

    /**
     * Sets the value of the accountid property.
     * 
     */
    public void setAccountid(int value) {
        this.accountid = value;
    }

}
