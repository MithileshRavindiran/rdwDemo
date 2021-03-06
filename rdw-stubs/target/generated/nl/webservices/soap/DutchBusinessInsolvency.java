
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessInsolvency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessInsolvency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="insolvency_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="events" type="{http://www.webservices.nl/soap/}DutchBusinessInsolvencyPublicationArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessInsolvency", propOrder = {

})
public class DutchBusinessInsolvency {

    @XmlElement(name = "insolvency_id", required = true)
    protected String insolvencyId;
    protected DutchBusinessInsolvencyPublicationArray events;

    /**
     * Gets the value of the insolvencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsolvencyId() {
        return insolvencyId;
    }

    /**
     * Sets the value of the insolvencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsolvencyId(String value) {
        this.insolvencyId = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessInsolvencyPublicationArray }
     *     
     */
    public DutchBusinessInsolvencyPublicationArray getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessInsolvencyPublicationArray }
     *     
     */
    public void setEvents(DutchBusinessInsolvencyPublicationArray value) {
        this.events = value;
    }

}
