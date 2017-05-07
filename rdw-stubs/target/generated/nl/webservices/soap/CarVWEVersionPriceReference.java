
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarVWEVersionPriceReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEVersionPriceReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="order_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="atl_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEVersionPriceReference", propOrder = {

})
public class CarVWEVersionPriceReference {

    @XmlElement(name = "order_number")
    protected int orderNumber;
    @XmlElement(name = "atl_code")
    protected int atlCode;
    @XmlElement(name = "model_name", required = true)
    protected String modelName;

    /**
     * Gets the value of the orderNumber property.
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the atlCode property.
     * 
     */
    public int getAtlCode() {
        return atlCode;
    }

    /**
     * Sets the value of the atlCode property.
     * 
     */
    public void setAtlCode(int value) {
        this.atlCode = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

}
