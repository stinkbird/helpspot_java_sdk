//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.05 at 01:59:11 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.request.search;

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
 *         &lt;element ref="{}xRequest"/>
 *         &lt;element ref="{}fOpenedVia"/>
 *         &lt;element ref="{}xOpenedViaId"/>
 *         &lt;element ref="{}xPortal"/>
 *         &lt;element ref="{}xMailboxToSendFrom"/>
 *         &lt;element ref="{}xPersonOpenedBy"/>
 *         &lt;element ref="{}xPersonAssignedTo"/>
 *         &lt;element ref="{}fOpen"/>
 *         &lt;element ref="{}xStatus"/>
 *         &lt;element ref="{}fUrgent"/>
 *         &lt;element ref="{}xCategory"/>
 *         &lt;element ref="{}dtGMTOpened"/>
 *         &lt;element ref="{}dtGMTClosed"/>
 *         &lt;element ref="{}iLastReplyBy"/>
 *         &lt;element ref="{}fTrash"/>
 *         &lt;element ref="{}dtGMTTrashed"/>
 *         &lt;element ref="{}sRequestPassword"/>
 *         &lt;element ref="{}sTitle"/>
 *         &lt;element ref="{}sUserId"/>
 *         &lt;element ref="{}sFirstName"/>
 *         &lt;element ref="{}sLastName"/>
 *         &lt;element ref="{}sEmail"/>
 *         &lt;element ref="{}sPhone"/>
 *         &lt;element ref="{}Custom1"/>
 *         &lt;element ref="{}Custom3"/>
 *         &lt;element ref="{}Custom5"/>
 *         &lt;element ref="{}Custom6"/>
 *         &lt;element ref="{}Custom7"/>
 *         &lt;element ref="{}Custom9"/>
 *         &lt;element ref="{}Custom10"/>
 *         &lt;element ref="{}Custom11"/>
 *         &lt;element ref="{}Custom12"/>
 *         &lt;element ref="{}fullname"/>
 *         &lt;element ref="{}tNote"/>
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
    "xRequest",
    "fOpenedVia",
    "xOpenedViaId",
    "xPortal",
    "xMailboxToSendFrom",
    "xPersonOpenedBy",
    "xPersonAssignedTo",
    "fOpen",
    "xStatus",
    "fUrgent",
    "xCategory",
    "dtGMTOpened",
    "dtGMTClosed",
    "iLastReplyBy",
    "fTrash",
    "dtGMTTrashed",
    "sRequestPassword",
    "sTitle",
    "sUserId",
    "sFirstName",
    "sLastName",
    "sEmail",
    "sPhone",
    "custom1",
    "custom3",
    "custom5",
    "custom6",
    "custom7",
    "custom9",
    "custom10",
    "custom11",
    "custom12",
    "fullname",
    "tNote"
})
@XmlRootElement(name = "request")
public class Request {

