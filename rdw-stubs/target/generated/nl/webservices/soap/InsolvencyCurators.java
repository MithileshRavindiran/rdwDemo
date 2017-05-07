
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsolvencyCurators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyCurators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="curator" type="{http://www.webservices.nl/soap/}InsolvencyLegalPerformingPersonArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyCurators", propOrder = {

})
public class InsolvencyCurators {

    @XmlElement(required = true)
    protected InsolvencyLegalPerformingPersonArray curator;

    /**
     * Gets the value of the curator property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyLegalPerformingPersonArray }
     *     
     */
    public InsolvencyLegalPerformingPersonArray getCurator() {
        return curator;
    }

    /**
     * Sets the value of the curator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyLegalPerformingPersonArray }
     *     
     */
    public void setCurator(InsolvencyLegalPerformingPersonArray value) {
        this.curator = value;
    }

}
