
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditsafeGetReportFullResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditsafeGetReportFullResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}CreditsafeCompanyReportFull"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditsafeGetReportFullResponseType", propOrder = {

})
public class CreditsafeGetReportFullResponseType {

    @XmlElement(required = true)
    protected CreditsafeCompanyReportFull out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeCompanyReportFull }
     *     
     */
    public CreditsafeCompanyReportFull getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeCompanyReportFull }
     *     
     */
    public void setOut(CreditsafeCompanyReportFull value) {
        this.out = value;
    }

}
