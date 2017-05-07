
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessDossierHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessDossierHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="references" type="{http://www.webservices.nl/soap/}DutchBusinessDossierReferenceArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessDossierHistory", propOrder = {

})
public class DutchBusinessDossierHistory {

    @XmlElement(required = true)
    protected DutchBusinessDossierReferenceArray references;

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessDossierReferenceArray }
     *     
     */
    public DutchBusinessDossierReferenceArray getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessDossierReferenceArray }
     *     
     */
    public void setReferences(DutchBusinessDossierReferenceArray value) {
        this.references = value;
    }

}
