
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRSpecialCompanyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRSpecialCompanyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="special_company_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="special_company_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texts" type="{http://www.webservices.nl/soap/}GCRTextSequenceArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRSpecialCompanyInformation", propOrder = {

})
public class GCRSpecialCompanyInformation {

    @XmlElement(name = "special_company_code")
    protected String specialCompanyCode;
    @XmlElement(name = "special_company_text")
    protected String specialCompanyText;
    protected GCRTextSequenceArray texts;

    /**
     * Gets the value of the specialCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCompanyCode() {
        return specialCompanyCode;
    }

    /**
     * Sets the value of the specialCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCompanyCode(String value) {
        this.specialCompanyCode = value;
    }

    /**
     * Gets the value of the specialCompanyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCompanyText() {
        return specialCompanyText;
    }

    /**
     * Sets the value of the specialCompanyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCompanyText(String value) {
        this.specialCompanyText = value;
    }

    /**
     * Gets the value of the texts property.
     * 
     * @return
     *     possible object is
     *     {@link GCRTextSequenceArray }
     *     
     */
    public GCRTextSequenceArray getTexts() {
        return texts;
    }

    /**
     * Sets the value of the texts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRTextSequenceArray }
     *     
     */
    public void setTexts(GCRTextSequenceArray value) {
        this.texts = value;
    }

}
