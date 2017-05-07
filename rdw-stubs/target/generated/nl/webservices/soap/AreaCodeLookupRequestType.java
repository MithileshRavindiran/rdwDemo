
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for areaCodeLookupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="areaCodeLookupRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="neighborhoodcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "areaCodeLookupRequestType", propOrder = {

})
public class AreaCodeLookupRequestType {

    @XmlElement(required = true)
    protected String neighborhoodcode;
    protected int page;

    /**
     * Gets the value of the neighborhoodcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborhoodcode() {
        return neighborhoodcode;
    }

    /**
     * Sets the value of the neighborhoodcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborhoodcode(String value) {
        this.neighborhoodcode = value;
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
