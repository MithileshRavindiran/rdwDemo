
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehiclePurchaseReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehiclePurchaseReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="basic_data" type="{http://www.webservices.nl/soap/}DutchVehicleData"/>
 *         &lt;element name="reference" type="{http://www.webservices.nl/soap/}DutchVehicleReference"/>
 *         &lt;element name="purchase_data" type="{http://www.webservices.nl/soap/}DutchVehiclePurchase"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehiclePurchaseReference", propOrder = {

})
public class DutchVehiclePurchaseReference {

    @XmlElement(name = "basic_data", required = true)
    protected DutchVehicleData basicData;
    @XmlElement(required = true)
    protected DutchVehicleReference reference;
    @XmlElement(name = "purchase_data", required = true)
    protected DutchVehiclePurchase purchaseData;

    /**
     * Gets the value of the basicData property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleData }
     *     
     */
    public DutchVehicleData getBasicData() {
        return basicData;
    }

    /**
     * Sets the value of the basicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleData }
     *     
     */
    public void setBasicData(DutchVehicleData value) {
        this.basicData = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleReference }
     *     
     */
    public DutchVehicleReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleReference }
     *     
     */
    public void setReference(DutchVehicleReference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the purchaseData property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehiclePurchase }
     *     
     */
    public DutchVehiclePurchase getPurchaseData() {
        return purchaseData;
    }

    /**
     * Sets the value of the purchaseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehiclePurchase }
     *     
     */
    public void setPurchaseData(DutchVehiclePurchase value) {
        this.purchaseData = value;
    }

}
