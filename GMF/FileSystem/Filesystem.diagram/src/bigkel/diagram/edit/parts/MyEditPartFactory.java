package bigkel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import bigkel.diagram.part.MyVisualIDRegistry;

/**
 * @generated
 */
public class MyEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MyVisualIDRegistry.getVisualID(view)) {

			case FilesystemEditPart.VISUAL_ID:
				return new FilesystemEditPart(view);

			case FolderEditPart.VISUAL_ID:
				return new FolderEditPart(view);

			case FolderNameEditPart.VISUAL_ID:
				return new FolderNameEditPart(view);

			case FileEditPart.VISUAL_ID:
				return new FileEditPart(view);

			case FileNameEditPart.VISUAL_ID:
				return new FileNameEditPart(view);

			case FolderRequestFloderEditPart.VISUAL_ID:
				return new FolderRequestFloderEditPart(view);

			case FolderRequestFilesEditPart.VISUAL_ID:
				return new FolderRequestFilesEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
