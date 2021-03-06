
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DutchBusinessExtractDocumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractDocumentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="document_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="legal_entity" type="{http://www.webservices.nl/soap/}DutchBusinessLegalEntity" minOccurs="0"/>
 *         &lt;element name="enterprise" type="{http://www.webservices.nl/soap/}DutchBusinessEnterprise" minOccurs="0"/>
 *         &lt;element name="partnership" type="{http://www.webservices.nl/soap/}DutchBusinessPartnershipArray" minOccurs="0"/>
 *         &lt;element name="establishments" type="{http://www.webservices.nl/soap/}DutchBusinessEstablishmentArray" minOccurs="0"/>
 *         &lt;element name="positions" type="{http://www.webservices.nl/soap/}DutchBusinessPositionArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessExtractDocumentData", propOrder = {

})
public class DutchBusinessExtractDocumentData {

    protected byte[] document;
    @XmlElement(name = "dossier_number", required = true)
    protected String dossierNumber;
    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    protected String status;
    @XmlElement(name = "document_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "legal_entity")
    protected DutchBusinessLegalEntity legalEntity;
    protected DutchBusinessEnterprise enterprise;
    protected DutchBusinessPartnershipArray partnership;
    protected DutchBusinessEstablishmentArray establishments;
    protected DutchBusinessPositionArray positions;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument(byte[] value) {
        this.document = ((byte[]) value);
    }

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
     * Gets the value of the establishmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentNumber() {
        return establishmentNumber;
    }

    /**
     * Sets the value of the establishmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentNumber(String value) {
        this.establishmentNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the legalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessLegalEntity }
     *     
     */
    public DutchBusinessLegalEntity getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessLegalEntity }
     *     
     */
    public void setLegalEntity(DutchBusinessLegalEntity value) {
        this.legalEntity = value;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessEnterprise }
     *     
     */
    public DutchBusinessEnterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessEnterprise }
     *     
     */
    public void setEnterprise(DutchBusinessEnterprise value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the partnership property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPartnershipArray }
     *     
     */
    public DutchBusinessPartnershipArray getPartnership() {
        return partnership;
    }

    /**
     * Sets the value of the partnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPartnershipArray }
     *     
     */
    public void setPartnership(DutchBusinessPartnershipArray value) {
        this.partnership = value;
    }

    /**
     * Gets the value of the establishments property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessEstablishmentArray }
     *     
     */
    public DutchBusinessEstablishmentArray getEstablishments() {
        return establishments;
    }

    /**
     * Sets the value of the establishments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessEstablishmentArray }
     *     
     */
    public void setEstablishments(DutchBusinessEstablishmentArray value) {
        this.establishments = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessPositionArray }
     *     
     */
    public DutchBusinessPositionArray getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessPositionArray }
     *     
     */
    public void setPositions(DutchBusinessPositionArray value) {
        this.positions = value;
    }

}
