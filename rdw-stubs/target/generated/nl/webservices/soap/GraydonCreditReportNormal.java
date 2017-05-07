
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReportNormal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReportNormal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company" type="{http://www.webservices.nl/soap/}GCRCompanyItself"/>
 *         &lt;element name="company_relations" type="{http://www.webservices.nl/soap/}GCRCompanyRelations"/>
 *         &lt;element name="indirect_company_relations" type="{http://www.webservices.nl/soap/}GCRCompanyRelations"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraydonCreditReportNormal", propOrder = {

})
public class GraydonCreditReportNormal {

    @XmlElement(required = true)
    protected GCRCompanyItself company;
    @XmlElement(name = "company_relations", required = true)
    protected GCRCompanyRelations companyRelations;
    @XmlElement(name = "indirect_company_relations", required = true)
    protected GCRCompanyRelations indirectCompanyRelations;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyItself }
     *     
     */
    public GCRCompanyItself getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyItself }
     *     
     */
    public void setCompany(GCRCompanyItself value) {
        this.company = value;
    }

    /**
     * Gets the value of the companyRelations property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyRelations }
     *     
     */
    public GCRCompanyRelations getCompanyRelations() {
        return companyRelations;
    }

    /**
     * Sets the value of the companyRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyRelations }
     *     
     */
    public void setCompanyRelations(GCRCompanyRelations value) {
        this.companyRelations = value;
    }

    /**
     * Gets the value of the indirectCompanyRelations property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyRelations }
     *     
     */
    public GCRCompanyRelations getIndirectCompanyRelations() {
        return indirectCompanyRelations;
    }

    /**
     * Sets the value of the indirectCompanyRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyRelations }
     *     
     */
    public void setIndirectCompanyRelations(GCRCompanyRelations value) {
        this.indirectCompanyRelations = value;
    }

}
