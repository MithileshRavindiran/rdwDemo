
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BerichtObjectDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerichtObjectDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="datum_bijgewerkt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="object_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kadastrale_aanduiding" type="{http://www.webservices.nl/soap/}KadastraleAanduiding"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locaties" type="{http://www.webservices.nl/soap/}LocatieBinnenlandLijst" minOccurs="0"/>
 *         &lt;element name="document" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="afbeeldingen" type="{http://www.webservices.nl/soap/}base64BinaryArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtObjectDocument", propOrder = {

})
public class BerichtObjectDocument {

    @XmlElement(name = "datum_bijgewerkt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumBijgewerkt;
    @XmlElement(name = "object_id")
    protected String objectId;
    @XmlElement(name = "kadastrale_aanduiding", required = true)
    protected KadastraleAanduiding kadastraleAanduiding;
    protected String omschrijving;
    protected LocatieBinnenlandLijst locaties;
    @XmlElement(required = true)
    protected byte[] document;
    protected Base64BinaryArray afbeeldingen;

    /**
     * Gets the value of the datumBijgewerkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumBijgewerkt() {
        return datumBijgewerkt;
    }

    /**
     * Sets the value of the datumBijgewerkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumBijgewerkt(XMLGregorianCalendar value) {
        this.datumBijgewerkt = value;
    }

    /**
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the kadastraleAanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public KadastraleAanduiding getKadastraleAanduiding() {
        return kadastraleAanduiding;
    }

    /**
     * Sets the value of the kadastraleAanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link KadastraleAanduiding }
     *     
     */
    public void setKadastraleAanduiding(KadastraleAanduiding value) {
        this.kadastraleAanduiding = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

    /**
     * Gets the value of the locaties property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieBinnenlandLijst }
     *     
     */
    public LocatieBinnenlandLijst getLocaties() {
        return locaties;
    }

    /**
     * Sets the value of the locaties property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieBinnenlandLijst }
     *     
     */
    public void setLocaties(LocatieBinnenlandLijst value) {
        this.locaties = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocument(byte[] value) {
        this.document = ((byte[]) value);
    }

    /**
     * Gets the value of the afbeeldingen property.
     * 
     * @return
     *     possible object is
     *     {@link Base64BinaryArray }
     *     
     */
    public Base64BinaryArray getAfbeeldingen() {
        return afbeeldingen;
    }

    /**
     * Sets the value of the afbeeldingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64BinaryArray }
     *     
     */
    public void setAfbeeldingen(Base64BinaryArray value) {
        this.afbeeldingen = value;
    }

}
