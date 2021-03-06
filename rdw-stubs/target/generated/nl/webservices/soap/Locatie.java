
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Locatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Locatie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="locatie_binnenland" type="{http://www.webservices.nl/soap/}LocatieBinnenland" minOccurs="0"/>
 *         &lt;element name="locatie_buitenland" type="{http://www.webservices.nl/soap/}LocatieBuitenland" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locatie", propOrder = {

})
public class Locatie {

    @XmlElement(name = "locatie_binnenland")
    protected LocatieBinnenland locatieBinnenland;
    @XmlElement(name = "locatie_buitenland")
    protected LocatieBuitenland locatieBuitenland;

    /**
     * Gets the value of the locatieBinnenland property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieBinnenland }
     *     
     */
    public LocatieBinnenland getLocatieBinnenland() {
        return locatieBinnenland;
    }

    /**
     * Sets the value of the locatieBinnenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieBinnenland }
     *     
     */
    public void setLocatieBinnenland(LocatieBinnenland value) {
        this.locatieBinnenland = value;
    }

    /**
     * Gets the value of the locatieBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieBuitenland }
     *     
     */
    public LocatieBuitenland getLocatieBuitenland() {
        return locatieBuitenland;
    }

    /**
     * Sets the value of the locatieBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieBuitenland }
     *     
     */
    public void setLocatieBuitenland(LocatieBuitenland value) {
        this.locatieBuitenland = value;
    }

}
