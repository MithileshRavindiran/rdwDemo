
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessReferenceV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessReferenceV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubDossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tradename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstablishmentStreetname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstablishmentCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrespondenceStreetname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrespondenceCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessReferenceV2", propOrder = {

})
public class BusinessReferenceV2 {

    @XmlElement(name = "DossierNo", required = true)
    protected String dossierNo;
    @XmlElement(name = "SubDossierNo", required = true)
    protected String subDossierNo;
    @XmlElement(name = "Tradename", required = true)
    protected String tradename;
    @XmlElement(name = "EstablishmentStreetname", required = true)
    protected String establishmentStreetname;
    @XmlElement(name = "EstablishmentCity", required = true)
    protected String establishmentCity;
    @XmlElement(name = "CorrespondenceStreetname", required = true)
    protected String correspondenceStreetname;
    @XmlElement(name = "CorrespondenceCity", required = true)
    protected String correspondenceCity;

    /**
     * Gets the value of the dossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNo() {
        return dossierNo;
    }

    /**
     * Sets the value of the dossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNo(String value) {
        this.dossierNo = value;
    }

    /**
     * Gets the value of the subDossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDossierNo() {
        return subDossierNo;
    }

    /**
     * Sets the value of the subDossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDossierNo(String value) {
        this.subDossierNo = value;
    }

    /**
     * Gets the value of the tradename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradename() {
        return tradename;
    }

    /**
     * Sets the value of the tradename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradename(String value) {
        this.tradename = value;
    }

    /**
     * Gets the value of the establishmentStreetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentStreetname() {
        return establishmentStreetname;
    }

    /**
     * Sets the value of the establishmentStreetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentStreetname(String value) {
        this.establishmentStreetname = value;
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
     * Gets the value of the correspondenceStreetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceStreetname() {
        return correspondenceStreetname;
    }

    /**
     * Sets the value of the correspondenceStreetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceStreetname(String value) {
        this.correspondenceStreetname = value;
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

}
