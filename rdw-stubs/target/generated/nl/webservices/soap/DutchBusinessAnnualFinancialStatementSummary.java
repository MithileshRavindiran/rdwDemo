
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessAnnualFinancialStatementSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessAnnualFinancialStatementSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="turnover" type="{http://www.webservices.nl/soap/}DutchBusinessMoneyV2" minOccurs="0"/>
 *         &lt;element name="profit" type="{http://www.webservices.nl/soap/}DutchBusinessMoneyV2" minOccurs="0"/>
 *         &lt;element name="assets" type="{http://www.webservices.nl/soap/}DutchBusinessMoneyV2" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessAnnualFinancialStatementSummary", propOrder = {

})
public class DutchBusinessAnnualFinancialStatementSummary {

    protected Integer year;
    protected DutchBusinessMoneyV2 turnover;
    protected DutchBusinessMoneyV2 profit;
    protected DutchBusinessMoneyV2 assets;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    /**
     * Gets the value of the turnover property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public DutchBusinessMoneyV2 getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public void setTurnover(DutchBusinessMoneyV2 value) {
        this.turnover = value;
    }

    /**
     * Gets the value of the profit property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public DutchBusinessMoneyV2 getProfit() {
        return profit;
    }

    /**
     * Sets the value of the profit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public void setProfit(DutchBusinessMoneyV2 value) {
        this.profit = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public DutchBusinessMoneyV2 getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessMoneyV2 }
     *     
     */
    public void setAssets(DutchBusinessMoneyV2 value) {
        this.assets = value;
    }

}
