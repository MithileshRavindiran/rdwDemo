
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessUpdateReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessUpdateReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubDossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdateTypes" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="DateLastUpdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUpdateReference", propOrder = {

})
public class BusinessUpdateReference {

    @XmlElement(name = "DossierNo", required = true)
    protected String dossierNo;
    @XmlElement(name = "SubDossierNo", required = true)
    protected String subDossierNo;
    @XmlElement(name = "UpdateTypes", required = true)
    protected StringArray updateTypes;
    @XmlElement(name = "DateLastUpdate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateLastUpdate;

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
