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
 * SoftMetaWare Ltd. (SoftMetaWare).
 * Portions created by the Initial Developer are
 * Copyright (C) 2011 SoftMetaWare Ltd.
 * All Rights Reserved.
 *
 * Contributor(s):
 * Jorn Bettin
 * ***** END LICENSE BLOCK ***** */

package org.s23m.cell.platform.models;

import static org.s23m.cell.S23MKernel.coreGraphs;

import org.s23m.cell.Set;
import org.s23m.cell.api.Instantiation;
import org.s23m.cell.api.models.Root;


/**
 * {@arrow SemanticEnterprise} implements all instantiation semantics related to Enterprise Architecture information modelling
 * that must be enforced for all Instances/artifacts (instantiation level n, with n > 0)
 *
 * The semantics enforced in SemanticEnterprise relate to specific subsets of vertices
 * that are useful for classifying Enterprise Architecture information
 *
 */
public final class SemanticEnterprise {

	//public static final Set enterpriseArchitectureGraph = F_SemanticStateOfInMemoryModel.instantiateConcrete(Artifact.artifact, F_SemanticStateOfInMemoryModel.addDisjunctSemanticIdentitySet("enterprise architecture", "set of enterprise architecture", S23MSemanticDomains.S23M));
	public static final Set semanticEnterprise = Root.cellengineering.addConcrete(coreGraphs.vertex, Instantiation.addDisjunctSemanticIdentitySet("semantic enterprise", "set of semantic enterprises", CellPlatformDomain.cellPlatformDomain));
	public static final Set how = semanticEnterprise.addConcrete(coreGraphs.vertex, org.s23m.cell.api.models2.EnterpriseArchitecture.how);
	public static final Set who = semanticEnterprise.addConcrete(coreGraphs.vertex, org.s23m.cell.api.models2.EnterpriseArchitecture.who);
	public static final Set what = semanticEnterprise.addConcrete(coreGraphs.vertex, org.s23m.cell.api.models2.EnterpriseArchitecture.what);
	public static final Set when = semanticEnterprise.addConcrete(coreGraphs.vertex, org.s23m.cell.api.models2.EnterpriseArchitecture.when);
	public static final Set where = semanticEnterprise.addConcrete(coreGraphs.vertex, org.s23m.cell.api.models2.EnterpriseArchitecture.where);
	public static final Set why = semanticEnterprise.addConcrete(coreGraphs.vertex, org.s23m.cell.api.models2.EnterpriseArchitecture.why);

	public static Set instantiateFeature() {

		// Here we ensure that the enterpriseArchitectureGraph is a true extension of Graph,
		// so that effectively the enterpriseArchitectureGraph is still at instantiation level 0 - the same as Graph.
		// See the TestSequence script to understand the effect.
		Instantiation.arrow(coreGraphs.visibility, semanticEnterprise, Cell.cell);

		Instantiation.arrow(coreGraphs.superSetReference, semanticEnterprise, Cell.cell);
		Instantiation.arrow(coreGraphs.superSetReference, how, Cell.cell);
		Instantiation.arrow(coreGraphs.superSetReference, who, Cell.cell);
		Instantiation.arrow(coreGraphs.superSetReference, what, Cell.cell);
		Instantiation.arrow(coreGraphs.superSetReference, when, Cell.cell);
		Instantiation.arrow(coreGraphs.superSetReference, where, Cell.cell);
		Instantiation.arrow(coreGraphs.superSetReference, why, Cell.cell);

		return semanticEnterprise;
	}

}
