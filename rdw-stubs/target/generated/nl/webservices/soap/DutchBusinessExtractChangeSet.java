
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessExtractChangeSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractChangeSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="period" type="{http://www.webservices.nl/soap/}DutchBusinessPeriod"/>
 *         &lt;element name="changes" type="{http://www.webservices.nl/soap/}stringArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessExtractChangeSet", propOrder = {

})
public class DutchBusinessExtractChangeSet {

    @XmlElement(required = true)
    protected DutchBusinessPeriod period;
    @XmlElement(required = true)
    protected StringArray changes;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPeriod }
     *     
     */
    public DutchBusinessPeriod getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPeriod }
     *     
     */
    public void setPeriod(DutchBusinessPeriod value) {
        this.period = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getChanges() {
        return changes;
    }

    /**
     * Sets the value of the changes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setChanges(StringArray value) {
        this.changes = value;
    }

}
