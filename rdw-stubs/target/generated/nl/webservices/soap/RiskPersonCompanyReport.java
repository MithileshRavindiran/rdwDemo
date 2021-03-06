
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskPersonCompanyReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskPersonCompanyReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="person" type="{http://www.webservices.nl/soap/}RiskPerson"/>
 *         &lt;element name="conclusion" type="{http://www.webservices.nl/soap/}RiskResult"/>
 *         &lt;element name="report_data" type="{http://www.webservices.nl/soap/}RiskCompanyReport" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskPersonCompanyReport", propOrder = {

})
public class RiskPersonCompanyReport {

    @XmlElement(required = true)
    protected RiskPerson person;
    @XmlElement(required = true)
    protected RiskResult conclusion;
    @XmlElement(name = "report_data")
    protected RiskCompanyReport reportData;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link RiskPerson }
     *     
     */
    public RiskPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskPerson }
     *     
     */
    public void setPerson(RiskPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link RiskResult }
     *     
     */
    public RiskResult getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskResult }
     *     
     */
    public void setConclusion(RiskResult value) {
        this.conclusion = value;
    }

    /**
     * Gets the value of the reportData property.
     * 
     * @return
     *     possible object is
     *     {@link RiskCompanyReport }
     *     
     */
    public RiskCompanyReport getReportData() {
        return reportData;
    }

    /**
     * Sets the value of the reportData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskCompanyReport }
     *     
     */
    public void setReportData(RiskCompanyReport value) {
        this.reportData = value;
    }

}
