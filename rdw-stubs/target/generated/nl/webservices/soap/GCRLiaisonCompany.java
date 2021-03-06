
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRLiaisonCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRLiaisonCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="contact_details" type="{http://www.webservices.nl/soap/}GCRLiaisonContactDetails" minOccurs="0"/>
 *         &lt;element name="official_data" type="{http://www.webservices.nl/soap/}GCRLiaisonOfficialData" minOccurs="0"/>
 *         &lt;element name="financial_calamities" type="{http://www.webservices.nl/soap/}GCRFinancialCalamityArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRLiaisonCompany", propOrder = {

})
public class GCRLiaisonCompany {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "contact_details")
    protected GCRLiaisonContactDetails contactDetails;
    @XmlElement(name = "official_data")
    protected GCRLiaisonOfficialData officialData;
    @XmlElement(name = "financial_calamities")
    protected GCRFinancialCalamityArray financialCalamities;

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
     *     {@link GCRLiaisonContactDetails }
     *     
     */
    public GCRLiaisonContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRLiaisonContactDetails }
     *     
     */
    public void setContactDetails(GCRLiaisonContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the officialData property.
     * 
     * @return
     *     possible object is
     *     {@link GCRLiaisonOfficialData }
     *     
     */
    public GCRLiaisonOfficialData getOfficialData() {
        return officialData;
    }

    /**
     * Sets the value of the officialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRLiaisonOfficialData }
     *     
     */
    public void setOfficialData(GCRLiaisonOfficialData value) {
        this.officialData = value;
    }

    /**
     * Gets the value of the financialCalamities property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFinancialCalamityArray }
     *     
     */
    public GCRFinancialCalamityArray getFinancialCalamities() {
        return financialCalamities;
    }

    /**
     * Sets the value of the financialCalamities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFinancialCalamityArray }
     *     
     */
    public void setFinancialCalamities(GCRFinancialCalamityArray value) {
        this.financialCalamities = value;
    }

}
