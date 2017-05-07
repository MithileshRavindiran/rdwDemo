
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchBusinessExtractChangeForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchBusinessExtractChangeForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="change_set" type="{http://www.webservices.nl/soap/}DutchBusinessExtractChangeSet"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchBusinessExtractChangeForecast", propOrder = {

})
public class DutchBusinessExtractChangeForecast {

    @XmlElement(name = "change_set", required = true)
    protected DutchBusinessExtractChangeSet changeSet;

    /**
     * Gets the value of the changeSet property.
     * 
     * @return
     *     possible object is
     *     {@link DutchBusinessExtractChangeSet }
     *     
     */
    public DutchBusinessExtractChangeSet getChangeSet() {
        return changeSet;
    }

    /**
     * Sets the value of the changeSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchBusinessExtractChangeSet }
     *     
     */
    public void setChangeSet(DutchBusinessExtractChangeSet value) {
        this.changeSet = value;
    }

}
