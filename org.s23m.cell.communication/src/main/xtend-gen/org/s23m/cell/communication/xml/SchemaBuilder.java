package org.s23m.cell.communication.xml;

import java.util.List;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.s23m.cell.communication.xml.NamespaceConstants;
import org.s23m.cell.communication.xml.NamespaceExtensions;
import org.s23m.cell.communication.xml.model.dom.Node;
import org.s23m.cell.communication.xml.model.schema.Attribute;
import org.s23m.cell.communication.xml.model.schema.Cardinality;
import org.s23m.cell.communication.xml.model.schema.ComplexType;
import org.s23m.cell.communication.xml.model.schema.ConstrainedSimpleType;
import org.s23m.cell.communication.xml.model.schema.DataType;
import org.s23m.cell.communication.xml.model.schema.Element;
import org.s23m.cell.communication.xml.model.schema.ElementReference;
import org.s23m.cell.communication.xml.model.schema.Extension;
import org.s23m.cell.communication.xml.model.schema.Schema;
import org.s23m.cell.communication.xml.model.schema.Sequence;
import org.s23m.cell.communication.xml.model.schema.SimpleType;
import org.s23m.cell.communication.xml.model.schema.Type;
import org.s23m.cell.communication.xml.model.schema.XmlSchemaConstants;

@SuppressWarnings("all")
public class SchemaBuilder {
  private Schema schema;
  
  private String rootElementName;
  
  public SchemaBuilder(final String rootElementName) {
      this.rootElementName = rootElementName;
      Schema _schema = new Schema();
      this.schema = _schema;
      String _xmlns = NamespaceExtensions.xmlns(XmlSchemaConstants.XML_SCHEMA_PREFIX);
      this.schema.setAttribute(_xmlns, XmlSchemaConstants.XML_SCHEMA_URI);
      String _xmlns_1 = NamespaceExtensions.xmlns(NamespaceConstants.S23M);
      this.schema.setAttribute(_xmlns_1, NamespaceConstants.S23M_SCHEMA_URI);
      this.schema.setAttribute("targetNamespace", NamespaceConstants.S23M_SCHEMA_URI);
      this.schema.setAttribute("elementFormDefault", "qualified");
      this.schema.setAttribute("attributeFormDefault", "unqualified");
  }
  
  public Schema build() {
    Schema _xblockexpression = null;
    {
      this.removeElementsWithoutReferences();
      _xblockexpression = (this.schema);
    }
    return _xblockexpression;
  }
  
