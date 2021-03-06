
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeCompanyUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeCompanyUpdate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changes" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="date_last_update" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeCompanyUpdate", propOrder = {

})
public class CreditsafeCompanyUpdate {

    @XmlElement(name = "company_id", required = true)
    protected String companyId;
    @XmlElement(required = true)
    protected StringArray changes;
    @XmlElement(name = "date_last_update", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLastUpdate;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setChanges(StringArray value) {
        this.changes = value;
    }

    /**
     * Gets the value of the dateLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastUpdate() {
        return dateLastUpdate;
    }

    /**
     * Sets the value of the dateLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastUpdate(XMLGregorianCalendar value) {
        this.dateLastUpdate = value;
    }

}
