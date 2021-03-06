
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskInsolvency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskInsolvency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="registration" type="{http://www.webservices.nl/soap/}RiskInsolvencyRegistration" minOccurs="0"/>
 *         &lt;element name="publications" type="{http://www.webservices.nl/soap/}RiskInsolvencyPublicationArray" minOccurs="0"/>
 *         &lt;element name="curators" type="{http://www.webservices.nl/soap/}RiskInsolvencyCuratorArray" minOccurs="0"/>
 *         &lt;element name="judge" type="{http://www.webservices.nl/soap/}RiskInsolvencyJudge" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskInsolvency", propOrder = {

})
public class RiskInsolvency {

    protected RiskInsolvencyRegistration registration;
    protected RiskInsolvencyPublicationArray publications;
    protected RiskInsolvencyCuratorArray curators;
    protected RiskInsolvencyJudge judge;

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInsolvencyRegistration }
     *     
     */
    public RiskInsolvencyRegistration getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInsolvencyRegistration }
     *     
     */
    public void setRegistration(RiskInsolvencyRegistration value) {
        this.registration = value;
    }

    /**
     * Gets the value of the publications property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInsolvencyPublicationArray }
     *     
     */
    public RiskInsolvencyPublicationArray getPublications() {
        return publications;
    }

    /**
     * Sets the value of the publications property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInsolvencyPublicationArray }
     *     
     */
    public void setPublications(RiskInsolvencyPublicationArray value) {
        this.publications = value;
    }

    /**
     * Gets the value of the curators property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInsolvencyCuratorArray }
     *     
     */
    public RiskInsolvencyCuratorArray getCurators() {
        return curators;
    }

    /**
     * Sets the value of the curators property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInsolvencyCuratorArray }
     *     
     */
    public void setCurators(RiskInsolvencyCuratorArray value) {
        this.curators = value;
    }

    /**
     * Gets the value of the judge property.
     * 
     * @return
     *     possible object is
     *     {@link RiskInsolvencyJudge }
     *     
     */
    public RiskInsolvencyJudge getJudge() {
        return judge;
    }

    /**
     * Sets the value of the judge property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskInsolvencyJudge }
     *     
     */
    public void setJudge(RiskInsolvencyJudge value) {
        this.judge = value;
    }

}
