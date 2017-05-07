
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRFinancialDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRFinancialDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_company_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="turnovers" type="{http://www.webservices.nl/soap/}GCRFinancialDetailValueArray" minOccurs="0"/>
 *         &lt;element name="results" type="{http://www.webservices.nl/soap/}GCRFinancialDetailValueArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRFinancialDetails", propOrder = {

})
public class GCRFinancialDetails {

    @XmlElement(name = "graydon_company_id")
    protected BigInteger graydonCompanyId;
    protected GCRFinancialDetailValueArray turnovers;
    protected GCRFinancialDetailValueArray results;

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
     * Gets the value of the turnovers property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFinancialDetailValueArray }
     *     
     */
    public GCRFinancialDetailValueArray getTurnovers() {
        return turnovers;
    }

    /**
     * Sets the value of the turnovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFinancialDetailValueArray }
     *     
     */
    public void setTurnovers(GCRFinancialDetailValueArray value) {
        this.turnovers = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFinancialDetailValueArray }
     *     
     */
    public GCRFinancialDetailValueArray getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFinancialDetailValueArray }
     *     
     */
    public void setResults(GCRFinancialDetailValueArray value) {
        this.results = value;
    }

}
