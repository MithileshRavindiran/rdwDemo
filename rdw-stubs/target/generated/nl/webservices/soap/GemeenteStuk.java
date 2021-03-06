
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GemeenteStuk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GemeenteStuk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="gemeentelijke_registratie_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nummer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datum_in_werking" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GemeenteStuk", propOrder = {

})
public class GemeenteStuk {

    @XmlElement(name = "gemeentelijke_registratie_id", required = true)
    protected String gemeentelijkeRegistratieId;
    @XmlElement(required = true)
    protected String nummer;
    @XmlElement(name = "datum_in_werking")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumInWerking;

    /**
     * Gets the value of the gemeentelijkeRegistratieId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemeentelijkeRegistratieId() {
        return gemeentelijkeRegistratieId;
    }

    /**
     * Sets the value of the gemeentelijkeRegistratieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemeentelijkeRegistratieId(String value) {
        this.gemeentelijkeRegistratieId = value;
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
     * Gets the value of the datumInWerking property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumInWerking() {
        return datumInWerking;
    }

    /**
     * Sets the value of the datumInWerking property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumInWerking(XMLGregorianCalendar value) {
        this.datumInWerking = value;
    }

}
