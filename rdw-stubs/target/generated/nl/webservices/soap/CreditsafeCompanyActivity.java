
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeCompanyActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeCompanyActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="activity_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activity_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeCompanyActivity", propOrder = {

})
public class CreditsafeCompanyActivity {

    @XmlElement(name = "activity_code", required = true)
    protected String activityCode;
    @XmlElement(name = "activity_description", required = true)
    protected String activityDescription;

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the activityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityDescription() {
        return activityDescription;
    }

    /**
     * Sets the value of the activityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityDescription(String value) {
        this.activityDescription = value;
    }

}
