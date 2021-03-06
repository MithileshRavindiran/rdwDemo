
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NbwoWaardeVerdeling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NbwoWaardeVerdeling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="koopsom_van" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="koopsom_tot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aantal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NbwoWaardeVerdeling", propOrder = {

})
public class NbwoWaardeVerdeling {

    @XmlElement(name = "koopsom_van")
    protected int koopsomVan;
    @XmlElement(name = "koopsom_tot")
    protected int koopsomTot;
    protected int aantal;

    /**
     * Gets the value of the koopsomVan property.
     * 
     */
    public int getKoopsomVan() {
        return koopsomVan;
    }

    /**
     * Sets the value of the koopsomVan property.
     * 
     */
    public void setKoopsomVan(int value) {
        this.koopsomVan = value;
    }

    /**
     * Gets the value of the koopsomTot property.
     * 
     */
    public int getKoopsomTot() {
        return koopsomTot;
    }

    /**
     * Sets the value of the koopsomTot property.
     * 
     */
    public void setKoopsomTot(int value) {
        this.koopsomTot = value;
    }

    /**
     * Gets the value of the aantal property.
     * 
     */
    public int getAantal() {
        return aantal;
    }

    /**
     * Sets the value of the aantal property.
     * 
     */
    public void setAantal(int value) {
        this.aantal = value;
    }

}
