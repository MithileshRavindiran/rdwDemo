
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DutchBusinessExtractReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="extract_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="document_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="change_set" type="{http://www.webservices.nl/soap/}DutchBusinessExtractChangeSet"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessExtractReference", propOrder = {

})
public class DutchBusinessExtractReference {

    @XmlElement(name = "extract_id", required = true)
    protected String extractId;
    @XmlElement(name = "document_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "change_set", required = true)
    protected DutchBusinessExtractChangeSet changeSet;

    /**
     * Gets the value of the extractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtractId() {
        return extractId;
    }

    /**
     * Sets the value of the extractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtractId(String value) {
        this.extractId = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the changeSet property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessExtractChangeSet }
     *     
     */
    public DutchBusinessExtractChangeSet getChangeSet() {
        return changeSet;
    }

    /**
     * Sets the value of the changeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessExtractChangeSet }
     *     
     */
    public void setChangeSet(DutchBusinessExtractChangeSet value) {
        this.changeSet = value;
    }

}
