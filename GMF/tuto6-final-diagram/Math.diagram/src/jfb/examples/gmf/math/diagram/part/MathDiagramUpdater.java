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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jfb.examples.gmf.math.Entry;
import jfb.examples.gmf.math.MathDiagram;
import jfb.examples.gmf.math.MathPackage;
import jfb.examples.gmf.math.MinusOperator;
import jfb.examples.gmf.math.Number;
import jfb.examples.gmf.math.Operator;
import jfb.examples.gmf.math.OperatorInput;
import jfb.examples.gmf.math.OperatorOutput;
import jfb.examples.gmf.math.PlusOperator;
import jfb.examples.gmf.math.Result;
import jfb.examples.gmf.math.diagram.edit.parts.EntryEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MathDiagramEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MinusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MinusOperatorMinusOperatorFigureCompartmentEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.NumberOperatorInputsEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorInputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputResultEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.PlusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.PlusOperatorPlusOperatorFigureCompartmentEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.ResultEditPart;
import jfb.examples.gmf.math.diagram.providers.MathElementTypes;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MathDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (MathVisualIDRegistry.getVisualID(view)) {
		case MinusOperatorMinusOperatorFigureCompartmentEditPart.VISUAL_ID:
			return getMinusOperatorMinusOperatorFigureCompartment_7001SemanticChildren(view);
		case PlusOperatorPlusOperatorFigureCompartmentEditPart.VISUAL_ID:
			return getPlusOperatorPlusOperatorFigureCompartment_7002SemanticChildren(view);
		case MathDiagramEditPart.VISUAL_ID:
			return getMathDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMinusOperatorMinusOperatorFigureCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MinusOperator modelElement = (MinusOperator) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInputs().iterator(); it.hasNext();) {
			OperatorInput childElement = (OperatorInput) it.next();
			int visualID = MathVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperatorInputEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			OperatorOutput childElement = modelElement.getOutput();
			int visualID = MathVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperatorOutputEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPlusOperatorPlusOperatorFigureCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		PlusOperator modelElement = (PlusOperator) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getInputs().iterator(); it.hasNext();) {
			OperatorInput childElement = (OperatorInput) it.next();
			int visualID = MathVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperatorInputEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			OperatorOutput childElement = modelElement.getOutput();
			int visualID = MathVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperatorOutputEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMathDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		MathDiagram modelElement = (MathDiagram) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			Result childElement = (Result) it.next();
			int visualID = MathVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ResultEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEntries().iterator(); it.hasNext();) {
			Entry childElement = (Entry) it.next();
			int visualID = MathVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntryEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getOperators().iterator(); it.hasNext();) {
			Operator childElement = (Operator) it.next();
			int visualID = MathVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MinusOperatorEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PlusOperatorEditPart.VISUAL_ID) {
				result.add(new MathNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (MathVisualIDRegistry.getVisualID(view)) {
		case MathDiagramEditPart.VISUAL_ID:
			return getMathDiagram_1000ContainedLinks(view);
		case ResultEditPart.VISUAL_ID:
			return getResult_2001ContainedLinks(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_2002ContainedLinks(view);
		case MinusOperatorEditPart.VISUAL_ID:
			return getMinusOperator_2003ContainedLinks(view);
		case PlusOperatorEditPart.VISUAL_ID:
			return getPlusOperator_2004ContainedLinks(view);
		case OperatorInputEditPart.VISUAL_ID:
			return getOperatorInput_3001ContainedLinks(view);
		case OperatorOutputEditPart.VISUAL_ID:
			return getOperatorOutput_3003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (MathVisualIDRegistry.getVisualID(view)) {
		case ResultEditPart.VISUAL_ID:
			return getResult_2001IncomingLinks(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_2002IncomingLinks(view);
		case MinusOperatorEditPart.VISUAL_ID:
			return getMinusOperator_2003IncomingLinks(view);
		case PlusOperatorEditPart.VISUAL_ID:
			return getPlusOperator_2004IncomingLinks(view);
		case OperatorInputEditPart.VISUAL_ID:
			return getOperatorInput_3001IncomingLinks(view);
		case OperatorOutputEditPart.VISUAL_ID:
			return getOperatorOutput_3003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (MathVisualIDRegistry.getVisualID(view)) {
		case ResultEditPart.VISUAL_ID:
			return getResult_2001OutgoingLinks(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_2002OutgoingLinks(view);
		case MinusOperatorEditPart.VISUAL_ID:
			return getMinusOperator_2003OutgoingLinks(view);
		case PlusOperatorEditPart.VISUAL_ID:
			return getPlusOperator_2004OutgoingLinks(view);
		case OperatorInputEditPart.VISUAL_ID:
			return getOperatorInput_3001OutgoingLinks(view);
		case OperatorOutputEditPart.VISUAL_ID:
			return getOperatorOutput_3003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMathDiagram_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_2001ContainedLinks(View view) {
		Result modelElement = (Result) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntry_2002ContainedLinks(View view) {
		Entry modelElement = (Entry) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMinusOperator_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlusOperator_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperatorInput_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperatorOutput_3003ContainedLinks(View view) {
		OperatorOutput modelElement = (OperatorOutput) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_OperatorOutput_Result_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResult_2001IncomingLinks(View view) {
		Result modelElement = (Result) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_OperatorOutput_Result_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntry_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMinusOperator_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlusOperator_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperatorInput_3001IncomingLinks(View view) {
		OperatorInput modelElement = (OperatorInput) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Number_OperatorInputs_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOperatorOutput_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResult_2001OutgoingLinks(View view) {
		Result modelElement = (Result) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEntry_2002OutgoingLinks(View view) {
		Entry modelElement = (Entry) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMinusOperator_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlusOperator_2004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperatorInput_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOperatorOutput_3003OutgoingLinks(View view) {
		OperatorOutput modelElement = (OperatorOutput) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_OperatorOutput_Result_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Number_OperatorInputs_4001(
			OperatorInput target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == MathPackage.eINSTANCE
					.getNumber_OperatorInputs()) {
				result.add(new MathLinkDescriptor(setting.getEObject(), target,
						MathElementTypes.NumberOperatorInputs_4001,
						NumberOperatorInputsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_OperatorOutput_Result_4003(
			Result target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == MathPackage.eINSTANCE
					.getOperatorOutput_Result()) {
				result.add(new MathLinkDescriptor(setting.getEObject(), target,
						MathElementTypes.OperatorOutputResult_4003,
						OperatorOutputResultEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Number_OperatorInputs_4001(
			Number source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getOperatorInputs().iterator(); destinations
				.hasNext();) {
			OperatorInput destination = (OperatorInput) destinations.next();
			result.add(new MathLinkDescriptor(source, destination,
					MathElementTypes.NumberOperatorInputs_4001,
					NumberOperatorInputsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_OperatorOutput_Result_4003(
			OperatorOutput source) {
		Collection result = new LinkedList();
		Result destination = source.getResult();
		if (destination == null) {
			return result;
		}
		result.add(new MathLinkDescriptor(source, destination,
				MathElementTypes.OperatorOutputResult_4003,
				OperatorOutputResultEditPart.VISUAL_ID));
		return result;
	}

}
