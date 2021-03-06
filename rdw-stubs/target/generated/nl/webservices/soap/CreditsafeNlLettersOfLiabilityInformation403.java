
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeNlLettersOfLiabilityInformation403 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeNlLettersOfLiabilityInformation403">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="financial_year" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="company_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company_number" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="date_submitted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="letters_of_liability" type="{http://www.webservices.nl/soap/}CreditsafeNlLettersOfLiabilityArray" minOccurs="0"/>
 *         &lt;element name="letters_of_liability_2nd_parent" type="{http://www.webservices.nl/soap/}CreditsafeNlLettersOfLiabilityArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeNlLettersOfLiabilityInformation403", propOrder = {

})
public class CreditsafeNlLettersOfLiabilityInformation403 {

    @XmlElement(name = "financial_year")
    @XmlSchemaType(name = "unsignedInt")
    protected Long financialYear;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "company_number")
    @XmlSchemaType(name = "unsignedInt")
    protected Long companyNumber;
    @XmlElement(name = "date_submitted")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSubmitted;
    @XmlElement(name = "letters_of_liability")
    protected CreditsafeNlLettersOfLiabilityArray lettersOfLiability;
    @XmlElement(name = "letters_of_liability_2nd_parent")
    protected CreditsafeNlLettersOfLiabilityArray lettersOfLiability2NdParent;

    /**
     * Gets the value of the financialYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinancialYear() {
        return financialYear;
    }

    /**
     * Sets the value of the financialYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinancialYear(Long value) {
        this.financialYear = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyNumber(Long value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the dateSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * Sets the value of the dateSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSubmitted(XMLGregorianCalendar value) {
        this.dateSubmitted = value;
    }

    /**
     * Gets the value of the lettersOfLiability property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlLettersOfLiabilityArray }
     *     
     */
    public CreditsafeNlLettersOfLiabilityArray getLettersOfLiability() {
        return lettersOfLiability;
    }

    /**
     * Sets the value of the lettersOfLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlLettersOfLiabilityArray }
     *     
     */
    public void setLettersOfLiability(CreditsafeNlLettersOfLiabilityArray value) {
        this.lettersOfLiability = value;
    }

    /**
     * Gets the value of the lettersOfLiability2NdParent property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlLettersOfLiabilityArray }
     *     
     */
    public CreditsafeNlLettersOfLiabilityArray getLettersOfLiability2NdParent() {
        return lettersOfLiability2NdParent;
    }

    /**
     * Sets the value of the lettersOfLiability2NdParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlLettersOfLiabilityArray }
     *     
     */
    public void setLettersOfLiability2NdParent(CreditsafeNlLettersOfLiabilityArray value) {
        this.lettersOfLiability2NdParent = value;
    }

}
