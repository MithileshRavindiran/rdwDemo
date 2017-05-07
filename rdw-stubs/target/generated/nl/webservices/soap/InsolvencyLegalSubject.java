
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsolvencyLegalSubject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyLegalSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="natural_person" type="{http://www.webservices.nl/soap/}InsolvencyConcernedPerson" minOccurs="0"/>
 *         &lt;element name="legal_entity" type="{http://www.webservices.nl/soap/}InsolvencyAffectedCompany" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyLegalSubject", propOrder = {

})
public class InsolvencyLegalSubject {

    @XmlElement(name = "natural_person")
    protected InsolvencyConcernedPerson naturalPerson;
    @XmlElement(name = "legal_entity")
    protected InsolvencyAffectedCompany legalEntity;

    /**
     * Gets the value of the naturalPerson property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyConcernedPerson }
     *     
     */
    public InsolvencyConcernedPerson getNaturalPerson() {
        return naturalPerson;
    }

    /**
     * Sets the value of the naturalPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyConcernedPerson }
     *     
     */
    public void setNaturalPerson(InsolvencyConcernedPerson value) {
        this.naturalPerson = value;
    }

    /**
     * Gets the value of the legalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyAffectedCompany }
     *     
     */
    public InsolvencyAffectedCompany getLegalEntity() {
        return legalEntity;
    }

    /**
     * Sets the value of the legalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyAffectedCompany }
     *     
     */
    public void setLegalEntity(InsolvencyAffectedCompany value) {
        this.legalEntity = value;
    }

}
