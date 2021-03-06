
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeOtherFinancials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeOtherFinancials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="contingent_liabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="working_capital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="net_worth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeOtherFinancials", propOrder = {

})
public class CreditsafeOtherFinancials {

    @XmlElement(name = "contingent_liabilities")
    protected String contingentLiabilities;
    @XmlElement(name = "working_capital")
    protected BigDecimal workingCapital;
    @XmlElement(name = "net_worth")
    protected BigDecimal netWorth;

    /**
     * Gets the value of the contingentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingentLiabilities() {
        return contingentLiabilities;
    }

    /**
     * Sets the value of the contingentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingentLiabilities(String value) {
        this.contingentLiabilities = value;
    }

    /**
     * Gets the value of the workingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkingCapital() {
        return workingCapital;
    }

    /**
     * Sets the value of the workingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkingCapital(BigDecimal value) {
        this.workingCapital = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWorth(BigDecimal value) {
        this.netWorth = value;
    }

}
