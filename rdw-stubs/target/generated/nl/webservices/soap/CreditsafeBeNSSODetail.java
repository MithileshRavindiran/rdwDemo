
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeBeNSSODetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBeNSSODetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="business_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_of_defendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_form_of_defendant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_of_summons" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="labour_court" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBeNSSODetail", propOrder = {

})
public class CreditsafeBeNSSODetail {

    @XmlElement(name = "business_number")
    protected String businessNumber;
    @XmlElement(name = "name_of_defendant")
    protected String nameOfDefendant;
    @XmlElement(name = "legal_form_of_defendant")
    protected String legalFormOfDefendant;
    @XmlElement(name = "date_of_summons")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfSummons;
    @XmlElement(name = "labour_court")
    protected String labourCourt;

    /**
     * Gets the value of the businessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNumber() {
        return businessNumber;
    }

    /**
     * Sets the value of the businessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNumber(String value) {
        this.businessNumber = value;
    }

    /**
     * Gets the value of the nameOfDefendant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfDefendant() {
        return nameOfDefendant;
    }

    /**
     * Sets the value of the nameOfDefendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfDefendant(String value) {
        this.nameOfDefendant = value;
    }

    /**
     * Gets the value of the legalFormOfDefendant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalFormOfDefendant() {
        return legalFormOfDefendant;
    }

    /**
     * Sets the value of the legalFormOfDefendant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalFormOfDefendant(String value) {
        this.legalFormOfDefendant = value;
    }

    /**
     * Gets the value of the dateOfSummons property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfSummons() {
        return dateOfSummons;
    }

    /**
     * Sets the value of the dateOfSummons property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfSummons(XMLGregorianCalendar value) {
        this.dateOfSummons = value;
    }

    /**
     * Gets the value of the labourCourt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabourCourt() {
        return labourCourt;
    }

    /**
     * Sets the value of the labourCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabourCourt(String value) {
        this.labourCourt = value;
    }

}
