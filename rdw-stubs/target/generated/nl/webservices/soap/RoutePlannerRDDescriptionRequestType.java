
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerRDDescriptionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerRDDescriptionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="xfrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yfrom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="english" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerRDDescriptionRequestType", propOrder = {

})
public class RoutePlannerRDDescriptionRequestType {

    protected int xfrom;
    protected int yfrom;
    protected int xto;
    protected int yto;
    @XmlElement(required = true)
    protected String routetype;
    protected boolean english;

    /**
     * Gets the value of the xfrom property.
     * 
     */
    public int getXfrom() {
        return xfrom;
    }

    /**
     * Sets the value of the xfrom property.
     * 
     */
    public void setXfrom(int value) {
        this.xfrom = value;
    }

    /**
     * Gets the value of the yfrom property.
     * 
     */
    public int getYfrom() {
        return yfrom;
    }

    /**
     * Sets the value of the yfrom property.
     * 
     */
    public void setYfrom(int value) {
        this.yfrom = value;
    }

    /**
     * Gets the value of the xto property.
     * 
     */
    public int getXto() {
        return xto;
    }

    /**
     * Sets the value of the xto property.
     * 
     */
    public void setXto(int value) {
        this.xto = value;
    }

    /**
     * Gets the value of the yto property.
     * 
     */
    public int getYto() {
        return yto;
    }

    /**
     * Sets the value of the yto property.
     * 
     */
    public void setYto(int value) {
        this.yto = value;
    }

    /**
     * Gets the value of the routetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutetype() {
        return routetype;
    }

    /**
     * Sets the value of the routetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutetype(String value) {
        this.routetype = value;
    }

    /**
     * Gets the value of the english property.
     * 
     */
    public boolean isEnglish() {
        return english;
    }

    /**
     * Sets the value of the english property.
     * 
     */
    public void setEnglish(boolean value) {
        this.english = value;
    }

}
