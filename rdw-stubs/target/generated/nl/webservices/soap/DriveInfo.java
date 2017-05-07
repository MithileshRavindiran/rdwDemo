
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DriveInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriveInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fastest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shortest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriveInfo", propOrder = {

})
public class DriveInfo {

    protected int fastest;
    protected int shortest;

    /**
     * Gets the value of the fastest property.
     * 
     */
    public int getFastest() {
        return fastest;
    }

    /**
     * Sets the value of the fastest property.
     * 
     */
    public void setFastest(int value) {
        this.fastest = value;
    }

    /**
     * Gets the value of the shortest property.
     * 
     */
    public int getShortest() {
        return shortest;
    }

    /**
     * Sets the value of the shortest property.
     * 
     */
    public void setShortest(int value) {
        this.shortest = value;
    }

}
