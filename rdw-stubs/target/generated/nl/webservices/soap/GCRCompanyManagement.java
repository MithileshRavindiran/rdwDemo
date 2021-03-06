
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCompanyManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCompanyManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="management" type="{http://www.webservices.nl/soap/}GCRManagementArray" minOccurs="0"/>
 *         &lt;element name="first_directors" type="{http://www.webservices.nl/soap/}GCRFirstDirectorArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCompanyManagement", propOrder = {

})
public class GCRCompanyManagement {

    protected GCRManagementArray management;
    @XmlElement(name = "first_directors")
    protected GCRFirstDirectorArray firstDirectors;

    /**
     * Gets the value of the management property.
     * 
     * @return
     *     possible object is
     *     {@link GCRManagementArray }
     *     
     */
    public GCRManagementArray getManagement() {
        return management;
    }

    /**
     * Sets the value of the management property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRManagementArray }
     *     
     */
    public void setManagement(GCRManagementArray value) {
        this.management = value;
    }

    /**
     * Gets the value of the firstDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link GCRFirstDirectorArray }
     *     
     */
    public GCRFirstDirectorArray getFirstDirectors() {
        return firstDirectors;
    }

    /**
     * Sets the value of the firstDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRFirstDirectorArray }
     *     
     */
    public void setFirstDirectors(GCRFirstDirectorArray value) {
        this.firstDirectors = value;
    }

}