  private boolean removeElementsWithoutReferences() {
    boolean _xblockexpression = false;
    {
      final Function1<Node,Boolean> _function = new Function1<Node,Boolean>() {
          public Boolean apply(final Node it) {
            boolean _operator_and = false;
            boolean _operator_and_1 = false;
            if (!(it instanceof Element)) {
              _operator_and_1 = false;
            } else {
              List<ElementReference> _references = ((Element) it).getReferences();
              boolean _isEmpty = _references.isEmpty();
              _operator_and_1 = BooleanExtensions.operator_and((it instanceof Element), _isEmpty);
            }
            if (!_operator_and_1) {
              _operator_and = false;
            } else {
              String _nameAttribute = ((Element) it).getNameAttribute();
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_nameAttribute, SchemaBuilder.this.rootElementName);
              _operator_and = BooleanExtensions.operator_and(_operator_and_1, _operator_notEquals);
            }
            return _operator_and;
          }
        };
      final Function1<Node,Boolean> predicate = _function;
      List<Node> _children = this.schema.getChildren();
      Iterable<Node> _filter = IterableExtensions.<Node>filter(_children, predicate);
      List<Node> _list = IterableExtensions.<Node>toList(_filter);
      final List<Node> elements = _list;
      List<Node> _children_1 = this.schema.getChildren();
      boolean _removeAll = _children_1.removeAll(elements);
      _xblockexpression = (_removeAll);
    }
    return _xblockexpression;
  }
  
  private <T extends Node> T store(final T node) {
    T _xblockexpression = null;
    {
      List<Node> _children = this.schema.getChildren();
      CollectionExtensions.<T>operator_add(_children, node);
      _xblockexpression = (node);
    }
    return _xblockexpression;
  }
  
  public ConstrainedSimpleType simpleType(final String nameAttribute, final DataType restrictionDataType) {
    ConstrainedSimpleType _constrainedSimpleType = new ConstrainedSimpleType(NamespaceConstants.NS_S23M, nameAttribute, restrictionDataType);
    ConstrainedSimpleType _store = this.<ConstrainedSimpleType>store(_constrainedSimpleType);
    return _store;
  }
  
  public ComplexType complexType(final String name, final Procedure1<? super Sequence> initialiser) {
    Sequence _sequence = SchemaBuilder.sequence(initialiser);
    ComplexType _complexType = new ComplexType(NamespaceConstants.NS_S23M, name, _sequence);
    ComplexType _store = this.<ComplexType>store(_complexType);
    return _store;
  }
  
  public ComplexType complexType(final String name, final Extension ext) {
    ComplexType _complexType = new ComplexType(NamespaceConstants.NS_S23M, name, ext);
    ComplexType _store = this.<ComplexType>store(_complexType);
    return _store;
  }
  
  public ComplexType complexType(final String name, final List<Attribute> attributes) {
    ComplexType _complexType = new ComplexType(NamespaceConstants.NS_S23M, name, attributes);
    ComplexType _store = this.<ComplexType>store(_complexType);
    return _store;
  }
  
  public ComplexType complexType(final String name, final List<Attribute> attributes, final Procedure1<? super Sequence> initialiser) {
    Sequence _sequence = SchemaBuilder.sequence(initialiser);
    ComplexType _complexType = new ComplexType(NamespaceConstants.NS_S23M, name, attributes, _sequence);
    ComplexType _store = this.<ComplexType>store(_complexType);
    return _store;
  }
  
  public Attribute mandatoryAttribute(final String name, final SimpleType type) {
    Attribute _attribute = new Attribute(name, type, true);
    return _attribute;
  }
  
  public Attribute optionalAttribute(final String name, final SimpleType type) {
    Attribute _attribute = new Attribute(name, type, false);
    return _attribute;
  }
  
  public Element element(final String name, final Type type) {
    final Procedure1<Element> _function = new Procedure1<Element>() {
        public void apply(final Element it) {
        }
      };
    Element _element = this.element(name, type, _function);
    return _element;
  }
  
  public Element element(final String name, final Type type, final Procedure1<? super Element> initialiser) {
    Element _element = this.element(name, type, Cardinality.EXACTLY_ONE, initialiser);
    return _element;
  }
  
  public Element element(final String name, final Type type, final Cardinality cardinality) {
    Element _element = new Element(NamespaceConstants.NS_S23M, name, type, cardinality);
    Element _store = this.<Element>store(_element);
    return _store;
  }
  
  public Element element(final String name, final Type type, final Cardinality cardinality, final Procedure1<? super Element> initialiser) {
    Element _xblockexpression = null;
    {
      Element _element = new Element(NamespaceConstants.NS_S23M, name, type, cardinality);
      final Element result = _element;
      initialiser.apply(result);
      Element _store = this.<Element>store(result);
      _xblockexpression = (_store);
    }
    return _xblockexpression;
  }
  
  public ElementReference element(final Element referencedElement) {
    ElementReference _elementReference = new ElementReference(referencedElement);
    return _elementReference;
  }
  
  public ElementReference element(final Element referencedElement, final Cardinality cardinality) {
    ElementReference _elementReference = new ElementReference(referencedElement, cardinality);
    return _elementReference;
  }
  
  /**
   * Helpers used in creation of top-level nodes
   */
  public static Extension withExtension(final ComplexType base) {
    Sequence _sequence = new Sequence();
    Extension _extension = new Extension(base, _sequence);
    return _extension;
  }
  
  public static Extension withExtension(final ComplexType base, final Procedure1<? super Sequence> initialiser) {
    Sequence _sequence = SchemaBuilder.sequence(initialiser);
    Extension _extension = new Extension(base, _sequence);
    return _extension;
  }
  
  private static Sequence sequence(final Procedure1<? super Sequence> initialiser) {
    Sequence _xblockexpression = null;
    {
      Sequence _sequence = new Sequence();
      final Sequence result = _sequence;
      initialiser.apply(result);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
