
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortedPostcodePagedResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortedPostcodePagedResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="paging" type="{http://www.webservices.nl/soap/}ResultInfo"/>
 *         &lt;element name="results" type="{http://www.webservices.nl/soap/}SortedPostcodeArray"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortedPostcodePagedResult", propOrder = {

})
public class SortedPostcodePagedResult {

    @XmlElement(required = true)
    protected ResultInfo paging;
    @XmlElement(required = true)
    protected SortedPostcodeArray results;

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
     *     {@link SortedPostcodeArray }
     *     
     */
    public SortedPostcodeArray getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedPostcodeArray }
     *     
     */
    public void setResults(SortedPostcodeArray value) {
        this.results = value;
    }

}
