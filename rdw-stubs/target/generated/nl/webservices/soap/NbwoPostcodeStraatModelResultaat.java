
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NbwoPostcodeStraatModelResultaat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NbwoPostcodeStraatModelResultaat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="waarde" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aantal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standaard_deviatie" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="straat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datum_van" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="waardeverdelingen" type="{http://www.webservices.nl/soap/}NbwoWaardeVerdelingArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NbwoPostcodeStraatModelResultaat", propOrder = {

})
public class NbwoPostcodeStraatModelResultaat {

    protected int waarde;
    protected int aantal;
    @XmlElement(name = "standaard_deviatie")
    protected double standaardDeviatie;
    @XmlElement(required = true)
    protected String straat;
    @XmlElement(required = true)
    protected String plaats;
    @XmlElement(name = "datum_van", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVan;
    protected NbwoWaardeVerdelingArray waardeverdelingen;

    /**
     * Gets the value of the waarde property.
     * 
     */
    public int getWaarde() {
        return waarde;
    }

    /**
     * Sets the value of the waarde property.
     * 
     */
    public void setWaarde(int value) {
        this.waarde = value;
    }

    /**
     * Gets the value of the aantal property.
     * 
     */
    public int getAantal() {
        return aantal;
    }

    /**
     * Sets the value of the aantal property.
     * 
     */
    public void setAantal(int value) {
        this.aantal = value;
    }

    /**
     * Gets the value of the standaardDeviatie property.
     * 
     */
    public double getStandaardDeviatie() {
        return standaardDeviatie;
    }

    /**
     * Sets the value of the standaardDeviatie property.
     * 
     */
    public void setStandaardDeviatie(double value) {
        this.standaardDeviatie = value;
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
     * Gets the value of the datumVan property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVan() {
        return datumVan;
    }

    /**
     * Sets the value of the datumVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVan(XMLGregorianCalendar value) {
        this.datumVan = value;
    }

    /**
     * Gets the value of the waardeverdelingen property.
     * 
     * @return
     *     possible object is
     *     {@link NbwoWaardeVerdelingArray }
     *     
     */
    public NbwoWaardeVerdelingArray getWaardeverdelingen() {
        return waardeverdelingen;
    }

    /**
     * Sets the value of the waardeverdelingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link NbwoWaardeVerdelingArray }
     *     
     */
    public void setWaardeverdelingen(NbwoWaardeVerdelingArray value) {
        this.waardeverdelingen = value;
    }

}
