
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRFiling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRFiling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filing_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filing_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filing_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="chamber_of_commerce" type="{http://www.webservices.nl/soap/}GCRChamberOfCommerce" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRFiling", propOrder = {

})
public class GCRFiling {

    @XmlElement(name = "filing_code")
    protected String filingCode;
    @XmlElement(name = "filing_text")
    protected String filingText;
    @XmlElement(name = "filing_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filingDate;
    @XmlElement(name = "chamber_of_commerce")
    protected GCRChamberOfCommerce chamberOfCommerce;

    /**
     * Gets the value of the filingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingCode() {
        return filingCode;
    }

    /**
     * Sets the value of the filingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingCode(String value) {
        this.filingCode = value;
    }

    /**
     * Gets the value of the filingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingText() {
        return filingText;
    }

    /**
     * Sets the value of the filingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingText(String value) {
        this.filingText = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilingDate(XMLGregorianCalendar value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the chamberOfCommerce property.
     * 
     * @return
     *     possible object is
     *     {@link GCRChamberOfCommerce }
     *     
     */
    public GCRChamberOfCommerce getChamberOfCommerce() {
        return chamberOfCommerce;
    }

    /**
     * Sets the value of the chamberOfCommerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRChamberOfCommerce }
     *     
     */
    public void setChamberOfCommerce(GCRChamberOfCommerce value) {
        this.chamberOfCommerce = value;
    }

}
