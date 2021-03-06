
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRCompanyContinuedUnder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanyContinuedUnder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="continued_under_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="continued_under_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GCRCompanyContinuedUnder", propOrder = {

})
public class GCRCompanyContinuedUnder {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "continued_under_code")
    protected Integer continuedUnderCode;
    @XmlElement(name = "continued_under_text")
    protected String continuedUnderText;
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
     * Gets the value of the continuedUnderCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContinuedUnderCode() {
        return continuedUnderCode;
    }

    /**
     * Sets the value of the continuedUnderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContinuedUnderCode(Integer value) {
        this.continuedUnderCode = value;
    }

    /**
     * Gets the value of the continuedUnderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinuedUnderText() {
        return continuedUnderText;
    }

    /**
     * Sets the value of the continuedUnderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinuedUnderText(String value) {
        this.continuedUnderText = value;
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
