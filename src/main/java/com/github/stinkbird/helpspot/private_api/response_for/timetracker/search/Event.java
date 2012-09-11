//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 02:04:29 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.timetracker.search;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}xTimeId"/>
 *         &lt;element ref="{}xRequest"/>
 *         &lt;element ref="{}xPerson"/>
 *         &lt;element ref="{}iSeconds"/>
 *         &lt;element ref="{}dtGMTDate"/>
 *         &lt;element ref="{}dtGMTDateAdded"/>
 *         &lt;element ref="{}tDescription"/>
 *         &lt;element ref="{}sUserId"/>
 *         &lt;element ref="{}sFirstName"/>
 *         &lt;element ref="{}sLastName"/>
 *         &lt;element ref="{}sEmail"/>
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
    "xTimeId",
    "xRequest",
    "xPerson",
    "iSeconds",
    "dtGMTDate",
    "dtGMTDateAdded",
    "tDescription",
    "sUserId",
    "sFirstName",
    "sLastName",
    "sEmail"
})
@XmlRootElement(name = "event")
public class Event {

    @XmlElement(required = false)
    protected BigInteger xTimeId;
    @XmlElement(required = false)
    protected BigInteger xRequest;
    @XmlElement(required = false)
    protected String xPerson;
    @XmlElement(required = false)
    protected BigInteger iSeconds;
    @XmlElement(required = false)
    protected String dtGMTDate;
    @XmlElement(required = false)
    protected String dtGMTDateAdded;
    @XmlElement(required = false)
    protected String tDescription;
    @XmlElement(required = false)
    protected BigInteger sUserId;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sFirstName;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sLastName;
    @XmlElement(required = false)
    protected String sEmail;

    /**
     * Gets the value of the xTimeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXTimeId() {
        return xTimeId;
    }

    /**
     * Sets the value of the xTimeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXTimeId(BigInteger value) {
        this.xTimeId = value;
    }

    /**
     * Gets the value of the xRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXRequest() {
        return xRequest;
    }

    /**
     * Sets the value of the xRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXRequest(BigInteger value) {
        this.xRequest = value;
    }

    /**
     * Gets the value of the xPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPerson() {
        return xPerson;
    }

    /**
     * Sets the value of the xPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPerson(String value) {
        this.xPerson = value;
    }

    /**
     * Gets the value of the iSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getISeconds() {
        return iSeconds;
    }

    /**
     * Sets the value of the iSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setISeconds(BigInteger value) {
        this.iSeconds = value;
    }

    /**
     * Gets the value of the dtGMTDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtGMTDate() {
        return dtGMTDate;
    }

    /**
     * Sets the value of the dtGMTDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtGMTDate(String value) {
        this.dtGMTDate = value;
    }

    /**
     * Gets the value of the dtGMTDateAdded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtGMTDateAdded() {
        return dtGMTDateAdded;
    }

    /**
     * Sets the value of the dtGMTDateAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtGMTDateAdded(String value) {
        this.dtGMTDateAdded = value;
    }

    /**
     * Gets the value of the tDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDescription() {
        return tDescription;
    }

    /**
     * Sets the value of the tDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDescription(String value) {
        this.tDescription = value;
    }

    /**
     * Gets the value of the sUserId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSUserId() {
        return sUserId;
    }

    /**
     * Sets the value of the sUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSUserId(BigInteger value) {
        this.sUserId = value;
    }

    /**
     * Gets the value of the sFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFirstName() {
        return sFirstName;
    }

    /**
     * Sets the value of the sFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFirstName(String value) {
        this.sFirstName = value;
    }

    /**
     * Gets the value of the sLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLastName() {
        return sLastName;
    }

    /**
     * Sets the value of the sLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLastName(String value) {
        this.sLastName = value;
    }

    /**
     * Gets the value of the sEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEmail() {
        return sEmail;
    }

    /**
     * Sets the value of the sEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEmail(String value) {
        this.sEmail = value;
    }

}
