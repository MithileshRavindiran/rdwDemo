
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDossierV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDossierV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RegisterLetter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubDossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChamberNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Legalformcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LegalformcodeText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreviousDossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PreviousSubDossierNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tradename30" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tradename1x30" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tradename2x30" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Tradename45" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TradenameFull" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstablishmentPostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstablishmentCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstablishmentStreetname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstablishmentHouseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EstablishmentHouseNoAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrespondencePostcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrespondenceCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrespondenceStreetname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrespondenceHouseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CorrespondenceHouseNoAddition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TelephoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Domainname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrimaryActivitycode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondaryActivitycode1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondaryActivitycode2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrimaryActivitycodeText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondaryActivitycode1Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecondaryActivitycode2Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonnelFulltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClassPersonnelFulltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IndicationOrganisationcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IndicationEconomicallyActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IndicationNonMailing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IndicationBankruptcy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IndicationDIP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDossierV2", propOrder = {

})
public class BusinessDossierV2 {

    @XmlElement(name = "RegisterLetter", required = true)
    protected String registerLetter;
    @XmlElement(name = "DossierNo", required = true)
    protected String dossierNo;
    @XmlElement(name = "SubDossierNo", required = true)
    protected String subDossierNo;
    @XmlElement(name = "ChamberNo", required = true)
    protected String chamberNo;
    @XmlElement(name = "Legalformcode", required = true)
    protected String legalformcode;
    @XmlElement(name = "LegalformcodeText", required = true)
    protected String legalformcodeText;
    @XmlElement(name = "PreviousDossierNo", required = true)
    protected String previousDossierNo;
    @XmlElement(name = "PreviousSubDossierNo", required = true)
    protected String previousSubDossierNo;
    @XmlElement(name = "Tradename30", required = true)
    protected String tradename30;
    @XmlElement(name = "Tradename1x30", required = true)
    protected String tradename1X30;
    @XmlElement(name = "Tradename2x30", required = true)
    protected String tradename2X30;
    @XmlElement(name = "Tradename45", required = true)
    protected String tradename45;
    @XmlElement(name = "TradenameFull", required = true)
    protected String tradenameFull;
    @XmlElement(name = "EstablishmentPostcode", required = true)
    protected String establishmentPostcode;
    @XmlElement(name = "EstablishmentCity", required = true)
    protected String establishmentCity;
    @XmlElement(name = "EstablishmentStreetname", required = true)
    protected String establishmentStreetname;
    @XmlElement(name = "EstablishmentHouseNo")
    protected int establishmentHouseNo;
    @XmlElement(name = "EstablishmentHouseNoAddition", required = true)
    protected String establishmentHouseNoAddition;
    @XmlElement(name = "CorrespondencePostcode", required = true)
    protected String correspondencePostcode;
    @XmlElement(name = "CorrespondenceCity", required = true)
    protected String correspondenceCity;
    @XmlElement(name = "CorrespondenceStreetname", required = true)
    protected String correspondenceStreetname;
    @XmlElement(name = "CorrespondenceHouseNo")
    protected int correspondenceHouseNo;
    @XmlElement(name = "CorrespondenceHouseNoAddition", required = true)
    protected String correspondenceHouseNoAddition;
    @XmlElement(name = "TelephoneNo", required = true)
    protected String telephoneNo;
    @XmlElement(name = "Domainname", required = true)
    protected String domainname;
    @XmlElement(name = "PrimaryActivitycode", required = true)
    protected String primaryActivitycode;
    @XmlElement(name = "SecondaryActivitycode1", required = true)
    protected String secondaryActivitycode1;
    @XmlElement(name = "SecondaryActivitycode2", required = true)
    protected String secondaryActivitycode2;
    @XmlElement(name = "PrimaryActivitycodeText", required = true)
    protected String primaryActivitycodeText;
    @XmlElement(name = "SecondaryActivitycode1Text", required = true)
    protected String secondaryActivitycode1Text;
    @XmlElement(name = "SecondaryActivitycode2Text", required = true)
    protected String secondaryActivitycode2Text;
    @XmlElement(name = "PersonnelFulltime")
    protected int personnelFulltime;
    @XmlElement(name = "ClassPersonnelFulltime")
    protected int classPersonnelFulltime;
    @XmlElement(name = "IndicationOrganisationcode", required = true)
    protected String indicationOrganisationcode;
    @XmlElement(name = "IndicationEconomicallyActive")
    protected boolean indicationEconomicallyActive;
    @XmlElement(name = "IndicationNonMailing")
    protected boolean indicationNonMailing;
    @XmlElement(name = "IndicationBankruptcy")
    protected boolean indicationBankruptcy;
    @XmlElement(name = "IndicationDIP")
    protected boolean indicationDIP;

