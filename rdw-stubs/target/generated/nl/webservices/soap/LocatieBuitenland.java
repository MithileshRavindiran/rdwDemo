
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocatieBuitenland complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocatieBuitenland">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="adres_buitenland1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adres_buitenland2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adres_buitenland3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="land" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocatieBuitenland", propOrder = {

})
public class LocatieBuitenland {

    @XmlElement(name = "adres_buitenland1")
    protected String adresBuitenland1;
    @XmlElement(name = "adres_buitenland2")
    protected String adresBuitenland2;
    @XmlElement(name = "adres_buitenland3")
    protected String adresBuitenland3;
    protected String land;

    /**
     * Gets the value of the adresBuitenland1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresBuitenland1() {
        return adresBuitenland1;
    }

    /**
     * Sets the value of the adresBuitenland1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresBuitenland1(String value) {
        this.adresBuitenland1 = value;
    }

    /**
     * Gets the value of the adresBuitenland2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresBuitenland2() {
        return adresBuitenland2;
    }

    /**
     * Sets the value of the adresBuitenland2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresBuitenland2(String value) {
        this.adresBuitenland2 = value;
    }

    /**
     * Gets the value of the adresBuitenland3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresBuitenland3() {
        return adresBuitenland3;
    }

    /**
     * Sets the value of the adresBuitenland3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresBuitenland3(String value) {
        this.adresBuitenland3 = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLand(String value) {
        this.land = value;
    }

}
