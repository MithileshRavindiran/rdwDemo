
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="reeks" type="{http://www.webservices.nl/soap/}PCReeks"/>
 *         &lt;element name="huisnr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="huisnr_toevoeging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeAddress", propOrder = {

})
public class RangeAddress {

    @XmlElement(required = true)
    protected PCReeks reeks;
    protected Integer huisnr;
    @XmlElement(name = "huisnr_toevoeging")
    protected String huisnrToevoeging;

    /**
     * Gets the value of the reeks property.
     * 
     * @return
     *     possible object is
     *     {@link PCReeks }
     *     
     */
    public PCReeks getReeks() {
        return reeks;
    }

    /**
     * Sets the value of the reeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCReeks }
     *     
     */
    public void setReeks(PCReeks value) {
        this.reeks = value;
    }

    /**
     * Gets the value of the huisnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHuisnr() {
        return huisnr;
    }

    /**
     * Sets the value of the huisnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHuisnr(Integer value) {
        this.huisnr = value;
    }

    /**
     * Gets the value of the huisnrToevoeging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisnrToevoeging() {
        return huisnrToevoeging;
    }

    /**
     * Sets the value of the huisnrToevoeging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisnrToevoeging(String value) {
        this.huisnrToevoeging = value;
    }

}
