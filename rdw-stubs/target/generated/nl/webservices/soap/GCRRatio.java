
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRRatio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRRatio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ratio_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ratio_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRRatio", propOrder = {

})
public class GCRRatio {

    @XmlElement(name = "ratio_code", required = true)
    protected String ratioCode;
    @XmlElement(name = "ratio_text", required = true)
    protected String ratioText;
    protected BigDecimal value;

    /**
     * Gets the value of the ratioCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatioCode() {
        return ratioCode;
    }

    /**
     * Sets the value of the ratioCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatioCode(String value) {
        this.ratioCode = value;
    }

    /**
     * Gets the value of the ratioText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatioText() {
        return ratioText;
    }

    /**
     * Sets the value of the ratioText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatioText(String value) {
        this.ratioText = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
