
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="person_score" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="address_score" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="postcode_score" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskResult", propOrder = {

})
public class RiskResult {

    @XmlElement(name = "person_score", required = true)
    protected BigInteger personScore;
    @XmlElement(name = "address_score", required = true)
    protected BigInteger addressScore;
    @XmlElement(name = "postcode_score", required = true)
    protected BigInteger postcodeScore;

    /**
     * Gets the value of the personScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonScore() {
        return personScore;
    }

    /**
     * Sets the value of the personScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonScore(BigInteger value) {
        this.personScore = value;
    }

    /**
     * Gets the value of the addressScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddressScore() {
        return addressScore;
    }

    /**
     * Sets the value of the addressScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddressScore(BigInteger value) {
        this.addressScore = value;
    }

    /**
     * Gets the value of the postcodeScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPostcodeScore() {
        return postcodeScore;
    }

    /**
     * Sets the value of the postcodeScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPostcodeScore(BigInteger value) {
        this.postcodeScore = value;
    }

}
