
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeNlAdditionalInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeNlAdditionalInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="negative_information" type="{http://www.webservices.nl/soap/}CreditsafeNlNegativeInformation" minOccurs="0"/>
 *         &lt;element name="misc" type="{http://www.webservices.nl/soap/}CreditsafeNlMisc" minOccurs="0"/>
 *         &lt;element name="industry_quartile_analysis" type="{http://www.webservices.nl/soap/}CreditsafeIndustryQuartilyAnalysis" minOccurs="0"/>
 *         &lt;element name="payment_expectations_summary" type="{http://www.webservices.nl/soap/}CreditsafeNlPaymentExpectationsSummary" minOccurs="0"/>
 *         &lt;element name="letters_of_liability_information_403" type="{http://www.webservices.nl/soap/}CreditsafeNlLettersOfLiabilityInformation403" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeNlAdditionalInformation", propOrder = {

})
public class CreditsafeNlAdditionalInformation {

    @XmlElement(name = "negative_information")
    protected CreditsafeNlNegativeInformation negativeInformation;
    protected CreditsafeNlMisc misc;
    @XmlElement(name = "industry_quartile_analysis")
    protected CreditsafeIndustryQuartilyAnalysis industryQuartileAnalysis;
    @XmlElement(name = "payment_expectations_summary")
    protected CreditsafeNlPaymentExpectationsSummary paymentExpectationsSummary;
    @XmlElement(name = "letters_of_liability_information_403")
    protected CreditsafeNlLettersOfLiabilityInformation403 lettersOfLiabilityInformation403;

    /**
     * Gets the value of the negativeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlNegativeInformation }
     *     
     */
    public CreditsafeNlNegativeInformation getNegativeInformation() {
        return negativeInformation;
    }

    /**
     * Sets the value of the negativeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlNegativeInformation }
     *     
     */
    public void setNegativeInformation(CreditsafeNlNegativeInformation value) {
        this.negativeInformation = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlMisc }
     *     
     */
    public CreditsafeNlMisc getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlMisc }
     *     
     */
    public void setMisc(CreditsafeNlMisc value) {
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
     *     {@link CreditsafeNlPaymentExpectationsSummary }
     *     
     */
    public CreditsafeNlPaymentExpectationsSummary getPaymentExpectationsSummary() {
        return paymentExpectationsSummary;
    }

    /**
     * Sets the value of the paymentExpectationsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlPaymentExpectationsSummary }
     *     
     */
    public void setPaymentExpectationsSummary(CreditsafeNlPaymentExpectationsSummary value) {
        this.paymentExpectationsSummary = value;
    }

    /**
     * Gets the value of the lettersOfLiabilityInformation403 property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlLettersOfLiabilityInformation403 }
     *     
     */
    public CreditsafeNlLettersOfLiabilityInformation403 getLettersOfLiabilityInformation403() {
        return lettersOfLiabilityInformation403;
    }

    /**
     * Sets the value of the lettersOfLiabilityInformation403 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlLettersOfLiabilityInformation403 }
     *     
     */
    public void setLettersOfLiabilityInformation403(CreditsafeNlLettersOfLiabilityInformation403 value) {
        this.lettersOfLiabilityInformation403 = value;
    }

}
