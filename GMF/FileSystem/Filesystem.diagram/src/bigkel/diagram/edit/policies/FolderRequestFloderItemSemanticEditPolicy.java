package bigkel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import bigkel.diagram.providers.MyElementTypes;

/**
 * @generated
 */
public class FolderRequestFloderItemSemanticEditPolicy extends MyBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FolderRequestFloderItemSemanticEditPolicy() {
		super(MyElementTypes.FolderRequestFloder_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
