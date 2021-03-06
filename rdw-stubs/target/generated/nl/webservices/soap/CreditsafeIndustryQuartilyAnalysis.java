
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeIndustryQuartilyAnalysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeIndustryQuartilyAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="payment_expectation_days" type="{http://www.webservices.nl/soap/}CreditsafeQuartiles" minOccurs="0"/>
 *         &lt;element name="day_sales_outstanding" type="{http://www.webservices.nl/soap/}CreditsafeQuartiles" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeIndustryQuartilyAnalysis", propOrder = {

})
public class CreditsafeIndustryQuartilyAnalysis {

    @XmlElement(name = "payment_expectation_days")
    protected CreditsafeQuartiles paymentExpectationDays;
    @XmlElement(name = "day_sales_outstanding")
    protected CreditsafeQuartiles daySalesOutstanding;

    /**
     * Gets the value of the paymentExpectationDays property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeQuartiles }
     *     
     */
    public CreditsafeQuartiles getPaymentExpectationDays() {
        return paymentExpectationDays;
    }

    /**
     * Sets the value of the paymentExpectationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeQuartiles }
     *     
     */
    public void setPaymentExpectationDays(CreditsafeQuartiles value) {
        this.paymentExpectationDays = value;
    }

    /**
     * Gets the value of the daySalesOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeQuartiles }
     *     
     */
    public CreditsafeQuartiles getDaySalesOutstanding() {
        return daySalesOutstanding;
    }

    /**
     * Sets the value of the daySalesOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeQuartiles }
     *     
     */
    public void setDaySalesOutstanding(CreditsafeQuartiles value) {
        this.daySalesOutstanding = value;
    }

}
