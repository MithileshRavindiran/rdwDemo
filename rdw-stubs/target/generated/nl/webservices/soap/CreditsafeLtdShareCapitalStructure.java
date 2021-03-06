
package nl.webservices.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditsafeLtdShareCapitalStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafeLtdShareCapitalStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="nominal_share_capital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="issued_share_capital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="share_holders" type="{http://www.webservices.nl/soap/}CreditsafeShareHolderArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafeLtdShareCapitalStructure", propOrder = {

})
public class CreditsafeLtdShareCapitalStructure {

    @XmlElement(name = "nominal_share_capital")
    protected BigDecimal nominalShareCapital;
    @XmlElement(name = "issued_share_capital")
    protected BigDecimal issuedShareCapital;
    @XmlElement(name = "share_holders")
    protected CreditsafeShareHolderArray shareHolders;

    /**
     * Gets the value of the nominalShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNominalShareCapital() {
        return nominalShareCapital;
    }

    /**
     * Sets the value of the nominalShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNominalShareCapital(BigDecimal value) {
        this.nominalShareCapital = value;
    }

    /**
     * Gets the value of the issuedShareCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIssuedShareCapital() {
        return issuedShareCapital;
    }

    /**
     * Sets the value of the issuedShareCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIssuedShareCapital(BigDecimal value) {
        this.issuedShareCapital = value;
    }

    /**
     * Gets the value of the shareHolders property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeShareHolderArray }
     *     
     */
    public CreditsafeShareHolderArray getShareHolders() {
        return shareHolders;
    }

    /**
     * Sets the value of the shareHolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeShareHolderArray }
     *     
     */
    public void setShareHolders(CreditsafeShareHolderArray value) {
        this.shareHolders = value;
    }

}
