
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DutchVehiclePurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehiclePurchase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="reference_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="price_data" type="{http://www.webservices.nl/soap/}DutchVehiclePrice"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehiclePurchase", propOrder = {

})
public class DutchVehiclePurchase {

    @XmlElement(name = "reference_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referenceDate;
    @XmlElement(name = "price_data", required = true)
    protected DutchVehiclePrice priceData;

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the priceData property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehiclePrice }
     *     
     */
    public DutchVehiclePrice getPriceData() {
        return priceData;
    }

    /**
     * Sets the value of the priceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehiclePrice }
     *     
     */
    public void setPriceData(DutchVehiclePrice value) {
        this.priceData = value;
    }

}
