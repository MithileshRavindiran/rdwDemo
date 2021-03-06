
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaMethodDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaMethodDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="service_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentation_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="input_elements" type="{http://www.webservices.nl/soap/}MetaElementDefinitionArray" minOccurs="0"/>
 *         &lt;element name="output_elements" type="{http://www.webservices.nl/soap/}MetaElementDefinitionArray" minOccurs="0"/>
 *         &lt;element name="related_methods" type="{http://www.webservices.nl/soap/}MetaMethodReferenceArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaMethodDefinition", propOrder = {

})
public class MetaMethodDefinition {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "service_name", required = true)
    protected String serviceName;
    protected boolean deprecated;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String documentation;
    @XmlElement(name = "documentation_url", required = true)
    protected String documentationUrl;
    @XmlElement(name = "input_elements")
    protected MetaElementDefinitionArray inputElements;
    @XmlElement(name = "output_elements")
    protected MetaElementDefinitionArray outputElements;
    @XmlElement(name = "related_methods")
    protected MetaMethodReferenceArray relatedMethods;

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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     */
    public boolean isDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     */
    public void setDeprecated(boolean value) {
        this.deprecated = value;
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
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentation(String value) {
        this.documentation = value;
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
     * Gets the value of the inputElements property.
     * 
     * @return
     *     possible object is
     *     {@link MetaElementDefinitionArray }
     *     
     */
    public MetaElementDefinitionArray getInputElements() {
        return inputElements;
    }

    /**
     * Sets the value of the inputElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaElementDefinitionArray }
     *     
     */
    public void setInputElements(MetaElementDefinitionArray value) {
        this.inputElements = value;
    }

    /**
     * Gets the value of the outputElements property.
     * 
     * @return
     *     possible object is
     *     {@link MetaElementDefinitionArray }
     *     
     */
    public MetaElementDefinitionArray getOutputElements() {
        return outputElements;
    }

    /**
     * Sets the value of the outputElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaElementDefinitionArray }
     *     
     */
    public void setOutputElements(MetaElementDefinitionArray value) {
        this.outputElements = value;
    }

    /**
     * Gets the value of the relatedMethods property.
     * 
     * @return
     *     possible object is
     *     {@link MetaMethodReferenceArray }
     *     
     */
    public MetaMethodReferenceArray getRelatedMethods() {
        return relatedMethods;
    }

    /**
     * Sets the value of the relatedMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaMethodReferenceArray }
     *     
     */
    public void setRelatedMethods(MetaMethodReferenceArray value) {
        this.relatedMethods = value;
    }

}
