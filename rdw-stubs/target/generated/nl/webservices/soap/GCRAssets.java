
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRAssets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRAssets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fixed_assets_total" type="{http://www.webservices.nl/soap/}GCRItem" minOccurs="0"/>
 *         &lt;element name="fixed_assets_items" type="{http://www.webservices.nl/soap/}GCRItemArray" minOccurs="0"/>
 *         &lt;element name="current_assets_total" type="{http://www.webservices.nl/soap/}GCRItem" minOccurs="0"/>
 *         &lt;element name="current_assets_items" type="{http://www.webservices.nl/soap/}GCRItemArray" minOccurs="0"/>
 *         &lt;element name="balance_sheet_total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRAssets", propOrder = {

})
public class GCRAssets {

    @XmlElement(name = "fixed_assets_total")
    protected GCRItem fixedAssetsTotal;
    @XmlElement(name = "fixed_assets_items")
    protected GCRItemArray fixedAssetsItems;
    @XmlElement(name = "current_assets_total")
    protected GCRItem currentAssetsTotal;
    @XmlElement(name = "current_assets_items")
    protected GCRItemArray currentAssetsItems;
    @XmlElement(name = "balance_sheet_total")
    protected BigDecimal balanceSheetTotal;

    /**
     * Gets the value of the fixedAssetsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link GCRItem }
     *     
     */
    public GCRItem getFixedAssetsTotal() {
        return fixedAssetsTotal;
    }

    /**
     * Sets the value of the fixedAssetsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRItem }
     *     
     */
    public void setFixedAssetsTotal(GCRItem value) {
        this.fixedAssetsTotal = value;
    }

    /**
     * Gets the value of the fixedAssetsItems property.
     * 
     * @return
     *     possible object is
     *     {@link GCRItemArray }
     *     
     */
    public GCRItemArray getFixedAssetsItems() {
        return fixedAssetsItems;
    }

    /**
     * Sets the value of the fixedAssetsItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRItemArray }
     *     
     */
    public void setFixedAssetsItems(GCRItemArray value) {
        this.fixedAssetsItems = value;
    }

    /**
     * Gets the value of the currentAssetsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link GCRItem }
     *     
     */
    public GCRItem getCurrentAssetsTotal() {
        return currentAssetsTotal;
    }

    /**
     * Sets the value of the currentAssetsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRItem }
     *     
     */
    public void setCurrentAssetsTotal(GCRItem value) {
        this.currentAssetsTotal = value;
    }

    /**
     * Gets the value of the currentAssetsItems property.
     * 
     * @return
     *     possible object is
     *     {@link GCRItemArray }
     *     
     */
    public GCRItemArray getCurrentAssetsItems() {
        return currentAssetsItems;
    }

    /**
     * Sets the value of the currentAssetsItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRItemArray }
     *     
     */
    public void setCurrentAssetsItems(GCRItemArray value) {
        this.currentAssetsItems = value;
    }

    /**
     * Gets the value of the balanceSheetTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalanceSheetTotal() {
        return balanceSheetTotal;
    }

    /**
     * Sets the value of the balanceSheetTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalanceSheetTotal(BigDecimal value) {
        this.balanceSheetTotal = value;
    }

}
