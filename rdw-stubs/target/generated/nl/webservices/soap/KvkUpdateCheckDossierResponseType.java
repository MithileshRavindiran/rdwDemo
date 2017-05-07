
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kvkUpdateCheckDossierResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kvkUpdateCheckDossierResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="out" type="{http://www.webservices.nl/soap/}KvkUpdateReference"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kvkUpdateCheckDossierResponseType", propOrder = {

})
public class KvkUpdateCheckDossierResponseType {

    @XmlElement(required = true)
    protected KvkUpdateReference out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link KvkUpdateReference }
     *     
     */
    public KvkUpdateReference getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link KvkUpdateReference }
     *     
     */
    public void setOut(KvkUpdateReference value) {
        this.out = value;
    }

}
