
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeNlCourtDataFacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeNlCourtDataFacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="court_action" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="date_of_bankruptcy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeNlCourtDataFacts", propOrder = {

})
public class CreditsafeNlCourtDataFacts {

    @XmlElement(name = "court_action")
    protected Boolean courtAction;
    @XmlElement(name = "date_of_bankruptcy")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBankruptcy;
    protected String details;

    /**
     * Gets the value of the courtAction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCourtAction() {
        return courtAction;
    }

    /**
     * Sets the value of the courtAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCourtAction(Boolean value) {
        this.courtAction = value;
    }

    /**
     * Gets the value of the dateOfBankruptcy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBankruptcy() {
        return dateOfBankruptcy;
    }

    /**
     * Sets the value of the dateOfBankruptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBankruptcy(XMLGregorianCalendar value) {
        this.dateOfBankruptcy = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

}
