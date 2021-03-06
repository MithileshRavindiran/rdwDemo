
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePlannerGetRouteRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePlannerGetRouteRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="start_postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_house_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="start_house_number_addition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination_postcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination_house_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="destination_house_number_addition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination_street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination_city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination_country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="route_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePlannerGetRouteRequestType", propOrder = {

})
public class RoutePlannerGetRouteRequestType {

    @XmlElement(name = "start_postcode", required = true)
    protected String startPostcode;
    @XmlElement(name = "start_house_number")
    protected int startHouseNumber;
    @XmlElement(name = "start_house_number_addition", required = true)
    protected String startHouseNumberAddition;
    @XmlElement(name = "start_street", required = true)
    protected String startStreet;
    @XmlElement(name = "start_city", required = true)
    protected String startCity;
    @XmlElement(name = "start_country", required = true)
    protected String startCountry;
    @XmlElement(name = "destination_postcode", required = true)
    protected String destinationPostcode;
    @XmlElement(name = "destination_house_number")
    protected int destinationHouseNumber;
    @XmlElement(name = "destination_house_number_addition", required = true)
    protected String destinationHouseNumberAddition;
    @XmlElement(name = "destination_street", required = true)
    protected String destinationStreet;
    @XmlElement(name = "destination_city", required = true)
    protected String destinationCity;
    @XmlElement(name = "destination_country", required = true)
    protected String destinationCountry;
    @XmlElement(name = "route_type", required = true)
    protected String routeType;
    @XmlElement(required = true)
    protected String language;

    /**
     * Gets the value of the startPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPostcode() {
        return startPostcode;
    }

    /**
     * Sets the value of the startPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPostcode(String value) {
        this.startPostcode = value;
    }

    /**
     * Gets the value of the startHouseNumber property.
     * 
     */
    public int getStartHouseNumber() {
        return startHouseNumber;
    }

    /**
     * Sets the value of the startHouseNumber property.
     * 
     */
    public void setStartHouseNumber(int value) {
        this.startHouseNumber = value;
    }

    /**
     * Gets the value of the startHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartHouseNumberAddition() {
        return startHouseNumberAddition;
    }

    /**
     * Sets the value of the startHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartHouseNumberAddition(String value) {
        this.startHouseNumberAddition = value;
    }

    /**
     * Gets the value of the startStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStreet() {
        return startStreet;
    }

    /**
     * Sets the value of the startStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStreet(String value) {
        this.startStreet = value;
    }

    /**
     * Gets the value of the startCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * Sets the value of the startCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartCity(String value) {
        this.startCity = value;
    }

    /**
     * Gets the value of the startCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartCountry() {
        return startCountry;
    }

    /**
     * Sets the value of the startCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartCountry(String value) {
        this.startCountry = value;
    }

    /**
     * Gets the value of the destinationPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPostcode() {
        return destinationPostcode;
    }

    /**
     * Sets the value of the destinationPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPostcode(String value) {
        this.destinationPostcode = value;
    }

    /**
     * Gets the value of the destinationHouseNumber property.
     * 
     */
    public int getDestinationHouseNumber() {
        return destinationHouseNumber;
    }

    /**
     * Sets the value of the destinationHouseNumber property.
     * 
     */
    public void setDestinationHouseNumber(int value) {
        this.destinationHouseNumber = value;
    }

    /**
     * Gets the value of the destinationHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationHouseNumberAddition() {
        return destinationHouseNumberAddition;
    }

    /**
     * Sets the value of the destinationHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationHouseNumberAddition(String value) {
        this.destinationHouseNumberAddition = value;
    }

    /**
     * Gets the value of the destinationStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStreet() {
        return destinationStreet;
    }

    /**
     * Sets the value of the destinationStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStreet(String value) {
        this.destinationStreet = value;
    }

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the routeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteType(String value) {
        this.routeType = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
