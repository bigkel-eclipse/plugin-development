package jfb.examples.gmf.school.diagram.edit.policies;

import jfb.examples.gmf.school.diagram.providers.SchoolElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class StudentFriendsItemSemanticEditPolicy extends
		SchoolBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StudentFriendsItemSemanticEditPolicy() {
		super(SchoolElementTypes.StudentFriends_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
