
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeLtdOtherInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdOtherInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bankers" type="{http://www.webservices.nl/soap/}CreditsafeBankerArray" minOccurs="0"/>
 *         &lt;element name="advisors" type="{http://www.webservices.nl/soap/}CreditsafeAdvisorArray" minOccurs="0"/>
 *         &lt;element name="employees_information" type="{http://www.webservices.nl/soap/}CreditsafeEmployeeInformationArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdOtherInformation", propOrder = {

})
public class CreditsafeLtdOtherInformation {

    protected CreditsafeBankerArray bankers;
    protected CreditsafeAdvisorArray advisors;
    @XmlElement(name = "employees_information")
    protected CreditsafeEmployeeInformationArray employeesInformation;

    /**
     * Gets the value of the bankers property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBankerArray }
     *     
     */
    public CreditsafeBankerArray getBankers() {
        return bankers;
    }

    /**
     * Sets the value of the bankers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBankerArray }
     *     
     */
    public void setBankers(CreditsafeBankerArray value) {
        this.bankers = value;
    }

    /**
     * Gets the value of the advisors property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeAdvisorArray }
     *     
     */
    public CreditsafeAdvisorArray getAdvisors() {
        return advisors;
    }

    /**
     * Sets the value of the advisors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeAdvisorArray }
     *     
     */
    public void setAdvisors(CreditsafeAdvisorArray value) {
        this.advisors = value;
    }

    /**
     * Gets the value of the employeesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeEmployeeInformationArray }
     *     
     */
    public CreditsafeEmployeeInformationArray getEmployeesInformation() {
        return employeesInformation;
    }

    /**
     * Sets the value of the employeesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeEmployeeInformationArray }
     *     
     */
    public void setEmployeesInformation(CreditsafeEmployeeInformationArray value) {
        this.employeesInformation = value;
    }

}
