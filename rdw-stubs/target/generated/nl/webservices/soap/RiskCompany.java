
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RiskCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_names" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *         &lt;element name="addresses" type="{http://www.webservices.nl/soap/}RiskCompanyAddressArray" minOccurs="0"/>
 *         &lt;element name="function_title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function_end_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="insolvencies" type="{http://www.webservices.nl/soap/}RiskInsolvencyArray" minOccurs="0"/>
 *         &lt;element name="mutation_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskCompany", propOrder = {

})
public class RiskCompany {

    @XmlElement(name = "dossier_number", required = true)
    protected String dossierNumber;
    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    protected String status;
    @XmlElement(name = "trade_names")
    protected StringArray tradeNames;
    protected RiskCompanyAddressArray addresses;
    @XmlElement(name = "function_title")
    protected String functionTitle;
    @XmlElement(name = "function_authorization")
    protected String functionAuthorization;
    @XmlElement(name = "function_end_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar functionEndDate;
    protected RiskInsolvencyArray insolvencies;
    @XmlElement(name = "mutation_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mutationDate;

    /**
     * Gets the value of the dossierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNumber() {
        return dossierNumber;
    }

    /**
     * Sets the value of the dossierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNumber(String value) {
        this.dossierNumber = value;
    }

    /**
     * Gets the value of the establishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentNumber() {
        return establishmentNumber;
    }

    /**
     * Sets the value of the establishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentNumber(String value) {
        this.establishmentNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tradeNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getTradeNames() {
        return tradeNames;
    }

    /**
     * Sets the value of the tradeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setTradeNames(StringArray value) {
        this.tradeNames = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link RiskCompanyAddressArray }
     *     
     */
    public RiskCompanyAddressArray getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskCompanyAddressArray }
     *     
     */
    public void setAddresses(RiskCompanyAddressArray value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the functionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionTitle() {
        return functionTitle;
    }

    /**
     * Sets the value of the functionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionTitle(String value) {
        this.functionTitle = value;
    }

    /**
     * Gets the value of the functionAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionAuthorization() {
        return functionAuthorization;
    }

    /**
     * Sets the value of the functionAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionAuthorization(String value) {
        this.functionAuthorization = value;
    }

    /**
     * Gets the value of the functionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFunctionEndDate() {
        return functionEndDate;
    }

    /**
     * Sets the value of the functionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFunctionEndDate(XMLGregorianCalendar value) {
        this.functionEndDate = value;
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
     * Gets the value of the mutationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMutationDate() {
        return mutationDate;
    }

    /**
     * Sets the value of the mutationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMutationDate(XMLGregorianCalendar value) {
        this.mutationDate = value;
    }

}
