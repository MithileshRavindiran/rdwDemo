
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BovagMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BovagMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bovag_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="certificate_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departments" type="{http://www.webservices.nl/soap/}BovagDepartmentArray"/>
 *         &lt;element name="dutch_business_identifiers" type="{http://www.webservices.nl/soap/}DutchBusinessIdentifiers"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BovagMember", propOrder = {

})
public class BovagMember {

    @XmlElement(name = "bovag_id", required = true)
    protected String bovagId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "certificate_url", required = true)
    protected String certificateUrl;
    @XmlElement(required = true)
    protected BovagDepartmentArray departments;
    @XmlElement(name = "dutch_business_identifiers", required = true)
    protected DutchBusinessIdentifiers dutchBusinessIdentifiers;

    /**
     * Gets the value of the bovagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBovagId() {
        return bovagId;
    }

    /**
     * Sets the value of the bovagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBovagId(String value) {
        this.bovagId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the certificateUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateUrl() {
        return certificateUrl;
    }

    /**
     * Sets the value of the certificateUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateUrl(String value) {
        this.certificateUrl = value;
    }

    /**
     * Gets the value of the departments property.
     * 
     * @return
     *     possible object is
     *     {@link BovagDepartmentArray }
     *     
     */
    public BovagDepartmentArray getDepartments() {
        return departments;
    }

    /**
     * Sets the value of the departments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BovagDepartmentArray }
     *     
     */
    public void setDepartments(BovagDepartmentArray value) {
        this.departments = value;
    }

    /**
     * Gets the value of the dutchBusinessIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessIdentifiers }
     *     
     */
    public DutchBusinessIdentifiers getDutchBusinessIdentifiers() {
        return dutchBusinessIdentifiers;
    }

    /**
     * Sets the value of the dutchBusinessIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessIdentifiers }
     *     
     */
    public void setDutchBusinessIdentifiers(DutchBusinessIdentifiers value) {
        this.dutchBusinessIdentifiers = value;
    }

}
