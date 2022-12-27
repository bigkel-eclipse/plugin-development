/*
 * Copyright (c) 2009, Jean-François Brazeau. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 * 
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIEDWARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package jfb.examples.gmf.math.diagram.part;

import java.util.ArrayList;
import java.util.List;

import jfb.examples.gmf.math.diagram.providers.MathElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class MathPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntry1CreationTool());
		paletteContainer.add(createResult2CreationTool());
		paletteContainer.add(createMinusOperator3CreationTool());
		paletteContainer.add(createPlusOperator4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Connections2Group_desc);
		paletteContainer.add(createEntryResulttooperatorinput1CreationTool());
		paletteContainer.add(createOperatoroutputtoresult2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntry1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MathElementTypes.Entry_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entry1CreationTool_title,
				Messages.Entry1CreationTool_desc, types);
		entry.setId("createEntry1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MathElementTypes
				.getImageDescriptor(MathElementTypes.Entry_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResult2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MathElementTypes.Result_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Result2CreationTool_title,
				Messages.Result2CreationTool_desc, types);
		entry.setId("createResult2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MathElementTypes
				.getImageDescriptor(MathElementTypes.Result_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMinusOperator3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MathElementTypes.MinusOperator_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MinusOperator3CreationTool_title,
				Messages.MinusOperator3CreationTool_desc, types);
		entry.setId("createMinusOperator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MathElementTypes
				.getImageDescriptor(MathElementTypes.MinusOperator_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlusOperator4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MathElementTypes.PlusOperator_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PlusOperator4CreationTool_title,
				Messages.PlusOperator4CreationTool_desc, types);
		entry.setId("createPlusOperator4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MathElementTypes
				.getImageDescriptor(MathElementTypes.PlusOperator_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryResulttooperatorinput1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MathElementTypes.NumberOperatorInputs_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EntryResulttooperatorinput1CreationTool_title,
				Messages.EntryResulttooperatorinput1CreationTool_desc, types);
		entry.setId("createEntryResulttooperatorinput1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MathElementTypes
						.getImageDescriptor(MathElementTypes.NumberOperatorInputs_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperatoroutputtoresult2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MathElementTypes.OperatorOutputResult_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Operatoroutputtoresult2CreationTool_title,
				Messages.Operatoroutputtoresult2CreationTool_desc, types);
		entry.setId("createOperatoroutputtoresult2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MathElementTypes
						.getImageDescriptor(MathElementTypes.OperatorOutputResult_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
