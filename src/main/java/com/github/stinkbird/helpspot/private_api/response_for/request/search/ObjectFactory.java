//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.11 at 02:01:28 PM CDT 
//


package com.github.stinkbird.helpspot.private_api.response_for.request.search;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.stinkbird.helpspot.private_api.response_for.request.search package. 
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

    private final static QName _DtGMTOpened_QNAME = new QName("", "dtGMTOpened");
    private final static QName _FOpenedVia_QNAME = new QName("", "fOpenedVia");
    private final static QName _XOpenedViaId_QNAME = new QName("", "xOpenedViaId");
    private final static QName _XPersonOpenedBy_QNAME = new QName("", "xPersonOpenedBy");
    private final static QName _XPersonAssignedTo_QNAME = new QName("", "xPersonAssignedTo");
    private final static QName _FOpen_QNAME = new QName("", "fOpen");
    private final static QName _FTrash_QNAME = new QName("", "fTrash");
    private final static QName _SLastName_QNAME = new QName("", "sLastName");
    private final static QName _FUrgent_QNAME = new QName("", "fUrgent");
    private final static QName _SUserId_QNAME = new QName("", "sUserId");
    private final static QName _ILastReplyBy_QNAME = new QName("", "iLastReplyBy");
    private final static QName _XCategory_QNAME = new QName("", "xCategory");
    private final static QName _STitle_QNAME = new QName("", "sTitle");
    private final static QName _Fullname_QNAME = new QName("", "fullname");
    private final static QName _SRequestPassword_QNAME = new QName("", "sRequestPassword");
    private final static QName _XRequest_QNAME = new QName("", "xRequest");
    private final static QName _XStatus_QNAME = new QName("", "xStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.stinkbird.helpspot.private_api.response_for.request.search
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SPhone }
     * 
     */
    public SPhone createSPhone() {
        return new SPhone();
    }

    /**
     * Create an instance of {@link TNote }
     * 
     */
    public TNote createTNote() {
        return new TNote();
    }

    /**
     * Create an instance of {@link SEmail }
     * 
     */
    public SEmail createSEmail() {
        return new SEmail();
    }

    /**
     * Create an instance of {@link DtGMTTrashed }
     * 
     */
    public DtGMTTrashed createDtGMTTrashed() {
        return new DtGMTTrashed();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Requests }
     * 
     */
    public Requests createRequests() {
        return new Requests();
    }

    /**
     * Create an instance of {@link Span }
     * 
     */
    public Span createSpan() {
        return new Span();
    }

    /**
     * Create an instance of {@link SFirstName }
     * 
     */
    public SFirstName createSFirstName() {
        return new SFirstName();
    }

    /**
     * Create an instance of {@link DtGMTClosed }
     * 
     */
    public DtGMTClosed createDtGMTClosed() {
        return new DtGMTClosed();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dtGMTOpened")
    public JAXBElement<String> createDtGMTOpened(String value) {
        return new JAXBElement<String>(_DtGMTOpened_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fOpenedVia")
    public JAXBElement<String> createFOpenedVia(String value) {
        return new JAXBElement<String>(_FOpenedVia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xOpenedViaId")
    public JAXBElement<BigInteger> createXOpenedViaId(BigInteger value) {
        return new JAXBElement<BigInteger>(_XOpenedViaId_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xPersonOpenedBy")
    public JAXBElement<String> createXPersonOpenedBy(String value) {
        return new JAXBElement<String>(_XPersonOpenedBy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xPersonAssignedTo")
    public JAXBElement<String> createXPersonAssignedTo(String value) {
        return new JAXBElement<String>(_XPersonAssignedTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fOpen")
    public JAXBElement<BigInteger> createFOpen(BigInteger value) {
        return new JAXBElement<BigInteger>(_FOpen_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fTrash")
    public JAXBElement<BigInteger> createFTrash(BigInteger value) {
        return new JAXBElement<BigInteger>(_FTrash_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sLastName")
    public JAXBElement<String> createSLastName(String value) {
        return new JAXBElement<String>(_SLastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fUrgent")
    public JAXBElement<BigInteger> createFUrgent(BigInteger value) {
        return new JAXBElement<BigInteger>(_FUrgent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sUserId")
    public JAXBElement<String> createSUserId(String value) {
        return new JAXBElement<String>(_SUserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "iLastReplyBy")
    public JAXBElement<BigInteger> createILastReplyBy(BigInteger value) {
        return new JAXBElement<BigInteger>(_ILastReplyBy_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createXCategory(String value) {
        return new JAXBElement<String>(_XCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sTitle")
    public JAXBElement<String> createSTitle(String value) {
        return new JAXBElement<String>(_STitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fullname")
    public JAXBElement<String> createFullname(String value) {
        return new JAXBElement<String>(_Fullname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sRequestPassword")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSRequestPassword(String value) {
        return new JAXBElement<String>(_SRequestPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xRequest")
    public JAXBElement<BigInteger> createXRequest(BigInteger value) {
        return new JAXBElement<BigInteger>(_XRequest_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createXStatus(String value) {
        return new JAXBElement<String>(_XStatus_QNAME, String.class, null, value);
    }

}