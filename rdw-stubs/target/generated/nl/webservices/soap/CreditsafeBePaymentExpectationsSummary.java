
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeBePaymentExpectationsSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBePaymentExpectationsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payment_expectation_days" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="day_sales_outstanding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBePaymentExpectationsSummary", propOrder = {

})
public class CreditsafeBePaymentExpectationsSummary {

    @XmlElement(name = "payment_expectation_days")
    protected BigDecimal paymentExpectationDays;
    @XmlElement(name = "day_sales_outstanding")
    protected BigDecimal daySalesOutstanding;

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

}
