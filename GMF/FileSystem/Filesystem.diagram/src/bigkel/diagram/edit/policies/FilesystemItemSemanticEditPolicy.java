package bigkel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import bigkel.diagram.edit.commands.FileCreateCommand;
import bigkel.diagram.edit.commands.FolderCreateCommand;
import bigkel.diagram.providers.MyElementTypes;

/**
 * @generated
 */
public class FilesystemItemSemanticEditPolicy extends MyBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FilesystemItemSemanticEditPolicy() {
		super(MyElementTypes.Filesystem_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MyElementTypes.Folder_2001 == req.getElementType()) {
			return getGEFWrapper(new FolderCreateCommand(req));
		}
		if (MyElementTypes.File_2002 == req.getElementType()) {
			return getGEFWrapper(new FileCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
