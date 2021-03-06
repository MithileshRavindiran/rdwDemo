
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NbwoKenmerkenModelResultaat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NbwoKenmerkenModelResultaat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="waarde" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="betrouwbaarheid" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "NbwoKenmerkenModelResultaat", propOrder = {

})
public class NbwoKenmerkenModelResultaat {

    protected int waarde;
    protected double betrouwbaarheid;
    protected int aantal;

    /**
     * Gets the value of the waarde property.
     * 
     */
    public int getWaarde() {
        return waarde;
    }

    /**
     * Sets the value of the waarde property.
     * 
     */
    public void setWaarde(int value) {
        this.waarde = value;
    }

    /**
     * Gets the value of the betrouwbaarheid property.
     * 
     */
    public double getBetrouwbaarheid() {
        return betrouwbaarheid;
    }

    /**
     * Sets the value of the betrouwbaarheid property.
     * 
     */
    public void setBetrouwbaarheid(double value) {
        this.betrouwbaarheid = value;
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
