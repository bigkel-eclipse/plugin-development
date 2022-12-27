package jfb.examples.gmf.school.diagram.edit.policies;

import jfb.examples.gmf.school.diagram.edit.commands.ClassroomCreateCommand;
import jfb.examples.gmf.school.diagram.providers.SchoolElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SchoolSchoolClassroomsCompartmentItemSemanticEditPolicy extends
		SchoolBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SchoolSchoolClassroomsCompartmentItemSemanticEditPolicy() {
		super(SchoolElementTypes.School_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SchoolElementTypes.Classroom_3001 == req.getElementType()) {
			return getGEFWrapper(new ClassroomCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
