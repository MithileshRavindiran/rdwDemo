
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskLegalRestraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskLegalRestraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="verdict_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="person" type="{http://www.webservices.nl/soap/}RiskLegalRestraintPerson" minOccurs="0"/>
 *         &lt;element name="registry" type="{http://www.webservices.nl/soap/}RiskLegalRestraintRegistry" minOccurs="0"/>
 *         &lt;element name="decisions" type="{http://www.webservices.nl/soap/}RiskLegalRestraintDecisionArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskLegalRestraint", propOrder = {

})
public class RiskLegalRestraint {

    @XmlElement(name = "verdict_number")
    protected String verdictNumber;
    protected RiskLegalRestraintPerson person;
    protected RiskLegalRestraintRegistry registry;
    protected RiskLegalRestraintDecisionArray decisions;

    /**
     * Gets the value of the verdictNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerdictNumber() {
        return verdictNumber;
    }

    /**
     * Sets the value of the verdictNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerdictNumber(String value) {
        this.verdictNumber = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLegalRestraintPerson }
     *     
     */
    public RiskLegalRestraintPerson getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLegalRestraintPerson }
     *     
     */
    public void setPerson(RiskLegalRestraintPerson value) {
        this.person = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLegalRestraintRegistry }
     *     
     */
    public RiskLegalRestraintRegistry getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLegalRestraintRegistry }
     *     
     */
    public void setRegistry(RiskLegalRestraintRegistry value) {
        this.registry = value;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLegalRestraintDecisionArray }
     *     
     */
    public RiskLegalRestraintDecisionArray getDecisions() {
        return decisions;
    }

    /**
     * Sets the value of the decisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLegalRestraintDecisionArray }
     *     
     */
    public void setDecisions(RiskLegalRestraintDecisionArray value) {
        this.decisions = value;
    }

}
