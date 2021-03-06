
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeCompanyReportFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeCompanyReportFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="order_number" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company_summary" type="{http://www.webservices.nl/soap/}CreditsafeLtdCompanySummary"/>
 *         &lt;element name="company_identification" type="{http://www.webservices.nl/soap/}CreditsafeLtdCompanyIdentification"/>
 *         &lt;element name="credit_score" type="{http://www.webservices.nl/soap/}CreditsafeLtdCreditScore"/>
 *         &lt;element name="contact_information" type="{http://www.webservices.nl/soap/}CreditsafeLtdContactInformation"/>
 *         &lt;element name="share_capital_structure" type="{http://www.webservices.nl/soap/}CreditsafeLtdShareCapitalStructure"/>
 *         &lt;element name="directors" type="{http://www.webservices.nl/soap/}CreditsafeLtdDirectors"/>
 *         &lt;element name="other_information" type="{http://www.webservices.nl/soap/}CreditsafeLtdOtherInformation"/>
 *         &lt;element name="group_structure" type="{http://www.webservices.nl/soap/}CreditsafeLtdGroupStructure" minOccurs="0"/>
 *         &lt;element name="financial_statements" type="{http://www.webservices.nl/soap/}CreditsafeLtdFinancialStatementArray" minOccurs="0"/>
 *         &lt;element name="additional_information" type="{http://www.webservices.nl/soap/}CreditsafeAdditionalInformation" minOccurs="0"/>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeCompanyReportFull", propOrder = {

})
public class CreditsafeCompanyReportFull {

    @XmlElement(name = "company_id", required = true)
    protected String companyId;
    @XmlElement(name = "order_number", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger orderNumber;
    @XmlElement(required = true)
    protected String language;
    @XmlElement(name = "company_summary", required = true)
    protected CreditsafeLtdCompanySummary companySummary;
    @XmlElement(name = "company_identification", required = true)
    protected CreditsafeLtdCompanyIdentification companyIdentification;
    @XmlElement(name = "credit_score", required = true)
    protected CreditsafeLtdCreditScore creditScore;
    @XmlElement(name = "contact_information", required = true)
    protected CreditsafeLtdContactInformation contactInformation;
    @XmlElement(name = "share_capital_structure", required = true)
    protected CreditsafeLtdShareCapitalStructure shareCapitalStructure;
    @XmlElement(required = true)
    protected CreditsafeLtdDirectors directors;
    @XmlElement(name = "other_information", required = true)
    protected CreditsafeLtdOtherInformation otherInformation;
    @XmlElement(name = "group_structure")
    protected CreditsafeLtdGroupStructure groupStructure;
    @XmlElement(name = "financial_statements")
    protected CreditsafeLtdFinancialStatementArray financialStatements;
    @XmlElement(name = "additional_information")
    protected CreditsafeAdditionalInformation additionalInformation;
    protected byte[] document;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the companySummary property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdCompanySummary }
     *     
     */
    public CreditsafeLtdCompanySummary getCompanySummary() {
        return companySummary;
    }

    /**
     * Sets the value of the companySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdCompanySummary }
     *     
     */
    public void setCompanySummary(CreditsafeLtdCompanySummary value) {
        this.companySummary = value;
    }

    /**
     * Gets the value of the companyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdCompanyIdentification }
     *     
     */
    public CreditsafeLtdCompanyIdentification getCompanyIdentification() {
        return companyIdentification;
    }

    /**
     * Sets the value of the companyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdCompanyIdentification }
     *     
     */
    public void setCompanyIdentification(CreditsafeLtdCompanyIdentification value) {
        this.companyIdentification = value;
    }

    /**
     * Gets the value of the creditScore property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdCreditScore }
     *     
     */
    public CreditsafeLtdCreditScore getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdCreditScore }
     *     
     */
    public void setCreditScore(CreditsafeLtdCreditScore value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdContactInformation }
     *     
     */
    public CreditsafeLtdContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdContactInformation }
     *     
     */
    public void setContactInformation(CreditsafeLtdContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the shareCapitalStructure property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdShareCapitalStructure }
     *     
     */
    public CreditsafeLtdShareCapitalStructure getShareCapitalStructure() {
        return shareCapitalStructure;
    }

    /**
     * Sets the value of the shareCapitalStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdShareCapitalStructure }
     *     
     */
    public void setShareCapitalStructure(CreditsafeLtdShareCapitalStructure value) {
        this.shareCapitalStructure = value;
    }

    /**
     * Gets the value of the directors property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdDirectors }
     *     
     */
    public CreditsafeLtdDirectors getDirectors() {
        return directors;
    }

    /**
     * Sets the value of the directors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdDirectors }
     *     
     */
    public void setDirectors(CreditsafeLtdDirectors value) {
        this.directors = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdOtherInformation }
     *     
     */
    public CreditsafeLtdOtherInformation getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdOtherInformation }
     *     
     */
    public void setOtherInformation(CreditsafeLtdOtherInformation value) {
        this.otherInformation = value;
    }

    /**
     * Gets the value of the groupStructure property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdGroupStructure }
     *     
     */
    public CreditsafeLtdGroupStructure getGroupStructure() {
        return groupStructure;
    }

    /**
     * Sets the value of the groupStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdGroupStructure }
     *     
     */
    public void setGroupStructure(CreditsafeLtdGroupStructure value) {
        this.groupStructure = value;
    }

    /**
     * Gets the value of the financialStatements property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeLtdFinancialStatementArray }
     *     
     */
    public CreditsafeLtdFinancialStatementArray getFinancialStatements() {
        return financialStatements;
    }

    /**
     * Sets the value of the financialStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeLtdFinancialStatementArray }
     *     
     */
    public void setFinancialStatements(CreditsafeLtdFinancialStatementArray value) {
        this.financialStatements = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeAdditionalInformation }
     *     
     */
    public CreditsafeAdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeAdditionalInformation }
     *     
     */
    public void setAdditionalInformation(CreditsafeAdditionalInformation value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument(byte[] value) {
        this.document = ((byte[]) value);
    }

}
