
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kadasterGerelateerdStukdeel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kadasterGerelateerdStukdeel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="aard_stukdeel_omschrijving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stuk" type="{http://www.webservices.nl/soap/}Stuk" minOccurs="0"/>
 *         &lt;element name="gefiatteerd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kadasterGerelateerdStukdeel", propOrder = {

})
public class KadasterGerelateerdStukdeel {

    @XmlElement(name = "aard_stukdeel_omschrijving", required = true)
    protected String aardStukdeelOmschrijving;
    protected Stuk stuk;
    protected Boolean gefiatteerd;

    /**
     * Gets the value of the aardStukdeelOmschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAardStukdeelOmschrijving() {
        return aardStukdeelOmschrijving;
    }

    /**
     * Sets the value of the aardStukdeelOmschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAardStukdeelOmschrijving(String value) {
        this.aardStukdeelOmschrijving = value;
    }

    /**
     * Gets the value of the stuk property.
     * 
     * @return
     *     possible object is
     *     {@link Stuk }
     *     
     */
    public Stuk getStuk() {
        return stuk;
    }

    /**
     * Sets the value of the stuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stuk }
     *     
     */
    public void setStuk(Stuk value) {
        this.stuk = value;
    }

    /**
     * Gets the value of the gefiatteerd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGefiatteerd() {
        return gefiatteerd;
    }

    /**
     * Sets the value of the gefiatteerd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGefiatteerd(Boolean value) {
        this.gefiatteerd = value;
    }

}
