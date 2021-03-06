
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDRScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDRScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="person_score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="region_score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edr_region_score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weighted_score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDRScore", propOrder = {

})
public class EDRScore {

    @XmlElement(name = "person_score")
    protected int personScore;
    @XmlElement(name = "region_score")
    protected int regionScore;
    @XmlElement(name = "edr_region_score")
    protected int edrRegionScore;
    @XmlElement(name = "weighted_score")
    protected int weightedScore;

    /**
     * Gets the value of the personScore property.
     * 
     */
    public int getPersonScore() {
        return personScore;
    }

    /**
     * Sets the value of the personScore property.
     * 
     */
    public void setPersonScore(int value) {
        this.personScore = value;
    }

    /**
     * Gets the value of the regionScore property.
     * 
     */
    public int getRegionScore() {
        return regionScore;
    }

    /**
     * Sets the value of the regionScore property.
     * 
     */
    public void setRegionScore(int value) {
        this.regionScore = value;
    }

    /**
     * Gets the value of the edrRegionScore property.
     * 
     */
    public int getEdrRegionScore() {
        return edrRegionScore;
    }

    /**
     * Sets the value of the edrRegionScore property.
     * 
     */
    public void setEdrRegionScore(int value) {
        this.edrRegionScore = value;
    }

    /**
     * Gets the value of the weightedScore property.
     * 
     */
    public int getWeightedScore() {
        return weightedScore;
    }

    /**
     * Sets the value of the weightedScore property.
     * 
     */
    public void setWeightedScore(int value) {
        this.weightedScore = value;
    }

}
