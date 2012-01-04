//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.23 at 04:41:58 PM CET 
//


package org.s23m.cell.serialization;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.s23m.cell.serialization.EdgeType.EdgeEnd;


/**
 * <p>Java class for edgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edgeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="2" minOccurs="2">
 *           &lt;element name="edgeEnd">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="semanticIdentity" type="{http://schemas.gmodel.org/serialization/2010}semanticIdType"/>
 *                     &lt;element name="minCardinality" type="{http://schemas.gmodel.org/serialization/2010}cardinalityType"/>
 *                     &lt;element name="maxCardinality" type="{http://schemas.gmodel.org/serialization/2010}cardinalityType"/>
 *                     &lt;element name="isContainer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="isNavigable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="instanceId" use="required" type="{http://schemas.gmodel.org/serialization/2010}referenceId" />
 *                   &lt;attribute name="metaElement" use="required" type="{http://schemas.gmodel.org/serialization/2010}referenceId" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="semanticIdentity" type="{http://schemas.gmodel.org/serialization/2010}semanticIdType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isAbstract" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="metaElement" use="required" type="{http://schemas.gmodel.org/serialization/2010}referenceId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edgeType", propOrder = {
    "edgeEnd",
    "semanticIdentity"
})
public class EdgeType {

    @XmlElement(namespace = "http://schemas.gmodel.org/serialization/2010", required = true)
    protected List<EdgeEnd> edgeEnd;
    @XmlElement(namespace = "http://schemas.gmodel.org/serialization/2010", required = true)
    protected SemanticIdType semanticIdentity;
    @XmlAttribute(required = true)
    protected boolean isAbstract;
    @XmlAttribute(required = true)
    protected String metaElement;

    /**
     * Gets the value of the edgeEnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edgeEnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdgeEnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdgeEnd }
     * 
     * 
     */
    public List<EdgeEnd> getEdgeEnd() {
        if (edgeEnd == null) {
            edgeEnd = new ArrayList<EdgeEnd>();
        }
        return this.edgeEnd;
    }

    /**
     * Gets the value of the semanticIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link SemanticIdType }
     *     
     */
    public SemanticIdType getSemanticIdentity() {
        return semanticIdentity;
    }

    /**
     * Sets the value of the semanticIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticIdType }
     *     
     */
    public void setSemanticIdentity(SemanticIdType value) {
        this.semanticIdentity = value;
    }

    /**
     * Gets the value of the isAbstract property.
     * 
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * Sets the value of the isAbstract property.
     * 
     */
    public void setIsAbstract(boolean value) {
        this.isAbstract = value;
    }

    /**
     * Gets the value of the metaElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaElement() {
        return metaElement;
    }

    /**
     * Sets the value of the metaElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaElement(String value) {
        this.metaElement = value;
    }


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
     *         &lt;element name="semanticIdentity" type="{http://schemas.gmodel.org/serialization/2010}semanticIdType"/>
     *         &lt;element name="minCardinality" type="{http://schemas.gmodel.org/serialization/2010}cardinalityType"/>
     *         &lt;element name="maxCardinality" type="{http://schemas.gmodel.org/serialization/2010}cardinalityType"/>
     *         &lt;element name="isContainer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="isNavigable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *       &lt;attribute name="instanceId" use="required" type="{http://schemas.gmodel.org/serialization/2010}referenceId" />
     *       &lt;attribute name="metaElement" use="required" type="{http://schemas.gmodel.org/serialization/2010}referenceId" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "semanticIdentity",
        "minCardinality",
        "maxCardinality",
        "isContainer",
        "isNavigable"
    })
    public static class EdgeEnd {

        @XmlElement(namespace = "http://schemas.gmodel.org/serialization/2010", required = true)
        protected SemanticIdType semanticIdentity;
        @XmlElement(namespace = "http://schemas.gmodel.org/serialization/2010", required = true)
        protected String minCardinality;
        @XmlElement(namespace = "http://schemas.gmodel.org/serialization/2010", required = true)
        protected String maxCardinality;
        @XmlElement(namespace = "http://schemas.gmodel.org/serialization/2010")
        protected boolean isContainer;
        @XmlElement(namespace = "http://schemas.gmodel.org/serialization/2010")
        protected boolean isNavigable;
        @XmlAttribute(required = true)
        protected String instanceId;
        @XmlAttribute(required = true)
        protected String metaElement;

        /**
         * Gets the value of the semanticIdentity property.
         * 
         * @return
         *     possible object is
         *     {@link SemanticIdType }
         *     
         */
        public SemanticIdType getSemanticIdentity() {
            return semanticIdentity;
        }

        /**
         * Sets the value of the semanticIdentity property.
         * 
         * @param value
         *     allowed object is
         *     {@link SemanticIdType }
         *     
         */
        public void setSemanticIdentity(SemanticIdType value) {
            this.semanticIdentity = value;
        }

        /**
         * Gets the value of the minCardinality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinCardinality() {
            return minCardinality;
        }

        /**
         * Sets the value of the minCardinality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinCardinality(String value) {
            this.minCardinality = value;
        }

        /**
         * Gets the value of the maxCardinality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxCardinality() {
            return maxCardinality;
        }

        /**
         * Sets the value of the maxCardinality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxCardinality(String value) {
            this.maxCardinality = value;
        }

        /**
         * Gets the value of the isContainer property.
         * 
         */
        public boolean isIsContainer() {
            return isContainer;
        }

        /**
         * Sets the value of the isContainer property.
         * 
         */
        public void setIsContainer(boolean value) {
            this.isContainer = value;
        }

        /**
         * Gets the value of the isNavigable property.
         * 
         */
        public boolean isIsNavigable() {
            return isNavigable;
        }

        /**
         * Sets the value of the isNavigable property.
         * 
         */
        public void setIsNavigable(boolean value) {
            this.isNavigable = value;
        }

        /**
         * Gets the value of the instanceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstanceId() {
            return instanceId;
        }

        /**
         * Sets the value of the instanceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstanceId(String value) {
            this.instanceId = value;
        }

        /**
         * Gets the value of the metaElement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetaElement() {
            return metaElement;
        }

        /**
         * Sets the value of the metaElement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetaElement(String value) {
            this.metaElement = value;
        }

    }

}