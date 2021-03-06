
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraydonCreditReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GraydonCreditReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="report_normal" type="{http://www.webservices.nl/soap/}GraydonCreditReportNormal" minOccurs="0"/>
 *         &lt;element name="report_calamity" type="{http://www.webservices.nl/soap/}GraydonCreditReportCalamity" minOccurs="0"/>
 *         &lt;element name="report_alarm" type="{http://www.webservices.nl/soap/}GraydonCreditReportAlarm" minOccurs="0"/>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
@XmlType(name = "GraydonCreditReport", propOrder = {

})
public class GraydonCreditReport {

    @XmlElement(name = "report_normal")
    protected GraydonCreditReportNormal reportNormal;
    @XmlElement(name = "report_calamity")
    protected GraydonCreditReportCalamity reportCalamity;
    @XmlElement(name = "report_alarm")
    protected GraydonCreditReportAlarm reportAlarm;
    protected byte[] document;
    protected GCRAlarm alarm;

    /**
     * Gets the value of the reportNormal property.
     * 
     * @return
     *     possible object is
     *     {@link GraydonCreditReportNormal }
     *     
     */
    public GraydonCreditReportNormal getReportNormal() {
        return reportNormal;
    }

    /**
     * Sets the value of the reportNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraydonCreditReportNormal }
     *     
     */
    public void setReportNormal(GraydonCreditReportNormal value) {
        this.reportNormal = value;
    }

    /**
     * Gets the value of the reportCalamity property.
     * 
     * @return
     *     possible object is
     *     {@link GraydonCreditReportCalamity }
     *     
     */
    public GraydonCreditReportCalamity getReportCalamity() {
        return reportCalamity;
    }

    /**
     * Sets the value of the reportCalamity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraydonCreditReportCalamity }
     *     
     */
    public void setReportCalamity(GraydonCreditReportCalamity value) {
        this.reportCalamity = value;
    }

    /**
     * Gets the value of the reportAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link GraydonCreditReportAlarm }
     *     
     */
    public GraydonCreditReportAlarm getReportAlarm() {
        return reportAlarm;
    }

    /**
     * Sets the value of the reportAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraydonCreditReportAlarm }
     *     
     */
    public void setReportAlarm(GraydonCreditReportAlarm value) {
        this.reportAlarm = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument(byte[] value) {
        this.document = ((byte[]) value);
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