    /**
     * Gets the value of the registerLetter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterLetter() {
        return registerLetter;
    }

    /**
     * Sets the value of the registerLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterLetter(String value) {
        this.registerLetter = value;
    }

    /**
     * Gets the value of the dossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierNo() {
        return dossierNo;
    }

    /**
     * Sets the value of the dossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierNo(String value) {
        this.dossierNo = value;
    }

    /**
     * Gets the value of the subDossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDossierNo() {
        return subDossierNo;
    }

    /**
     * Sets the value of the subDossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDossierNo(String value) {
        this.subDossierNo = value;
    }

    /**
     * Gets the value of the chamberNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamberNo() {
        return chamberNo;
    }

    /**
     * Sets the value of the chamberNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamberNo(String value) {
        this.chamberNo = value;
    }

    /**
     * Gets the value of the legalformcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalformcode() {
        return legalformcode;
    }

    /**
     * Sets the value of the legalformcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalformcode(String value) {
        this.legalformcode = value;
    }

    /**
     * Gets the value of the legalformcodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalformcodeText() {
        return legalformcodeText;
    }

    /**
     * Sets the value of the legalformcodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalformcodeText(String value) {
        this.legalformcodeText = value;
    }

    /**
     * Gets the value of the previousDossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousDossierNo() {
        return previousDossierNo;
    }

    /**
     * Sets the value of the previousDossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDossierNo(String value) {
        this.previousDossierNo = value;
    }

    /**
     * Gets the value of the previousSubDossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousSubDossierNo() {
        return previousSubDossierNo;
    }

    /**
     * Sets the value of the previousSubDossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousSubDossierNo(String value) {
        this.previousSubDossierNo = value;
    }

    /**
     * Gets the value of the tradename30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradename30() {
        return tradename30;
    }

    /**
     * Sets the value of the tradename30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradename30(String value) {
        this.tradename30 = value;
    }

    /**
     * Gets the value of the tradename1X30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradename1X30() {
        return tradename1X30;
    }

    /**
     * Sets the value of the tradename1X30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradename1X30(String value) {
        this.tradename1X30 = value;
    }

    /**
     * Gets the value of the tradename2X30 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradename2X30() {
        return tradename2X30;
    }

    /**
     * Sets the value of the tradename2X30 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradename2X30(String value) {
        this.tradename2X30 = value;
    }

    /**
     * Gets the value of the tradename45 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradename45() {
        return tradename45;
    }

    /**
     * Sets the value of the tradename45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradename45(String value) {
        this.tradename45 = value;
    }

    /**
     * Gets the value of the tradenameFull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradenameFull() {
        return tradenameFull;
    }

    /**
     * Sets the value of the tradenameFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradenameFull(String value) {
        this.tradenameFull = value;
    }

    /**
     * Gets the value of the establishmentPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentPostcode() {
        return establishmentPostcode;
    }

    /**
     * Sets the value of the establishmentPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentPostcode(String value) {
        this.establishmentPostcode = value;
    }

    /**
     * Gets the value of the establishmentCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentCity() {
        return establishmentCity;
    }

    /**
     * Sets the value of the establishmentCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentCity(String value) {
        this.establishmentCity = value;
    }

    /**
     * Gets the value of the establishmentStreetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentStreetname() {
        return establishmentStreetname;
    }

    /**
     * Sets the value of the establishmentStreetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentStreetname(String value) {
        this.establishmentStreetname = value;
    }

    /**
     * Gets the value of the establishmentHouseNo property.
     * 
     */
    public int getEstablishmentHouseNo() {
        return establishmentHouseNo;
    }

    /**
     * Sets the value of the establishmentHouseNo property.
     * 
     */
    public void setEstablishmentHouseNo(int value) {
        this.establishmentHouseNo = value;
    }

    /**
     * Gets the value of the establishmentHouseNoAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentHouseNoAddition() {
        return establishmentHouseNoAddition;
    }

    /**
     * Sets the value of the establishmentHouseNoAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentHouseNoAddition(String value) {
        this.establishmentHouseNoAddition = value;
    }

    /**
     * Gets the value of the correspondencePostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondencePostcode() {
        return correspondencePostcode;
    }

    /**
     * Sets the value of the correspondencePostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondencePostcode(String value) {
        this.correspondencePostcode = value;
    }

    /**
     * Gets the value of the correspondenceCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceCity() {
        return correspondenceCity;
    }

    /**
     * Sets the value of the correspondenceCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceCity(String value) {
        this.correspondenceCity = value;
    }

    /**
     * Gets the value of the correspondenceStreetname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceStreetname() {
        return correspondenceStreetname;
    }

    /**
     * Sets the value of the correspondenceStreetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceStreetname(String value) {
        this.correspondenceStreetname = value;
    }

    /**
     * Gets the value of the correspondenceHouseNo property.
     * 
     */
    public int getCorrespondenceHouseNo() {
        return correspondenceHouseNo;
    }

