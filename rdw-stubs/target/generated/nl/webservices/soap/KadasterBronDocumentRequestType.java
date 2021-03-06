
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterBronDocumentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterBronDocumentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="aanduiding_soort_register" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reeks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterBronDocumentRequestType", propOrder = {

})
public class KadasterBronDocumentRequestType {

    @XmlElement(name = "aanduiding_soort_register", required = true)
    protected String aanduidingSoortRegister;
    @XmlElement(required = true)
    protected String deel;
    @XmlElement(required = true)
    protected String nummer;
    @XmlElement(required = true)
    protected String reeks;
    @XmlElement(required = true)
    protected String format;

    /**
     * Gets the value of the aanduidingSoortRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanduidingSoortRegister() {
        return aanduidingSoortRegister;
    }

    /**
     * Sets the value of the aanduidingSoortRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanduidingSoortRegister(String value) {
        this.aanduidingSoortRegister = value;
    }

    /**
     * Gets the value of the deel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeel() {
        return deel;
    }

    /**
     * Sets the value of the deel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeel(String value) {
        this.deel = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the reeks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReeks() {
        return reeks;
    }

    /**
     * Sets the value of the reeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReeks(String value) {
        this.reeks = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
