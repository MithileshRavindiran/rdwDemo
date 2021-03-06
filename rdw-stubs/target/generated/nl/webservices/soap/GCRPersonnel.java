
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRPersonnel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRPersonnel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="employees_class_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employees_class_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number_of_employees" type="{http://www.webservices.nl/soap/}GCRNumberOfEmployeesArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRPersonnel", propOrder = {

})
public class GCRPersonnel {

    @XmlElement(name = "graydon_company_id")
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "employees_class_code")
    protected Integer employeesClassCode;
    @XmlElement(name = "employees_class_text")
    protected String employeesClassText;
    @XmlElement(name = "number_of_employees")
    protected GCRNumberOfEmployeesArray numberOfEmployees;

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
     * Gets the value of the employeesClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeesClassCode() {
        return employeesClassCode;
    }

    /**
     * Sets the value of the employeesClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeesClassCode(Integer value) {
        this.employeesClassCode = value;
    }

    /**
     * Gets the value of the employeesClassText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeesClassText() {
        return employeesClassText;
    }

    /**
     * Sets the value of the employeesClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeesClassText(String value) {
        this.employeesClassText = value;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link GCRNumberOfEmployeesArray }
     *     
     */
    public GCRNumberOfEmployeesArray getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRNumberOfEmployeesArray }
     *     
     */
    public void setNumberOfEmployees(GCRNumberOfEmployeesArray value) {
        this.numberOfEmployees = value;
    }

}
