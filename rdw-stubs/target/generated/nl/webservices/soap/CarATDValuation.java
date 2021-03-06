
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarATDValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarATDValuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price_retail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price_exchange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price_trade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type_names" type="{http://www.webservices.nl/soap/}stringArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarATDValuation", propOrder = {

})
public class CarATDValuation {

    @XmlElement(name = "type_id")
    protected int typeId;
    @XmlElement(name = "price_retail")
    protected int priceRetail;
    @XmlElement(name = "price_exchange")
    protected int priceExchange;
    @XmlElement(name = "price_trade")
    protected int priceTrade;
    @XmlElement(name = "type_names", required = true)
    protected StringArray typeNames;

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the priceRetail property.
     * 
     */
    public int getPriceRetail() {
        return priceRetail;
    }

    /**
     * Sets the value of the priceRetail property.
     * 
     */
    public void setPriceRetail(int value) {
        this.priceRetail = value;
    }

    /**
     * Gets the value of the priceExchange property.
     * 
     */
    public int getPriceExchange() {
        return priceExchange;
    }

    /**
     * Sets the value of the priceExchange property.
     * 
     */
    public void setPriceExchange(int value) {
        this.priceExchange = value;
    }

    /**
     * Gets the value of the priceTrade property.
     * 
     */
    public int getPriceTrade() {
        return priceTrade;
    }

    /**
     * Sets the value of the priceTrade property.
     * 
     */
    public void setPriceTrade(int value) {
        this.priceTrade = value;
    }

    /**
     * Gets the value of the typeNames property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getTypeNames() {
        return typeNames;
    }

    /**
     * Sets the value of the typeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setTypeNames(StringArray value) {
        this.typeNames = value;
    }

}
