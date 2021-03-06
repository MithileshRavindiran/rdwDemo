
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="originated_from" type="{http://www.webservices.nl/soap/}GCROriginatedFromArray" minOccurs="0"/>
 *         &lt;element name="continuation" type="{http://www.webservices.nl/soap/}GCRContinuationArray" minOccurs="0"/>
 *         &lt;element name="company_continued_under" type="{http://www.webservices.nl/soap/}GCRCompanyContinuedUnderArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRHistory", propOrder = {

})
public class GCRHistory {

    @XmlElement(name = "originated_from")
    protected GCROriginatedFromArray originatedFrom;
    protected GCRContinuationArray continuation;
    @XmlElement(name = "company_continued_under")
    protected GCRCompanyContinuedUnderArray companyContinuedUnder;

    /**
     * Gets the value of the originatedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link GCROriginatedFromArray }
     *     
     */
    public GCROriginatedFromArray getOriginatedFrom() {
        return originatedFrom;
    }

    /**
     * Sets the value of the originatedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCROriginatedFromArray }
     *     
     */
    public void setOriginatedFrom(GCROriginatedFromArray value) {
        this.originatedFrom = value;
    }

    /**
     * Gets the value of the continuation property.
     * 
     * @return
     *     possible object is
     *     {@link GCRContinuationArray }
     *     
     */
    public GCRContinuationArray getContinuation() {
        return continuation;
    }

    /**
     * Sets the value of the continuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRContinuationArray }
     *     
     */
    public void setContinuation(GCRContinuationArray value) {
        this.continuation = value;
    }

    /**
     * Gets the value of the companyContinuedUnder property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyContinuedUnderArray }
     *     
     */
    public GCRCompanyContinuedUnderArray getCompanyContinuedUnder() {
        return companyContinuedUnder;
    }

    /**
     * Sets the value of the companyContinuedUnder property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyContinuedUnderArray }
     *     
     */
    public void setCompanyContinuedUnder(GCRCompanyContinuedUnderArray value) {
        this.companyContinuedUnder = value;
    }

}
