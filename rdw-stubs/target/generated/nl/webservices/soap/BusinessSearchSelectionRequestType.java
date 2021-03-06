
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessSearchSelectionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessSearchSelectionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="city" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="postcode" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="sbi" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="primary_sbi_only" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="legal_forms" type="{http://www.webservices.nl/soap/}intArray"/>
 *         &lt;element name="employees_min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employees_max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="economically_active" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="financial_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changed_since" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessSearchSelectionRequestType", propOrder = {

})
public class BusinessSearchSelectionRequestType {

    @XmlElement(required = true)
    protected StringArray city;
    @XmlElement(required = true)
    protected StringArray postcode;
    @XmlElement(required = true)
    protected StringArray sbi;
    @XmlElement(name = "primary_sbi_only")
    protected boolean primarySbiOnly;
    @XmlElement(name = "legal_forms", required = true)
    protected IntArray legalForms;
    @XmlElement(name = "employees_min")
    protected int employeesMin;
    @XmlElement(name = "employees_max")
    protected int employeesMax;
    @XmlElement(name = "economically_active", required = true)
    protected String economicallyActive;
    @XmlElement(name = "financial_status", required = true)
    protected String financialStatus;
    @XmlElement(name = "changed_since", required = true)
    protected String changedSince;
    protected int page;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setCity(StringArray value) {
        this.city = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setPostcode(StringArray value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the sbi property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getSbi() {
        return sbi;
    }

    /**
     * Sets the value of the sbi property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setSbi(StringArray value) {
        this.sbi = value;
    }

    /**
     * Gets the value of the primarySbiOnly property.
     * 
     */
    public boolean isPrimarySbiOnly() {
        return primarySbiOnly;
    }

    /**
     * Sets the value of the primarySbiOnly property.
     * 
     */
    public void setPrimarySbiOnly(boolean value) {
        this.primarySbiOnly = value;
    }

    /**
     * Gets the value of the legalForms property.
     * 
     * @return
     *     possible object is
     *     {@link IntArray }
     *     
     */
    public IntArray getLegalForms() {
        return legalForms;
    }

    /**
     * Sets the value of the legalForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntArray }
     *     
     */
    public void setLegalForms(IntArray value) {
        this.legalForms = value;
    }

    /**
     * Gets the value of the employeesMin property.
     * 
     */
    public int getEmployeesMin() {
        return employeesMin;
    }

    /**
     * Sets the value of the employeesMin property.
     * 
     */
    public void setEmployeesMin(int value) {
        this.employeesMin = value;
    }

    /**
     * Gets the value of the employeesMax property.
     * 
     */
    public int getEmployeesMax() {
        return employeesMax;
    }

    /**
     * Sets the value of the employeesMax property.
     * 
     */
    public void setEmployeesMax(int value) {
        this.employeesMax = value;
    }

    /**
     * Gets the value of the economicallyActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicallyActive() {
        return economicallyActive;
    }

    /**
     * Sets the value of the economicallyActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicallyActive(String value) {
        this.economicallyActive = value;
    }

    /**
     * Gets the value of the financialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialStatus() {
        return financialStatus;
    }

    /**
     * Sets the value of the financialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialStatus(String value) {
        this.financialStatus = value;
    }

    /**
     * Gets the value of the changedSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedSince() {
        return changedSince;
    }

    /**
     * Sets the value of the changedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedSince(String value) {
        this.changedSince = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
