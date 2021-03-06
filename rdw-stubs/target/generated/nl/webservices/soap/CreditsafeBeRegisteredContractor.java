
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeBeRegisteredContractor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBeRegisteredContractor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="registration_number" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="contractor_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="striking_off_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBeRegisteredContractor", propOrder = {

})
public class CreditsafeBeRegisteredContractor {

    @XmlElement(name = "registration_number")
    @XmlSchemaType(name = "unsignedInt")
    protected Long registrationNumber;
    @XmlElement(name = "contractor_description")
    protected String contractorDescription;
    @XmlElement(name = "striking_off_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar strikingOffDate;

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegistrationNumber(Long value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the contractorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractorDescription() {
        return contractorDescription;
    }

    /**
     * Sets the value of the contractorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractorDescription(String value) {
        this.contractorDescription = value;
    }

    /**
     * Gets the value of the strikingOffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStrikingOffDate() {
        return strikingOffDate;
    }

    /**
     * Sets the value of the strikingOffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStrikingOffDate(XMLGregorianCalendar value) {
        this.strikingOffDate = value;
    }

}
