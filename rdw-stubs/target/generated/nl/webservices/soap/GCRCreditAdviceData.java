
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCreditAdviceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCreditAdviceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="including_personal_judgement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="credit_advice" type="{http://www.webservices.nl/soap/}GCRCreditAdvice" minOccurs="0"/>
 *         &lt;element name="credit_advice_mother" type="{http://www.webservices.nl/soap/}GCRCreditAdviceMother" minOccurs="0"/>
 *         &lt;element name="credit_rating" type="{http://www.webservices.nl/soap/}GCRCreditRating" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCreditAdviceData", propOrder = {

})
public class GCRCreditAdviceData {

    @XmlElement(name = "including_personal_judgement")
    protected boolean includingPersonalJudgement;
    @XmlElement(name = "credit_advice")
    protected GCRCreditAdvice creditAdvice;
    @XmlElement(name = "credit_advice_mother")
    protected GCRCreditAdviceMother creditAdviceMother;
    @XmlElement(name = "credit_rating")
    protected GCRCreditRating creditRating;

    /**
     * Gets the value of the includingPersonalJudgement property.
     * 
     */
    public boolean isIncludingPersonalJudgement() {
        return includingPersonalJudgement;
    }

    /**
     * Sets the value of the includingPersonalJudgement property.
     * 
     */
    public void setIncludingPersonalJudgement(boolean value) {
        this.includingPersonalJudgement = value;
    }

    /**
     * Gets the value of the creditAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCreditAdvice }
     *     
     */
    public GCRCreditAdvice getCreditAdvice() {
        return creditAdvice;
    }

    /**
     * Sets the value of the creditAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCreditAdvice }
     *     
     */
    public void setCreditAdvice(GCRCreditAdvice value) {
        this.creditAdvice = value;
    }

    /**
     * Gets the value of the creditAdviceMother property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCreditAdviceMother }
     *     
     */
    public GCRCreditAdviceMother getCreditAdviceMother() {
        return creditAdviceMother;
    }

    /**
     * Sets the value of the creditAdviceMother property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCreditAdviceMother }
     *     
     */
    public void setCreditAdviceMother(GCRCreditAdviceMother value) {
        this.creditAdviceMother = value;
    }

    /**
     * Gets the value of the creditRating property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCreditRating }
     *     
     */
    public GCRCreditRating getCreditRating() {
        return creditRating;
    }

    /**
     * Sets the value of the creditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCreditRating }
     *     
     */
    public void setCreditRating(GCRCreditRating value) {
        this.creditRating = value;
    }

}
