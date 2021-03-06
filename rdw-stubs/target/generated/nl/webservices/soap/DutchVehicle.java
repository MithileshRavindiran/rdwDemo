
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchVehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="basic_data" type="{http://www.webservices.nl/soap/}DutchVehicleData"/>
 *         &lt;element name="status" type="{http://www.webservices.nl/soap/}DutchVehicleStatus" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.webservices.nl/soap/}DutchVehicleRegistration" minOccurs="0"/>
 *         &lt;element name="details" type="{http://www.webservices.nl/soap/}DutchVehicleFeature" minOccurs="0"/>
 *         &lt;element name="tax" type="{http://www.webservices.nl/soap/}DutchVehicleTaxData" minOccurs="0"/>
 *         &lt;element name="technical_weight" type="{http://www.webservices.nl/soap/}DutchVehicleTechnicalWeight" minOccurs="0"/>
 *         &lt;element name="engine" type="{http://www.webservices.nl/soap/}DutchVehicleEngine" minOccurs="0"/>
 *         &lt;element name="environmental_impact" type="{http://www.webservices.nl/soap/}DutchVehicleEnvironmentArray" minOccurs="0"/>
 *         &lt;element name="axle_information" type="{http://www.webservices.nl/soap/}DutchVehicleAxleArray" minOccurs="0"/>
 *         &lt;element name="type_approval" type="{http://www.webservices.nl/soap/}DutchVehicleTypeApproval" minOccurs="0"/>
 *         &lt;element name="body_approval" type="{http://www.webservices.nl/soap/}DutchVehicleBodyApprovalArray" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.webservices.nl/soap/}DutchVehicleRemarkArray" minOccurs="0"/>
 *         &lt;element name="recall" type="{http://www.webservices.nl/soap/}DutchVehicleRecall" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchVehicle", propOrder = {

})
public class DutchVehicle {

    @XmlElement(name = "basic_data", required = true)
    protected DutchVehicleData basicData;
    protected DutchVehicleStatus status;
    protected DutchVehicleRegistration registration;
    protected DutchVehicleFeature details;
    protected DutchVehicleTaxData tax;
    @XmlElement(name = "technical_weight")
    protected DutchVehicleTechnicalWeight technicalWeight;
    protected DutchVehicleEngine engine;
    @XmlElement(name = "environmental_impact")
    protected DutchVehicleEnvironmentArray environmentalImpact;
    @XmlElement(name = "axle_information")
    protected DutchVehicleAxleArray axleInformation;
    @XmlElement(name = "type_approval")
    protected DutchVehicleTypeApproval typeApproval;
    @XmlElement(name = "body_approval")
    protected DutchVehicleBodyApprovalArray bodyApproval;
    protected DutchVehicleRemarkArray remark;
    protected DutchVehicleRecall recall;

    /**
     * Gets the value of the basicData property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleData }
     *     
     */
    public DutchVehicleData getBasicData() {
        return basicData;
    }

    /**
     * Sets the value of the basicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleData }
     *     
     */
    public void setBasicData(DutchVehicleData value) {
        this.basicData = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleStatus }
     *     
     */
    public DutchVehicleStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleStatus }
     *     
     */
    public void setStatus(DutchVehicleStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleRegistration }
     *     
     */
    public DutchVehicleRegistration getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleRegistration }
     *     
     */
    public void setRegistration(DutchVehicleRegistration value) {
        this.registration = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleFeature }
     *     
     */
    public DutchVehicleFeature getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleFeature }
     *     
     */
    public void setDetails(DutchVehicleFeature value) {
        this.details = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleTaxData }
     *     
     */
    public DutchVehicleTaxData getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleTaxData }
     *     
     */
    public void setTax(DutchVehicleTaxData value) {
        this.tax = value;
    }

    /**
     * Gets the value of the technicalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleTechnicalWeight }
     *     
     */
    public DutchVehicleTechnicalWeight getTechnicalWeight() {
        return technicalWeight;
    }

    /**
     * Sets the value of the technicalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleTechnicalWeight }
     *     
     */
    public void setTechnicalWeight(DutchVehicleTechnicalWeight value) {
        this.technicalWeight = value;
    }

    /**
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleEngine }
     *     
     */
    public DutchVehicleEngine getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleEngine }
     *     
     */
    public void setEngine(DutchVehicleEngine value) {
        this.engine = value;
    }

    /**
     * Gets the value of the environmentalImpact property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleEnvironmentArray }
     *     
     */
    public DutchVehicleEnvironmentArray getEnvironmentalImpact() {
        return environmentalImpact;
    }

    /**
     * Sets the value of the environmentalImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleEnvironmentArray }
     *     
     */
    public void setEnvironmentalImpact(DutchVehicleEnvironmentArray value) {
        this.environmentalImpact = value;
    }

    /**
     * Gets the value of the axleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleAxleArray }
     *     
     */
    public DutchVehicleAxleArray getAxleInformation() {
        return axleInformation;
    }

    /**
     * Sets the value of the axleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleAxleArray }
     *     
     */
    public void setAxleInformation(DutchVehicleAxleArray value) {
        this.axleInformation = value;
    }

    /**
     * Gets the value of the typeApproval property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleTypeApproval }
     *     
     */
    public DutchVehicleTypeApproval getTypeApproval() {
        return typeApproval;
    }

    /**
     * Sets the value of the typeApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleTypeApproval }
     *     
     */
    public void setTypeApproval(DutchVehicleTypeApproval value) {
        this.typeApproval = value;
    }

    /**
     * Gets the value of the bodyApproval property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleBodyApprovalArray }
     *     
     */
    public DutchVehicleBodyApprovalArray getBodyApproval() {
        return bodyApproval;
    }

    /**
     * Sets the value of the bodyApproval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleBodyApprovalArray }
     *     
     */
    public void setBodyApproval(DutchVehicleBodyApprovalArray value) {
        this.bodyApproval = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleRemarkArray }
     *     
     */
    public DutchVehicleRemarkArray getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleRemarkArray }
     *     
     */
    public void setRemark(DutchVehicleRemarkArray value) {
        this.remark = value;
    }

    /**
     * Gets the value of the recall property.
     * 
     * @return
     *     possible object is
     *     {@link DutchVehicleRecall }
     *     
     */
    public DutchVehicleRecall getRecall() {
        return recall;
    }

    /**
     * Sets the value of the recall property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutchVehicleRecall }
     *     
     */
    public void setRecall(DutchVehicleRecall value) {
        this.recall = value;
    }

}
