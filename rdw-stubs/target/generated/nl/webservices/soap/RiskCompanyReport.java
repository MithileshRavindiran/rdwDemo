
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskCompanyReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskCompanyReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="companies" type="{http://www.webservices.nl/soap/}RiskCompanyArray" minOccurs="0"/>
 *         &lt;element name="insolvencies" type="{http://www.webservices.nl/soap/}RiskInsolvencyArray" minOccurs="0"/>
 *         &lt;element name="legal_restraint" type="{http://www.webservices.nl/soap/}RiskLegalRestraint" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskCompanyReport", propOrder = {

})
public class RiskCompanyReport {

    protected RiskCompanyArray companies;
    protected RiskInsolvencyArray insolvencies;
    @XmlElement(name = "legal_restraint")
    protected RiskLegalRestraint legalRestraint;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link RiskCompanyArray }
     *     
     */
    public RiskCompanyArray getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskCompanyArray }
     *     
     */
    public void setCompanies(RiskCompanyArray value) {
        this.companies = value;
    }

    /**
     * Gets the value of the insolvencies property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInsolvencyArray }
     *     
     */
    public RiskInsolvencyArray getInsolvencies() {
        return insolvencies;
    }

    /**
     * Sets the value of the insolvencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInsolvencyArray }
     *     
     */
    public void setInsolvencies(RiskInsolvencyArray value) {
        this.insolvencies = value;
    }

    /**
     * Gets the value of the legalRestraint property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLegalRestraint }
     *     
     */
    public RiskLegalRestraint getLegalRestraint() {
        return legalRestraint;
    }

    /**
     * Sets the value of the legalRestraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLegalRestraint }
     *     
     */
    public void setLegalRestraint(RiskLegalRestraint value) {
        this.legalRestraint = value;
    }

}
