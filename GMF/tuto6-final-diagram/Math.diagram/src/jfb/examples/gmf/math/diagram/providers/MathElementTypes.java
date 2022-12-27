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

package jfb.examples.gmf.math.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import jfb.examples.gmf.math.MathPackage;
import jfb.examples.gmf.math.diagram.edit.parts.EntryEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MathDiagramEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.MinusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.NumberOperatorInputsEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorInputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.OperatorOutputResultEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.PlusOperatorEditPart;
import jfb.examples.gmf.math.diagram.edit.parts.ResultEditPart;
import jfb.examples.gmf.math.diagram.part.MathDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MathElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private MathElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType MathDiagram_1000 = getElementType("Math.diagram.MathDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Result_2001 = getElementType("Math.diagram.Result_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Entry_2002 = getElementType("Math.diagram.Entry_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MinusOperator_2003 = getElementType("Math.diagram.MinusOperator_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlusOperator_2004 = getElementType("Math.diagram.PlusOperator_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatorInput_3001 = getElementType("Math.diagram.OperatorInput_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatorOutput_3003 = getElementType("Math.diagram.OperatorOutput_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NumberOperatorInputs_4001 = getElementType("Math.diagram.NumberOperatorInputs_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OperatorOutputResult_4003 = getElementType("Math.diagram.OperatorOutputResult_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MathDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(MathDiagram_1000, MathPackage.eINSTANCE
					.getMathDiagram());

			elements.put(Result_2001, MathPackage.eINSTANCE.getResult());

			elements.put(Entry_2002, MathPackage.eINSTANCE.getEntry());

			elements.put(MinusOperator_2003, MathPackage.eINSTANCE
					.getMinusOperator());

			elements.put(PlusOperator_2004, MathPackage.eINSTANCE
					.getPlusOperator());

			elements.put(OperatorInput_3001, MathPackage.eINSTANCE
					.getOperatorInput());

			elements.put(OperatorOutput_3003, MathPackage.eINSTANCE
					.getOperatorOutput());

			elements.put(NumberOperatorInputs_4001, MathPackage.eINSTANCE
					.getNumber_OperatorInputs());

			elements.put(OperatorOutputResult_4003, MathPackage.eINSTANCE
					.getOperatorOutput_Result());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(MathDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Result_2001);
			KNOWN_ELEMENT_TYPES.add(Entry_2002);
			KNOWN_ELEMENT_TYPES.add(MinusOperator_2003);
			KNOWN_ELEMENT_TYPES.add(PlusOperator_2004);
			KNOWN_ELEMENT_TYPES.add(OperatorInput_3001);
			KNOWN_ELEMENT_TYPES.add(OperatorOutput_3003);
			KNOWN_ELEMENT_TYPES.add(NumberOperatorInputs_4001);
			KNOWN_ELEMENT_TYPES.add(OperatorOutputResult_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MathDiagramEditPart.VISUAL_ID:
			return MathDiagram_1000;
		case ResultEditPart.VISUAL_ID:
			return Result_2001;
		case EntryEditPart.VISUAL_ID:
			return Entry_2002;
		case MinusOperatorEditPart.VISUAL_ID:
			return MinusOperator_2003;
		case PlusOperatorEditPart.VISUAL_ID:
			return PlusOperator_2004;
		case OperatorInputEditPart.VISUAL_ID:
			return OperatorInput_3001;
		case OperatorOutputEditPart.VISUAL_ID:
			return OperatorOutput_3003;
		case NumberOperatorInputsEditPart.VISUAL_ID:
			return NumberOperatorInputs_4001;
		case OperatorOutputResultEditPart.VISUAL_ID:
			return OperatorOutputResult_4003;
		}
		return null;
	}

}
