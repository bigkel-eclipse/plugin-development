package jfb.examples.gmf.school.diagram.edit.parts;

import jfb.examples.gmf.school.diagram.edit.policies.DiagramCanonicalEditPolicy;
import jfb.examples.gmf.school.diagram.edit.policies.DiagramItemSemanticEditPolicy;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DiagramEditPart extends
		org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "School"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public DiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DiagramCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
