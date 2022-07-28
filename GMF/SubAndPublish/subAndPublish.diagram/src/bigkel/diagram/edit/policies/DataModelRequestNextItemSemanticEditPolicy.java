package bigkel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import bigkel.diagram.providers.MyElementTypes;

/**
 * @generated
 */
public class DataModelRequestNextItemSemanticEditPolicy extends MyBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataModelRequestNextItemSemanticEditPolicy() {
		super(MyElementTypes.DataModelRequestNext_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
