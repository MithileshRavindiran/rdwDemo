
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReportAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReportAlarm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company" type="{http://www.webservices.nl/soap/}GCRCompanyItselfAlarm"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraydonCreditReportAlarm", propOrder = {

})
public class GraydonCreditReportAlarm {

    @XmlElement(required = true)
    protected GCRCompanyItselfAlarm company;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyItselfAlarm }
     *     
     */
    public GCRCompanyItselfAlarm getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyItselfAlarm }
     *     
     */
    public void setCompany(GCRCompanyItselfAlarm value) {
        this.company = value;
    }

}
