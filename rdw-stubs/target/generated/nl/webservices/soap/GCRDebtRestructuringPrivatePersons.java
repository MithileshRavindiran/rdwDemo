
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRDebtRestructuringPrivatePersons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRDebtRestructuringPrivatePersons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="official_registration_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currently_active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="provisional_verdict_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="definite_verdict_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="debt_restructuring_term_in_months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="provisional_discontinuance_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="provisional_discontinuance_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisional_discontinuance_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "GCRDebtRestructuringPrivatePersons", propOrder = {

})
public class GCRDebtRestructuringPrivatePersons {

    @XmlElement(name = "official_registration_number")
    protected BigInteger officialRegistrationNumber;
    @XmlElement(name = "currently_active")
    protected Boolean currentlyActive;
    @XmlElement(name = "provisional_verdict_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar provisionalVerdictDate;
    @XmlElement(name = "definite_verdict_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar definiteVerdictDate;
    @XmlElement(name = "debt_restructuring_term_in_months")
    protected Integer debtRestructuringTermInMonths;
    @XmlElement(name = "provisional_discontinuance_code")
    protected Integer provisionalDiscontinuanceCode;
    @XmlElement(name = "provisional_discontinuance_text")
    protected String provisionalDiscontinuanceText;
    @XmlElement(name = "provisional_discontinuance_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar provisionalDiscontinuanceDate;
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
     * Gets the value of the debtRestructuringTermInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDebtRestructuringTermInMonths() {
        return debtRestructuringTermInMonths;
    }

    /**
     * Sets the value of the debtRestructuringTermInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDebtRestructuringTermInMonths(Integer value) {
        this.debtRestructuringTermInMonths = value;
    }

    /**
     * Gets the value of the provisionalDiscontinuanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProvisionalDiscontinuanceCode() {
        return provisionalDiscontinuanceCode;
    }

    /**
     * Sets the value of the provisionalDiscontinuanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProvisionalDiscontinuanceCode(Integer value) {
        this.provisionalDiscontinuanceCode = value;
    }

    /**
     * Gets the value of the provisionalDiscontinuanceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisionalDiscontinuanceText() {
        return provisionalDiscontinuanceText;
    }

    /**
     * Sets the value of the provisionalDiscontinuanceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionalDiscontinuanceText(String value) {
        this.provisionalDiscontinuanceText = value;
    }

    /**
     * Gets the value of the provisionalDiscontinuanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvisionalDiscontinuanceDate() {
        return provisionalDiscontinuanceDate;
    }

    /**
     * Sets the value of the provisionalDiscontinuanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProvisionalDiscontinuanceDate(XMLGregorianCalendar value) {
        this.provisionalDiscontinuanceDate = value;
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
