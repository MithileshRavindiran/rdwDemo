
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="reactid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user_nickname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationtime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastvisit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Session", propOrder = {

})
public class Session {

    @XmlElement(required = true)
    protected String reactid;
    @XmlElement(name = "user_id")
    protected int userId;
    @XmlElement(name = "user_nickname", required = true)
    protected String userNickname;
    @XmlElement(required = true)
    protected String creationtime;
    @XmlElement(required = true)
    protected String lastvisit;
    protected int hits;
    @XmlElement(required = true)
    protected String ip;

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

    /**
     * Gets the value of the userId property.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userNickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * Sets the value of the userNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNickname(String value) {
        this.userNickname = value;
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
     * Gets the value of the lastvisit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastvisit() {
        return lastvisit;
    }

    /**
     * Sets the value of the lastvisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastvisit(String value) {
        this.lastvisit = value;
    }

    /**
     * Gets the value of the hits property.
     * 
     */
    public int getHits() {
        return hits;
    }

    /**
     * Sets the value of the hits property.
     * 
     */
    public void setHits(int value) {
        this.hits = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

}
