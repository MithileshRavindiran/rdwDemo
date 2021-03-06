
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for City complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="City">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="plaatsid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="plaatsnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plaatsnaam_ptt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plaatsnaam_extract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeenteid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "City", propOrder = {

})
public class City {

    protected int plaatsid;
    @XmlElement(required = true)
    protected String plaatsnaam;
    @XmlElement(name = "plaatsnaam_ptt", required = true)
    protected String plaatsnaamPtt;
    @XmlElement(name = "plaatsnaam_extract", required = true)
    protected String plaatsnaamExtract;
    protected int gemeenteid;

    /**
     * Gets the value of the plaatsid property.
     * 
     */
    public int getPlaatsid() {
        return plaatsid;
    }

    /**
     * Sets the value of the plaatsid property.
     * 
     */
    public void setPlaatsid(int value) {
        this.plaatsid = value;
    }

    /**
     * Gets the value of the plaatsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsnaam() {
        return plaatsnaam;
    }

    /**
     * Sets the value of the plaatsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsnaam(String value) {
        this.plaatsnaam = value;
    }

    /**
     * Gets the value of the plaatsnaamPtt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsnaamPtt() {
        return plaatsnaamPtt;
    }

    /**
     * Sets the value of the plaatsnaamPtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsnaamPtt(String value) {
        this.plaatsnaamPtt = value;
    }

    /**
     * Gets the value of the plaatsnaamExtract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaatsnaamExtract() {
        return plaatsnaamExtract;
    }

    /**
     * Sets the value of the plaatsnaamExtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaatsnaamExtract(String value) {
        this.plaatsnaamExtract = value;
    }

    /**
     * Gets the value of the gemeenteid property.
     * 
     */
    public int getGemeenteid() {
        return gemeenteid;
    }

    /**
     * Sets the value of the gemeenteid property.
     * 
     */
    public void setGemeenteid(int value) {
        this.gemeenteid = value;
    }

}
