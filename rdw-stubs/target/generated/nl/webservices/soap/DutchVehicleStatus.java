
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicleStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicleStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="insured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="awaiting_inspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="missed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stolen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="suspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicleStatus", propOrder = {

})
public class DutchVehicleStatus {

    protected Boolean insured;
    @XmlElement(name = "awaiting_inspection")
    protected Boolean awaitingInspection;
    protected Boolean missed;
    protected Boolean stolen;
    protected Boolean exported;
    protected Boolean suspended;

    /**
     * Gets the value of the insured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsured() {
        return insured;
    }

    /**
     * Sets the value of the insured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsured(Boolean value) {
        this.insured = value;
    }

    /**
     * Gets the value of the awaitingInspection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwaitingInspection() {
        return awaitingInspection;
    }

    /**
     * Sets the value of the awaitingInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAwaitingInspection(Boolean value) {
        this.awaitingInspection = value;
    }

    /**
     * Gets the value of the missed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissed() {
        return missed;
    }

    /**
     * Sets the value of the missed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissed(Boolean value) {
        this.missed = value;
    }

    /**
     * Gets the value of the stolen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStolen() {
        return stolen;
    }

    /**
     * Sets the value of the stolen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStolen(Boolean value) {
        this.stolen = value;
    }

    /**
     * Gets the value of the exported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExported() {
        return exported;
    }

    /**
     * Sets the value of the exported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExported(Boolean value) {
        this.exported = value;
    }

    /**
     * Gets the value of the suspended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspended() {
        return suspended;
    }

    /**
     * Sets the value of the suspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspended(Boolean value) {
        this.suspended = value;
    }

}
