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

import jfb.examples.gmf.math.MathDiagram;
import jfb.examples.gmf.math.MathPackage;
import jfb.examples.gmf.math.diagram.edit.parts.EntryEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.EntryValueEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MathDiagramEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MinusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorInputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.PlusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.ResultEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.ResultValueEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MathVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Math.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MathDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return MathDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return jfb.examples.gmf.math.diagram.part.MathVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MathDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MathPackage.eINSTANCE.getMathDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((MathDiagram) domainElement)) {
			return MathDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = jfb.examples.gmf.math.diagram.part.MathVisualIDRegistry
				.getModelID(containerView);
		if (!MathDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (MathDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = jfb.examples.gmf.math.diagram.part.MathVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MathDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (MathPackage.eINSTANCE.getOperatorInput().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorInputEditPart.VISUAL_ID;
			}
			if (MathPackage.eINSTANCE.getOperatorOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorOutputEditPart.VISUAL_ID;
			}
			break;
		case PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (MathPackage.eINSTANCE.getOperatorInput().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorInputEditPart.VISUAL_ID;
			}
			if (MathPackage.eINSTANCE.getOperatorOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OperatorOutputEditPart.VISUAL_ID;
			}
			break;
		case MathDiagramEditPart.VISUAL_ID:
			if (MathPackage.eINSTANCE.getResult().isSuperTypeOf(
					domainElement.eClass())) {
				return ResultEditPart.VISUAL_ID;
			}
			if (MathPackage.eINSTANCE.getEntry().isSuperTypeOf(
					domainElement.eClass())) {
				return EntryEditPart.VISUAL_ID;
			}
			if (MathPackage.eINSTANCE.getMinusOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return MinusOperatorEditPart.VISUAL_ID;
			}
			if (MathPackage.eINSTANCE.getPlusOperator().isSuperTypeOf(
					domainElement.eClass())) {
				return PlusOperatorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = jfb.examples.gmf.math.diagram.part.MathVisualIDRegistry
				.getModelID(containerView);
		if (!MathDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (MathDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = jfb.examples.gmf.math.diagram.part.MathVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MathDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ResultEditPart.VISUAL_ID:
			if (ResultValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntryEditPart.VISUAL_ID:
			if (EntryValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MinusOperatorEditPart.VISUAL_ID:
			if (MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlusOperatorEditPart.VISUAL_ID:
			if (PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (OperatorInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
			if (OperatorInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperatorOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MathDiagramEditPart.VISUAL_ID:
			if (ResultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EntryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MinusOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PlusOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(MathDiagram element) {
		return true;
	}

}
