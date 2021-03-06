
package nl.webservices.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InsolvencyPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyPublication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="publication_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authority_code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="court_session" type="{http://www.webservices.nl/soap/}InsolvencyCourtSession" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyPublication", propOrder = {

})
public class InsolvencyPublication {

    @XmlElement(name = "publication_id", required = true)
    protected String publicationId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(name = "authority_code", required = true)
    protected BigInteger authorityCode;
    @XmlElement(name = "court_session")
    protected InsolvencyCourtSession courtSession;

    /**
     * Gets the value of the publicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationId() {
        return publicationId;
    }

    /**
     * Sets the value of the publicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationId(String value) {
        this.publicationId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the authorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuthorityCode() {
        return authorityCode;
    }

    /**
     * Sets the value of the authorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuthorityCode(BigInteger value) {
        this.authorityCode = value;
    }

    /**
     * Gets the value of the courtSession property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyCourtSession }
     *     
     */
    public InsolvencyCourtSession getCourtSession() {
        return courtSession;
    }

    /**
     * Sets the value of the courtSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyCourtSession }
     *     
     */
    public void setCourtSession(InsolvencyCourtSession value) {
        this.courtSession = value;
    }

}
