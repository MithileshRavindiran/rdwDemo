
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for businessUpdateGetChangedDossiersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="businessUpdateGetChangedDossiersRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="changed_since" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="update_types" type="{http://www.webservices.nl/soap/}stringArray"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessUpdateGetChangedDossiersRequestType", propOrder = {

})
public class BusinessUpdateGetChangedDossiersRequestType {

    @XmlElement(name = "changed_since", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changedSince;
    @XmlElement(name = "update_types", required = true)
    protected StringArray updateTypes;
    protected int page;

    /**
     * Gets the value of the changedSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedSince() {
        return changedSince;
    }

    /**
     * Sets the value of the changedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedSince(XMLGregorianCalendar value) {
        this.changedSince = value;
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
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
