
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRChamberOfCommerce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRChamberOfCommerce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="chamber_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dossier_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sub_dossier_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="administering_chamber_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trade_register_location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRChamberOfCommerce", propOrder = {

})
public class GCRChamberOfCommerce {

    @XmlElement(name = "chamber_no", required = true)
    protected String chamberNo;
    @XmlElement(name = "dossier_no", required = true)
    protected String dossierNo;
    @XmlElement(name = "sub_dossier_no", required = true)
    protected String subDossierNo;
    @XmlElement(name = "administering_chamber_no")
    protected String administeringChamberNo;
    @XmlElement(name = "trade_register_location")
    protected String tradeRegisterLocation;

    /**
     * Gets the value of the chamberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamberNo() {
        return chamberNo;
    }

    /**
     * Sets the value of the chamberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamberNo(String value) {
        this.chamberNo = value;
    }

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
     * Gets the value of the administeringChamberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministeringChamberNo() {
        return administeringChamberNo;
    }

    /**
     * Sets the value of the administeringChamberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministeringChamberNo(String value) {
        this.administeringChamberNo = value;
    }

    /**
     * Gets the value of the tradeRegisterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeRegisterLocation() {
        return tradeRegisterLocation;
    }

    /**
     * Sets the value of the tradeRegisterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeRegisterLocation(String value) {
        this.tradeRegisterLocation = value;
    }

}
