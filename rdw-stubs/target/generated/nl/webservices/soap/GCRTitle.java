
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRTitle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRTitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="title_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRTitle", propOrder = {

})
public class GCRTitle {

    @XmlElement(name = "title_code")
    protected int titleCode;
    @XmlElement(name = "title_text", required = true)
    protected String titleText;

    /**
     * Gets the value of the titleCode property.
     * 
     */
    public int getTitleCode() {
        return titleCode;
    }

    /**
     * Sets the value of the titleCode property.
     * 
     */
    public void setTitleCode(int value) {
        this.titleCode = value;
    }

    /**
     * Gets the value of the titleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleText() {
        return titleText;
    }

    /**
     * Sets the value of the titleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleText(String value) {
        this.titleText = value;
    }

}
