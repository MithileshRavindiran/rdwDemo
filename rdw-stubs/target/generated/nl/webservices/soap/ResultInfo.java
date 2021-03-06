
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="curpage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="perpage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numpages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numresults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxresults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultInfo", propOrder = {

})
public class ResultInfo {

    protected int curpage;
    protected int perpage;
    protected int numpages;
    protected int numresults;
    protected int maxresults;

    /**
     * Gets the value of the curpage property.
     * 
     */
    public int getCurpage() {
        return curpage;
    }

    /**
     * Sets the value of the curpage property.
     * 
     */
    public void setCurpage(int value) {
        this.curpage = value;
    }

    /**
     * Gets the value of the perpage property.
     * 
     */
    public int getPerpage() {
        return perpage;
    }

    /**
     * Sets the value of the perpage property.
     * 
     */
    public void setPerpage(int value) {
        this.perpage = value;
    }

    /**
     * Gets the value of the numpages property.
     * 
     */
    public int getNumpages() {
        return numpages;
    }

    /**
     * Sets the value of the numpages property.
     * 
     */
    public void setNumpages(int value) {
        this.numpages = value;
    }

    /**
     * Gets the value of the numresults property.
     * 
     */
    public int getNumresults() {
        return numresults;
    }

    /**
     * Sets the value of the numresults property.
     * 
     */
    public void setNumresults(int value) {
        this.numresults = value;
    }

    /**
     * Gets the value of the maxresults property.
     * 
     */
    public int getMaxresults() {
        return maxresults;
    }

    /**
     * Sets the value of the maxresults property.
     * 
     */
    public void setMaxresults(int value) {
        this.maxresults = value;
    }

}
