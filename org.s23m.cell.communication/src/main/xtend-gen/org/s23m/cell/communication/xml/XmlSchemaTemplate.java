package org.s23m.cell.communication.xml;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XmlSchemaTemplate {
  public CharSequence createHumanReadableSchema() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<xsd:schema xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("xmlns:s23m=\"http://schemas.s23m.org/serialization/2012\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("targetNamespace=\"http://schemas.s23m.org/serialization/2012\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("elementFormDefault=\"qualified\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("attributeFormDefault=\"unqualified\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Reused elements -->\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"semanticIdentity\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"model\" type=\"s23m:model\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"category\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"isAbstract\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"maxCardinality\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"minCardinality\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"isContainer\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"isNavigable\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"from\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"to\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"function\" type=\"s23m:function\"/>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"identityReference\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"uniqueRepresentationReference\" type=\"s23m:uuid\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"identifier\" type=\"s23m:uuid\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"category\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:semanticIdentity\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:category\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:sequence>\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:simpleType name=\"uuid\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:restriction base=\"xsd:string\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:simpleType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Root element -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:element name=\"artifactSet\" type=\"s23m:artifactSet\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"artifactSet\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:model\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"semanticDomain\" type=\"s23m:semanticDomain\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Encoding of model artifacts -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"model\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:graph\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"graph\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"container\" type=\"s23m:identityReference\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isAbstract\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"vertex\" type=\"s23m:vertex\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"visibility\" type=\"s23m:visibility\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"edge\" type=\"s23m:edge\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"superSetReference\" type=\"s23m:superSetReference\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>            ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"command\" type=\"s23m:command\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"query\" type=\"s23m:query\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</xsd:extension>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Vertices --> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"vertex\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isAbstract\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:maxCardinality\"/>\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</xsd:extension>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Arrows --> ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"superSetReference\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isAbstract\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:from\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:to\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</xsd:extension>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"visibility\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isAbstract\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:from\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:to\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</xsd:extension>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>  ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"edge\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isAbstract\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"from\" type=\"s23m:edgeEnd\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"to\" type=\"s23m:edgeEnd\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</xsd:extension>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"edgeEnd\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isAbstract\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:minCardinality\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:maxCardinality\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isContainer\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:isNavigable\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</xsd:extension>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Artifact functionality -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"function\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<xsd:element name=\"parameter\" type=\"s23m:parameter\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</xsd:extension>\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"parameter\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:category\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"command\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:function\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"query\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:extension base=\"s23m:function\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:complexContent>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Encoding of semantic domain artifacts -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"semanticDomain\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element ref=\"s23m:model\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"identity\" type=\"s23m:identity\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<xsd:complexType name=\"identity\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<xsd:sequence>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"identifier\" type=\"s23m:uuid\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"name\" type=\"xsd:string\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"pluralName\" type=\"xsd:string\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"payload\" type=\"xsd:string\"/>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<xsd:element name=\"technicalName\" type=\"xsd:string\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</xsd:sequence>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</xsd:complexType>");
    _builder.newLine();
    _builder.append("</xsd:schema>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createMachineReadableSchema() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
