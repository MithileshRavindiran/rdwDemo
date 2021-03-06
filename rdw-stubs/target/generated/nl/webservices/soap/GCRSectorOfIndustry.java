
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRSectorOfIndustry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRSectorOfIndustry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="is_primary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sector_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sector_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRSectorOfIndustry", propOrder = {

})
public class GCRSectorOfIndustry {

    @XmlElement(name = "is_primary")
    protected Boolean isPrimary;
    @XmlElement(name = "sector_code", required = true)
    protected String sectorCode;
    @XmlElement(name = "sector_text", required = true)
    protected String sectorText;

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

    /**
     * Gets the value of the sectorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorCode() {
        return sectorCode;
    }

    /**
     * Sets the value of the sectorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorCode(String value) {
        this.sectorCode = value;
    }

    /**
     * Gets the value of the sectorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorText() {
        return sectorText;
    }

    /**
     * Sets the value of the sectorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorText(String value) {
        this.sectorText = value;
    }

}
