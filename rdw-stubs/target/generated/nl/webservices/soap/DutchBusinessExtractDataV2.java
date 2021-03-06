
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DutchBusinessExtractDataV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractDataV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="legal_entity" type="{http://www.webservices.nl/soap/}DutchBusinessLegalEntityV2" minOccurs="0"/>
 *         &lt;element name="partnership" type="{http://www.webservices.nl/soap/}DutchBusinessPartnershipV2" minOccurs="0"/>
 *         &lt;element name="enterprise" type="{http://www.webservices.nl/soap/}DutchBusinessEnterpriseV2" minOccurs="0"/>
 *         &lt;element name="establishments" type="{http://www.webservices.nl/soap/}DutchBusinessEstablishmentV2Array" minOccurs="0"/>
 *         &lt;element name="positions" type="{http://www.webservices.nl/soap/}DutchBusinessPositionV2Array" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://www.webservices.nl/soap/}stringArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessExtractDataV2", propOrder = {

})
public class DutchBusinessExtractDataV2 {

    @XmlElement(name = "dossier_number")
    protected String dossierNumber;
    @XmlElement(name = "reference_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referenceDate;
    @XmlElement(name = "legal_entity")
    protected DutchBusinessLegalEntityV2 legalEntity;
    protected DutchBusinessPartnershipV2 partnership;
    protected DutchBusinessEnterpriseV2 enterprise;
    protected DutchBusinessEstablishmentV2Array establishments;
    protected DutchBusinessPositionV2Array positions;
    protected StringArray remarks;

    /**
     * Gets the value of the dossierNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNumber() {
        return dossierNumber;
    }

    /**
     * Sets the value of the dossierNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNumber(String value) {
        this.dossierNumber = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceDate(XMLGregorianCalendar value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the legalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessLegalEntityV2 }
     *     
     */
    public DutchBusinessLegalEntityV2 getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessLegalEntityV2 }
     *     
     */
    public void setLegalEntity(DutchBusinessLegalEntityV2 value) {
        this.legalEntity = value;
    }

    /**
     * Gets the value of the partnership property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPartnershipV2 }
     *     
     */
    public DutchBusinessPartnershipV2 getPartnership() {
        return partnership;
    }

    /**
     * Sets the value of the partnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPartnershipV2 }
     *     
     */
    public void setPartnership(DutchBusinessPartnershipV2 value) {
        this.partnership = value;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessEnterpriseV2 }
     *     
     */
    public DutchBusinessEnterpriseV2 getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessEnterpriseV2 }
     *     
     */
    public void setEnterprise(DutchBusinessEnterpriseV2 value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the establishments property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessEstablishmentV2Array }
     *     
     */
    public DutchBusinessEstablishmentV2Array getEstablishments() {
        return establishments;
    }

    /**
     * Sets the value of the establishments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessEstablishmentV2Array }
     *     
     */
    public void setEstablishments(DutchBusinessEstablishmentV2Array value) {
        this.establishments = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPositionV2Array }
     *     
     */
    public DutchBusinessPositionV2Array getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPositionV2Array }
     *     
     */
    public void setPositions(DutchBusinessPositionV2Array value) {
        this.positions = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setRemarks(StringArray value) {
        this.remarks = value;
    }

}
