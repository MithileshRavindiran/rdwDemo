
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCReeks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCReeks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="reeksid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="huisnr_van" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="huisnr_tm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wijkcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lettercombinatie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reeksindicatie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="straatid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="straatnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="straatnaam_nen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="straatnaam_ptt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="straatnaam_extract" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PCReeks", propOrder = {

})
public class PCReeks {

    protected int reeksid;
    @XmlElement(name = "huisnr_van")
    protected int huisnrVan;
    @XmlElement(name = "huisnr_tm")
    protected int huisnrTm;
    @XmlElement(required = true)
    protected String wijkcode;
    @XmlElement(required = true)
    protected String lettercombinatie;
    @XmlElement(required = true)
    protected String reeksindicatie;
    protected int straatid;
    @XmlElement(required = true)
    protected String straatnaam;
    @XmlElement(name = "straatnaam_nen", required = true)
    protected String straatnaamNen;
    @XmlElement(name = "straatnaam_ptt", required = true)
    protected String straatnaamPtt;
    @XmlElement(name = "straatnaam_extract", required = true)
    protected String straatnaamExtract;
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
     * Gets the value of the reeksid property.
     * 
     */
    public int getReeksid() {
        return reeksid;
    }

    /**
     * Sets the value of the reeksid property.
     * 
     */
    public void setReeksid(int value) {
        this.reeksid = value;
    }

    /**
     * Gets the value of the huisnrVan property.
     * 
     */
    public int getHuisnrVan() {
        return huisnrVan;
    }

    /**
     * Sets the value of the huisnrVan property.
     * 
     */
    public void setHuisnrVan(int value) {
        this.huisnrVan = value;
    }

    /**
     * Gets the value of the huisnrTm property.
     * 
     */
    public int getHuisnrTm() {
        return huisnrTm;
    }

    /**
     * Sets the value of the huisnrTm property.
     * 
     */
    public void setHuisnrTm(int value) {
        this.huisnrTm = value;
    }

    /**
     * Gets the value of the wijkcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWijkcode() {
        return wijkcode;
    }

    /**
     * Sets the value of the wijkcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWijkcode(String value) {
        this.wijkcode = value;
    }

    /**
     * Gets the value of the lettercombinatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettercombinatie() {
        return lettercombinatie;
    }

    /**
     * Sets the value of the lettercombinatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettercombinatie(String value) {
        this.lettercombinatie = value;
    }

    /**
     * Gets the value of the reeksindicatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReeksindicatie() {
        return reeksindicatie;
    }

    /**
     * Sets the value of the reeksindicatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReeksindicatie(String value) {
        this.reeksindicatie = value;
    }

    /**
     * Gets the value of the straatid property.
     * 
     */
    public int getStraatid() {
        return straatid;
    }

    /**
     * Sets the value of the straatid property.
     * 
     */
    public void setStraatid(int value) {
        this.straatid = value;
    }

    /**
     * Gets the value of the straatnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaam() {
        return straatnaam;
    }

    /**
     * Sets the value of the straatnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaam(String value) {
        this.straatnaam = value;
    }

    /**
     * Gets the value of the straatnaamNen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaamNen() {
        return straatnaamNen;
    }

    /**
     * Sets the value of the straatnaamNen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaamNen(String value) {
        this.straatnaamNen = value;
    }

    /**
     * Gets the value of the straatnaamPtt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaamPtt() {
        return straatnaamPtt;
    }

    /**
     * Sets the value of the straatnaamPtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaamPtt(String value) {
        this.straatnaamPtt = value;
    }

    /**
     * Gets the value of the straatnaamExtract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaamExtract() {
        return straatnaamExtract;
    }

    /**
     * Sets the value of the straatnaamExtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaamExtract(String value) {
        this.straatnaamExtract = value;
    }

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
