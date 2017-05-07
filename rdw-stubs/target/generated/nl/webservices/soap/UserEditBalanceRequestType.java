
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userEditBalanceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userEditBalanceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userEditBalanceRequestType", propOrder = {

})
public class UserEditBalanceRequestType {

    protected int userid;
    protected float balance;

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
     * Gets the value of the balance property.
     * 
     */
    public float getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(float value) {
        this.balance = value;
    }

}
