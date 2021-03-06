
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRLiaisonOfficialData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRLiaisonOfficialData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="chamber_of_commerce" type="{http://www.webservices.nl/soap/}GCRChamberOfCommerce" minOccurs="0"/>
 *         &lt;element name="present_legal_form_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="present_legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRLiaisonOfficialData", propOrder = {

})
public class GCRLiaisonOfficialData {

    @XmlElement(name = "chamber_of_commerce")
    protected GCRChamberOfCommerce chamberOfCommerce;
    @XmlElement(name = "present_legal_form_code")
    protected Integer presentLegalFormCode;
    @XmlElement(name = "present_legal_form_text")
    protected String presentLegalFormText;

    /**
     * Gets the value of the chamberOfCommerce property.
     * 
     * @return
     *     possible object is
     *     {@link GCRChamberOfCommerce }
     *     
     */
    public GCRChamberOfCommerce getChamberOfCommerce() {
        return chamberOfCommerce;
    }

    /**
     * Sets the value of the chamberOfCommerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRChamberOfCommerce }
     *     
     */
    public void setChamberOfCommerce(GCRChamberOfCommerce value) {
        this.chamberOfCommerce = value;
    }

    /**
     * Gets the value of the presentLegalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresentLegalFormCode() {
        return presentLegalFormCode;
    }

    /**
     * Sets the value of the presentLegalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresentLegalFormCode(Integer value) {
        this.presentLegalFormCode = value;
    }

    /**
     * Gets the value of the presentLegalFormText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentLegalFormText() {
        return presentLegalFormText;
    }

    /**
     * Sets the value of the presentLegalFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentLegalFormText(String value) {
        this.presentLegalFormText = value;
    }

}
