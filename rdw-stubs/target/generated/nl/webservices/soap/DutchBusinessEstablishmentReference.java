
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessEstablishmentReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessEstablishmentReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legal_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="match_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="establishment_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishment_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correspondence_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correspondence_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indication_main_establishment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessEstablishmentReference", propOrder = {

})
public class DutchBusinessEstablishmentReference {

    @XmlElement(name = "dossier_number", required = true)
    protected String dossierNumber;
    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    @XmlElement(name = "legal_name")
    protected String legalName;
    @XmlElement(name = "trade_name", required = true)
    protected String tradeName;
    @XmlElement(name = "match_type")
    protected String matchType;
    @XmlElement(name = "establishment_city", required = true)
    protected String establishmentCity;
    @XmlElement(name = "establishment_street", required = true)
    protected String establishmentStreet;
    @XmlElement(name = "correspondence_city", required = true)
    protected String correspondenceCity;
    @XmlElement(name = "correspondence_street", required = true)
    protected String correspondenceStreet;
    @XmlElement(name = "indication_main_establishment")
    protected Boolean indicationMainEstablishment;

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
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchType(String value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the establishmentCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCity() {
        return establishmentCity;
    }

    /**
     * Sets the value of the establishmentCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCity(String value) {
        this.establishmentCity = value;
    }

    /**
     * Gets the value of the establishmentStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentStreet() {
        return establishmentStreet;
    }

    /**
     * Sets the value of the establishmentStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentStreet(String value) {
        this.establishmentStreet = value;
    }

    /**
     * Gets the value of the correspondenceCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceCity() {
        return correspondenceCity;
    }

    /**
     * Sets the value of the correspondenceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceCity(String value) {
        this.correspondenceCity = value;
    }

    /**
     * Gets the value of the correspondenceStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceStreet() {
        return correspondenceStreet;
    }

    /**
     * Sets the value of the correspondenceStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceStreet(String value) {
        this.correspondenceStreet = value;
    }

    /**
     * Gets the value of the indicationMainEstablishment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicationMainEstablishment() {
        return indicationMainEstablishment;
    }

    /**
     * Sets the value of the indicationMainEstablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicationMainEstablishment(Boolean value) {
        this.indicationMainEstablishment = value;
    }

}
