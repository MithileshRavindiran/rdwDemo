
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeLtdDirectors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdDirectors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="current_directors" type="{http://www.webservices.nl/soap/}CreditsafeDirectorArray" minOccurs="0"/>
 *         &lt;element name="previous_directors" type="{http://www.webservices.nl/soap/}CreditsafePreviousDirectorArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdDirectors", propOrder = {

})
public class CreditsafeLtdDirectors {

    @XmlElement(name = "current_directors")
    protected CreditsafeDirectorArray currentDirectors;
    @XmlElement(name = "previous_directors")
    protected CreditsafePreviousDirectorArray previousDirectors;

    /**
     * Gets the value of the currentDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeDirectorArray }
     *     
     */
    public CreditsafeDirectorArray getCurrentDirectors() {
        return currentDirectors;
    }

    /**
     * Sets the value of the currentDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeDirectorArray }
     *     
     */
    public void setCurrentDirectors(CreditsafeDirectorArray value) {
        this.currentDirectors = value;
    }

    /**
     * Gets the value of the previousDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafePreviousDirectorArray }
     *     
     */
    public CreditsafePreviousDirectorArray getPreviousDirectors() {
        return previousDirectors;
    }

    /**
     * Sets the value of the previousDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafePreviousDirectorArray }
     *     
     */
    public void setPreviousDirectors(CreditsafePreviousDirectorArray value) {
        this.previousDirectors = value;
    }

}
