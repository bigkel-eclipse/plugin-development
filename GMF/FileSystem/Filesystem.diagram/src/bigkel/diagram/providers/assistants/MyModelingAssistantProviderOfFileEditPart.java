package bigkel.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import bigkel.diagram.edit.parts.FileEditPart;
import bigkel.diagram.providers.MyElementTypes;
import bigkel.diagram.providers.MyModelingAssistantProvider;

/**
 * @generated
 */
public class MyModelingAssistantProviderOfFileEditPart extends MyModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((FileEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(FileEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MyElementTypes.FolderRequestFiles_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((FileEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(FileEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MyElementTypes.FolderRequestFiles_4002) {
			types.add(MyElementTypes.Folder_2001);
		}
		return types;
	}

}
