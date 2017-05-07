
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for areaCodeToNeighborhoodcodeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="areaCodeToNeighborhoodcodeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="areacode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaCodeToNeighborhoodcodeRequestType", propOrder = {

})
public class AreaCodeToNeighborhoodcodeRequestType {

    @XmlElement(required = true)
    protected String areacode;
    protected int page;

    /**
     * Gets the value of the areacode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * Sets the value of the areacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreacode(String value) {
        this.areacode = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
