
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessExtractHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="forecast" type="{http://www.webservices.nl/soap/}DutchBusinessExtractChangeForecast"/>
 *         &lt;element name="references" type="{http://www.webservices.nl/soap/}DutchBusinessExtractReferenceArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessExtractHistory", propOrder = {

})
public class DutchBusinessExtractHistory {

    @XmlElement(required = true)
    protected DutchBusinessExtractChangeForecast forecast;
    @XmlElement(required = true)
    protected DutchBusinessExtractReferenceArray references;

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessExtractChangeForecast }
     *     
     */
    public DutchBusinessExtractChangeForecast getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessExtractChangeForecast }
     *     
     */
    public void setForecast(DutchBusinessExtractChangeForecast value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessExtractReferenceArray }
     *     
     */
    public DutchBusinessExtractReferenceArray getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessExtractReferenceArray }
     *     
     */
    public void setReferences(DutchBusinessExtractReferenceArray value) {
        this.references = value;
    }

}
