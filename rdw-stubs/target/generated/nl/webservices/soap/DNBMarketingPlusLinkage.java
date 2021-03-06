
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBMarketingPlusLinkage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBMarketingPlusLinkage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="domestic_ultimate_duns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domestic_ultimate_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domestic_ultimate_address" type="{http://www.webservices.nl/soap/}DNBAddress"/>
 *         &lt;element name="global_ultimate_indication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="global_ultimate_duns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="global_ultimate_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="global_ultimate_address" type="{http://www.webservices.nl/soap/}DNBAddress"/>
 *         &lt;element name="headquarters_duns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headquarters_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headquarters_address" type="{http://www.webservices.nl/soap/}DNBAddress"/>
 *         &lt;element name="family_member_count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="linkage_report_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBMarketingPlusLinkage", propOrder = {

})
public class DNBMarketingPlusLinkage {

    @XmlElement(name = "domestic_ultimate_duns")
    protected String domesticUltimateDuns;
    @XmlElement(name = "domestic_ultimate_name")
    protected String domesticUltimateName;
    @XmlElement(name = "domestic_ultimate_address", required = true)
    protected DNBAddress domesticUltimateAddress;
    @XmlElement(name = "global_ultimate_indication")
    protected Boolean globalUltimateIndication;
    @XmlElement(name = "global_ultimate_duns")
    protected String globalUltimateDuns;
    @XmlElement(name = "global_ultimate_name")
    protected String globalUltimateName;
    @XmlElement(name = "global_ultimate_address", required = true)
    protected DNBAddress globalUltimateAddress;
    @XmlElement(name = "headquarters_duns")
    protected String headquartersDuns;
    @XmlElement(name = "headquarters_name")
    protected String headquartersName;
    @XmlElement(name = "headquarters_address", required = true)
    protected DNBAddress headquartersAddress;
    @XmlElement(name = "family_member_count")
    protected Integer familyMemberCount;
    @XmlElement(name = "linkage_report_date")
    protected String linkageReportDate;

    /**
     * Gets the value of the domesticUltimateDuns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticUltimateDuns() {
        return domesticUltimateDuns;
    }

    /**
     * Sets the value of the domesticUltimateDuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticUltimateDuns(String value) {
        this.domesticUltimateDuns = value;
    }

    /**
     * Gets the value of the domesticUltimateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomesticUltimateName() {
        return domesticUltimateName;
    }

    /**
     * Sets the value of the domesticUltimateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomesticUltimateName(String value) {
        this.domesticUltimateName = value;
    }

    /**
     * Gets the value of the domesticUltimateAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DNBAddress }
     *     
     */
    public DNBAddress getDomesticUltimateAddress() {
        return domesticUltimateAddress;
    }

    /**
     * Sets the value of the domesticUltimateAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBAddress }
     *     
     */
    public void setDomesticUltimateAddress(DNBAddress value) {
        this.domesticUltimateAddress = value;
    }

    /**
     * Gets the value of the globalUltimateIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalUltimateIndication() {
        return globalUltimateIndication;
    }

    /**
     * Sets the value of the globalUltimateIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalUltimateIndication(Boolean value) {
        this.globalUltimateIndication = value;
    }

    /**
     * Gets the value of the globalUltimateDuns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalUltimateDuns() {
        return globalUltimateDuns;
    }

    /**
     * Sets the value of the globalUltimateDuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalUltimateDuns(String value) {
        this.globalUltimateDuns = value;
    }

    /**
     * Gets the value of the globalUltimateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalUltimateName() {
        return globalUltimateName;
    }

    /**
     * Sets the value of the globalUltimateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalUltimateName(String value) {
        this.globalUltimateName = value;
    }

    /**
     * Gets the value of the globalUltimateAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DNBAddress }
     *     
     */
    public DNBAddress getGlobalUltimateAddress() {
        return globalUltimateAddress;
    }

    /**
     * Sets the value of the globalUltimateAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBAddress }
     *     
     */
    public void setGlobalUltimateAddress(DNBAddress value) {
        this.globalUltimateAddress = value;
    }

    /**
     * Gets the value of the headquartersDuns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadquartersDuns() {
        return headquartersDuns;
    }

    /**
     * Sets the value of the headquartersDuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadquartersDuns(String value) {
        this.headquartersDuns = value;
    }

    /**
     * Gets the value of the headquartersName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadquartersName() {
        return headquartersName;
    }

    /**
     * Sets the value of the headquartersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadquartersName(String value) {
        this.headquartersName = value;
    }

    /**
     * Gets the value of the headquartersAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DNBAddress }
     *     
     */
    public DNBAddress getHeadquartersAddress() {
        return headquartersAddress;
    }

    /**
     * Sets the value of the headquartersAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBAddress }
     *     
     */
    public void setHeadquartersAddress(DNBAddress value) {
        this.headquartersAddress = value;
    }

    /**
     * Gets the value of the familyMemberCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamilyMemberCount() {
        return familyMemberCount;
    }

    /**
     * Sets the value of the familyMemberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFamilyMemberCount(Integer value) {
        this.familyMemberCount = value;
    }

    /**
     * Gets the value of the linkageReportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkageReportDate() {
        return linkageReportDate;
    }

    /**
     * Sets the value of the linkageReportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkageReportDate(String value) {
        this.linkageReportDate = value;
    }

}
