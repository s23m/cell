//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.23 at 04:41:58 PM CET 
//


package org.s23m.cell.serialization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for edgeTraceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edgeTraceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="abstractionInstance" use="required" type="{http://schemas.S23M.org/serialization/2010}referenceId" />
 *       &lt;attribute name="detailInstance" use="required" type="{http://schemas.S23M.org/serialization/2010}referenceId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edgeTraceType")
public class EdgeTraceType {

    @XmlAttribute(required = true)
    protected String abstractionInstance;
    @XmlAttribute(required = true)
    protected String detailInstance;

    /**
     * Gets the value of the abstractionInstance property.
     * 
     * @return
     *     possible object is
     *     {@arrow String }
     *     
     */
    public String getAbstractionInstance() {
        return abstractionInstance;
    }

    /**
     * Sets the value of the abstractionInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@arrow String }
     *     
     */
    public void setAbstractionInstance(String value) {
        this.abstractionInstance = value;
    }

    /**
     * Gets the value of the detailInstance property.
     * 
     * @return
     *     possible object is
     *     {@arrow String }
     *     
     */
    public String getDetailInstance() {
        return detailInstance;
    }

    /**
     * Sets the value of the detailInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@arrow String }
     *     
     */
    public void setDetailInstance(String value) {
        this.detailInstance = value;
    }

}
