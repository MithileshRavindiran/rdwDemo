
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDossierSBI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDossierSBI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PrimarySBICode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondarySBICode1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondarySBICode2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrimarySBICodeText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondarySBICode1Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondarySBICode2Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDossierSBI", propOrder = {

})
public class BusinessDossierSBI {

    @XmlElement(name = "PrimarySBICode", required = true)
    protected String primarySBICode;
    @XmlElement(name = "SecondarySBICode1", required = true)
    protected String secondarySBICode1;
    @XmlElement(name = "SecondarySBICode2", required = true)
    protected String secondarySBICode2;
    @XmlElement(name = "PrimarySBICodeText", required = true)
    protected String primarySBICodeText;
    @XmlElement(name = "SecondarySBICode1Text", required = true)
    protected String secondarySBICode1Text;
    @XmlElement(name = "SecondarySBICode2Text", required = true)
    protected String secondarySBICode2Text;

    /**
     * Gets the value of the primarySBICode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySBICode() {
        return primarySBICode;
    }

    /**
     * Sets the value of the primarySBICode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySBICode(String value) {
        this.primarySBICode = value;
    }

    /**
     * Gets the value of the secondarySBICode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySBICode1() {
        return secondarySBICode1;
    }

    /**
     * Sets the value of the secondarySBICode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySBICode1(String value) {
        this.secondarySBICode1 = value;
    }

    /**
     * Gets the value of the secondarySBICode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySBICode2() {
        return secondarySBICode2;
    }

    /**
     * Sets the value of the secondarySBICode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySBICode2(String value) {
        this.secondarySBICode2 = value;
    }

    /**
     * Gets the value of the primarySBICodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySBICodeText() {
        return primarySBICodeText;
    }

    /**
     * Sets the value of the primarySBICodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySBICodeText(String value) {
        this.primarySBICodeText = value;
    }

    /**
     * Gets the value of the secondarySBICode1Text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySBICode1Text() {
        return secondarySBICode1Text;
    }

    /**
     * Sets the value of the secondarySBICode1Text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySBICode1Text(String value) {
        this.secondarySBICode1Text = value;
    }

    /**
     * Gets the value of the secondarySBICode2Text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondarySBICode2Text() {
        return secondarySBICode2Text;
    }

    /**
     * Sets the value of the secondarySBICode2Text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondarySBICode2Text(String value) {
        this.secondarySBICode2Text = value;
    }

}
