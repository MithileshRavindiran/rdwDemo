
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafeBeProtestedBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeBeProtestedBill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="drawee_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drawee_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bill_amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bill_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maturity_of_bill_in_months" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="payment_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="name_of_drawer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city_of_drawer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeBeProtestedBill", propOrder = {

})
public class CreditsafeBeProtestedBill {

    @XmlElement(name = "drawee_name")
    protected String draweeName;
    @XmlElement(name = "drawee_address")
    protected String draweeAddress;
    @XmlElement(name = "bill_amount")
    protected BigDecimal billAmount;
    @XmlElement(name = "bill_currency")
    protected String billCurrency;
    @XmlElement(name = "maturity_of_bill_in_months")
    protected BigDecimal maturityOfBillInMonths;
    @XmlElement(name = "payment_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "name_of_drawer")
    protected String nameOfDrawer;
    @XmlElement(name = "city_of_drawer")
    protected String cityOfDrawer;

    /**
     * Gets the value of the draweeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraweeName() {
        return draweeName;
    }

    /**
     * Sets the value of the draweeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraweeName(String value) {
        this.draweeName = value;
    }

    /**
     * Gets the value of the draweeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraweeAddress() {
        return draweeAddress;
    }

    /**
     * Sets the value of the draweeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraweeAddress(String value) {
        this.draweeAddress = value;
    }

    /**
     * Gets the value of the billAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillAmount() {
        return billAmount;
    }

    /**
     * Sets the value of the billAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillAmount(BigDecimal value) {
        this.billAmount = value;
    }

    /**
     * Gets the value of the billCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCurrency() {
        return billCurrency;
    }

    /**
     * Sets the value of the billCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCurrency(String value) {
        this.billCurrency = value;
    }

    /**
     * Gets the value of the maturityOfBillInMonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaturityOfBillInMonths() {
        return maturityOfBillInMonths;
    }

    /**
     * Sets the value of the maturityOfBillInMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaturityOfBillInMonths(BigDecimal value) {
        this.maturityOfBillInMonths = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the nameOfDrawer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfDrawer() {
        return nameOfDrawer;
    }

    /**
     * Sets the value of the nameOfDrawer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfDrawer(String value) {
        this.nameOfDrawer = value;
    }

    /**
     * Gets the value of the cityOfDrawer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfDrawer() {
        return cityOfDrawer;
    }

    /**
     * Sets the value of the cityOfDrawer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfDrawer(String value) {
        this.cityOfDrawer = value;
    }

}
