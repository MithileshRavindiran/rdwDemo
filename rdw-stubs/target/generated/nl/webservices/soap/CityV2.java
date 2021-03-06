
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="plaatsid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="plaatsnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plaatsnaam_ptt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plaatsnaam_extract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeenteid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gemeentenaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeentecode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cebucocode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="provinciecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provincienaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityV2", propOrder = {

})
public class CityV2 {

    protected int plaatsid;
    @XmlElement(required = true)
    protected String plaatsnaam;
    @XmlElement(name = "plaatsnaam_ptt", required = true)
    protected String plaatsnaamPtt;
    @XmlElement(name = "plaatsnaam_extract", required = true)
    protected String plaatsnaamExtract;
    protected int gemeenteid;
    @XmlElement(required = true)
    protected String gemeentenaam;
    protected int gemeentecode;
    protected int cebucocode;
    @XmlElement(required = true)
    protected String provinciecode;
    @XmlElement(required = true)
    protected String provincienaam;

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

    /**
     * Gets the value of the gemeentenaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeentenaam() {
        return gemeentenaam;
    }

    /**
     * Sets the value of the gemeentenaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeentenaam(String value) {
        this.gemeentenaam = value;
    }

    /**
     * Gets the value of the gemeentecode property.
     * 
     */
    public int getGemeentecode() {
        return gemeentecode;
    }

    /**
     * Sets the value of the gemeentecode property.
     * 
     */
    public void setGemeentecode(int value) {
        this.gemeentecode = value;
    }

    /**
     * Gets the value of the cebucocode property.
     * 
     */
    public int getCebucocode() {
        return cebucocode;
    }

    /**
     * Sets the value of the cebucocode property.
     * 
     */
    public void setCebucocode(int value) {
        this.cebucocode = value;
    }

    /**
     * Gets the value of the provinciecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciecode() {
        return provinciecode;
    }

    /**
     * Sets the value of the provinciecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciecode(String value) {
        this.provinciecode = value;
    }

    /**
     * Gets the value of the provincienaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincienaam() {
        return provincienaam;
    }

    /**
     * Sets the value of the provincienaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincienaam(String value) {
        this.provincienaam = value;
    }

}
