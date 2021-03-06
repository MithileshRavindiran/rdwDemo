
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCROriginatedFrom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCROriginatedFrom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="originated_from_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="originated_from_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_from" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCROriginatedFrom", propOrder = {

})
public class GCROriginatedFrom {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "originated_from_code")
    protected int originatedFromCode;
    @XmlElement(name = "originated_from_text", required = true)
    protected String originatedFromText;
    @XmlElement(name = "date_from")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;

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
     * Gets the value of the originatedFromCode property.
     * 
     */
    public int getOriginatedFromCode() {
        return originatedFromCode;
    }

    /**
     * Sets the value of the originatedFromCode property.
     * 
     */
    public void setOriginatedFromCode(int value) {
        this.originatedFromCode = value;
    }

    /**
     * Gets the value of the originatedFromText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatedFromText() {
        return originatedFromText;
    }

    /**
     * Sets the value of the originatedFromText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatedFromText(String value) {
        this.originatedFromText = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

}
