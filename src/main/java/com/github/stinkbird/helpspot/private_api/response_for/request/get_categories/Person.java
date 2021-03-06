//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:58:44 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.request.get_categories;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}xPerson"/>
 *         &lt;element ref="{}fullname"/>
 *         &lt;element ref="{}assigned_requests"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xPerson",
    "fullname",
    "assignedRequests"
})
@XmlRootElement(name = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = -1677378646141624997L;
	
	@XmlElement(required = false)
    protected BigInteger xPerson;
    @XmlElement(required = false)
    protected String fullname;
    @XmlElement(name = "assigned_requests", required = false)
    protected BigInteger assignedRequests;

    /**
     * Gets the value of the xPerson property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXPerson() {
        return xPerson;
    }

    /**
     * Sets the value of the xPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXPerson(BigInteger value) {
        this.xPerson = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the assignedRequests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssignedRequests() {
        return assignedRequests;
    }

    /**
     * Sets the value of the assignedRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssignedRequests(BigInteger value) {
        this.assignedRequests = value;
    }

}
