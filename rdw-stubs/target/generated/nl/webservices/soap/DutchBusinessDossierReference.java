
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DutchBusinessDossierReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessDossierReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="update_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="change_set" type="{http://www.webservices.nl/soap/}DutchBusinessChangeSet"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessDossierReference", propOrder = {

})
public class DutchBusinessDossierReference {

    @XmlElement(name = "update_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "change_set", required = true)
    protected DutchBusinessChangeSet changeSet;

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the changeSet property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessChangeSet }
     *     
     */
    public DutchBusinessChangeSet getChangeSet() {
        return changeSet;
    }

    /**
     * Sets the value of the changeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessChangeSet }
     *     
     */
    public void setChangeSet(DutchBusinessChangeSet value) {
        this.changeSet = value;
    }

}
