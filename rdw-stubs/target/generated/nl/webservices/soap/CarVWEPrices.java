
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarVWEPrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarVWEPrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="current_price_retail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="current_price_exchange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="current_price_trade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="date_price_list" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="catalog_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="btw_new_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bpm_new_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="net_catalog_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recalculated_catalog_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recalculated_btw_new_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recalculated_net_catalog_price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarVWEPrices", propOrder = {

})
public class CarVWEPrices {

    @XmlElement(name = "current_price_retail")
    protected Integer currentPriceRetail;
    @XmlElement(name = "current_price_exchange")
    protected Integer currentPriceExchange;
    @XmlElement(name = "current_price_trade")
    protected Integer currentPriceTrade;
    @XmlElement(name = "date_price_list")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePriceList;
    @XmlElement(name = "catalog_price")
    protected Integer catalogPrice;
    @XmlElement(name = "btw_new_price")
    protected Integer btwNewPrice;
    @XmlElement(name = "bpm_new_price")
    protected Integer bpmNewPrice;
    @XmlElement(name = "net_catalog_price")
    protected Integer netCatalogPrice;
    @XmlElement(name = "recalculated_catalog_price")
    protected Integer recalculatedCatalogPrice;
    @XmlElement(name = "recalculated_btw_new_price")
    protected Integer recalculatedBtwNewPrice;
    @XmlElement(name = "recalculated_net_catalog_price")
    protected Integer recalculatedNetCatalogPrice;

    /**
     * Gets the value of the currentPriceRetail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPriceRetail() {
        return currentPriceRetail;
    }

    /**
     * Sets the value of the currentPriceRetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPriceRetail(Integer value) {
        this.currentPriceRetail = value;
    }

    /**
     * Gets the value of the currentPriceExchange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPriceExchange() {
        return currentPriceExchange;
    }

    /**
     * Sets the value of the currentPriceExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPriceExchange(Integer value) {
        this.currentPriceExchange = value;
    }

    /**
     * Gets the value of the currentPriceTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPriceTrade() {
        return currentPriceTrade;
    }

    /**
     * Sets the value of the currentPriceTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPriceTrade(Integer value) {
        this.currentPriceTrade = value;
    }

    /**
     * Gets the value of the datePriceList property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePriceList() {
        return datePriceList;
    }

    /**
     * Sets the value of the datePriceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePriceList(XMLGregorianCalendar value) {
        this.datePriceList = value;
    }

    /**
     * Gets the value of the catalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatalogPrice() {
        return catalogPrice;
    }

    /**
     * Sets the value of the catalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatalogPrice(Integer value) {
        this.catalogPrice = value;
    }

    /**
     * Gets the value of the btwNewPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBtwNewPrice() {
        return btwNewPrice;
    }

    /**
     * Sets the value of the btwNewPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBtwNewPrice(Integer value) {
        this.btwNewPrice = value;
    }

    /**
     * Gets the value of the bpmNewPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBpmNewPrice() {
        return bpmNewPrice;
    }

    /**
     * Sets the value of the bpmNewPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBpmNewPrice(Integer value) {
        this.bpmNewPrice = value;
    }

    /**
     * Gets the value of the netCatalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetCatalogPrice() {
        return netCatalogPrice;
    }

    /**
     * Sets the value of the netCatalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetCatalogPrice(Integer value) {
        this.netCatalogPrice = value;
    }

    /**
     * Gets the value of the recalculatedCatalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecalculatedCatalogPrice() {
        return recalculatedCatalogPrice;
    }

    /**
     * Sets the value of the recalculatedCatalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecalculatedCatalogPrice(Integer value) {
        this.recalculatedCatalogPrice = value;
    }

    /**
     * Gets the value of the recalculatedBtwNewPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecalculatedBtwNewPrice() {
        return recalculatedBtwNewPrice;
    }

    /**
     * Sets the value of the recalculatedBtwNewPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecalculatedBtwNewPrice(Integer value) {
        this.recalculatedBtwNewPrice = value;
    }

    /**
     * Gets the value of the recalculatedNetCatalogPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecalculatedNetCatalogPrice() {
        return recalculatedNetCatalogPrice;
    }

    /**
     * Sets the value of the recalculatedNetCatalogPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecalculatedNetCatalogPrice(Integer value) {
        this.recalculatedNetCatalogPrice = value;
    }

}
