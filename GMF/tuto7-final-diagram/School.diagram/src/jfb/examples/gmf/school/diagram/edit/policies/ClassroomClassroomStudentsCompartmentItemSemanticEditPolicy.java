package jfb.examples.gmf.school.diagram.edit.policies;

import jfb.examples.gmf.school.diagram.edit.commands.StudentCreateCommand;
import jfb.examples.gmf.school.diagram.providers.SchoolElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

/**
 * @generated
 */
public class ClassroomClassroomStudentsCompartmentItemSemanticEditPolicy extends
		SchoolBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassroomClassroomStudentsCompartmentItemSemanticEditPolicy() {
		super(SchoolElementTypes.Classroom_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SchoolElementTypes.Student_3002 == req.getElementType()) {
			return getGEFWrapper(new StudentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated NOT
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		if (request instanceof DestroyRequest) {
			return null;
		}
		return super.getSemanticCommand(request);
	}

}
