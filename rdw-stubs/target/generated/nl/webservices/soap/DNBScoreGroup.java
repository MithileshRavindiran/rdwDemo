
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DNBScoreGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBScoreGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="score_commentaries" type="{http://www.webservices.nl/soap/}DNBCommentaryArray"/>
 *         &lt;element name="score_class" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="national_percentile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="score_override_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidence_of_default" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="score_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry_norm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry_incidence_of_default" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry_percentile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unnormalized_score" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="algorithm_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBScoreGroup", propOrder = {

})
public class DNBScoreGroup {

    protected Integer score;
    @XmlElement(name = "score_commentaries", required = true)
    protected DNBCommentaryArray scoreCommentaries;
    @XmlElement(name = "score_class")
    protected Boolean scoreClass;
    @XmlElement(name = "national_percentile")
    protected Integer nationalPercentile;
    @XmlElement(name = "score_override_code")
    protected String scoreOverrideCode;
    @XmlElement(name = "incidence_of_default")
    protected Integer incidenceOfDefault;
    @XmlElement(name = "score_date")
    protected String scoreDate;
    @XmlElement(name = "industry_norm")
    protected String industryNorm;
    @XmlElement(name = "industry_incidence_of_default")
    protected String industryIncidenceOfDefault;
    @XmlElement(name = "industry_percentile")
    protected Integer industryPercentile;
    @XmlElement(name = "unnormalized_score")
    protected String unnormalizedScore;
    @XmlElement(name = "algorithm_id")
    protected String algorithmId;

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Gets the value of the scoreCommentaries property.
     * 
     * @return
     *     possible object is
     *     {@link DNBCommentaryArray }
     *     
     */
    public DNBCommentaryArray getScoreCommentaries() {
        return scoreCommentaries;
    }

    /**
     * Sets the value of the scoreCommentaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBCommentaryArray }
     *     
     */
    public void setScoreCommentaries(DNBCommentaryArray value) {
        this.scoreCommentaries = value;
    }

    /**
     * Gets the value of the scoreClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScoreClass() {
        return scoreClass;
    }

    /**
     * Sets the value of the scoreClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScoreClass(Boolean value) {
        this.scoreClass = value;
    }

    /**
     * Gets the value of the nationalPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNationalPercentile() {
        return nationalPercentile;
    }

    /**
     * Sets the value of the nationalPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNationalPercentile(Integer value) {
        this.nationalPercentile = value;
    }

    /**
     * Gets the value of the scoreOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreOverrideCode() {
        return scoreOverrideCode;
    }

    /**
     * Sets the value of the scoreOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreOverrideCode(String value) {
        this.scoreOverrideCode = value;
    }

    /**
     * Gets the value of the incidenceOfDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncidenceOfDefault() {
        return incidenceOfDefault;
    }

    /**
     * Sets the value of the incidenceOfDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncidenceOfDefault(Integer value) {
        this.incidenceOfDefault = value;
    }

    /**
     * Gets the value of the scoreDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreDate() {
        return scoreDate;
    }

    /**
     * Sets the value of the scoreDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreDate(String value) {
        this.scoreDate = value;
    }

    /**
     * Gets the value of the industryNorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryNorm() {
        return industryNorm;
    }

    /**
     * Sets the value of the industryNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryNorm(String value) {
        this.industryNorm = value;
    }

    /**
     * Gets the value of the industryIncidenceOfDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryIncidenceOfDefault() {
        return industryIncidenceOfDefault;
    }

    /**
     * Sets the value of the industryIncidenceOfDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryIncidenceOfDefault(String value) {
        this.industryIncidenceOfDefault = value;
    }

    /**
     * Gets the value of the industryPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndustryPercentile() {
        return industryPercentile;
    }

    /**
     * Sets the value of the industryPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndustryPercentile(Integer value) {
        this.industryPercentile = value;
    }

    /**
     * Gets the value of the unnormalizedScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnnormalizedScore() {
        return unnormalizedScore;
    }

    /**
     * Sets the value of the unnormalizedScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnnormalizedScore(String value) {
        this.unnormalizedScore = value;
    }

    /**
     * Gets the value of the algorithmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithmId() {
        return algorithmId;
    }

    /**
     * Sets the value of the algorithmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmId(String value) {
        this.algorithmId = value;
    }

}
