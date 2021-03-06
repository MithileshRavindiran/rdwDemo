
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReportCalamity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReportCalamity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="company" type="{http://www.webservices.nl/soap/}GCRCompanyItselfCalamity"/>
 *         &lt;element name="company_relations" type="{http://www.webservices.nl/soap/}GCRCompanyRelationsSimple"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraydonCreditReportCalamity", propOrder = {

})
public class GraydonCreditReportCalamity {

    @XmlElement(required = true)
    protected GCRCompanyItselfCalamity company;
    @XmlElement(name = "company_relations", required = true)
    protected GCRCompanyRelationsSimple companyRelations;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyItselfCalamity }
     *     
     */
    public GCRCompanyItselfCalamity getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyItselfCalamity }
     *     
     */
    public void setCompany(GCRCompanyItselfCalamity value) {
        this.company = value;
    }

    /**
     * Gets the value of the companyRelations property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyRelationsSimple }
     *     
     */
    public GCRCompanyRelationsSimple getCompanyRelations() {
        return companyRelations;
    }

    /**
     * Sets the value of the companyRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyRelationsSimple }
     *     
     */
    public void setCompanyRelations(GCRCompanyRelationsSimple value) {
        this.companyRelations = value;
    }

}
