
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeNlCourtData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeNlCourtData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="facts" type="{http://www.webservices.nl/soap/}CreditsafeNlCourtDataFacts" minOccurs="0"/>
 *         &lt;element name="receiver_details" type="{http://www.webservices.nl/soap/}CreditsafeNlCourtDataReceiver" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeNlCourtData", propOrder = {

})
public class CreditsafeNlCourtData {

    protected CreditsafeNlCourtDataFacts facts;
    @XmlElement(name = "receiver_details")
    protected CreditsafeNlCourtDataReceiver receiverDetails;

    /**
     * Gets the value of the facts property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlCourtDataFacts }
     *     
     */
    public CreditsafeNlCourtDataFacts getFacts() {
        return facts;
    }

    /**
     * Sets the value of the facts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlCourtDataFacts }
     *     
     */
    public void setFacts(CreditsafeNlCourtDataFacts value) {
        this.facts = value;
    }

    /**
     * Gets the value of the receiverDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlCourtDataReceiver }
     *     
     */
    public CreditsafeNlCourtDataReceiver getReceiverDetails() {
        return receiverDetails;
    }

    /**
     * Sets the value of the receiverDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlCourtDataReceiver }
     *     
     */
    public void setReceiverDetails(CreditsafeNlCourtDataReceiver value) {
        this.receiverDetails = value;
    }

}
