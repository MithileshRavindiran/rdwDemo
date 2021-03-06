
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRFirstDirector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRFirstDirector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_person_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="is_current" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="job_title_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="job_title_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_from" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_until" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRFirstDirector", propOrder = {

})
public class GCRFirstDirector {

    @XmlElement(name = "graydon_person_id")
    protected BigInteger graydonPersonId;
    @XmlElement(name = "is_current")
    protected Boolean isCurrent;
    @XmlElement(name = "job_title_code")
    protected Integer jobTitleCode;
    @XmlElement(name = "job_title_text")
    protected String jobTitleText;
    @XmlElement(name = "date_from")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(name = "date_until")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateUntil;

    /**
     * Gets the value of the graydonPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGraydonPersonId() {
        return graydonPersonId;
    }

    /**
     * Sets the value of the graydonPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGraydonPersonId(BigInteger value) {
        this.graydonPersonId = value;
    }

    /**
     * Gets the value of the isCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrent() {
        return isCurrent;
    }

    /**
     * Sets the value of the isCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCurrent(Boolean value) {
        this.isCurrent = value;
    }

    /**
     * Gets the value of the jobTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobTitleCode() {
        return jobTitleCode;
    }

    /**
     * Sets the value of the jobTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobTitleCode(Integer value) {
        this.jobTitleCode = value;
    }

    /**
     * Gets the value of the jobTitleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitleText() {
        return jobTitleText;
    }

    /**
     * Sets the value of the jobTitleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitleText(String value) {
        this.jobTitleText = value;
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

    /**
     * Gets the value of the dateUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUntil() {
        return dateUntil;
    }

    /**
     * Sets the value of the dateUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUntil(XMLGregorianCalendar value) {
        this.dateUntil = value;
    }

}
