
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCRCreditRating complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GCRCreditRating">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="y_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pd_rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pd_percentage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="erc_score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_flag_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credit_flag_text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ratings" type="{http://www.webservices.nl/soap/}GCRRatingArray" minOccurs="0"/>
 *         &lt;element name="y_rating_history" type="{http://www.webservices.nl/soap/}GCRRatingHistoryArray" minOccurs="0"/>
 *         &lt;element name="pd_rating_history" type="{http://www.webservices.nl/soap/}GCRRatingHistoryArray" minOccurs="0"/>
 *         &lt;element name="pd_percentage_history" type="{http://www.webservices.nl/soap/}GCRPercentageHistoryArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GCRCreditRating", propOrder = {

})
public class GCRCreditRating {

    @XmlElement(name = "y_rating")
    protected String yRating;
    @XmlElement(name = "pd_rating")
    protected String pdRating;
    @XmlElement(name = "pd_percentage")
    protected Float pdPercentage;
    @XmlElement(name = "erc_score")
    protected String ercScore;
    @XmlElement(name = "credit_flag_code")
    protected String creditFlagCode;
    @XmlElement(name = "credit_flag_text")
    protected String creditFlagText;
    protected GCRRatingArray ratings;
    @XmlElement(name = "y_rating_history")
    protected GCRRatingHistoryArray yRatingHistory;
    @XmlElement(name = "pd_rating_history")
    protected GCRRatingHistoryArray pdRatingHistory;
    @XmlElement(name = "pd_percentage_history")
    protected GCRPercentageHistoryArray pdPercentageHistory;

    /**
     * Gets the value of the yRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYRating() {
        return yRating;
    }

    /**
     * Sets the value of the yRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYRating(String value) {
        this.yRating = value;
    }

    /**
     * Gets the value of the pdRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdRating() {
        return pdRating;
    }

    /**
     * Sets the value of the pdRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdRating(String value) {
        this.pdRating = value;
    }

    /**
     * Gets the value of the pdPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPdPercentage() {
        return pdPercentage;
    }

    /**
     * Sets the value of the pdPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPdPercentage(Float value) {
        this.pdPercentage = value;
    }

    /**
     * Gets the value of the ercScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErcScore() {
        return ercScore;
    }

    /**
     * Sets the value of the ercScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErcScore(String value) {
        this.ercScore = value;
    }

    /**
     * Gets the value of the creditFlagCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFlagCode() {
        return creditFlagCode;
    }

    /**
     * Sets the value of the creditFlagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFlagCode(String value) {
        this.creditFlagCode = value;
    }

    /**
     * Gets the value of the creditFlagText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditFlagText() {
        return creditFlagText;
    }

    /**
     * Sets the value of the creditFlagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditFlagText(String value) {
        this.creditFlagText = value;
    }

    /**
     * Gets the value of the ratings property.
     * 
     * @return
     *     possible object is
     *     {@link GCRRatingArray }
     *     
     */
    public GCRRatingArray getRatings() {
        return ratings;
    }

    /**
     * Sets the value of the ratings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRRatingArray }
     *     
     */
    public void setRatings(GCRRatingArray value) {
        this.ratings = value;
    }

    /**
     * Gets the value of the yRatingHistory property.
     * 
     * @return
     *     possible object is
     *     {@link GCRRatingHistoryArray }
     *     
     */
    public GCRRatingHistoryArray getYRatingHistory() {
        return yRatingHistory;
    }

    /**
     * Sets the value of the yRatingHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRRatingHistoryArray }
     *     
     */
    public void setYRatingHistory(GCRRatingHistoryArray value) {
        this.yRatingHistory = value;
    }

    /**
     * Gets the value of the pdRatingHistory property.
     * 
     * @return
     *     possible object is
     *     {@link GCRRatingHistoryArray }
     *     
     */
    public GCRRatingHistoryArray getPdRatingHistory() {
        return pdRatingHistory;
    }

    /**
     * Sets the value of the pdRatingHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRRatingHistoryArray }
     *     
     */
    public void setPdRatingHistory(GCRRatingHistoryArray value) {
        this.pdRatingHistory = value;
    }

    /**
     * Gets the value of the pdPercentageHistory property.
     * 
     * @return
     *     possible object is
     *     {@link GCRPercentageHistoryArray }
     *     
     */
    public GCRPercentageHistoryArray getPdPercentageHistory() {
        return pdPercentageHistory;
    }

    /**
     * Sets the value of the pdPercentageHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCRPercentageHistoryArray }
     *     
     */
    public void setPdPercentageHistory(GCRPercentageHistoryArray value) {
        this.pdPercentageHistory = value;
    }

}
