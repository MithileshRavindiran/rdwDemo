
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCROfficialData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCROfficialData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="chamber_of_commerce" type="{http://www.webservices.nl/soap/}GCRChamberOfCommerce" minOccurs="0"/>
 *         &lt;element name="vat_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="present_legal_form_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="present_legal_form_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="present_legal_form_fine_code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="present_legal_form_fine_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number_of_non_executive_partners" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publication_duty_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publication_duty_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capital" type="{http://www.webservices.nl/soap/}GCRCapitalArray" minOccurs="0"/>
 *         &lt;element name="founded" type="{http://www.webservices.nl/soap/}GCRFoundedArray" minOccurs="0"/>
 *         &lt;element name="discontinuance" type="{http://www.webservices.nl/soap/}GCRDiscontinuance" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCROfficialData", propOrder = {

})
public class GCROfficialData {

    @XmlElement(name = "chamber_of_commerce")
    protected GCRChamberOfCommerce chamberOfCommerce;
    @XmlElement(name = "vat_number")
    protected String vatNumber;
    @XmlElement(name = "present_legal_form_code")
    protected Integer presentLegalFormCode;
    @XmlElement(name = "present_legal_form_text")
    protected String presentLegalFormText;
    @XmlElement(name = "present_legal_form_fine_code")
    protected Integer presentLegalFormFineCode;
    @XmlElement(name = "present_legal_form_fine_text")
    protected String presentLegalFormFineText;
    @XmlElement(name = "number_of_non_executive_partners")
    protected String numberOfNonExecutivePartners;
    @XmlElement(name = "publication_duty_code")
    protected String publicationDutyCode;
    @XmlElement(name = "publication_duty_text")
    protected String publicationDutyText;
    protected GCRCapitalArray capital;
    protected GCRFoundedArray founded;
    protected GCRDiscontinuance discontinuance;

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
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
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

    /**
     * Gets the value of the presentLegalFormFineCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPresentLegalFormFineCode() {
        return presentLegalFormFineCode;
    }

    /**
     * Sets the value of the presentLegalFormFineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPresentLegalFormFineCode(Integer value) {
        this.presentLegalFormFineCode = value;
    }

    /**
     * Gets the value of the presentLegalFormFineText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentLegalFormFineText() {
        return presentLegalFormFineText;
    }

    /**
     * Sets the value of the presentLegalFormFineText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentLegalFormFineText(String value) {
        this.presentLegalFormFineText = value;
    }

    /**
     * Gets the value of the numberOfNonExecutivePartners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfNonExecutivePartners() {
        return numberOfNonExecutivePartners;
    }

    /**
     * Sets the value of the numberOfNonExecutivePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfNonExecutivePartners(String value) {
        this.numberOfNonExecutivePartners = value;
    }

    /**
     * Gets the value of the publicationDutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDutyCode() {
        return publicationDutyCode;
    }

    /**
     * Sets the value of the publicationDutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDutyCode(String value) {
        this.publicationDutyCode = value;
    }

    /**
     * Gets the value of the publicationDutyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDutyText() {
        return publicationDutyText;
    }

    /**
     * Sets the value of the publicationDutyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDutyText(String value) {
        this.publicationDutyText = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCapitalArray }
     *     
     */
    public GCRCapitalArray getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCapitalArray }
     *     
     */
    public void setCapital(GCRCapitalArray value) {
        this.capital = value;
    }

    /**
     * Gets the value of the founded property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFoundedArray }
     *     
     */
    public GCRFoundedArray getFounded() {
        return founded;
    }

    /**
     * Sets the value of the founded property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFoundedArray }
     *     
     */
    public void setFounded(GCRFoundedArray value) {
        this.founded = value;
    }

    /**
     * Gets the value of the discontinuance property.
     * 
     * @return
     *     possible object is
     *     {@link GCRDiscontinuance }
     *     
     */
    public GCRDiscontinuance getDiscontinuance() {
        return discontinuance;
    }

    /**
     * Sets the value of the discontinuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRDiscontinuance }
     *     
     */
    public void setDiscontinuance(GCRDiscontinuance value) {
        this.discontinuance = value;
    }

}
