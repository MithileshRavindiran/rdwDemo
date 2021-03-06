
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="include_source" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="period_start" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="period_end" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType", propOrder = {

})
public class DutchBusinessGetExtractHistoryDocumentDataV3ByDossierRequestType {

    @XmlElement(name = "dossier_number", required = true)
    protected String dossierNumber;
    @XmlElement(name = "include_source")
    protected boolean includeSource;
    @XmlElement(name = "period_start", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodStart;
    @XmlElement(name = "period_end", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodEnd;

    /**
     * Gets the value of the dossierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNumber() {
        return dossierNumber;
    }

    /**
     * Sets the value of the dossierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNumber(String value) {
        this.dossierNumber = value;
    }

    /**
     * Gets the value of the includeSource property.
     * 
     */
    public boolean isIncludeSource() {
        return includeSource;
    }

    /**
     * Sets the value of the includeSource property.
     * 
     */
    public void setIncludeSource(boolean value) {
        this.includeSource = value;
    }

    /**
     * Gets the value of the periodStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodStart() {
        return periodStart;
    }

    /**
     * Sets the value of the periodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodStart(XMLGregorianCalendar value) {
        this.periodStart = value;
    }

    /**
     * Gets the value of the periodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodEnd() {
        return periodEnd;
    }

    /**
     * Sets the value of the periodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodEnd(XMLGregorianCalendar value) {
        this.periodEnd = value;
    }

}
