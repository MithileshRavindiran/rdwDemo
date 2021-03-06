
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DutchBusinessExtractDataV3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractDataV3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="legal_entity" type="{http://www.webservices.nl/soap/}DutchBusinessLegalEntityV3" minOccurs="0"/>
 *         &lt;element name="partnership" type="{http://www.webservices.nl/soap/}DutchBusinessPartnershipV3" minOccurs="0"/>
 *         &lt;element name="enterprise" type="{http://www.webservices.nl/soap/}DutchBusinessEnterpriseV3" minOccurs="0"/>
 *         &lt;element name="establishments" type="{http://www.webservices.nl/soap/}DutchBusinessEstablishmentV3Array" minOccurs="0"/>
 *         &lt;element name="positions" type="{http://www.webservices.nl/soap/}DutchBusinessPositionV3Array" minOccurs="0"/>
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
@XmlType(name = "DutchBusinessExtractDataV3", propOrder = {

})
public class DutchBusinessExtractDataV3 {

    @XmlElement(name = "dossier_number")
    protected String dossierNumber;
    @XmlElement(name = "reference_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar referenceDate;
    @XmlElement(name = "legal_entity")
    protected DutchBusinessLegalEntityV3 legalEntity;
    protected DutchBusinessPartnershipV3 partnership;
    protected DutchBusinessEnterpriseV3 enterprise;
    protected DutchBusinessEstablishmentV3Array establishments;
    protected DutchBusinessPositionV3Array positions;
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
     *     {@link DutchBusinessLegalEntityV3 }
     *     
     */
    public DutchBusinessLegalEntityV3 getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessLegalEntityV3 }
     *     
     */
    public void setLegalEntity(DutchBusinessLegalEntityV3 value) {
        this.legalEntity = value;
    }

    /**
     * Gets the value of the partnership property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPartnershipV3 }
     *     
     */
    public DutchBusinessPartnershipV3 getPartnership() {
        return partnership;
    }

    /**
     * Sets the value of the partnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPartnershipV3 }
     *     
     */
    public void setPartnership(DutchBusinessPartnershipV3 value) {
        this.partnership = value;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessEnterpriseV3 }
     *     
     */
    public DutchBusinessEnterpriseV3 getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessEnterpriseV3 }
     *     
     */
    public void setEnterprise(DutchBusinessEnterpriseV3 value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the establishments property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessEstablishmentV3Array }
     *     
     */
    public DutchBusinessEstablishmentV3Array getEstablishments() {
        return establishments;
    }

    /**
     * Sets the value of the establishments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessEstablishmentV3Array }
     *     
     */
    public void setEstablishments(DutchBusinessEstablishmentV3Array value) {
        this.establishments = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPositionV3Array }
     *     
     */
    public DutchBusinessPositionV3Array getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPositionV3Array }
     *     
     */
    public void setPositions(DutchBusinessPositionV3Array value) {
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
