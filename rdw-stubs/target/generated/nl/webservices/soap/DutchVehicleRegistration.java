
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DutchVehicleRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="date_apk_due_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_first_issuing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_first_admission" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_suspension_end_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_tachograph_expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="date_latest_name_registration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ownerships" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleRegistration", propOrder = {

})
public class DutchVehicleRegistration {

    @XmlElement(name = "date_apk_due_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateApkDueDate;
    @XmlElement(name = "date_first_issuing")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFirstIssuing;
    @XmlElement(name = "date_first_admission")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFirstAdmission;
    @XmlElement(name = "date_suspension_end_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSuspensionEndDate;
    @XmlElement(name = "date_tachograph_expiration")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTachographExpiration;
    @XmlElement(name = "date_latest_name_registration")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLatestNameRegistration;
    protected Integer ownerships;

    /**
     * Gets the value of the dateApkDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateApkDueDate() {
        return dateApkDueDate;
    }

    /**
     * Sets the value of the dateApkDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateApkDueDate(XMLGregorianCalendar value) {
        this.dateApkDueDate = value;
    }

    /**
     * Gets the value of the dateFirstIssuing property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFirstIssuing() {
        return dateFirstIssuing;
    }

    /**
     * Sets the value of the dateFirstIssuing property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFirstIssuing(XMLGregorianCalendar value) {
        this.dateFirstIssuing = value;
    }

    /**
     * Gets the value of the dateFirstAdmission property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFirstAdmission() {
        return dateFirstAdmission;
    }

    /**
     * Sets the value of the dateFirstAdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFirstAdmission(XMLGregorianCalendar value) {
        this.dateFirstAdmission = value;
    }

    /**
     * Gets the value of the dateSuspensionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSuspensionEndDate() {
        return dateSuspensionEndDate;
    }

    /**
     * Sets the value of the dateSuspensionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSuspensionEndDate(XMLGregorianCalendar value) {
        this.dateSuspensionEndDate = value;
    }

    /**
     * Gets the value of the dateTachographExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTachographExpiration() {
        return dateTachographExpiration;
    }

    /**
     * Sets the value of the dateTachographExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTachographExpiration(XMLGregorianCalendar value) {
        this.dateTachographExpiration = value;
    }

    /**
     * Gets the value of the dateLatestNameRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLatestNameRegistration() {
        return dateLatestNameRegistration;
    }

    /**
     * Sets the value of the dateLatestNameRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLatestNameRegistration(XMLGregorianCalendar value) {
        this.dateLatestNameRegistration = value;
    }

    /**
     * Gets the value of the ownerships property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOwnerships() {
        return ownerships;
    }

    /**
     * Sets the value of the ownerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOwnerships(Integer value) {
        this.ownerships = value;
    }

}
