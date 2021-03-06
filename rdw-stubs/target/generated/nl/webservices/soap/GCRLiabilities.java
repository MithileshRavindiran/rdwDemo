
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRLiabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRLiabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="liabilities_items" type="{http://www.webservices.nl/soap/}GCRItemArray" minOccurs="0"/>
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
@XmlType(name = "GCRLiabilities", propOrder = {

})
public class GCRLiabilities {

    @XmlElement(name = "liabilities_items")
    protected GCRItemArray liabilitiesItems;
    @XmlElement(name = "balance_sheet_total")
    protected BigDecimal balanceSheetTotal;

    /**
     * Gets the value of the liabilitiesItems property.
     * 
     * @return
     *     possible object is
     *     {@link GCRItemArray }
     *     
     */
    public GCRItemArray getLiabilitiesItems() {
        return liabilitiesItems;
    }

    /**
     * Sets the value of the liabilitiesItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRItemArray }
     *     
     */
    public void setLiabilitiesItems(GCRItemArray value) {
        this.liabilitiesItems = value;
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
