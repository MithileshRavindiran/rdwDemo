
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRLiaison complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRLiaison">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="liaison_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liaison_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRLiaison", propOrder = {

})
public class GCRLiaison {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "liaison_code")
    protected String liaisonCode;
    @XmlElement(name = "liaison_text")
    protected String liaisonText;

    /**
     * Gets the value of the graydonCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGraydonCompanyId() {
        return graydonCompanyId;
    }

    /**
     * Sets the value of the graydonCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGraydonCompanyId(BigInteger value) {
        this.graydonCompanyId = value;
    }

    /**
     * Gets the value of the liaisonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiaisonCode() {
        return liaisonCode;
    }

    /**
     * Sets the value of the liaisonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiaisonCode(String value) {
        this.liaisonCode = value;
    }

    /**
     * Gets the value of the liaisonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiaisonText() {
        return liaisonText;
    }

    /**
     * Sets the value of the liaisonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiaisonText(String value) {
        this.liaisonText = value;
    }

}
