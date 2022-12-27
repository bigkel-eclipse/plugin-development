package jfb.examples.gmf.school.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jfb.examples.gmf.school.Classroom;
import jfb.examples.gmf.school.Diagram;
import jfb.examples.gmf.school.School;
import jfb.examples.gmf.school.SchoolPackage;
import jfb.examples.gmf.school.Student;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomClassroomStudentsCompartmentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.DiagramEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolSchoolClassroomsCompartmentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentFriendsEditPart;
import jfb.examples.gmf.school.diagram.providers.SchoolElementTypes;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SchoolDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case SchoolSchoolClassroomsCompartmentEditPart.VISUAL_ID:
			return getSchoolSchoolClassroomsCompartment_7001SemanticChildren(view);
		case ClassroomClassroomStudentsCompartmentEditPart.VISUAL_ID:
			return getClassroomClassroomStudentsCompartment_7002SemanticChildren(view);
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSchoolSchoolClassroomsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		School modelElement = (School) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getClassrooms().iterator(); it
				.hasNext();) {
			Classroom childElement = (Classroom) it.next();
			int visualID = SchoolVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassroomEditPart.VISUAL_ID) {
				result.add(new SchoolNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getClassroomClassroomStudentsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Classroom modelElement = (Classroom) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getStudents().iterator(); it.hasNext();) {
			Student childElement = (Student) it.next();
			int visualID = SchoolVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StudentEditPart.VISUAL_ID) {
				result.add(new SchoolNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		{
			School childElement = modelElement.getSchool();
			int visualID = SchoolVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SchoolEditPart.VISUAL_ID) {
				result.add(new SchoolNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case SchoolEditPart.VISUAL_ID:
			return getSchool_2001ContainedLinks(view);
		case ClassroomEditPart.VISUAL_ID:
			return getClassroom_3001ContainedLinks(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_3002ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case SchoolEditPart.VISUAL_ID:
			return getSchool_2001IncomingLinks(view);
		case ClassroomEditPart.VISUAL_ID:
			return getClassroom_3001IncomingLinks(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_3002IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case SchoolEditPart.VISUAL_ID:
			return getSchool_2001OutgoingLinks(view);
		case ClassroomEditPart.VISUAL_ID:
			return getClassroom_3001OutgoingLinks(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_3002OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSchool_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassroom_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStudent_3002ContainedLinks(View view) {
		Student modelElement = (Student) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Student_Friends_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSchool_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassroom_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStudent_3002IncomingLinks(View view) {
		Student modelElement = (Student) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Student_Friends_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSchool_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getClassroom_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStudent_3002OutgoingLinks(View view) {
		Student modelElement = (Student) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Student_Friends_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Student_Friends_4001(
			Student target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == SchoolPackage.eINSTANCE
					.getStudent_Friends()) {
				result.add(new SchoolLinkDescriptor(setting.getEObject(),
						target, SchoolElementTypes.StudentFriends_4001,
						StudentFriendsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Student_Friends_4001(
			Student source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getFriends().iterator(); destinations
				.hasNext();) {
			Student destination = (Student) destinations.next();
			result.add(new SchoolLinkDescriptor(source, destination,
					SchoolElementTypes.StudentFriends_4001,
					StudentFriendsEditPart.VISUAL_ID));
		}
		return result;
	}

}
