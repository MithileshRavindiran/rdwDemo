
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeLtdCreditScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdCreditScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="current_credit_rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="current_rating_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="current_credit_limit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="current_contract_limit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="previous_credit_limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previous_credit_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previous_rating_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_of_latest_rating_change" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdCreditScore", propOrder = {

})
public class CreditsafeLtdCreditScore {

    @XmlElement(name = "current_credit_rating", required = true)
    protected String currentCreditRating;
    @XmlElement(name = "current_rating_description")
    protected String currentRatingDescription;
    @XmlElement(name = "current_credit_limit", required = true)
    protected String currentCreditLimit;
    @XmlElement(name = "current_contract_limit")
    protected BigDecimal currentContractLimit;
    @XmlElement(name = "previous_credit_limit")
    protected String previousCreditLimit;
    @XmlElement(name = "previous_credit_rating")
    protected String previousCreditRating;
    @XmlElement(name = "previous_rating_description")
    protected String previousRatingDescription;
    @XmlElement(name = "date_of_latest_rating_change")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfLatestRatingChange;

    /**
     * Gets the value of the currentCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCreditRating() {
        return currentCreditRating;
    }

    /**
     * Sets the value of the currentCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCreditRating(String value) {
        this.currentCreditRating = value;
    }

    /**
     * Gets the value of the currentRatingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentRatingDescription() {
        return currentRatingDescription;
    }

    /**
     * Sets the value of the currentRatingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentRatingDescription(String value) {
        this.currentRatingDescription = value;
    }

    /**
     * Gets the value of the currentCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCreditLimit() {
        return currentCreditLimit;
    }

    /**
     * Sets the value of the currentCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCreditLimit(String value) {
        this.currentCreditLimit = value;
    }

    /**
     * Gets the value of the currentContractLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentContractLimit() {
        return currentContractLimit;
    }

    /**
     * Sets the value of the currentContractLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentContractLimit(BigDecimal value) {
        this.currentContractLimit = value;
    }

    /**
     * Gets the value of the previousCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousCreditLimit() {
        return previousCreditLimit;
    }

    /**
     * Sets the value of the previousCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousCreditLimit(String value) {
        this.previousCreditLimit = value;
    }

    /**
     * Gets the value of the previousCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousCreditRating() {
        return previousCreditRating;
    }

    /**
     * Sets the value of the previousCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousCreditRating(String value) {
        this.previousCreditRating = value;
    }

    /**
     * Gets the value of the previousRatingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRatingDescription() {
        return previousRatingDescription;
    }

    /**
     * Sets the value of the previousRatingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRatingDescription(String value) {
        this.previousRatingDescription = value;
    }

    /**
     * Gets the value of the dateOfLatestRatingChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfLatestRatingChange() {
        return dateOfLatestRatingChange;
    }

    /**
     * Sets the value of the dateOfLatestRatingChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfLatestRatingChange(XMLGregorianCalendar value) {
        this.dateOfLatestRatingChange = value;
    }

}
