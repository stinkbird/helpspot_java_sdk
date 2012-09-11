//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.10 at 02:43:14 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.request.get_time_events;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iland.portal.helpspot.private_api.request.get_time_events package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DtGMTDateAdded_QNAME = new QName("", "dtGMTDateAdded");
    private final static QName _XTimeId_QNAME = new QName("", "xTimeId");
    private final static QName _ISeconds_QNAME = new QName("", "iSeconds");
    private final static QName _TDescription_QNAME = new QName("", "tDescription");
    private final static QName _DtGMTDate_QNAME = new QName("", "dtGMTDate");
    private final static QName _XPerson_QNAME = new QName("", "xPerson");
    private final static QName _FBillable_QNAME = new QName("", "fBillable");
    private final static QName _XRequest_QNAME = new QName("", "xRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iland.portal.helpspot.private_api.request.get_time_events
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimeEvents }
     * 
     */
    public TimeEvents createTimeEvents() {
        return new TimeEvents();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dtGMTDateAdded")
    public JAXBElement<String> createDtGMTDateAdded(String value) {
        return new JAXBElement<String>(_DtGMTDateAdded_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xTimeId")
    public JAXBElement<BigInteger> createXTimeId(BigInteger value) {
        return new JAXBElement<BigInteger>(_XTimeId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "iSeconds")
    public JAXBElement<BigInteger> createISeconds(BigInteger value) {
        return new JAXBElement<BigInteger>(_ISeconds_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tDescription")
    public JAXBElement<String> createTDescription(String value) {
        return new JAXBElement<String>(_TDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dtGMTDate")
    public JAXBElement<String> createDtGMTDate(String value) {
        return new JAXBElement<String>(_DtGMTDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xPerson")
    public JAXBElement<String> createXPerson(String value) {
        return new JAXBElement<String>(_XPerson_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fBillable")
    public JAXBElement<BigInteger> createFBillable(BigInteger value) {
        return new JAXBElement<BigInteger>(_FBillable_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xRequest")
    public JAXBElement<BigInteger> createXRequest(BigInteger value) {
        return new JAXBElement<BigInteger>(_XRequest_QNAME, BigInteger.class, null, value);
    }

}
