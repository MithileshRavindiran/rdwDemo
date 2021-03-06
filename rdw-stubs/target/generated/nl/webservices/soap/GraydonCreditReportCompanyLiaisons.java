
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReportCompanyLiaisons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReportCompanyLiaisons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="concern_liaisons" type="{http://www.webservices.nl/soap/}GCRLiaisonArray" minOccurs="0"/>
 *         &lt;element name="companies" type="{http://www.webservices.nl/soap/}GCRLiaisonCompanyArray" minOccurs="0"/>
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
@XmlType(name = "GraydonCreditReportCompanyLiaisons", propOrder = {

})
public class GraydonCreditReportCompanyLiaisons {

    @XmlElement(name = "concern_liaisons")
    protected GCRLiaisonArray concernLiaisons;
    protected GCRLiaisonCompanyArray companies;
    protected GCRAlarm alarm;

    /**
     * Gets the value of the concernLiaisons property.
     * 
     * @return
     *     possible object is
     *     {@link GCRLiaisonArray }
     *     
     */
    public GCRLiaisonArray getConcernLiaisons() {
        return concernLiaisons;
    }

    /**
     * Sets the value of the concernLiaisons property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRLiaisonArray }
     *     
     */
    public void setConcernLiaisons(GCRLiaisonArray value) {
        this.concernLiaisons = value;
    }

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link GCRLiaisonCompanyArray }
     *     
     */
    public GCRLiaisonCompanyArray getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRLiaisonCompanyArray }
     *     
     */
    public void setCompanies(GCRLiaisonCompanyArray value) {
        this.companies = value;
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
