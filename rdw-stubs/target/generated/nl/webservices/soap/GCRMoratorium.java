
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRMoratorium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRMoratorium">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="official_registration_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currently_active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="date_from" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="provisional_verdict_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="definite_verdict_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="moratorium_term_in_months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="prolongation_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="prolongation_in_months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vote_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vote_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vote_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="definite_discontinuance_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="definite_discontinuance_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="definite_discontinuance_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receivers" type="{http://www.webservices.nl/soap/}GCRReceiverArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRMoratorium", propOrder = {

})
public class GCRMoratorium {

    @XmlElement(name = "official_registration_number")
    protected BigInteger officialRegistrationNumber;
    @XmlElement(name = "currently_active")
    protected Boolean currentlyActive;
    @XmlElement(name = "date_from")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(name = "provisional_verdict_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar provisionalVerdictDate;
    @XmlElement(name = "definite_verdict_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar definiteVerdictDate;
    @XmlElement(name = "moratorium_term_in_months")
    protected Integer moratoriumTermInMonths;
    @XmlElement(name = "prolongation_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prolongationDate;
    @XmlElement(name = "prolongation_in_months")
    protected Integer prolongationInMonths;
    @XmlElement(name = "vote_code")
    protected Integer voteCode;
    @XmlElement(name = "vote_text")
    protected String voteText;
    @XmlElement(name = "vote_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar voteDate;
    @XmlElement(name = "definite_discontinuance_code")
    protected Integer definiteDiscontinuanceCode;
    @XmlElement(name = "definite_discontinuance_text")
    protected String definiteDiscontinuanceText;
    @XmlElement(name = "definite_discontinuance_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar definiteDiscontinuanceDate;
    protected GCRReceiverArray receivers;

    /**
     * Gets the value of the officialRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfficialRegistrationNumber() {
        return officialRegistrationNumber;
    }

    /**
     * Sets the value of the officialRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfficialRegistrationNumber(BigInteger value) {
        this.officialRegistrationNumber = value;
    }

    /**
     * Gets the value of the currentlyActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentlyActive() {
        return currentlyActive;
    }

    /**
     * Sets the value of the currentlyActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentlyActive(Boolean value) {
        this.currentlyActive = value;
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
     * Gets the value of the provisionalVerdictDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvisionalVerdictDate() {
        return provisionalVerdictDate;
    }

    /**
     * Sets the value of the provisionalVerdictDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProvisionalVerdictDate(XMLGregorianCalendar value) {
        this.provisionalVerdictDate = value;
    }

    /**
     * Gets the value of the definiteVerdictDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefiniteVerdictDate() {
        return definiteVerdictDate;
    }

    /**
     * Sets the value of the definiteVerdictDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefiniteVerdictDate(XMLGregorianCalendar value) {
        this.definiteVerdictDate = value;
    }

    /**
     * Gets the value of the moratoriumTermInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoratoriumTermInMonths() {
        return moratoriumTermInMonths;
    }

    /**
     * Sets the value of the moratoriumTermInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoratoriumTermInMonths(Integer value) {
        this.moratoriumTermInMonths = value;
    }

    /**
     * Gets the value of the prolongationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProlongationDate() {
        return prolongationDate;
    }

    /**
     * Sets the value of the prolongationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProlongationDate(XMLGregorianCalendar value) {
        this.prolongationDate = value;
    }

    /**
     * Gets the value of the prolongationInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProlongationInMonths() {
        return prolongationInMonths;
    }

    /**
     * Sets the value of the prolongationInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProlongationInMonths(Integer value) {
        this.prolongationInMonths = value;
    }

    /**
     * Gets the value of the voteCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVoteCode() {
        return voteCode;
    }

    /**
     * Sets the value of the voteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVoteCode(Integer value) {
        this.voteCode = value;
    }

    /**
     * Gets the value of the voteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoteText() {
        return voteText;
    }

    /**
     * Sets the value of the voteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoteText(String value) {
        this.voteText = value;
    }

    /**
     * Gets the value of the voteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoteDate() {
        return voteDate;
    }

    /**
     * Sets the value of the voteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoteDate(XMLGregorianCalendar value) {
        this.voteDate = value;
    }

    /**
     * Gets the value of the definiteDiscontinuanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefiniteDiscontinuanceCode() {
        return definiteDiscontinuanceCode;
    }

    /**
     * Sets the value of the definiteDiscontinuanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefiniteDiscontinuanceCode(Integer value) {
        this.definiteDiscontinuanceCode = value;
    }

    /**
     * Gets the value of the definiteDiscontinuanceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefiniteDiscontinuanceText() {
        return definiteDiscontinuanceText;
    }

    /**
     * Sets the value of the definiteDiscontinuanceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefiniteDiscontinuanceText(String value) {
        this.definiteDiscontinuanceText = value;
    }

    /**
     * Gets the value of the definiteDiscontinuanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefiniteDiscontinuanceDate() {
        return definiteDiscontinuanceDate;
    }

    /**
     * Sets the value of the definiteDiscontinuanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefiniteDiscontinuanceDate(XMLGregorianCalendar value) {
        this.definiteDiscontinuanceDate = value;
    }

    /**
     * Gets the value of the receivers property.
     * 
     * @return
     *     possible object is
     *     {@link GCRReceiverArray }
     *     
     */
    public GCRReceiverArray getReceivers() {
        return receivers;
    }

    /**
     * Sets the value of the receivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRReceiverArray }
     *     
     */
    public void setReceivers(GCRReceiverArray value) {
        this.receivers = value;
    }

}
