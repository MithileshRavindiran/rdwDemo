
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutchAddressPostcodeRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutchAddressPostcodeRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="house_number_from" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="house_number_to" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="neighborhood_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letter_combination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="range_indication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="street_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="street_name_nen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="municipality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="municipality_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cebuco_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="province_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutchAddressPostcodeRange", propOrder = {

})
public class DutchAddressPostcodeRange {

    @XmlElement(name = "house_number_from")
    protected int houseNumberFrom;
    @XmlElement(name = "house_number_to")
    protected int houseNumberTo;
    @XmlElement(name = "neighborhood_code", required = true)
    protected String neighborhoodCode;
    @XmlElement(name = "letter_combination", required = true)
    protected String letterCombination;
    @XmlElement(name = "range_indication", required = true)
    protected String rangeIndication;
    @XmlElement(name = "street_name", required = true)
    protected String streetName;
    @XmlElement(name = "street_name_nen", required = true)
    protected String streetNameNen;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String municipality;
    @XmlElement(name = "municipality_code")
    protected int municipalityCode;
    @XmlElement(name = "cebuco_code")
    protected int cebucoCode;
    @XmlElement(required = true)
    protected String province;
    @XmlElement(name = "province_code", required = true)
    protected String provinceCode;

    /**
     * Gets the value of the houseNumberFrom property.
     * 
     */
    public int getHouseNumberFrom() {
        return houseNumberFrom;
    }

    /**
     * Sets the value of the houseNumberFrom property.
     * 
     */
    public void setHouseNumberFrom(int value) {
        this.houseNumberFrom = value;
    }

    /**
     * Gets the value of the houseNumberTo property.
     * 
     */
    public int getHouseNumberTo() {
        return houseNumberTo;
    }

    /**
     * Sets the value of the houseNumberTo property.
     * 
     */
    public void setHouseNumberTo(int value) {
        this.houseNumberTo = value;
    }

    /**
     * Gets the value of the neighborhoodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborhoodCode() {
        return neighborhoodCode;
    }

    /**
     * Sets the value of the neighborhoodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborhoodCode(String value) {
        this.neighborhoodCode = value;
    }

    /**
     * Gets the value of the letterCombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterCombination() {
        return letterCombination;
    }

    /**
     * Sets the value of the letterCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterCombination(String value) {
        this.letterCombination = value;
    }

    /**
     * Gets the value of the rangeIndication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeIndication() {
        return rangeIndication;
    }

    /**
     * Sets the value of the rangeIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeIndication(String value) {
        this.rangeIndication = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetNameNen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNameNen() {
        return streetNameNen;
    }

    /**
     * Sets the value of the streetNameNen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNameNen(String value) {
        this.streetNameNen = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the municipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipality(String value) {
        this.municipality = value;
    }

    /**
     * Gets the value of the municipalityCode property.
     * 
     */
    public int getMunicipalityCode() {
        return municipalityCode;
    }

    /**
     * Sets the value of the municipalityCode property.
     * 
     */
    public void setMunicipalityCode(int value) {
        this.municipalityCode = value;
    }

    /**
     * Gets the value of the cebucoCode property.
     * 
     */
    public int getCebucoCode() {
        return cebucoCode;
    }

    /**
     * Sets the value of the cebucoCode property.
     * 
     */
    public void setCebucoCode(int value) {
        this.cebucoCode = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceCode(String value) {
        this.provinceCode = value;
    }

}
