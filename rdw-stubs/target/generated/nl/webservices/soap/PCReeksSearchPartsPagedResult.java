
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCReeksSearchPartsPagedResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCReeksSearchPartsPagedResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="extra" type="{http://www.webservices.nl/soap/}SearchParts"/>
 *         &lt;element name="paging" type="{http://www.webservices.nl/soap/}ResultInfo"/>
 *         &lt;element name="results" type="{http://www.webservices.nl/soap/}PCReeksArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCReeksSearchPartsPagedResult", propOrder = {

})
public class PCReeksSearchPartsPagedResult {

    @XmlElement(required = true)
    protected SearchParts extra;
    @XmlElement(required = true)
    protected ResultInfo paging;
    @XmlElement(required = true)
    protected PCReeksArray results;

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link SearchParts }
     *     
     */
    public SearchParts getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParts }
     *     
     */
    public void setExtra(SearchParts value) {
        this.extra = value;
    }

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
     *     {@link PCReeksArray }
     *     
     */
    public PCReeksArray getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCReeksArray }
     *     
     */
    public void setResults(PCReeksArray value) {
        this.results = value;
    }

}
