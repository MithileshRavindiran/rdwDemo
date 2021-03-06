
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GCRCurator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCurator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="graydon_person_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="date_when_active_in_job_title" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCurator", propOrder = {

})
public class GCRCurator {

    @XmlElement(name = "graydon_person_id", required = true)
    protected BigInteger graydonPersonId;
    @XmlElement(name = "date_when_active_in_job_title")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateWhenActiveInJobTitle;

    /**
     * Gets the value of the graydonPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGraydonPersonId() {
        return graydonPersonId;
    }

    /**
     * Sets the value of the graydonPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGraydonPersonId(BigInteger value) {
        this.graydonPersonId = value;
    }

    /**
     * Gets the value of the dateWhenActiveInJobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateWhenActiveInJobTitle() {
        return dateWhenActiveInJobTitle;
    }

    /**
     * Sets the value of the dateWhenActiveInJobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateWhenActiveInJobTitle(XMLGregorianCalendar value) {
        this.dateWhenActiveInJobTitle = value;
    }

}
