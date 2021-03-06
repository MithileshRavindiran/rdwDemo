
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRBankruptcy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRBankruptcy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="official_registration_number" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currently_active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="date_of_verdict" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="definite_discontinuance_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="definite_discontinuance_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="definite_discontinuance_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="curators" type="{http://www.webservices.nl/soap/}GCRCuratorArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRBankruptcy", propOrder = {

})
public class GCRBankruptcy {

    @XmlElement(name = "official_registration_number")
    protected BigInteger officialRegistrationNumber;
    @XmlElement(name = "currently_active")
    protected Boolean currentlyActive;
    @XmlElement(name = "date_of_verdict")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfVerdict;
    @XmlElement(name = "definite_discontinuance_code")
    protected Integer definiteDiscontinuanceCode;
    @XmlElement(name = "definite_discontinuance_text")
    protected String definiteDiscontinuanceText;
    @XmlElement(name = "definite_discontinuance_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar definiteDiscontinuanceDate;
    protected GCRCuratorArray curators;

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
     * Gets the value of the dateOfVerdict property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfVerdict() {
        return dateOfVerdict;
    }

    /**
     * Sets the value of the dateOfVerdict property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfVerdict(XMLGregorianCalendar value) {
        this.dateOfVerdict = value;
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
     * Gets the value of the curators property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCuratorArray }
     *     
     */
    public GCRCuratorArray getCurators() {
        return curators;
    }

    /**
     * Sets the value of the curators property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCuratorArray }
     *     
     */
    public void setCurators(GCRCuratorArray value) {
        this.curators = value;
    }

}
