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
 *         &lt;element ref="{}xReportingTag"/>
 *         &lt;element ref="{}sReportingTag"/>
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
    "xReportingTag",
    "sReportingTag"
})
@XmlRootElement(name = "tag")
public class Tag implements Serializable {

	private static final long serialVersionUID = -1983486671439234468L;
	
	@XmlElement(required = false)
    protected BigInteger xReportingTag;
    @XmlElement(required = false)
    protected String sReportingTag;

    /**
     * Gets the value of the xReportingTag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXReportingTag() {
        return xReportingTag;
    }

    /**
     * Sets the value of the xReportingTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXReportingTag(BigInteger value) {
        this.xReportingTag = value;
    }

    /**
     * Gets the value of the sReportingTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSReportingTag() {
        return sReportingTag;
    }

    /**
     * Sets the value of the sReportingTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSReportingTag(String value) {
        this.sReportingTag = value;
    }

}
