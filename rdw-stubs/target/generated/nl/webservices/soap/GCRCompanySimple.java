
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompanySimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanySimple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="contact_details" type="{http://www.webservices.nl/soap/}GCRContactDetails" minOccurs="0"/>
 *         &lt;element name="official_data" type="{http://www.webservices.nl/soap/}GCROfficialData" minOccurs="0"/>
 *         &lt;element name="history" type="{http://www.webservices.nl/soap/}GCRHistory" minOccurs="0"/>
 *         &lt;element name="sectors_of_industry" type="{http://www.webservices.nl/soap/}GCRSectorOfIndustryArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCompanySimple", propOrder = {

})
public class GCRCompanySimple {

    @XmlElement(name = "graydon_company_id", required = true)
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "contact_details")
    protected GCRContactDetails contactDetails;
    @XmlElement(name = "official_data")
    protected GCROfficialData officialData;
    protected GCRHistory history;
    @XmlElement(name = "sectors_of_industry")
    protected GCRSectorOfIndustryArray sectorsOfIndustry;

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
     *     {@link GCRContactDetails }
     *     
     */
    public GCRContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRContactDetails }
     *     
     */
    public void setContactDetails(GCRContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the officialData property.
     * 
     * @return
     *     possible object is
     *     {@link GCROfficialData }
     *     
     */
    public GCROfficialData getOfficialData() {
        return officialData;
    }

    /**
     * Sets the value of the officialData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCROfficialData }
     *     
     */
    public void setOfficialData(GCROfficialData value) {
        this.officialData = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link GCRHistory }
     *     
     */
    public GCRHistory getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRHistory }
     *     
     */
    public void setHistory(GCRHistory value) {
        this.history = value;
    }

    /**
     * Gets the value of the sectorsOfIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link GCRSectorOfIndustryArray }
     *     
     */
    public GCRSectorOfIndustryArray getSectorsOfIndustry() {
        return sectorsOfIndustry;
    }

    /**
     * Sets the value of the sectorsOfIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRSectorOfIndustryArray }
     *     
     */
    public void setSectorsOfIndustry(GCRSectorOfIndustryArray value) {
        this.sectorsOfIndustry = value;
    }

}
