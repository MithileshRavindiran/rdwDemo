
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riskCheckGetRiskPersonCompanyReportResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskCheckGetRiskPersonCompanyReportResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}RiskPersonCompanyReport"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskCheckGetRiskPersonCompanyReportResponseType", propOrder = {

})
public class RiskCheckGetRiskPersonCompanyReportResponseType {

    @XmlElement(required = true)
    protected RiskPersonCompanyReport out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link RiskPersonCompanyReport }
     *     
     */
    public RiskPersonCompanyReport getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskPersonCompanyReport }
     *     
     */
    public void setOut(RiskPersonCompanyReport value) {
        this.out = value;
    }

}
