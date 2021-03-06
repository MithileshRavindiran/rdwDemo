
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KadastraalPerceel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KadastraalPerceel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="x_coordinaat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="y_coordinaat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grootte_perceel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicatie_grootte_geschat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KadastraalPerceel", propOrder = {

})
public class KadastraalPerceel {

    @XmlElement(name = "x_coordinaat")
    protected String xCoordinaat;
    @XmlElement(name = "y_coordinaat")
    protected String yCoordinaat;
    @XmlElement(name = "grootte_perceel")
    protected String groottePerceel;
    @XmlElement(name = "indicatie_grootte_geschat")
    protected boolean indicatieGrootteGeschat;

    /**
     * Gets the value of the xCoordinaat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCoordinaat() {
        return xCoordinaat;
    }

    /**
     * Sets the value of the xCoordinaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCoordinaat(String value) {
        this.xCoordinaat = value;
    }

    /**
     * Gets the value of the yCoordinaat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYCoordinaat() {
        return yCoordinaat;
    }

    /**
     * Sets the value of the yCoordinaat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYCoordinaat(String value) {
        this.yCoordinaat = value;
    }

    /**
     * Gets the value of the groottePerceel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroottePerceel() {
        return groottePerceel;
    }

    /**
     * Sets the value of the groottePerceel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroottePerceel(String value) {
        this.groottePerceel = value;
    }

    /**
     * Gets the value of the indicatieGrootteGeschat property.
     * 
     */
    public boolean isIndicatieGrootteGeschat() {
        return indicatieGrootteGeschat;
    }

    /**
     * Sets the value of the indicatieGrootteGeschat property.
     * 
     */
    public void setIndicatieGrootteGeschat(boolean value) {
        this.indicatieGrootteGeschat = value;
    }

}
