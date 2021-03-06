
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchParts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="huisnr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="toevoeging" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wijkcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lettercombinatie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="straat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gemeente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provincie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reeksindicatie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParts", propOrder = {

})
public class SearchParts {

    protected int huisnr;
    @XmlElement(required = true)
    protected String toevoeging;
    @XmlElement(required = true)
    protected String wijkcode;
    @XmlElement(required = true)
    protected String lettercombinatie;
    @XmlElement(required = true)
    protected String straat;
    @XmlElement(required = true)
    protected String plaats;
    @XmlElement(required = true)
    protected String gemeente;
    @XmlElement(required = true)
    protected String provincie;
    @XmlElement(required = true)
    protected String reeksindicatie;

    /**
     * Gets the value of the huisnr property.
     * 
     */
    public int getHuisnr() {
        return huisnr;
    }

    /**
     * Sets the value of the huisnr property.
     * 
     */
    public void setHuisnr(int value) {
        this.huisnr = value;
    }

    /**
     * Gets the value of the toevoeging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToevoeging() {
        return toevoeging;
    }

    /**
     * Sets the value of the toevoeging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToevoeging(String value) {
        this.toevoeging = value;
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
     * Gets the value of the straat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraat() {
        return straat;
    }

    /**
     * Sets the value of the straat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraat(String value) {
        this.straat = value;
    }

    /**
     * Gets the value of the plaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaats() {
        return plaats;
    }

    /**
     * Sets the value of the plaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaats(String value) {
        this.plaats = value;
    }

    /**
     * Gets the value of the gemeente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeente() {
        return gemeente;
    }

    /**
     * Sets the value of the gemeente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeente(String value) {
        this.gemeente = value;
    }

    /**
     * Gets the value of the provincie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincie() {
        return provincie;
    }

    /**
     * Sets the value of the provincie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincie(String value) {
        this.provincie = value;
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

}
