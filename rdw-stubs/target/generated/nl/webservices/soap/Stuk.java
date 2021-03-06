
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Stuk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stuk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aanduiding_soort_register" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum_aanbieding" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stuk", propOrder = {

})
public class Stuk {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "aanduiding_soort_register", required = true)
    protected String aanduidingSoortRegister;
    @XmlElement(required = true)
    protected String deel;
    @XmlElement(required = true)
    protected String nummer;
    protected String reeks;
    @XmlElement(name = "datum_aanbieding")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAanbieding;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the aanduidingSoortRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanduidingSoortRegister() {
        return aanduidingSoortRegister;
    }

    /**
     * Sets the value of the aanduidingSoortRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanduidingSoortRegister(String value) {
        this.aanduidingSoortRegister = value;
    }

    /**
     * Gets the value of the deel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeel() {
        return deel;
    }

    /**
     * Sets the value of the deel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeel(String value) {
        this.deel = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Gets the value of the reeks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReeks() {
        return reeks;
    }

    /**
     * Sets the value of the reeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReeks(String value) {
        this.reeks = value;
    }

    /**
     * Gets the value of the datumAanbieding property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumAanbieding() {
        return datumAanbieding;
    }

    /**
     * Sets the value of the datumAanbieding property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumAanbieding(XMLGregorianCalendar value) {
        this.datumAanbieding = value;
    }

}