    @XmlElement(required = false)
    protected BigInteger xRequest;
    @XmlElement(required = false)
    protected String fOpenedVia;
    @XmlElement(required = false)
    protected String xOpenedViaId;
    @XmlElement(required = false)
    protected BigInteger xPortal;
    @XmlElement(required = false)
    protected BigInteger xMailboxToSendFrom;
    @XmlElement(required = false)
    protected String xPersonOpenedBy;
    @XmlElement(required = false)
    protected String xPersonAssignedTo;
    @XmlElement(required = false)
    protected BigInteger fOpen;
    @XmlElement(required = false)
    protected String xStatus;
    @XmlElement(required = false)
    protected BigInteger fUrgent;
    @XmlElement(required = false)
    protected String xCategory;
    @XmlElement(required = false)
    protected String dtGMTOpened;
    @XmlElement(required = false)
    protected String dtGMTClosed;
    @XmlElement(required = false)
    protected String iLastReplyBy;
    @XmlElement(required = false)
    protected BigInteger fTrash;
    @XmlElement(required = false)
    protected DtGMTTrashed dtGMTTrashed;
    @XmlElement(required = false)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sRequestPassword;
    @XmlElement(required = false)
    protected String sTitle;
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
    @XmlElement(required = false)
    protected String sPhone;
    @XmlElement(name = "Custom1", required = false)
    protected String custom1;
    @XmlElement(name = "Custom3", required = false)
    protected Custom3 custom3;
    @XmlElement(name = "Custom5", required = false)
    protected String custom5;
    @XmlElement(name = "Custom6", required = false)
    protected Custom6 custom6;
    @XmlElement(name = "Custom7", required = false)
    protected String custom7;
    @XmlElement(name = "Custom9", required = false)
    protected String custom9;
    @XmlElement(name = "Custom10", required = false)
    protected Custom10 custom10;
    @XmlElement(name = "Custom11", required = false)
    protected Custom11 custom11;
    @XmlElement(name = "Custom12", required = false)
    protected Custom12 custom12;
    @XmlElement(required = false)
    protected String fullname;
    @XmlElement(required = false)
    protected String tNote;

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
     * Gets the value of the fOpenedVia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOpenedVia() {
        return fOpenedVia;
    }

    /**
     * Sets the value of the fOpenedVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOpenedVia(String value) {
        this.fOpenedVia = value;
    }

    /**
     * Gets the value of the xOpenedViaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXOpenedViaId() {
        return xOpenedViaId;
    }

    /**
     * Sets the value of the xOpenedViaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXOpenedViaId(String value) {
        this.xOpenedViaId = value;
    }

    /**
     * Gets the value of the xPortal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXPortal() {
        return xPortal;
    }

    /**
     * Sets the value of the xPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXPortal(BigInteger value) {
        this.xPortal = value;
    }

    /**
     * Gets the value of the xMailboxToSendFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXMailboxToSendFrom() {
        return xMailboxToSendFrom;
    }

    /**
     * Sets the value of the xMailboxToSendFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXMailboxToSendFrom(BigInteger value) {
        this.xMailboxToSendFrom = value;
    }

    /**
     * Gets the value of the xPersonOpenedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPersonOpenedBy() {
        return xPersonOpenedBy;
    }

    /**
     * Sets the value of the xPersonOpenedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPersonOpenedBy(String value) {
        this.xPersonOpenedBy = value;
    }

    /**
     * Gets the value of the xPersonAssignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPersonAssignedTo() {
        return xPersonAssignedTo;
    }

    /**
     * Sets the value of the xPersonAssignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPersonAssignedTo(String value) {
        this.xPersonAssignedTo = value;
    }

    /**
     * Gets the value of the fOpen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFOpen() {
        return fOpen;
    }

    /**
     * Sets the value of the fOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFOpen(BigInteger value) {
        this.fOpen = value;
    }

    /**
     * Gets the value of the xStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXStatus() {
        return xStatus;
    }

    /**
     * Sets the value of the xStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXStatus(String value) {
        this.xStatus = value;
    }

    /**
     * Gets the value of the fUrgent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFUrgent() {
        return fUrgent;
    }

    /**
     * Sets the value of the fUrgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFUrgent(BigInteger value) {
        this.fUrgent = value;
    }

    /**
     * Gets the value of the xCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCategory() {
        return xCategory;
    }

    /**
     * Sets the value of the xCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCategory(String value) {
        this.xCategory = value;
    }

    /**
     * Gets the value of the dtGMTOpened property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtGMTOpened() {
        return dtGMTOpened;
    }

    /**
     * Sets the value of the dtGMTOpened property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtGMTOpened(String value) {
        this.dtGMTOpened = value;
    }

    /**
     * Gets the value of the dtGMTClosed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtGMTClosed() {
        return dtGMTClosed;
    }

    /**
     * Sets the value of the dtGMTClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtGMTClosed(String value) {
        this.dtGMTClosed = value;
    }

    /**
     * Gets the value of the iLastReplyBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILastReplyBy() {
        return iLastReplyBy;
    }

    /**
     * Sets the value of the iLastReplyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setILastReplyBy(String value) {
        this.iLastReplyBy = value;
    }

    /**
     * Gets the value of the fTrash property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFTrash() {
        return fTrash;
    }

    /**
     * Sets the value of the fTrash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFTrash(BigInteger value) {
        this.fTrash = value;
    }

    /**
     * Gets the value of the dtGMTTrashed property.
     * 
     * @return
     *     possible object is
     *     {@link DtGMTTrashed }
     *     
     */
    public DtGMTTrashed getDtGMTTrashed() {
        return dtGMTTrashed;
    }

