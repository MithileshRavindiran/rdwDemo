
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompanyRelationsSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanyRelationsSimple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="companies" type="{http://www.webservices.nl/soap/}GCRCompanySimpleArray" minOccurs="0"/>
 *         &lt;element name="persons" type="{http://www.webservices.nl/soap/}GCRPersonSimpleArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCompanyRelationsSimple", propOrder = {

})
public class GCRCompanyRelationsSimple {

    protected GCRCompanySimpleArray companies;
    protected GCRPersonSimpleArray persons;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCompanySimpleArray }
     *     
     */
    public GCRCompanySimpleArray getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCompanySimpleArray }
     *     
     */
    public void setCompanies(GCRCompanySimpleArray value) {
        this.companies = value;
    }

    /**
     * Gets the value of the persons property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPersonSimpleArray }
     *     
     */
    public GCRPersonSimpleArray getPersons() {
        return persons;
    }

    /**
     * Sets the value of the persons property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPersonSimpleArray }
     *     
     */
    public void setPersons(GCRPersonSimpleArray value) {
        this.persons = value;
    }

}
