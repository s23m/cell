/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is S23M.
 *
 * The Initial Developer of the Original Code is
 * The S23M Foundation.
 * Portions created by the Initial Developer are
 * Copyright (C) 2012 The S23M Foundation.
 * All Rights Reserved.
 *
 * Contributor(s):
 * Andrew Shewring
 * ***** END LICENSE BLOCK ***** */
package org.s23m.cell.communication.xml.schemainstance;

import org.s23m.cell.communication.xml.XmlSchemaTerminology;
import org.s23m.cell.communication.xml.dom.AbstractCompositeNode;
import org.s23m.cell.communication.xml.dom.Namespace;
import org.s23m.cell.communication.xml.dom.Node;
import org.s23m.cell.communication.xml.schema.Cardinality;
import org.s23m.cell.communication.xml.schema.DataType;
import org.s23m.cell.communication.xml.schema.Element;

/*
<xsd:element ref="s23m:semanticIdentity"/>
<xsd:element ref="s23m:category"/>
 */
public class Category extends AbstractCompositeNode {

	private final IdentityReference semanticIdentity;
	
	private final IdentityReference category;	
	
	protected Category(Namespace namespace,
			String name,
			XmlSchemaTerminology terminology,
			IdentityReference semanticIdentity,
			IdentityReference category) {
		
		super(namespace, name);
		this.semanticIdentity = semanticIdentity;
		this.category = category;
	}
	
	public Category(Namespace namespace, XmlSchemaTerminology terminology) {
		// TODO add parameters
		this(namespace, terminology.category(), terminology, null, null);
	}

	@Override
	public Iterable<? extends Node> getChildren() {
		// TODO Auto-generated method stub
		return null;
	}

}