
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaServiceDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaServiceDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentation_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="methods" type="{http://www.webservices.nl/soap/}MetaMethodReferenceArray" minOccurs="0"/>
 *         &lt;element name="protocols" type="{http://www.webservices.nl/soap/}MetaProtocolDefinitionArray" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaServiceDefinition", propOrder = {

})
public class MetaServiceDefinition {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "documentation_url", required = true)
    protected String documentationUrl;
    protected MetaMethodReferenceArray methods;
    protected MetaProtocolDefinitionArray protocols;
    protected String status;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the documentationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    /**
     * Sets the value of the documentationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentationUrl(String value) {
        this.documentationUrl = value;
    }

    /**
     * Gets the value of the methods property.
     * 
     * @return
     *     possible object is
     *     {@link MetaMethodReferenceArray }
     *     
     */
    public MetaMethodReferenceArray getMethods() {
        return methods;
    }

    /**
     * Sets the value of the methods property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaMethodReferenceArray }
     *     
     */
    public void setMethods(MetaMethodReferenceArray value) {
        this.methods = value;
    }

    /**
     * Gets the value of the protocols property.
     * 
     * @return
     *     possible object is
     *     {@link MetaProtocolDefinitionArray }
     *     
     */
    public MetaProtocolDefinitionArray getProtocols() {
        return protocols;
    }

    /**
     * Sets the value of the protocols property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaProtocolDefinitionArray }
     *     
     */
    public void setProtocols(MetaProtocolDefinitionArray value) {
        this.protocols = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