    /**
     * Sets the value of the dtGMTTrashed property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtGMTTrashed }
     *     
     */
    public void setDtGMTTrashed(DtGMTTrashed value) {
        this.dtGMTTrashed = value;
    }

    /**
     * Gets the value of the sRequestPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRequestPassword() {
        return sRequestPassword;
    }

    /**
     * Sets the value of the sRequestPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRequestPassword(String value) {
        this.sRequestPassword = value;
    }

    /**
     * Gets the value of the sTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTitle() {
        return sTitle;
    }

    /**
     * Sets the value of the sTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTitle(String value) {
        this.sTitle = value;
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

    /**
     * Gets the value of the sPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPhone() {
        return sPhone;
    }

    /**
     * Sets the value of the sPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPhone(String value) {
        this.sPhone = value;
    }

    /**
     * Gets the value of the custom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * Sets the value of the custom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom1(String value) {
        this.custom1 = value;
    }

    /**
     * Gets the value of the custom3 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom3 }
     *     
     */
    public Custom3 getCustom3() {
        return custom3;
    }

    /**
     * Sets the value of the custom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom3 }
     *     
     */
    public void setCustom3(Custom3 value) {
        this.custom3 = value;
    }

    /**
     * Gets the value of the custom5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom5() {
        return custom5;
    }

    /**
     * Sets the value of the custom5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom5(String value) {
        this.custom5 = value;
    }

    /**
     * Gets the value of the custom6 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom6 }
     *     
     */
    public Custom6 getCustom6() {
        return custom6;
    }

    /**
     * Sets the value of the custom6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom6 }
     *     
     */
    public void setCustom6(Custom6 value) {
        this.custom6 = value;
    }

    /**
     * Gets the value of the custom7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom7() {
        return custom7;
    }

    /**
     * Sets the value of the custom7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom7(String value) {
        this.custom7 = value;
    }

    /**
     * Gets the value of the custom9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom9() {
        return custom9;
    }

    /**
     * Sets the value of the custom9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom9(String value) {
        this.custom9 = value;
    }

    /**
     * Gets the value of the custom10 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom10 }
     *     
     */
    public Custom10 getCustom10() {
        return custom10;
    }

    /**
     * Sets the value of the custom10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom10 }
     *     
     */
    public void setCustom10(Custom10 value) {
        this.custom10 = value;
    }

    /**
     * Gets the value of the custom11 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom11 }
     *     
     */
    public Custom11 getCustom11() {
        return custom11;
    }

    /**
     * Sets the value of the custom11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom11 }
     *     
     */
    public void setCustom11(Custom11 value) {
        this.custom11 = value;
    }

    /**
     * Gets the value of the custom12 property.
     * 
     * @return
     *     possible object is
     *     {@link Custom12 }
     *     
     */
    public Custom12 getCustom12() {
        return custom12;
    }

    /**
     * Sets the value of the custom12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Custom12 }
     *     
     */
    public void setCustom12(Custom12 value) {
        this.custom12 = value;
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
     * Gets the value of the tNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNote() {
        return tNote;
    }

    /**
     * Sets the value of the tNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNote(String value) {
        this.tNote = value;
    }

}
