//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 01:55:52 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.filter.get_stream;

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
 *         &lt;element ref="{}history_note"/>
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
    "historyNote"
})
@XmlRootElement(name = "stream")
public class Stream {

    @XmlElement(name = "history_note", required = false)
    protected HistoryNote historyNote;

    /**
     * Gets the value of the historyNote property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryNote }
     *     
     */
    public HistoryNote getHistoryNote() {
        return historyNote;
    }

    /**
     * Sets the value of the historyNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryNote }
     *     
     */
    public void setHistoryNote(HistoryNote value) {
        this.historyNote = value;
    }

}