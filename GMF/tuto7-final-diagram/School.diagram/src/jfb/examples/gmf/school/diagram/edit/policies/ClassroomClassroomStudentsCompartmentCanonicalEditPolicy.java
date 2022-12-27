package jfb.examples.gmf.school.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import jfb.examples.gmf.school.SchoolPackage;
import jfb.examples.gmf.school.diagram.edit.parts.StudentEditPart;
import jfb.examples.gmf.school.diagram.part.SchoolDiagramUpdater;
import jfb.examples.gmf.school.diagram.part.SchoolNodeDescriptor;
import jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClassroomClassroomStudentsCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = SchoolDiagramUpdater
				.getClassroomClassroomStudentsCompartment_7002SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((SchoolNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = SchoolVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case StudentEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(SchoolPackage.eINSTANCE
					.getClassroom_Students());
		}
		return myFeaturesToSynchronize;
	}

}
