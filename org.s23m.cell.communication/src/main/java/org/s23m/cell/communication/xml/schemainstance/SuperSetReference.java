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
import org.s23m.cell.communication.xml.dom.Namespace;
import org.s23m.cell.communication.xml.dom.Node;

import com.google.common.collect.ImmutableList;

public class SuperSetReference extends Category {

	private IsAbstract isAbstract;
	
	private From from;
	
	private To to;
	
	public SuperSetReference(Namespace namespace, XmlSchemaTerminology terminology) {
		super(namespace, terminology.superSetReference());
	}

	public IsAbstract getIsAbstract() {
		return isAbstract;
	}

	public void setIsAbstract(IsAbstract isAbstract) {
		this.isAbstract = isAbstract;
	}

	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	public To getTo() {
		return to;
	}

	public void setTo(To to) {
		this.to = to;
	}
	
	@Override
	protected Iterable<? extends Node> getAdditionalChildren() {
		return ImmutableList.of(isAbstract, from, to);
	}
}
