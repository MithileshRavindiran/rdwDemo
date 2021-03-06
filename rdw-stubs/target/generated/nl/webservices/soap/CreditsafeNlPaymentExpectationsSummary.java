
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeNlPaymentExpectationsSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeNlPaymentExpectationsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="suspension_of_payments_mora" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payment_expectation_days" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="day_sales_outstanding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="industry_average_payment_expectation_days" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="industry_average_day_sales_outstanding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeNlPaymentExpectationsSummary", propOrder = {

})
public class CreditsafeNlPaymentExpectationsSummary {

    @XmlElement(name = "suspension_of_payments_mora")
    protected Boolean suspensionOfPaymentsMora;
    @XmlElement(name = "payment_expectation_days")
    protected BigDecimal paymentExpectationDays;
    @XmlElement(name = "day_sales_outstanding")
    protected BigDecimal daySalesOutstanding;
    @XmlElement(name = "industry_average_payment_expectation_days")
    protected BigDecimal industryAveragePaymentExpectationDays;
    @XmlElement(name = "industry_average_day_sales_outstanding")
    protected BigDecimal industryAverageDaySalesOutstanding;

    /**
     * Gets the value of the suspensionOfPaymentsMora property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspensionOfPaymentsMora() {
        return suspensionOfPaymentsMora;
    }

    /**
     * Sets the value of the suspensionOfPaymentsMora property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspensionOfPaymentsMora(Boolean value) {
        this.suspensionOfPaymentsMora = value;
    }

    /**
     * Gets the value of the paymentExpectationDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentExpectationDays() {
        return paymentExpectationDays;
    }

    /**
     * Sets the value of the paymentExpectationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentExpectationDays(BigDecimal value) {
        this.paymentExpectationDays = value;
    }

    /**
     * Gets the value of the daySalesOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaySalesOutstanding() {
        return daySalesOutstanding;
    }

    /**
     * Sets the value of the daySalesOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaySalesOutstanding(BigDecimal value) {
        this.daySalesOutstanding = value;
    }

    /**
     * Gets the value of the industryAveragePaymentExpectationDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndustryAveragePaymentExpectationDays() {
        return industryAveragePaymentExpectationDays;
    }

    /**
     * Sets the value of the industryAveragePaymentExpectationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndustryAveragePaymentExpectationDays(BigDecimal value) {
        this.industryAveragePaymentExpectationDays = value;
    }

    /**
     * Gets the value of the industryAverageDaySalesOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndustryAverageDaySalesOutstanding() {
        return industryAverageDaySalesOutstanding;
    }

    /**
     * Sets the value of the industryAverageDaySalesOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndustryAverageDaySalesOutstanding(BigDecimal value) {
        this.industryAverageDaySalesOutstanding = value;
    }

}
