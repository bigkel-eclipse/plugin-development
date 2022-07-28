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

			case RootEditPart.VISUAL_ID:
				return new RootEditPart(view);

			case NodeModelEditPart.VISUAL_ID:
				return new NodeModelEditPart(view);

			case NodeModelNameEditPart.VISUAL_ID:
				return new NodeModelNameEditPart(view);

			case NextModelEditPart.VISUAL_ID:
				return new NextModelEditPart(view);

			case NextModelNameEditPart.VISUAL_ID:
				return new NextModelNameEditPart(view);

			case DataModelEditPart.VISUAL_ID:
				return new DataModelEditPart(view);

			case DataModelNameEditPart.VISUAL_ID:
				return new DataModelNameEditPart(view);

			case DataModelRequestNextEditPart.VISUAL_ID:
				return new DataModelRequestNextEditPart(view);

			case NextModelRequestNextEditPart.VISUAL_ID:
				return new NextModelRequestNextEditPart(view);

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
