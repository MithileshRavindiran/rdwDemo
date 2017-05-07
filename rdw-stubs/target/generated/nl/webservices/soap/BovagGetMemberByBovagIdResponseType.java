
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bovagGetMemberByBovagIdResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bovagGetMemberByBovagIdResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="member" type="{http://www.webservices.nl/soap/}BovagMember"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bovagGetMemberByBovagIdResponseType", propOrder = {

})
public class BovagGetMemberByBovagIdResponseType {

    @XmlElement(required = true)
    protected BovagMember member;

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link BovagMember }
     *     
     */
    public BovagMember getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link BovagMember }
     *     
     */
    public void setMember(BovagMember value) {
        this.member = value;
    }

}
