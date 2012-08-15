package org.s23m.cell.communication.xml;

@SuppressWarnings("all")
public class NamespaceExtensions {
  public static String xmlns(final String name) {
    String _qualifiedName = NamespaceExtensions.qualifiedName("xmlns", name);
    return _qualifiedName;
  }
  
  public static String qualifiedName(final String namespacePrefix, final String name) {
    String _plus = (namespacePrefix + ":");
    String _plus_1 = (_plus + name);
    return _plus_1;
  }
}
