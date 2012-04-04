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


public class Language {

	private static final Set v2 = Instantiation.arrow(coreGraphs.visibility, Root.cellengineering, CellEngineering.language);

	public static final Set languageElement = CellEngineering.language.addAbstract(coreGraphs.vertex, CellPlatformDomain.languageElement);
	public static final Set abstractWord = CellEngineering.language.addAbstract(coreGraphs.vertex, CellPlatformDomain.abstractWord);
	public static final Set wordSeparator = CellEngineering.language.addAbstract(coreGraphs.vertex, CellPlatformDomain.wordSeparator);
	public static final Set word = CellEngineering.language.addConcrete(coreGraphs.vertex, CellPlatformDomain.word);
	public static final Set whiteSpaceElement = CellEngineering.language.addConcrete(coreGraphs.vertex, CellPlatformDomain.whiteSpaceElement);
	public static final Set sentenceSeparator = CellEngineering.language.addConcrete(coreGraphs.vertex, CellPlatformDomain.sentenceSeparator);
	private static final Set s0 = Instantiation.arrow(coreGraphs.superSetReference, languageElement, coreGraphs.vertex);
	private static final Set s1 = Instantiation.arrow(coreGraphs.superSetReference, abstractWord, languageElement);
	private static final Set s2 = Instantiation.arrow(coreGraphs.superSetReference, wordSeparator, languageElement);
	private static final Set s3 = Instantiation.arrow(coreGraphs.superSetReference, word, abstractWord);
	private static final Set s4 = Instantiation.arrow(coreGraphs.superSetReference, whiteSpaceElement, wordSeparator);
	private static final Set s5 = Instantiation.arrow(coreGraphs.superSetReference, sentenceSeparator, wordSeparator);

	public static Set instantiateFeature() {

		return CellEngineering.language;
	}

}
