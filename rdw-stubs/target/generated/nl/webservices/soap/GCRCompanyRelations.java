
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompanyRelations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanyRelations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="companies" type="{http://www.webservices.nl/soap/}GCRCompanyArray" minOccurs="0"/>
 *         &lt;element name="persons" type="{http://www.webservices.nl/soap/}GCRPersonArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCompanyRelations", propOrder = {

})
public class GCRCompanyRelations {

    protected GCRCompanyArray companies;
    protected GCRPersonArray persons;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanyArray }
     *     
     */
    public GCRCompanyArray getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanyArray }
     *     
     */
    public void setCompanies(GCRCompanyArray value) {
        this.companies = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPersonArray }
     *     
     */
    public GCRPersonArray getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPersonArray }
     *     
     */
    public void setPersons(GCRPersonArray value) {
        this.persons = value;
    }

}