    /**
     * Sets the value of the correspondenceHouseNo property.
     * 
     */
    public void setCorrespondenceHouseNo(int value) {
        this.correspondenceHouseNo = value;
    }

    /**
     * Gets the value of the correspondenceHouseNoAddition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceHouseNoAddition() {
        return correspondenceHouseNoAddition;
    }

    /**
     * Sets the value of the correspondenceHouseNoAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceHouseNoAddition(String value) {
        this.correspondenceHouseNoAddition = value;
    }

    /**
     * Gets the value of the telephoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNo() {
        return telephoneNo;
    }

    /**
     * Sets the value of the telephoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNo(String value) {
        this.telephoneNo = value;
    }

    /**
     * Gets the value of the domainname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainname() {
        return domainname;
    }

    /**
     * Sets the value of the domainname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainname(String value) {
        this.domainname = value;
    }

    /**
     * Gets the value of the primaryActivitycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryActivitycode() {
        return primaryActivitycode;
    }

    /**
     * Sets the value of the primaryActivitycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryActivitycode(String value) {
        this.primaryActivitycode = value;
    }

    /**
     * Gets the value of the secondaryActivitycode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryActivitycode1() {
        return secondaryActivitycode1;
    }

    /**
     * Sets the value of the secondaryActivitycode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryActivitycode1(String value) {
        this.secondaryActivitycode1 = value;
    }

    /**
     * Gets the value of the secondaryActivitycode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryActivitycode2() {
        return secondaryActivitycode2;
    }

    /**
     * Sets the value of the secondaryActivitycode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryActivitycode2(String value) {
        this.secondaryActivitycode2 = value;
    }

    /**
     * Gets the value of the primaryActivitycodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryActivitycodeText() {
        return primaryActivitycodeText;
    }

    /**
     * Sets the value of the primaryActivitycodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryActivitycodeText(String value) {
        this.primaryActivitycodeText = value;
    }

    /**
     * Gets the value of the secondaryActivitycode1Text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryActivitycode1Text() {
        return secondaryActivitycode1Text;
    }

    /**
     * Sets the value of the secondaryActivitycode1Text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryActivitycode1Text(String value) {
        this.secondaryActivitycode1Text = value;
    }

    /**
     * Gets the value of the secondaryActivitycode2Text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryActivitycode2Text() {
        return secondaryActivitycode2Text;
    }

    /**
     * Sets the value of the secondaryActivitycode2Text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryActivitycode2Text(String value) {
        this.secondaryActivitycode2Text = value;
    }

    /**
     * Gets the value of the personnelFulltime property.
     * 
     */
    public int getPersonnelFulltime() {
        return personnelFulltime;
    }

    /**
     * Sets the value of the personnelFulltime property.
     * 
     */
    public void setPersonnelFulltime(int value) {
        this.personnelFulltime = value;
    }

    /**
     * Gets the value of the classPersonnelFulltime property.
     * 
     */
    public int getClassPersonnelFulltime() {
        return classPersonnelFulltime;
    }

    /**
     * Sets the value of the classPersonnelFulltime property.
     * 
     */
    public void setClassPersonnelFulltime(int value) {
        this.classPersonnelFulltime = value;
    }

    /**
     * Gets the value of the indicationOrganisationcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicationOrganisationcode() {
        return indicationOrganisationcode;
    }

    /**
     * Sets the value of the indicationOrganisationcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicationOrganisationcode(String value) {
        this.indicationOrganisationcode = value;
    }

    /**
     * Gets the value of the indicationEconomicallyActive property.
     * 
     */
    public boolean isIndicationEconomicallyActive() {
        return indicationEconomicallyActive;
    }

    /**
     * Sets the value of the indicationEconomicallyActive property.
     * 
     */
    public void setIndicationEconomicallyActive(boolean value) {
        this.indicationEconomicallyActive = value;
    }

    /**
     * Gets the value of the indicationNonMailing property.
     * 
     */
    public boolean isIndicationNonMailing() {
        return indicationNonMailing;
    }

    /**
     * Sets the value of the indicationNonMailing property.
     * 
     */
    public void setIndicationNonMailing(boolean value) {
        this.indicationNonMailing = value;
    }

    /**
     * Gets the value of the indicationBankruptcy property.
     * 
     */
    public boolean isIndicationBankruptcy() {
        return indicationBankruptcy;
    }

    /**
     * Sets the value of the indicationBankruptcy property.
     * 
     */
    public void setIndicationBankruptcy(boolean value) {
        this.indicationBankruptcy = value;
    }

    /**
     * Gets the value of the indicationDIP property.
     * 
     */
    public boolean isIndicationDIP() {
        return indicationDIP;
    }

    /**
     * Sets the value of the indicationDIP property.
     * 
     */
    public void setIndicationDIP(boolean value) {
        this.indicationDIP = value;
    }

}
