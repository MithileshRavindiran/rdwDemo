
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="standaard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pakket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="standaard_sinds_datum" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/>
 *         &lt;element name="prijs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarOption", propOrder = {

})
public class CarOption {

    protected Boolean standaard;
    protected Integer pakket;
    @XmlElement(name = "standaard_sinds_datum")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar standaardSindsDatum;
    protected Integer prijs;

    /**
     * Gets the value of the standaard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandaard() {
        return standaard;
    }

    /**
     * Sets the value of the standaard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandaard(Boolean value) {
        this.standaard = value;
    }

    /**
     * Gets the value of the pakket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPakket() {
        return pakket;
    }

    /**
     * Sets the value of the pakket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPakket(Integer value) {
        this.pakket = value;
    }

    /**
     * Gets the value of the standaardSindsDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStandaardSindsDatum() {
        return standaardSindsDatum;
    }

    /**
     * Sets the value of the standaardSindsDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStandaardSindsDatum(XMLGregorianCalendar value) {
        this.standaardSindsDatum = value;
    }

    /**
     * Gets the value of the prijs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrijs() {
        return prijs;
    }

    /**
     * Sets the value of the prijs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrijs(Integer value) {
        this.prijs = value;
    }

}
