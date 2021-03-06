
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterLocatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterLocatie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="locatie_binnenland" type="{http://www.webservices.nl/soap/}kadasterLocatieBinnenland" minOccurs="0"/>
 *         &lt;element name="locatie_buitenland" type="{http://www.webservices.nl/soap/}kadasterLocatieBuitenland" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterLocatie", propOrder = {

})
public class KadasterLocatie {

    @XmlElement(name = "locatie_binnenland")
    protected KadasterLocatieBinnenland locatieBinnenland;
    @XmlElement(name = "locatie_buitenland")
    protected KadasterLocatieBuitenland locatieBuitenland;

    /**
     * Gets the value of the locatieBinnenland property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterLocatieBinnenland }
     *     
     */
    public KadasterLocatieBinnenland getLocatieBinnenland() {
        return locatieBinnenland;
    }

    /**
     * Sets the value of the locatieBinnenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterLocatieBinnenland }
     *     
     */
    public void setLocatieBinnenland(KadasterLocatieBinnenland value) {
        this.locatieBinnenland = value;
    }

    /**
     * Gets the value of the locatieBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link KadasterLocatieBuitenland }
     *     
     */
    public KadasterLocatieBuitenland getLocatieBuitenland() {
        return locatieBuitenland;
    }

    /**
     * Sets the value of the locatieBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadasterLocatieBuitenland }
     *     
     */
    public void setLocatieBuitenland(KadasterLocatieBuitenland value) {
        this.locatieBuitenland = value;
    }

}
