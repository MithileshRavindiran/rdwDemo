
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KvkUpdateReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KvkUpdateReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dossier_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update_types" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="date_last_update" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KvkUpdateReference", propOrder = {

})
public class KvkUpdateReference {

    @XmlElement(name = "dossier_number", required = true)
    protected String dossierNumber;
    @XmlElement(name = "establishment_number")
    protected String establishmentNumber;
    @XmlElement(name = "update_types", required = true)
    protected StringArray updateTypes;
    @XmlElement(name = "date_last_update", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLastUpdate;

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

    /**
     * Gets the value of the dateLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastUpdate() {
        return dateLastUpdate;
    }

    /**
     * Sets the value of the dateLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastUpdate(XMLGregorianCalendar value) {
        this.dateLastUpdate = value;
    }

}
