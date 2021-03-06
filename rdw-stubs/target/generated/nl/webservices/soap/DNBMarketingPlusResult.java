
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBMarketingPlusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBMarketingPlusResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="marketing" type="{http://www.webservices.nl/soap/}DNBMarketing"/>
 *         &lt;element name="marketing_plus" type="{http://www.webservices.nl/soap/}DNBMarketingPlus"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBMarketingPlusResult", propOrder = {

})
public class DNBMarketingPlusResult {

    @XmlElement(required = true)
    protected DNBMarketing marketing;
    @XmlElement(name = "marketing_plus", required = true)
    protected DNBMarketingPlus marketingPlus;

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link DNBMarketing }
     *     
     */
    public DNBMarketing getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBMarketing }
     *     
     */
    public void setMarketing(DNBMarketing value) {
        this.marketing = value;
    }

    /**
     * Gets the value of the marketingPlus property.
     * 
     * @return
     *     possible object is
     *     {@link DNBMarketingPlus }
     *     
     */
    public DNBMarketingPlus getMarketingPlus() {
        return marketingPlus;
    }

    /**
     * Sets the value of the marketingPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBMarketingPlus }
     *     
     */
    public void setMarketingPlus(DNBMarketingPlus value) {
        this.marketingPlus = value;
    }

}
