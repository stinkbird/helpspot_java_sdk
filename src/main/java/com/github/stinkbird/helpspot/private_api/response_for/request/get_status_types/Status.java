//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 02:00:03 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.request.get_status_types;

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
 *         &lt;element ref="{}sStatus"/>
 *         &lt;element ref="{}xStatus"/>
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
    "sStatus",
    "xStatus"
})
@XmlRootElement(name = "status")
public class Status {

    @XmlElement(required = false)
    protected String sStatus;
    @XmlElement(required = false)
    protected BigInteger xStatus;

    /**
     * Gets the value of the sStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStatus() {
        return sStatus;
    }

    /**
     * Sets the value of the sStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStatus(String value) {
        this.sStatus = value;
    }

    /**
     * Gets the value of the xStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXStatus() {
        return xStatus;
    }

    /**
     * Sets the value of the xStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXStatus(BigInteger value) {
        this.xStatus = value;
    }

}