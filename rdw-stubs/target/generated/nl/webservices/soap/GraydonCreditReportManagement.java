
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReportManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReportManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company_management" type="{http://www.webservices.nl/soap/}GCRCompanyManagement" minOccurs="0"/>
 *         &lt;element name="persons" type="{http://www.webservices.nl/soap/}GCRPersonArray" minOccurs="0"/>
 *         &lt;element name="alarm" type="{http://www.webservices.nl/soap/}GCRAlarm" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraydonCreditReportManagement", propOrder = {

})
public class GraydonCreditReportManagement {

    @XmlElement(name = "company_management")
    protected GCRCompanyManagement companyManagement;
    protected GCRPersonArray persons;
    protected GCRAlarm alarm;

    /**
     * Gets the value of the companyManagement property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyManagement }
     *     
     */
    public GCRCompanyManagement getCompanyManagement() {
        return companyManagement;
    }

    /**
     * Sets the value of the companyManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyManagement }
     *     
     */
    public void setCompanyManagement(GCRCompanyManagement value) {
        this.companyManagement = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPersonArray }
     *     
     */
    public GCRPersonArray getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPersonArray }
     *     
     */
    public void setPersons(GCRPersonArray value) {
        this.persons = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAlarm }
     *     
     */
    public GCRAlarm getAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAlarm }
     *     
     */
    public void setAlarm(GCRAlarm value) {
        this.alarm = value;
    }

}
