
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBBusinessReferenceV2PagedResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBBusinessReferenceV2PagedResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="paging" type="{http://www.webservices.nl/soap/}ResultInfo"/>
 *         &lt;element name="results" type="{http://www.webservices.nl/soap/}DNBBusinessReferenceV2Array"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBBusinessReferenceV2PagedResult", propOrder = {

})
public class DNBBusinessReferenceV2PagedResult {

    @XmlElement(required = true)
    protected ResultInfo paging;
    @XmlElement(required = true)
    protected DNBBusinessReferenceV2Array results;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link ResultInfo }
     *     
     */
    public ResultInfo getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultInfo }
     *     
     */
    public void setPaging(ResultInfo value) {
        this.paging = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link DNBBusinessReferenceV2Array }
     *     
     */
    public DNBBusinessReferenceV2Array getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBBusinessReferenceV2Array }
     *     
     */
    public void setResults(DNBBusinessReferenceV2Array value) {
        this.results = value;
    }

}
