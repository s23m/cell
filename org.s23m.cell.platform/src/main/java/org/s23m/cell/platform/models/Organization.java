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
import static org.s23m.cell.S23MKernel.coreSets;

import org.s23m.cell.Set;
import org.s23m.cell.api.Instantiation;
import org.s23m.cell.api.models.Root;
import org.s23m.cell.api.models.S23MSemanticDomains;


public class Organization {

	// STRUCTURE OF MODEL REPOSITORY
	private static final Set v4 = Instantiation.arrow(coreGraphs.visibility, Root.cellengineering, CellEngineering.organization);
	private static final Set v6 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, CellEngineering.timeConsciousness);
	private static final Set v5 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, CellEngineering.location);
	private static final Set s0 = Instantiation.arrow(coreGraphs.superSetReference, CellEngineering.organization, coreGraphs.vertex);
	//private static final Set v5 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, CellEngineering.cellContent);


	public static final Set member = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.member);
	public static final Set role = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.role);

	// F-R-A-M-E-S access control paradigm
	public static final Set privilege = CellEngineering.organization.addAbstract(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.privilege);
	public static final Set find = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.find);
	public static final Set read = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.read);
	public static final Set add = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.add);
	public static final Set modify = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.modify);
	public static final Set execute = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.execute);
	public static final Set superUser = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.superUser);

	private static final Set s2 = Instantiation.arrow(coreGraphs.superSetReference, member, TimeConsciousness.timeConsciousVertex);
	private static final Set s10 = Instantiation.arrow(coreGraphs.superSetReference, role, TimeConsciousness.timeConsciousVertex);

	private static final Set s11 = Instantiation.arrow(coreGraphs.superSetReference, privilege, TimeConsciousness.timeConsciousVertex);
	private static final Set s12 = Instantiation.arrow(coreGraphs.superSetReference, find, privilege);
	private static final Set s13 = Instantiation.arrow(coreGraphs.superSetReference, read, privilege);
	private static final Set s14 = Instantiation.arrow(coreGraphs.superSetReference, add, privilege);
	private static final Set s15 = Instantiation.arrow(coreGraphs.superSetReference, modify, privilege);
	private static final Set s16 = Instantiation.arrow(coreGraphs.superSetReference, execute, privilege);
	private static final Set s17 = Instantiation.arrow(coreGraphs.superSetReference, superUser, privilege);


	private static final Set v7 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, member);
	private static final Set v8 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, role);
	// cell content stuff below
	private static final Set v1 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, CellEngineering.language);
	private static final Set v2 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, CellEngineering.terminology);
	private static final Set v9 = Instantiation.arrow(coreGraphs.visibility, CellEngineering.organization, CellEngineering.legal);

	public static final Set agent_to_roles = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.agent_to_roles,
			CellPlatformDomain.agent,
			member,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE,
			role,
			role,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
);

	public static final Set agent_to_location = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.agent_to_location,
			CellPlatformDomain.agent,
			member,
			S23MSemanticDomains.minCardinality_0,
			S23MSemanticDomains.maxCardinality_n,
			S23MSemanticDomains.isNavigable_FALSE,
			S23MSemanticDomains.isContainer_FALSE,
			CellPlatformDomain.location,
			CellEngineering.location,
			S23MSemanticDomains.minCardinality_0,
			S23MSemanticDomains.maxCardinality_1,
			S23MSemanticDomains.isNavigable_TRUE,
			S23MSemanticDomains.isContainer_FALSE
	);

	public static final Set role_to_includedRoles = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.role_to_includedRoles,
			CellPlatformDomain.parentRole,
			role,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_1,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_TRUE,
			CellPlatformDomain.includedRole,
			role,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);
	public static final Set role_to_excludedRoles = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.role_to_excludedRoles,
			CellPlatformDomain.disjunctRole,
			role,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE,
			CellPlatformDomain.excludedRole,
			role,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);

	public static final Set accessGrant = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.accessGrant,
			CellPlatformDomain.role,
			role,
			coreSets.minCardinality_1,
			coreSets.maxCardinality_1,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_TRUE,
			CellPlatformDomain.authorized,
			privilege,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);

	public static final Set accessRestriction = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.accessRestriction,
			CellPlatformDomain.role,
			role,
			coreSets.minCardinality_1,
			coreSets.maxCardinality_1,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_TRUE,
			CellPlatformDomain.forbidden,
			privilege,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);

	/* *************** */

	//public static final Set cell = CellEngineering.cellContent.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.cell);
	public static final Set cell = CellEngineering.organization.addConcrete(TimeConsciousness.timeConsciousVertex, CellPlatformDomain.cell);
	private static final Set s1 = Instantiation.arrow(coreGraphs.superSetReference, cell, TimeConsciousness.timeConsciousVertex);

	// additional semantics
	public static final Set semanticUnit_to_abstractWords = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.semanticUnit_to_abstractWords,
			CellPlatformDomain.semanticUnit,
			cell,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_FALSE,
			coreSets.isContainer_FALSE,
			Language.word,
			Language.abstractWord,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);
	private static final Set s3 = Instantiation.arrow(coreGraphs.superSetReference, semanticUnit_to_abstractWords, TimeConsciousness.timeConsciousEdge);

	public static final Set semanticUnit_to_abbreviations = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.semanticUnit_to_abbreviations,
			CellPlatformDomain.semanticUnit,
			cell,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE,
			Terminology.abbreviation,
			Terminology.abbreviation,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);
	private static final Set s4 = Instantiation.arrow(coreGraphs.superSetReference, semanticUnit_to_abbreviations, TimeConsciousness.timeConsciousEdge);

	public static final Set semanticUnit_to_wordDefinitions = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.semanticUnit_to_wordDefinitions,
			CellPlatformDomain.semanticUnit,
			cell,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_TRUE,
			Terminology.wordDefinition,
			Terminology.wordDefinition,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);
	private static final Set s5 = Instantiation.arrow(coreGraphs.superSetReference, semanticUnit_to_wordDefinitions, TimeConsciousness.timeConsciousEdge);

	public static final Set semanticUnit_to_oppositeSemanticUnit = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.semanticUnit_to_oppositeSemanticUnit,
			CellPlatformDomain.semanticUnit,
			cell,
			coreSets.minCardinality_1,
			coreSets.maxCardinality_1,
			coreSets.isNavigable_FALSE,
			coreSets.isContainer_FALSE,
			CellPlatformDomain.oppositeSemanticUnit,
			cell,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_1,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);
	private static final Set s6 = Instantiation.arrow(coreGraphs.superSetReference, semanticUnit_to_oppositeSemanticUnit, TimeConsciousness.timeConsciousEdge);

	public static final Set semanticUnit_to_copyrightHolder = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.semanticUnit_to_copyrightHolder,
			CellPlatformDomain.semanticUnit,
			cell,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_FALSE,
			coreSets.isContainer_FALSE,
			CellPlatformDomain.copyrightHolder,
			Legal.legalEntity,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);
	private static final Set s7 = Instantiation.arrow(coreGraphs.superSetReference, semanticUnit_to_copyrightHolder, TimeConsciousness.timeConsciousEdge);

	public static final Set semanticUnit_to_availableLicense = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.semanticUnit_to_availableLicense,
			CellPlatformDomain.semanticUnit,
			cell,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_FALSE,
			coreSets.isContainer_FALSE,
			CellPlatformDomain.availableLicense,
			Legal.license,
			coreSets.minCardinality_0,
			coreSets.maxCardinality_n,
			coreSets.isNavigable_TRUE,
			coreSets.isContainer_FALSE
	);
	private static final Set s8 = Instantiation.arrow(coreGraphs.superSetReference, semanticUnit_to_copyrightHolder, TimeConsciousness.timeConsciousEdge);

	public static final Set cell_to_nativeLanguage = Instantiation.arrow(TimeConsciousness.timeConsciousEdge,
			CellPlatformDomain.cell_to_nativeLanguage,
			CellPlatformDomain.semanticUnit,
			cell,
			S23MSemanticDomains.minCardinality_0,
			S23MSemanticDomains.maxCardinality_n,
			S23MSemanticDomains.isNavigable_FALSE,
			S23MSemanticDomains.isContainer_FALSE,
			CellPlatformDomain.nativeLanguage,
			CellEngineering.language,
			S23MSemanticDomains.minCardinality_1,
			S23MSemanticDomains.maxCardinality_1,
			S23MSemanticDomains.isNavigable_TRUE,
			S23MSemanticDomains.isContainer_FALSE
	);
	private static final Set s9 = Instantiation.arrow(coreGraphs.superSetReference, cell_to_nativeLanguage, TimeConsciousness.timeConsciousEdge);

	/* *************** */


	public static Set instantiateFeature() {

		return CellEngineering.organization;
	}

}
