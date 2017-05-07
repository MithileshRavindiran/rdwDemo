
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sepaConvertBasicBankAccountNumberResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sepaConvertBasicBankAccountNumberResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bankaccount" type="{http://www.webservices.nl/soap/}SepaBankAccountData"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sepaConvertBasicBankAccountNumberResponseType", propOrder = {

})
public class SepaConvertBasicBankAccountNumberResponseType {

    @XmlElement(required = true)
    protected SepaBankAccountData bankaccount;

    /**
     * Gets the value of the bankaccount property.
     * 
     * @return
     *     possible object is
     *     {@link SepaBankAccountData }
     *     
     */
    public SepaBankAccountData getBankaccount() {
        return bankaccount;
    }

    /**
     * Sets the value of the bankaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SepaBankAccountData }
     *     
     */
    public void setBankaccount(SepaBankAccountData value) {
        this.bankaccount = value;
    }

}
