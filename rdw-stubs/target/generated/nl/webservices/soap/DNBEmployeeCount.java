
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBEmployeeCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBEmployeeCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="employees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employees_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estimated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subsidiaries_included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="qualification_indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBEmployeeCount", propOrder = {

})
public class DNBEmployeeCount {

    protected Integer employees;
    @XmlElement(name = "employees_text")
    protected String employeesText;
    protected Boolean estimated;
    @XmlElement(name = "subsidiaries_included")
    protected Boolean subsidiariesIncluded;
    @XmlElement(name = "qualification_indicator")
    protected String qualificationIndicator;

    /**
     * Gets the value of the employees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployees() {
        return employees;
    }

    /**
     * Sets the value of the employees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployees(Integer value) {
        this.employees = value;
    }

    /**
     * Gets the value of the employeesText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeesText() {
        return employeesText;
    }

    /**
     * Sets the value of the employeesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeesText(String value) {
        this.employeesText = value;
    }

    /**
     * Gets the value of the estimated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstimated() {
        return estimated;
    }

    /**
     * Sets the value of the estimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstimated(Boolean value) {
        this.estimated = value;
    }

    /**
     * Gets the value of the subsidiariesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubsidiariesIncluded() {
        return subsidiariesIncluded;
    }

    /**
     * Sets the value of the subsidiariesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsidiariesIncluded(Boolean value) {
        this.subsidiariesIncluded = value;
    }

    /**
     * Gets the value of the qualificationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationIndicator() {
        return qualificationIndicator;
    }

    /**
     * Sets the value of the qualificationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationIndicator(String value) {
        this.qualificationIndicator = value;
    }

}
