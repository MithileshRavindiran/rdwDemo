
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRPersonalDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRPersonalDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="gender_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titles" type="{http://www.webservices.nl/soap/}GCRTitleArray" minOccurs="0"/>
 *         &lt;element name="initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefixes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRPersonalDetails", propOrder = {

})
public class GCRPersonalDetails {

    @XmlElement(name = "gender_code")
    protected String genderCode;
    @XmlElement(name = "gender_text")
    protected String genderText;
    protected GCRTitleArray titles;
    protected String initials;
    protected String prefixes;
    protected String name;

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the genderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderText() {
        return genderText;
    }

    /**
     * Sets the value of the genderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderText(String value) {
        this.genderText = value;
    }

    /**
     * Gets the value of the titles property.
     * 
     * @return
     *     possible object is
     *     {@link GCRTitleArray }
     *     
     */
    public GCRTitleArray getTitles() {
        return titles;
    }

    /**
     * Sets the value of the titles property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRTitleArray }
     *     
     */
    public void setTitles(GCRTitleArray value) {
        this.titles = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the prefixes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixes() {
        return prefixes;
    }

    /**
     * Sets the value of the prefixes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixes(String value) {
        this.prefixes = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
