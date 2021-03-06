
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRImportExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRImportExport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="import_countries" type="{http://www.webservices.nl/soap/}GCRCountryArray" minOccurs="0"/>
 *         &lt;element name="export_countries" type="{http://www.webservices.nl/soap/}GCRCountryArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRImportExport", propOrder = {

})
public class GCRImportExport {

    @XmlElement(name = "import_countries")
    protected GCRCountryArray importCountries;
    @XmlElement(name = "export_countries")
    protected GCRCountryArray exportCountries;

    /**
     * Gets the value of the importCountries property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCountryArray }
     *     
     */
    public GCRCountryArray getImportCountries() {
        return importCountries;
    }

    /**
     * Sets the value of the importCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCountryArray }
     *     
     */
    public void setImportCountries(GCRCountryArray value) {
        this.importCountries = value;
    }

    /**
     * Gets the value of the exportCountries property.
     * 
     * @return
     *     possible object is
     *     {@link GCRCountryArray }
     *     
     */
    public GCRCountryArray getExportCountries() {
        return exportCountries;
    }

    /**
     * Sets the value of the exportCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRCountryArray }
     *     
     */
    public void setExportCountries(GCRCountryArray value) {
        this.exportCountries = value;
    }

}
