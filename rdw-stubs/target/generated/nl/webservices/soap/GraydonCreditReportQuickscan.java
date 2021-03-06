
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReportQuickscan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReportQuickscan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pd_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_flag_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_flag_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alarm" type="{http://www.webservices.nl/soap/}GCRAlarm" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraydonCreditReportQuickscan", propOrder = {

})
public class GraydonCreditReportQuickscan {

    @XmlElement(name = "pd_rating")
    protected String pdRating;
    @XmlElement(name = "credit_flag_code")
    protected String creditFlagCode;
    @XmlElement(name = "credit_flag_text")
    protected String creditFlagText;
    protected GCRAlarm alarm;

    /**
     * Gets the value of the pdRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdRating() {
        return pdRating;
    }

    /**
     * Sets the value of the pdRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdRating(String value) {
        this.pdRating = value;
    }

    /**
     * Gets the value of the creditFlagCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFlagCode() {
        return creditFlagCode;
    }

    /**
     * Sets the value of the creditFlagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFlagCode(String value) {
        this.creditFlagCode = value;
    }

    /**
     * Gets the value of the creditFlagText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFlagText() {
        return creditFlagText;
    }

    /**
     * Sets the value of the creditFlagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFlagText(String value) {
        this.creditFlagText = value;
    }

    /**
     * Gets the value of the alarm property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAlarm }
     *     
     */
    public GCRAlarm getAlarm() {
        return alarm;
    }

    /**
     * Sets the value of the alarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAlarm }
     *     
     */
    public void setAlarm(GCRAlarm value) {
        this.alarm = value;
    }

}
