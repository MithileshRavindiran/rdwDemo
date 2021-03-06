
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for businessUpdateCheckDossierRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessUpdateCheckDossierRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossierno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subdossierno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="update_types" type="{http://www.webservices.nl/soap/}stringArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessUpdateCheckDossierRequestType", propOrder = {

})
public class BusinessUpdateCheckDossierRequestType {

    @XmlElement(required = true)
    protected String dossierno;
    @XmlElement(required = true)
    protected String subdossierno;
    @XmlElement(name = "update_types", required = true)
    protected StringArray updateTypes;

    /**
     * Gets the value of the dossierno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierno() {
        return dossierno;
    }

    /**
     * Sets the value of the dossierno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierno(String value) {
        this.dossierno = value;
    }

    /**
     * Gets the value of the subdossierno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdossierno() {
        return subdossierno;
    }

    /**
     * Sets the value of the subdossierno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdossierno(String value) {
        this.subdossierno = value;
    }

    /**
     * Gets the value of the updateTypes property.
     * 
     * @return
     *     possible object is
     *     {@link StringArray }
     *     
     */
    public StringArray getUpdateTypes() {
        return updateTypes;
    }

    /**
     * Sets the value of the updateTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringArray }
     *     
     */
    public void setUpdateTypes(StringArray value) {
        this.updateTypes = value;
    }

}
