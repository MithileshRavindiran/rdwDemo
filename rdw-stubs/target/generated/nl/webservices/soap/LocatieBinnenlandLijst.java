
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocatieBinnenlandLijst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocatieBinnenlandLijst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="locaties_binnenland" type="{http://www.webservices.nl/soap/}LocatieBinnenlandArray"/>
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
@XmlType(name = "LocatieBinnenlandLijst", propOrder = {

})
public class LocatieBinnenlandLijst {

    @XmlElement(name = "locaties_binnenland", required = true)
    protected LocatieBinnenlandArray locatiesBinnenland;
    @XmlElement(name = "indicatie_compleet")
    protected boolean indicatieCompleet;

    /**
     * Gets the value of the locatiesBinnenland property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieBinnenlandArray }
     *     
     */
    public LocatieBinnenlandArray getLocatiesBinnenland() {
        return locatiesBinnenland;
    }

    /**
     * Sets the value of the locatiesBinnenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieBinnenlandArray }
     *     
     */
    public void setLocatiesBinnenland(LocatieBinnenlandArray value) {
        this.locatiesBinnenland = value;
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
