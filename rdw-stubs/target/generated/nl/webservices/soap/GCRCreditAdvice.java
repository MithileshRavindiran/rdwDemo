
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCreditAdvice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCreditAdvice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="history_advised_limits" type="{http://www.webservices.nl/soap/}GCRHistoryAdvisedLimitArray" minOccurs="0"/>
 *         &lt;element name="credit_factors" type="{http://www.webservices.nl/soap/}GCRCreditFactorArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCreditAdvice", propOrder = {

})
public class GCRCreditAdvice {

    @XmlElement(name = "graydon_company_id")
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "credit_amount")
    protected String creditAmount;
    @XmlElement(name = "credit_currency")
    protected String creditCurrency;
    @XmlElement(name = "history_advised_limits")
    protected GCRHistoryAdvisedLimitArray historyAdvisedLimits;
    @XmlElement(name = "credit_factors")
    protected GCRCreditFactorArray creditFactors;

    /**
     * Gets the value of the graydonCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGraydonCompanyId() {
        return graydonCompanyId;
    }

    /**
     * Sets the value of the graydonCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGraydonCompanyId(BigInteger value) {
        this.graydonCompanyId = value;
    }

    /**
     * Gets the value of the creditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAmount() {
        return creditAmount;
    }

    /**
     * Sets the value of the creditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAmount(String value) {
        this.creditAmount = value;
    }

    /**
     * Gets the value of the creditCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCurrency() {
        return creditCurrency;
    }

    /**
     * Sets the value of the creditCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCurrency(String value) {
        this.creditCurrency = value;
    }

    /**
     * Gets the value of the historyAdvisedLimits property.
     * 
     * @return
     *     possible object is
     *     {@link GCRHistoryAdvisedLimitArray }
     *     
     */
    public GCRHistoryAdvisedLimitArray getHistoryAdvisedLimits() {
        return historyAdvisedLimits;
    }

    /**
     * Sets the value of the historyAdvisedLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRHistoryAdvisedLimitArray }
     *     
     */
    public void setHistoryAdvisedLimits(GCRHistoryAdvisedLimitArray value) {
        this.historyAdvisedLimits = value;
    }

    /**
     * Gets the value of the creditFactors property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCreditFactorArray }
     *     
     */
    public GCRCreditFactorArray getCreditFactors() {
        return creditFactors;
    }

    /**
     * Sets the value of the creditFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCreditFactorArray }
     *     
     */
    public void setCreditFactors(GCRCreditFactorArray value) {
        this.creditFactors = value;
    }

}
