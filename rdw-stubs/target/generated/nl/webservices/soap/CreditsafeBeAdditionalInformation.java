
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeBeAdditionalInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBeAdditionalInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="negative_information" type="{http://www.webservices.nl/soap/}CreditsafeBeNegativeInformation" minOccurs="0"/>
 *         &lt;element name="misc" type="{http://www.webservices.nl/soap/}CreditsafeBeMisc" minOccurs="0"/>
 *         &lt;element name="industry_quartile_analysis" type="{http://www.webservices.nl/soap/}CreditsafeIndustryQuartilyAnalysis" minOccurs="0"/>
 *         &lt;element name="payment_expectations_summary" type="{http://www.webservices.nl/soap/}CreditsafeBePaymentExpectationsSummary" minOccurs="0"/>
 *         &lt;element name="industry_comparison" type="{http://www.webservices.nl/soap/}CreditsafeBeIndustryComparison" minOccurs="0"/>
 *         &lt;element name="registered_contractors" type="{http://www.webservices.nl/soap/}CreditsafeBeRegisteredContractorArray" minOccurs="0"/>
 *         &lt;element name="events" type="{http://www.webservices.nl/soap/}CreditsafeBeEventArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBeAdditionalInformation", propOrder = {

})
public class CreditsafeBeAdditionalInformation {

    @XmlElement(name = "negative_information")
    protected CreditsafeBeNegativeInformation negativeInformation;
    protected CreditsafeBeMisc misc;
    @XmlElement(name = "industry_quartile_analysis")
    protected CreditsafeIndustryQuartilyAnalysis industryQuartileAnalysis;
    @XmlElement(name = "payment_expectations_summary")
    protected CreditsafeBePaymentExpectationsSummary paymentExpectationsSummary;
    @XmlElement(name = "industry_comparison")
    protected CreditsafeBeIndustryComparison industryComparison;
    @XmlElement(name = "registered_contractors")
    protected CreditsafeBeRegisteredContractorArray registeredContractors;
    protected CreditsafeBeEventArray events;

    /**
     * Gets the value of the negativeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeNegativeInformation }
     *     
     */
    public CreditsafeBeNegativeInformation getNegativeInformation() {
        return negativeInformation;
    }

    /**
     * Sets the value of the negativeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeNegativeInformation }
     *     
     */
    public void setNegativeInformation(CreditsafeBeNegativeInformation value) {
        this.negativeInformation = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeMisc }
     *     
     */
    public CreditsafeBeMisc getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeMisc }
     *     
     */
    public void setMisc(CreditsafeBeMisc value) {
        this.misc = value;
    }

    /**
     * Gets the value of the industryQuartileAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeIndustryQuartilyAnalysis }
     *     
     */
    public CreditsafeIndustryQuartilyAnalysis getIndustryQuartileAnalysis() {
        return industryQuartileAnalysis;
    }

    /**
     * Sets the value of the industryQuartileAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeIndustryQuartilyAnalysis }
     *     
     */
    public void setIndustryQuartileAnalysis(CreditsafeIndustryQuartilyAnalysis value) {
        this.industryQuartileAnalysis = value;
    }

    /**
     * Gets the value of the paymentExpectationsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBePaymentExpectationsSummary }
     *     
     */
    public CreditsafeBePaymentExpectationsSummary getPaymentExpectationsSummary() {
        return paymentExpectationsSummary;
    }

    /**
     * Sets the value of the paymentExpectationsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBePaymentExpectationsSummary }
     *     
     */
    public void setPaymentExpectationsSummary(CreditsafeBePaymentExpectationsSummary value) {
        this.paymentExpectationsSummary = value;
    }

    /**
     * Gets the value of the industryComparison property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeIndustryComparison }
     *     
     */
    public CreditsafeBeIndustryComparison getIndustryComparison() {
        return industryComparison;
    }

    /**
     * Sets the value of the industryComparison property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeIndustryComparison }
     *     
     */
    public void setIndustryComparison(CreditsafeBeIndustryComparison value) {
        this.industryComparison = value;
    }

    /**
     * Gets the value of the registeredContractors property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeRegisteredContractorArray }
     *     
     */
    public CreditsafeBeRegisteredContractorArray getRegisteredContractors() {
        return registeredContractors;
    }

    /**
     * Sets the value of the registeredContractors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeRegisteredContractorArray }
     *     
     */
    public void setRegisteredContractors(CreditsafeBeRegisteredContractorArray value) {
        this.registeredContractors = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeEventArray }
     *     
     */
    public CreditsafeBeEventArray getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeEventArray }
     *     
     */
    public void setEvents(CreditsafeBeEventArray value) {
        this.events = value;
    }

}
