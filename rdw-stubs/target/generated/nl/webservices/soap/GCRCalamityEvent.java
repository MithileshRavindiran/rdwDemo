
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRCalamityEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCalamityEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="event_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="event_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="event_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="expiration_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="damage_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="damage_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insurance_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="insurance_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instigator_graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCalamityEvent", propOrder = {

})
public class GCRCalamityEvent {

    @XmlElement(name = "event_code")
    protected int eventCode;
    @XmlElement(name = "event_text")
    protected String eventText;
    @XmlElement(name = "event_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "expiration_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "damage_amount")
    protected String damageAmount;
    @XmlElement(name = "damage_currency")
    protected String damageCurrency;
    @XmlElement(name = "insurance_code")
    protected Integer insuranceCode;
    @XmlElement(name = "insurance_text")
    protected String insuranceText;
    @XmlElement(name = "instigator_graydon_company_id")
    protected BigInteger instigatorGraydonCompanyId;

    /**
     * Gets the value of the eventCode property.
     * 
     */
    public int getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     */
    public void setEventCode(int value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the eventText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventText() {
        return eventText;
    }

    /**
     * Sets the value of the eventText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventText(String value) {
        this.eventText = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the damageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageAmount() {
        return damageAmount;
    }

    /**
     * Sets the value of the damageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageAmount(String value) {
        this.damageAmount = value;
    }

    /**
     * Gets the value of the damageCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageCurrency() {
        return damageCurrency;
    }

    /**
     * Sets the value of the damageCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageCurrency(String value) {
        this.damageCurrency = value;
    }

    /**
     * Gets the value of the insuranceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuranceCode() {
        return insuranceCode;
    }

    /**
     * Sets the value of the insuranceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuranceCode(Integer value) {
        this.insuranceCode = value;
    }

    /**
     * Gets the value of the insuranceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceText() {
        return insuranceText;
    }

    /**
     * Sets the value of the insuranceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceText(String value) {
        this.insuranceText = value;
    }

    /**
     * Gets the value of the instigatorGraydonCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstigatorGraydonCompanyId() {
        return instigatorGraydonCompanyId;
    }

    /**
     * Sets the value of the instigatorGraydonCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstigatorGraydonCompanyId(BigInteger value) {
        this.instigatorGraydonCompanyId = value;
    }

}
