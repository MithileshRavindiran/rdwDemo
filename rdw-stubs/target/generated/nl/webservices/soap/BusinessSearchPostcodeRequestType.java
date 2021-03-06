
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSearchPostcodeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSearchPostcodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nbcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lettercomb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="houseno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="housenoaddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSearchPostcodeRequestType", propOrder = {

})
public class BusinessSearchPostcodeRequestType {

    @XmlElement(required = true)
    protected String nbcode;
    @XmlElement(required = true)
    protected String lettercomb;
    protected int houseno;
    @XmlElement(required = true)
    protected String housenoaddition;
    protected int page;

    /**
     * Gets the value of the nbcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbcode() {
        return nbcode;
    }

    /**
     * Sets the value of the nbcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbcode(String value) {
        this.nbcode = value;
    }

    /**
     * Gets the value of the lettercomb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettercomb() {
        return lettercomb;
    }

    /**
     * Sets the value of the lettercomb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettercomb(String value) {
        this.lettercomb = value;
    }

    /**
     * Gets the value of the houseno property.
     * 
     */
    public int getHouseno() {
        return houseno;
    }

    /**
     * Sets the value of the houseno property.
     * 
     */
    public void setHouseno(int value) {
        this.houseno = value;
    }

    /**
     * Gets the value of the housenoaddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousenoaddition() {
        return housenoaddition;
    }

    /**
     * Sets the value of the housenoaddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousenoaddition(String value) {
        this.housenoaddition = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
