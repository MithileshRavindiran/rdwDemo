
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PRBeperkingLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRBeperkingLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pr_beperkingen" type="{http://www.webservices.nl/soap/}PRBeperkingArray"/>
 *         &lt;element name="indicatie_compleet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRBeperkingLijst", propOrder = {

})
public class PRBeperkingLijst {

    @XmlElement(name = "pr_beperkingen", required = true)
    protected PRBeperkingArray prBeperkingen;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the prBeperkingen property.
     * 
     * @return
     *     possible object is
     *     {@link PRBeperkingArray }
     *     
     */
    public PRBeperkingArray getPrBeperkingen() {
        return prBeperkingen;
    }

    /**
     * Sets the value of the prBeperkingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRBeperkingArray }
     *     
     */
    public void setPrBeperkingen(PRBeperkingArray value) {
        this.prBeperkingen = value;
    }

    /**
     * Gets the value of the indicatieCompleet property.
     * 
     */
    public boolean isIndicatieCompleet() {
        return indicatieCompleet;
    }

    /**
     * Sets the value of the indicatieCompleet property.
     * 
     */
    public void setIndicatieCompleet(boolean value) {
        this.indicatieCompleet = value;
    }

}
