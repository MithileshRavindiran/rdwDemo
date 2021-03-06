
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRCapital complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCapital">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="is_current" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="date_change" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="social_capital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capital_of_commandite_partnership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issued_capital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paid_up_capital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monetary_amount_specified_in_corporate_deed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCapital", propOrder = {

})
public class GCRCapital {

    @XmlElement(name = "is_current")
    protected Boolean isCurrent;
    @XmlElement(name = "date_change")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateChange;
    @XmlElement(name = "social_capital")
    protected String socialCapital;
    @XmlElement(name = "capital_of_commandite_partnership")
    protected String capitalOfCommanditePartnership;
    @XmlElement(name = "issued_capital")
    protected String issuedCapital;
    @XmlElement(name = "paid_up_capital")
    protected String paidUpCapital;
    @XmlElement(name = "monetary_amount_specified_in_corporate_deed")
    protected String monetaryAmountSpecifiedInCorporateDeed;

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
     * Gets the value of the dateChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateChange() {
        return dateChange;
    }

    /**
     * Sets the value of the dateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateChange(XMLGregorianCalendar value) {
        this.dateChange = value;
    }

    /**
     * Gets the value of the socialCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialCapital() {
        return socialCapital;
    }

    /**
     * Sets the value of the socialCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialCapital(String value) {
        this.socialCapital = value;
    }

    /**
     * Gets the value of the capitalOfCommanditePartnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitalOfCommanditePartnership() {
        return capitalOfCommanditePartnership;
    }

    /**
     * Sets the value of the capitalOfCommanditePartnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitalOfCommanditePartnership(String value) {
        this.capitalOfCommanditePartnership = value;
    }

    /**
     * Gets the value of the issuedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedCapital() {
        return issuedCapital;
    }

    /**
     * Sets the value of the issuedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedCapital(String value) {
        this.issuedCapital = value;
    }

    /**
     * Gets the value of the paidUpCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidUpCapital() {
        return paidUpCapital;
    }

    /**
     * Sets the value of the paidUpCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidUpCapital(String value) {
        this.paidUpCapital = value;
    }

    /**
     * Gets the value of the monetaryAmountSpecifiedInCorporateDeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonetaryAmountSpecifiedInCorporateDeed() {
        return monetaryAmountSpecifiedInCorporateDeed;
    }

    /**
     * Sets the value of the monetaryAmountSpecifiedInCorporateDeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonetaryAmountSpecifiedInCorporateDeed(String value) {
        this.monetaryAmountSpecifiedInCorporateDeed = value;
    }

}
