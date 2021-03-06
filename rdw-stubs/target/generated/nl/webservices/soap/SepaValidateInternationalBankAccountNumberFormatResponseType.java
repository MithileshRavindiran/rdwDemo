
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sepaValidateInternationalBankAccountNumberFormatResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sepaValidateInternationalBankAccountNumberFormatResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="validation_report" type="{http://www.webservices.nl/soap/}SepaInternationalBankAccountNumberFormatValidationReport"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sepaValidateInternationalBankAccountNumberFormatResponseType", propOrder = {

})
public class SepaValidateInternationalBankAccountNumberFormatResponseType {

    @XmlElement(name = "validation_report", required = true)
    protected SepaInternationalBankAccountNumberFormatValidationReport validationReport;

    /**
     * Gets the value of the validationReport property.
     * 
     * @return
     *     possible object is
     *     {@link SepaInternationalBankAccountNumberFormatValidationReport }
     *     
     */
    public SepaInternationalBankAccountNumberFormatValidationReport getValidationReport() {
        return validationReport;
    }

    /**
     * Sets the value of the validationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SepaInternationalBankAccountNumberFormatValidationReport }
     *     
     */
    public void setValidationReport(SepaInternationalBankAccountNumberFormatValidationReport value) {
        this.validationReport = value;
    }

}
