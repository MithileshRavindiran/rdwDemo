
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRCalamityOther complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCalamityOther">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="calamity_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calamity_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiration_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCalamityOther", propOrder = {

})
public class GCRCalamityOther {

    @XmlElement(name = "calamity_code")
    protected int calamityCode;
    @XmlElement(name = "calamity_text")
    protected String calamityText;
    @XmlElement(name = "expiration_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Gets the value of the calamityCode property.
     * 
     */
    public int getCalamityCode() {
        return calamityCode;
    }

    /**
     * Sets the value of the calamityCode property.
     * 
     */
    public void setCalamityCode(int value) {
        this.calamityCode = value;
    }

    /**
     * Gets the value of the calamityText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalamityText() {
        return calamityText;
    }

    /**
     * Sets the value of the calamityText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalamityText(String value) {
        this.calamityText = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

}
