
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRBranchOffice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRBranchOffice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="branch_office_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="business_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}GCRTradeNameArray" minOccurs="0"/>
 *         &lt;element name="addresses" type="{http://www.webservices.nl/soap/}GCRAddressArray" minOccurs="0"/>
 *         &lt;element name="telephone_numbers" type="{http://www.webservices.nl/soap/}GCRTelephoneNumberArray" minOccurs="0"/>
 *         &lt;element name="email_addresses" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="estabishment_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="discontinuance" type="{http://www.webservices.nl/soap/}GCRDiscontinuance" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRBranchOffice", propOrder = {

})
public class GCRBranchOffice {

    @XmlElement(name = "branch_office_id", required = true)
    protected String branchOfficeId;
    @XmlElement(name = "business_name")
    protected String businessName;
    @XmlElement(name = "trade_names")
    protected GCRTradeNameArray tradeNames;
    protected GCRAddressArray addresses;
    @XmlElement(name = "telephone_numbers")
    protected GCRTelephoneNumberArray telephoneNumbers;
    @XmlElement(name = "email_addresses")
    protected StringArray emailAddresses;
    @XmlElement(name = "estabishment_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar estabishmentDate;
    protected GCRDiscontinuance discontinuance;

    /**
     * Gets the value of the branchOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchOfficeId() {
        return branchOfficeId;
    }

    /**
     * Sets the value of the branchOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchOfficeId(String value) {
        this.branchOfficeId = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the tradeNames property.
     * 
     * @return
     *     possible object is
     *     {@link GCRTradeNameArray }
     *     
     */
    public GCRTradeNameArray getTradeNames() {
        return tradeNames;
    }

    /**
     * Sets the value of the tradeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRTradeNameArray }
     *     
     */
    public void setTradeNames(GCRTradeNameArray value) {
        this.tradeNames = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAddressArray }
     *     
     */
    public GCRAddressArray getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAddressArray }
     *     
     */
    public void setAddresses(GCRAddressArray value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the telephoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link GCRTelephoneNumberArray }
     *     
     */
    public GCRTelephoneNumberArray getTelephoneNumbers() {
        return telephoneNumbers;
    }

    /**
     * Sets the value of the telephoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRTelephoneNumberArray }
     *     
     */
    public void setTelephoneNumbers(GCRTelephoneNumberArray value) {
        this.telephoneNumbers = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setEmailAddresses(StringArray value) {
        this.emailAddresses = value;
    }

    /**
     * Gets the value of the estabishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstabishmentDate() {
        return estabishmentDate;
    }

    /**
     * Sets the value of the estabishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstabishmentDate(XMLGregorianCalendar value) {
        this.estabishmentDate = value;
    }

    /**
     * Gets the value of the discontinuance property.
     * 
     * @return
     *     possible object is
     *     {@link GCRDiscontinuance }
     *     
     */
    public GCRDiscontinuance getDiscontinuance() {
        return discontinuance;
    }

    /**
     * Sets the value of the discontinuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRDiscontinuance }
     *     
     */
    public void setDiscontinuance(GCRDiscontinuance value) {
        this.discontinuance = value;
    }

}
