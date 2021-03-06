
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InsolvencyCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyCase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="insolvency_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="magistrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previous_insolvency_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previous_magistrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="is_pre_hgk_published" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pre_hgk_insolvency_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dept_restructuring_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="removal_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="legal_subject" type="{http://www.webservices.nl/soap/}InsolvencyLegalSubject"/>
 *         &lt;element name="treating_authority" type="{http://www.webservices.nl/soap/}InsolvencyTreatingAuthority"/>
 *         &lt;element name="curators" type="{http://www.webservices.nl/soap/}InsolvencyCurators" minOccurs="0"/>
 *         &lt;element name="receivers" type="{http://www.webservices.nl/soap/}InsolvencyReceivers" minOccurs="0"/>
 *         &lt;element name="events" type="{http://www.webservices.nl/soap/}InsolvencyPublications"/>
 *         &lt;element name="reports" type="{http://www.webservices.nl/soap/}InsolvencyReportArray" minOccurs="0"/>
 *         &lt;element name="affected_companies" type="{http://www.webservices.nl/soap/}InsolvencyAffectedCompanyArray" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyCase", propOrder = {

})
public class InsolvencyCase {

    @XmlElement(name = "insolvency_id", required = true)
    protected String insolvencyId;
    protected String magistrate;
    @XmlElement(name = "previous_insolvency_id")
    protected String previousInsolvencyId;
    @XmlElement(name = "previous_magistrate")
    protected String previousMagistrate;
    @XmlElement(name = "is_pre_hgk_published")
    protected boolean isPreHgkPublished;
    @XmlElement(name = "pre_hgk_insolvency_id")
    protected String preHgkInsolvencyId;
    @XmlElement(name = "dept_restructuring_number")
    protected String deptRestructuringNumber;
    @XmlElement(name = "removal_date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar removalDate;
    @XmlElement(name = "legal_subject", required = true)
    protected InsolvencyLegalSubject legalSubject;
    @XmlElement(name = "treating_authority", required = true)
    protected InsolvencyTreatingAuthority treatingAuthority;
    protected InsolvencyCurators curators;
    protected InsolvencyReceivers receivers;
    @XmlElement(required = true)
    protected InsolvencyPublications events;
    protected InsolvencyReportArray reports;
    @XmlElement(name = "affected_companies")
    protected InsolvencyAffectedCompanyArray affectedCompanies;

    /**
     * Gets the value of the insolvencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsolvencyId() {
        return insolvencyId;
    }

    /**
     * Sets the value of the insolvencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsolvencyId(String value) {
        this.insolvencyId = value;
    }

    /**
     * Gets the value of the magistrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagistrate() {
        return magistrate;
    }

    /**
     * Sets the value of the magistrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagistrate(String value) {
        this.magistrate = value;
    }

    /**
     * Gets the value of the previousInsolvencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousInsolvencyId() {
        return previousInsolvencyId;
    }

    /**
     * Sets the value of the previousInsolvencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousInsolvencyId(String value) {
        this.previousInsolvencyId = value;
    }

    /**
     * Gets the value of the previousMagistrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousMagistrate() {
        return previousMagistrate;
    }

    /**
     * Sets the value of the previousMagistrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousMagistrate(String value) {
        this.previousMagistrate = value;
    }

    /**
     * Gets the value of the isPreHgkPublished property.
     * 
     */
    public boolean isIsPreHgkPublished() {
        return isPreHgkPublished;
    }

    /**
     * Sets the value of the isPreHgkPublished property.
     * 
     */
    public void setIsPreHgkPublished(boolean value) {
        this.isPreHgkPublished = value;
    }

    /**
     * Gets the value of the preHgkInsolvencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreHgkInsolvencyId() {
        return preHgkInsolvencyId;
    }

    /**
     * Sets the value of the preHgkInsolvencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreHgkInsolvencyId(String value) {
        this.preHgkInsolvencyId = value;
    }

    /**
     * Gets the value of the deptRestructuringNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptRestructuringNumber() {
        return deptRestructuringNumber;
    }

    /**
     * Sets the value of the deptRestructuringNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptRestructuringNumber(String value) {
        this.deptRestructuringNumber = value;
    }

    /**
     * Gets the value of the removalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRemovalDate() {
        return removalDate;
    }

    /**
     * Sets the value of the removalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRemovalDate(XMLGregorianCalendar value) {
        this.removalDate = value;
    }

    /**
     * Gets the value of the legalSubject property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyLegalSubject }
     *     
     */
    public InsolvencyLegalSubject getLegalSubject() {
        return legalSubject;
    }

    /**
     * Sets the value of the legalSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyLegalSubject }
     *     
     */
    public void setLegalSubject(InsolvencyLegalSubject value) {
        this.legalSubject = value;
    }

    /**
     * Gets the value of the treatingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyTreatingAuthority }
     *     
     */
    public InsolvencyTreatingAuthority getTreatingAuthority() {
        return treatingAuthority;
    }

    /**
     * Sets the value of the treatingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyTreatingAuthority }
     *     
     */
    public void setTreatingAuthority(InsolvencyTreatingAuthority value) {
        this.treatingAuthority = value;
    }

    /**
     * Gets the value of the curators property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyCurators }
     *     
     */
    public InsolvencyCurators getCurators() {
        return curators;
    }

    /**
     * Sets the value of the curators property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyCurators }
     *     
     */
    public void setCurators(InsolvencyCurators value) {
        this.curators = value;
    }

    /**
     * Gets the value of the receivers property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyReceivers }
     *     
     */
    public InsolvencyReceivers getReceivers() {
        return receivers;
    }

    /**
     * Sets the value of the receivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyReceivers }
     *     
     */
    public void setReceivers(InsolvencyReceivers value) {
        this.receivers = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyPublications }
     *     
     */
    public InsolvencyPublications getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyPublications }
     *     
     */
    public void setEvents(InsolvencyPublications value) {
        this.events = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyReportArray }
     *     
     */
    public InsolvencyReportArray getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyReportArray }
     *     
     */
    public void setReports(InsolvencyReportArray value) {
        this.reports = value;
    }

    /**
     * Gets the value of the affectedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyAffectedCompanyArray }
     *     
     */
    public InsolvencyAffectedCompanyArray getAffectedCompanies() {
        return affectedCompanies;
    }

    /**
     * Sets the value of the affectedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyAffectedCompanyArray }
     *     
     */
    public void setAffectedCompanies(InsolvencyAffectedCompanyArray value) {
        this.affectedCompanies = value;
    }

}
