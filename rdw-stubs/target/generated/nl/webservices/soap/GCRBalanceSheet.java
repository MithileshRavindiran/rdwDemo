
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRBalanceSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRBalanceSheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="items" type="{http://www.webservices.nl/soap/}GCRItemArray" minOccurs="0"/>
 *         &lt;element name="assets" type="{http://www.webservices.nl/soap/}GCRAssets" minOccurs="0"/>
 *         &lt;element name="liabilities" type="{http://www.webservices.nl/soap/}GCRLiabilities" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRBalanceSheet", propOrder = {

})
public class GCRBalanceSheet {

    protected GCRItemArray items;
    protected GCRAssets assets;
    protected GCRLiabilities liabilities;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link GCRItemArray }
     *     
     */
    public GCRItemArray getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRItemArray }
     *     
     */
    public void setItems(GCRItemArray value) {
        this.items = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link GCRAssets }
     *     
     */
    public GCRAssets getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRAssets }
     *     
     */
    public void setAssets(GCRAssets value) {
        this.assets = value;
    }

    /**
     * Gets the value of the liabilities property.
     * 
     * @return
     *     possible object is
     *     {@link GCRLiabilities }
     *     
     */
    public GCRLiabilities getLiabilities() {
        return liabilities;
    }

    /**
     * Sets the value of the liabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRLiabilities }
     *     
     */
    public void setLiabilities(GCRLiabilities value) {
        this.liabilities = value;
    }

}
