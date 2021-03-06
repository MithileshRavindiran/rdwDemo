
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeLtdGroupStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdGroupStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ultimate_parent" type="{http://www.webservices.nl/soap/}CreditsafeCompanyListEntry" minOccurs="0"/>
 *         &lt;element name="immediate_parent" type="{http://www.webservices.nl/soap/}CreditsafeCompanyListEntry" minOccurs="0"/>
 *         &lt;element name="subsidiary_companies" type="{http://www.webservices.nl/soap/}CreditsafeCompanyListEntryArray" minOccurs="0"/>
 *         &lt;element name="affiliated_companies" type="{http://www.webservices.nl/soap/}CreditsafeCompanyListEntryArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdGroupStructure", propOrder = {

})
public class CreditsafeLtdGroupStructure {

    @XmlElement(name = "ultimate_parent")
    protected CreditsafeCompanyListEntry ultimateParent;
    @XmlElement(name = "immediate_parent")
    protected CreditsafeCompanyListEntry immediateParent;
    @XmlElement(name = "subsidiary_companies")
    protected CreditsafeCompanyListEntryArray subsidiaryCompanies;
    @XmlElement(name = "affiliated_companies")
    protected CreditsafeCompanyListEntryArray affiliatedCompanies;

    /**
     * Gets the value of the ultimateParent property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyListEntry }
     *     
     */
    public CreditsafeCompanyListEntry getUltimateParent() {
        return ultimateParent;
    }

    /**
     * Sets the value of the ultimateParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyListEntry }
     *     
     */
    public void setUltimateParent(CreditsafeCompanyListEntry value) {
        this.ultimateParent = value;
    }

    /**
     * Gets the value of the immediateParent property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyListEntry }
     *     
     */
    public CreditsafeCompanyListEntry getImmediateParent() {
        return immediateParent;
    }

    /**
     * Sets the value of the immediateParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyListEntry }
     *     
     */
    public void setImmediateParent(CreditsafeCompanyListEntry value) {
        this.immediateParent = value;
    }

    /**
     * Gets the value of the subsidiaryCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyListEntryArray }
     *     
     */
    public CreditsafeCompanyListEntryArray getSubsidiaryCompanies() {
        return subsidiaryCompanies;
    }

    /**
     * Sets the value of the subsidiaryCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyListEntryArray }
     *     
     */
    public void setSubsidiaryCompanies(CreditsafeCompanyListEntryArray value) {
        this.subsidiaryCompanies = value;
    }

    /**
     * Gets the value of the affiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyListEntryArray }
     *     
     */
    public CreditsafeCompanyListEntryArray getAffiliatedCompanies() {
        return affiliatedCompanies;
    }

    /**
     * Sets the value of the affiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyListEntryArray }
     *     
     */
    public void setAffiliatedCompanies(CreditsafeCompanyListEntryArray value) {
        this.affiliatedCompanies = value;
    }

}
