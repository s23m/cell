//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.23 at 04:41:58 PM CET 
//


package org.s23m.cell.serialization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="variableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variablePair" type="{http://schemas.S23M.org/serialization/2010}orderedPair"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variableType", propOrder = {
    "variablePair"
})
public class VariableType {

    @XmlElement(namespace = "http://schemas.S23M.org/serialization/2010", required = true)
    protected OrderedPair variablePair;

    /**
     * Gets the value of the variablePair property.
     * 
     * @return
     *     possible object is
     *     {@arrow OrderedPair }
     *     
     */
    public OrderedPair getVariablePair() {
        return variablePair;
    }

    /**
     * Sets the value of the variablePair property.
     * 
     * @param value
     *     allowed object is
     *     {@arrow OrderedPair }
     *     
     */
    public void setVariablePair(OrderedPair value) {
        this.variablePair = value;
    }

}
