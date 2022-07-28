package bigkel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import bigkel.diagram.providers.MyElementTypes;

/**
 * @generated
 */
public class FolderRequestFilesItemSemanticEditPolicy extends MyBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FolderRequestFilesItemSemanticEditPolicy() {
		super(MyElementTypes.FolderRequestFiles_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
