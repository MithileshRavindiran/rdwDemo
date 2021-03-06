
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reseller" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contactname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactemail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationtime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastmodified" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="credits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usernameprefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditthreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {

})
public class Account {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String environment;
    protected boolean reseller;
    @XmlElement(required = true)
    protected String contactname;
    @XmlElement(required = true)
    protected String contactemail;
    @XmlElement(required = true)
    protected String telephone;
    @XmlElement(required = true)
    protected String fax;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String creationtime;
    @XmlElement(required = true)
    protected String lastmodified;
    protected int credits;
    @XmlElement(required = true)
    protected String clientcode;
    @XmlElement(required = true)
    protected String comments;
    @XmlElement(required = true)
    protected String usernameprefix;
    protected int creditthreshold;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the reseller property.
     * 
     */
    public boolean isReseller() {
        return reseller;
    }

    /**
     * Sets the value of the reseller property.
     * 
     */
    public void setReseller(boolean value) {
        this.reseller = value;
    }

    /**
     * Gets the value of the contactname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactname() {
        return contactname;
    }

    /**
     * Sets the value of the contactname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactname(String value) {
        this.contactname = value;
    }

    /**
     * Gets the value of the contactemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactemail() {
        return contactemail;
    }

    /**
     * Sets the value of the contactemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactemail(String value) {
        this.contactemail = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the creationtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationtime() {
        return creationtime;
    }

    /**
     * Sets the value of the creationtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationtime(String value) {
        this.creationtime = value;
    }

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastmodified() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastmodified(String value) {
        this.lastmodified = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the value of the credits property.
     * 
     */
    public void setCredits(int value) {
        this.credits = value;
    }

    /**
     * Gets the value of the clientcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientcode() {
        return clientcode;
    }

    /**
     * Sets the value of the clientcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientcode(String value) {
        this.clientcode = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the usernameprefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernameprefix() {
        return usernameprefix;
    }

    /**
     * Sets the value of the usernameprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernameprefix(String value) {
        this.usernameprefix = value;
    }

    /**
     * Gets the value of the creditthreshold property.
     * 
     */
    public int getCreditthreshold() {
        return creditthreshold;
    }

    /**
     * Sets the value of the creditthreshold property.
     * 
     */
    public void setCreditthreshold(int value) {
        this.creditthreshold = value;
    }

}
