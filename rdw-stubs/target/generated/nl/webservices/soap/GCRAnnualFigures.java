
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRAnnualFigures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRAnnualFigures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="company_annual_accounts" type="{http://www.webservices.nl/soap/}GCRCompanyAnnualAccountArray" minOccurs="0"/>
 *         &lt;element name="bank_and_insurer_data" type="{http://www.webservices.nl/soap/}GCRBankAndInsurerDataArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRAnnualFigures", propOrder = {

})
public class GCRAnnualFigures {

    @XmlElement(name = "graydon_company_id")
    protected BigInteger graydonCompanyId;
    @XmlElement(name = "company_annual_accounts")
    protected GCRCompanyAnnualAccountArray companyAnnualAccounts;
    @XmlElement(name = "bank_and_insurer_data")
    protected GCRBankAndInsurerDataArray bankAndInsurerData;

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
     * Gets the value of the companyAnnualAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyAnnualAccountArray }
     *     
     */
    public GCRCompanyAnnualAccountArray getCompanyAnnualAccounts() {
        return companyAnnualAccounts;
    }

    /**
     * Sets the value of the companyAnnualAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyAnnualAccountArray }
     *     
     */
    public void setCompanyAnnualAccounts(GCRCompanyAnnualAccountArray value) {
        this.companyAnnualAccounts = value;
    }

    /**
     * Gets the value of the bankAndInsurerData property.
     * 
     * @return
     *     possible object is
     *     {@link GCRBankAndInsurerDataArray }
     *     
     */
    public GCRBankAndInsurerDataArray getBankAndInsurerData() {
        return bankAndInsurerData;
    }

    /**
     * Sets the value of the bankAndInsurerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRBankAndInsurerDataArray }
     *     
     */
    public void setBankAndInsurerData(GCRBankAndInsurerDataArray value) {
        this.bankAndInsurerData = value;
    }

}
