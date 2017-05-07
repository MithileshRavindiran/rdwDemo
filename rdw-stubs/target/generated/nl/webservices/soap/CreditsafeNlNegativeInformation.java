
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeNlNegativeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeNlNegativeInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="court_data" type="{http://www.webservices.nl/soap/}CreditsafeNlCourtData" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeNlNegativeInformation", propOrder = {

})
public class CreditsafeNlNegativeInformation {

    @XmlElement(name = "court_data")
    protected CreditsafeNlCourtData courtData;

    /**
     * Gets the value of the courtData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeNlCourtData }
     *     
     */
    public CreditsafeNlCourtData getCourtData() {
        return courtData;
    }

    /**
     * Sets the value of the courtData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeNlCourtData }
     *     
     */
    public void setCourtData(CreditsafeNlCourtData value) {
        this.courtData = value;
    }

}
