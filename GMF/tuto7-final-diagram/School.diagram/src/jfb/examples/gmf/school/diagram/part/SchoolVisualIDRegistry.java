package jfb.examples.gmf.school.diagram.part;

import jfb.examples.gmf.school.SchoolPackage;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomClassroomStudentsCompartmentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomNameEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.DiagramEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolNameEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolSchoolClassroomsCompartmentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentNameEditPart;

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
public class SchoolVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "School.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry
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
				SchoolDiagramEditorPlugin.getInstance().logError(
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
		if (SchoolPackage.eINSTANCE.getDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((jfb.examples.gmf.school.Diagram) domainElement)) {
			return DiagramEditPart.VISUAL_ID;
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
		String containerModelID = jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SchoolSchoolClassroomsCompartmentEditPart.VISUAL_ID:
			if (SchoolPackage.eINSTANCE.getClassroom().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassroomEditPart.VISUAL_ID;
			}
			break;
		case ClassroomClassroomStudentsCompartmentEditPart.VISUAL_ID:
			if (SchoolPackage.eINSTANCE.getStudent().isSuperTypeOf(
					domainElement.eClass())) {
				return StudentEditPart.VISUAL_ID;
			}
			break;
		case DiagramEditPart.VISUAL_ID:
			if (SchoolPackage.eINSTANCE.getSchool().isSuperTypeOf(
					domainElement.eClass())) {
				return SchoolEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SchoolEditPart.VISUAL_ID:
			if (SchoolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SchoolSchoolClassroomsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassroomEditPart.VISUAL_ID:
			if (ClassroomNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassroomClassroomStudentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StudentEditPart.VISUAL_ID:
			if (StudentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SchoolSchoolClassroomsCompartmentEditPart.VISUAL_ID:
			if (ClassroomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassroomClassroomStudentsCompartmentEditPart.VISUAL_ID:
			if (StudentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiagramEditPart.VISUAL_ID:
			if (SchoolEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(jfb.examples.gmf.school.Diagram element) {
		return true;
	}

}
