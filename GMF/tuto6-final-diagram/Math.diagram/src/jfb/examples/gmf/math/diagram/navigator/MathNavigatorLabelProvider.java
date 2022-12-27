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

package jfb.examples.gmf.math.diagram.navigator;

import jfb.examples.gmf.math.diagram.edit.parts.EntryEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.EntryValueEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MathDiagramEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MinusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.NumberOperatorInputsEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorInputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputResultEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.PlusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.ResultEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.ResultValueEditPart;
import jfb.examples.gmf.math.diagram.part.MathDiagramEditorPlugin;
import jfb.examples.gmf.math.diagram.part.MathVisualIDRegistry;
import jfb.examples.gmf.math.diagram.providers.MathElementTypes;
import jfb.examples.gmf.math.diagram.providers.MathParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MathNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MathDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MathDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MathNavigatorItem
				&& !isOwnView(((MathNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MathNavigatorGroup) {
			MathNavigatorGroup group = (MathNavigatorGroup) element;
			return MathDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MathNavigatorItem) {
			MathNavigatorItem navigatorItem = (MathNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MathVisualIDRegistry.getVisualID(view)) {
		case MathDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///jfb/examples/gmf/math.ecore?MathDiagram", MathElementTypes.MathDiagram_1000); //$NON-NLS-1$
		case ResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///jfb/examples/gmf/math.ecore?Result", MathElementTypes.Result_2001); //$NON-NLS-1$
		case EntryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///jfb/examples/gmf/math.ecore?Entry", MathElementTypes.Entry_2002); //$NON-NLS-1$
		case MinusOperatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///jfb/examples/gmf/math.ecore?MinusOperator", MathElementTypes.MinusOperator_2003); //$NON-NLS-1$
		case PlusOperatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///jfb/examples/gmf/math.ecore?PlusOperator", MathElementTypes.PlusOperator_2004); //$NON-NLS-1$
		case OperatorInputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///jfb/examples/gmf/math.ecore?OperatorInput", MathElementTypes.OperatorInput_3001); //$NON-NLS-1$
		case OperatorOutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///jfb/examples/gmf/math.ecore?OperatorOutput", MathElementTypes.OperatorOutput_3003); //$NON-NLS-1$
		case NumberOperatorInputsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///jfb/examples/gmf/math.ecore?Number?operatorInputs", MathElementTypes.NumberOperatorInputs_4001); //$NON-NLS-1$
		case OperatorOutputResultEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///jfb/examples/gmf/math.ecore?OperatorOutput?result", MathElementTypes.OperatorOutputResult_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MathDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MathElementTypes.isKnownElementType(elementType)) {
			image = MathElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MathNavigatorGroup) {
			MathNavigatorGroup group = (MathNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MathNavigatorItem) {
			MathNavigatorItem navigatorItem = (MathNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MathVisualIDRegistry.getVisualID(view)) {
		case MathDiagramEditPart.VISUAL_ID:
			return getMathDiagram_1000Text(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2001Text(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_2002Text(view);
		case MinusOperatorEditPart.VISUAL_ID:
			return getMinusOperator_2003Text(view);
		case PlusOperatorEditPart.VISUAL_ID:
			return getPlusOperator_2004Text(view);
		case OperatorInputEditPart.VISUAL_ID:
			return getOperatorInput_3001Text(view);
		case OperatorOutputEditPart.VISUAL_ID:
			return getOperatorOutput_3003Text(view);
		case NumberOperatorInputsEditPart.VISUAL_ID:
			return getNumberOperatorInputs_4001Text(view);
		case OperatorOutputResultEditPart.VISUAL_ID:
			return getOperatorOutputResult_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMathDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getResult_2001Text(View view) {
		IParser parser = MathParserProvider.getParser(
				MathElementTypes.Result_2001, view.getElement() != null ? view
						.getElement() : view, MathVisualIDRegistry
						.getType(ResultValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MathDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEntry_2002Text(View view) {
		IParser parser = MathParserProvider.getParser(
				MathElementTypes.Entry_2002, view.getElement() != null ? view
						.getElement() : view, MathVisualIDRegistry
						.getType(EntryValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MathDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMinusOperator_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlusOperator_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperatorInput_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperatorOutput_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNumberOperatorInputs_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOperatorOutputResult_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return MathDiagramEditPart.MODEL_ID.equals(MathVisualIDRegistry
				.getModelID(view));
	}

}
