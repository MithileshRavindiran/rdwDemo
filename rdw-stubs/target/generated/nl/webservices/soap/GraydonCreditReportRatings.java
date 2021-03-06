
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReportRatings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReportRatings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="credit_advice_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_advice_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_advice_factors" type="{http://www.webservices.nl/soap/}GCRCreditFactorArray" minOccurs="0"/>
 *         &lt;element name="pd_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratings" type="{http://www.webservices.nl/soap/}GCRRatingArray" minOccurs="0"/>
 *         &lt;element name="payment_information" type="{http://www.webservices.nl/soap/}GCRPaymentInformationArray" minOccurs="0"/>
 *         &lt;element name="alarm" type="{http://www.webservices.nl/soap/}GCRAlarm" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraydonCreditReportRatings", propOrder = {

})
public class GraydonCreditReportRatings {

    @XmlElement(name = "credit_advice_amount")
    protected String creditAdviceAmount;
    @XmlElement(name = "credit_advice_currency")
    protected String creditAdviceCurrency;
    @XmlElement(name = "credit_advice_factors")
    protected GCRCreditFactorArray creditAdviceFactors;
    @XmlElement(name = "pd_rating")
    protected String pdRating;
    protected GCRRatingArray ratings;
    @XmlElement(name = "payment_information")
    protected GCRPaymentInformationArray paymentInformation;
    protected GCRAlarm alarm;

    /**
     * Gets the value of the creditAdviceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAdviceAmount() {
        return creditAdviceAmount;
    }

    /**
     * Sets the value of the creditAdviceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAdviceAmount(String value) {
        this.creditAdviceAmount = value;
    }

    /**
     * Gets the value of the creditAdviceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAdviceCurrency() {
        return creditAdviceCurrency;
    }

    /**
     * Sets the value of the creditAdviceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAdviceCurrency(String value) {
        this.creditAdviceCurrency = value;
    }

    /**
     * Gets the value of the creditAdviceFactors property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCreditFactorArray }
     *     
     */
    public GCRCreditFactorArray getCreditAdviceFactors() {
        return creditAdviceFactors;
    }

    /**
     * Sets the value of the creditAdviceFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCreditFactorArray }
     *     
     */
    public void setCreditAdviceFactors(GCRCreditFactorArray value) {
        this.creditAdviceFactors = value;
    }

    /**
     * Gets the value of the pdRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdRating() {
        return pdRating;
    }

    /**
     * Sets the value of the pdRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdRating(String value) {
        this.pdRating = value;
    }

    /**
     * Gets the value of the ratings property.
     * 
     * @return
     *     possible object is
     *     {@link GCRRatingArray }
     *     
     */
    public GCRRatingArray getRatings() {
        return ratings;
    }

    /**
     * Sets the value of the ratings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRRatingArray }
     *     
     */
    public void setRatings(GCRRatingArray value) {
        this.ratings = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPaymentInformationArray }
     *     
     */
    public GCRPaymentInformationArray getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPaymentInformationArray }
     *     
     */
    public void setPaymentInformation(GCRPaymentInformationArray value) {
        this.paymentInformation = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAlarm }
     *     
     */
    public GCRAlarm getAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAlarm }
     *     
     */
    public void setAlarm(GCRAlarm value) {
        this.alarm = value;
    }

}
