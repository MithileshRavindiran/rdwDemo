
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRFinancialCalamity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRFinancialCalamity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bankruptcy" type="{http://www.webservices.nl/soap/}GCRBankruptcy" minOccurs="0"/>
 *         &lt;element name="moratorium" type="{http://www.webservices.nl/soap/}GCRMoratorium" minOccurs="0"/>
 *         &lt;element name="debt_restructuring_private_persons" type="{http://www.webservices.nl/soap/}GCRDebtRestructuringPrivatePersons" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRFinancialCalamity", propOrder = {

})
public class GCRFinancialCalamity {

    protected GCRBankruptcy bankruptcy;
    protected GCRMoratorium moratorium;
    @XmlElement(name = "debt_restructuring_private_persons")
    protected GCRDebtRestructuringPrivatePersons debtRestructuringPrivatePersons;

    /**
     * Gets the value of the bankruptcy property.
     * 
     * @return
     *     possible object is
     *     {@link GCRBankruptcy }
     *     
     */
    public GCRBankruptcy getBankruptcy() {
        return bankruptcy;
    }

    /**
     * Sets the value of the bankruptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRBankruptcy }
     *     
     */
    public void setBankruptcy(GCRBankruptcy value) {
        this.bankruptcy = value;
    }

    /**
     * Gets the value of the moratorium property.
     * 
     * @return
     *     possible object is
     *     {@link GCRMoratorium }
     *     
     */
    public GCRMoratorium getMoratorium() {
        return moratorium;
    }

    /**
     * Sets the value of the moratorium property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRMoratorium }
     *     
     */
    public void setMoratorium(GCRMoratorium value) {
        this.moratorium = value;
    }

    /**
     * Gets the value of the debtRestructuringPrivatePersons property.
     * 
     * @return
     *     possible object is
     *     {@link GCRDebtRestructuringPrivatePersons }
     *     
     */
    public GCRDebtRestructuringPrivatePersons getDebtRestructuringPrivatePersons() {
        return debtRestructuringPrivatePersons;
    }

    /**
     * Sets the value of the debtRestructuringPrivatePersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRDebtRestructuringPrivatePersons }
     *     
     */
    public void setDebtRestructuringPrivatePersons(GCRDebtRestructuringPrivatePersons value) {
        this.debtRestructuringPrivatePersons = value;
    }

}
