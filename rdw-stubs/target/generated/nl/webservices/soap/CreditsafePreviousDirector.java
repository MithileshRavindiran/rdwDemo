
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditsafePreviousDirector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditsafePreviousDirector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="director" type="{http://www.webservices.nl/soap/}CreditsafeDirector"/>
 *         &lt;element name="resignation_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditsafePreviousDirector", propOrder = {

})
public class CreditsafePreviousDirector {

    @XmlElement(required = true)
    protected CreditsafeDirector director;
    @XmlElement(name = "resignation_date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resignationDate;

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link CreditsafeDirector }
     *     
     */
    public CreditsafeDirector getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditsafeDirector }
     *     
     */
    public void setDirector(CreditsafeDirector value) {
        this.director = value;
    }

    /**
     * Gets the value of the resignationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResignationDate() {
        return resignationDate;
    }

    /**
     * Sets the value of the resignationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResignationDate(XMLGregorianCalendar value) {
        this.resignationDate = value;
    }

}
