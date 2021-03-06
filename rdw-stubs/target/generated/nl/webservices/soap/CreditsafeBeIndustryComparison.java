
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeBeIndustryComparison complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBeIndustryComparison">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="activity_code" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="activity_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry_average_payment_expectation_days" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="industry_average_day_sales_outstanding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="industry_average_credit_rating" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBeIndustryComparison", propOrder = {

})
public class CreditsafeBeIndustryComparison {

    @XmlElement(name = "activity_code")
    @XmlSchemaType(name = "unsignedInt")
    protected Long activityCode;
    @XmlElement(name = "activity_description")
    protected String activityDescription;
    @XmlElement(name = "industry_average_payment_expectation_days")
    protected BigDecimal industryAveragePaymentExpectationDays;
    @XmlElement(name = "industry_average_day_sales_outstanding")
    protected BigDecimal industryAverageDaySalesOutstanding;
    @XmlElement(name = "industry_average_credit_rating")
    protected BigDecimal industryAverageCreditRating;

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivityCode(Long value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the activityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityDescription() {
        return activityDescription;
    }

    /**
     * Sets the value of the activityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityDescription(String value) {
        this.activityDescription = value;
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

    /**
     * Gets the value of the industryAverageCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndustryAverageCreditRating() {
        return industryAverageCreditRating;
    }

    /**
     * Sets the value of the industryAverageCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndustryAverageCreditRating(BigDecimal value) {
        this.industryAverageCreditRating = value;
    }

}
