
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeAdditionalInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeAdditionalInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nl" type="{http://www.webservices.nl/soap/}CreditsafeNlAdditionalInformation" minOccurs="0"/>
 *         &lt;element name="be" type="{http://www.webservices.nl/soap/}CreditsafeBeAdditionalInformation" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeAdditionalInformation", propOrder = {

})
public class CreditsafeAdditionalInformation {

    protected CreditsafeNlAdditionalInformation nl;
    protected CreditsafeBeAdditionalInformation be;

    /**
     * Gets the value of the nl property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlAdditionalInformation }
     *     
     */
    public CreditsafeNlAdditionalInformation getNl() {
        return nl;
    }

    /**
     * Sets the value of the nl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlAdditionalInformation }
     *     
     */
    public void setNl(CreditsafeNlAdditionalInformation value) {
        this.nl = value;
    }

    /**
     * Gets the value of the be property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeBeAdditionalInformation }
     *     
     */
    public CreditsafeBeAdditionalInformation getBe() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeBeAdditionalInformation }
     *     
     */
    public void setBe(CreditsafeBeAdditionalInformation value) {
        this.be = value;
    }

}
