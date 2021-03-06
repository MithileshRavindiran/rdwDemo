
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompanyItselfAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanyItselfAlarm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="contact_details" type="{http://www.webservices.nl/soap/}GCRAlarmContactDetails" minOccurs="0"/>
 *         &lt;element name="discontinuance" type="{http://www.webservices.nl/soap/}GCRDiscontinuance" minOccurs="0"/>
 *         &lt;element name="special_company_information" type="{http://www.webservices.nl/soap/}GCRSpecialCompanyInformationArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCompanyItselfAlarm", propOrder = {

})
public class GCRCompanyItselfAlarm {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "contact_details")
    protected GCRAlarmContactDetails contactDetails;
    protected GCRDiscontinuance discontinuance;
    @XmlElement(name = "special_company_information")
    protected GCRSpecialCompanyInformationArray specialCompanyInformation;

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
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAlarmContactDetails }
     *     
     */
    public GCRAlarmContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAlarmContactDetails }
     *     
     */
    public void setContactDetails(GCRAlarmContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the discontinuance property.
     * 
     * @return
     *     possible object is
     *     {@link GCRDiscontinuance }
     *     
     */
    public GCRDiscontinuance getDiscontinuance() {
        return discontinuance;
    }

    /**
     * Sets the value of the discontinuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRDiscontinuance }
     *     
     */
    public void setDiscontinuance(GCRDiscontinuance value) {
        this.discontinuance = value;
    }

    /**
     * Gets the value of the specialCompanyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GCRSpecialCompanyInformationArray }
     *     
     */
    public GCRSpecialCompanyInformationArray getSpecialCompanyInformation() {
        return specialCompanyInformation;
    }

    /**
     * Sets the value of the specialCompanyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRSpecialCompanyInformationArray }
     *     
     */
    public void setSpecialCompanyInformation(GCRSpecialCompanyInformationArray value) {
        this.specialCompanyInformation = value;
    }

}
