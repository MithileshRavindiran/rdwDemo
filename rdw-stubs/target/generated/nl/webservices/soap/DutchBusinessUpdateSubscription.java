
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessUpdateSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessUpdateSubscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="up_to_date" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pending_updates" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessUpdateSubscription", propOrder = {

})
public class DutchBusinessUpdateSubscription {

    @XmlElement(name = "dossier_number", required = true)
    protected String dossierNumber;
    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    @XmlElement(name = "up_to_date")
    protected boolean upToDate;
    @XmlElement(name = "pending_updates")
    protected StringArray pendingUpdates;

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
     * Gets the value of the establishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentNumber() {
        return establishmentNumber;
    }

    /**
     * Sets the value of the establishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentNumber(String value) {
        this.establishmentNumber = value;
    }

    /**
     * Gets the value of the upToDate property.
     * 
     */
    public boolean isUpToDate() {
        return upToDate;
    }

    /**
     * Sets the value of the upToDate property.
     * 
     */
    public void setUpToDate(boolean value) {
        this.upToDate = value;
    }

    /**
     * Gets the value of the pendingUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getPendingUpdates() {
        return pendingUpdates;
    }

    /**
     * Sets the value of the pendingUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setPendingUpdates(StringArray value) {
        this.pendingUpdates = value;
    }

}
