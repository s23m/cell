package org.s23m.cell.communication.xml.sax;

import org.s23m.cell.communication.xml.XmlSchemaTerminology;
import org.s23m.cell.communication.xml.model.dom.Namespace;
import org.s23m.cell.communication.xml.model.dom.Node;
import org.s23m.cell.communication.xml.model.schemainstance.Category;
import org.s23m.cell.communication.xml.model.schemainstance.CategoryIdentityReference;

public class CategoryIdentityReferenceProcessor implements SaxElementProcessor<CategoryIdentityReference> {

	@Override
	public CategoryIdentityReference startElement(Namespace namespace, XmlSchemaTerminology terminology, Node top) {
		return new CategoryIdentityReference(namespace, terminology);
	}

	@Override
	public void endElement(Node removed, Node top, String textContent) {
		if (top instanceof Category) {
			((Category) top).setCategory((CategoryIdentityReference) removed);
		}
	}
}