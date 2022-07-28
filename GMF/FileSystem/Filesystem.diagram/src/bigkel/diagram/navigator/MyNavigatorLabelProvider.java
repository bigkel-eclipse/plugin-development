package bigkel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import bigkel.diagram.edit.parts.FileEditPart;
import bigkel.diagram.edit.parts.FileNameEditPart;
import bigkel.diagram.edit.parts.FilesystemEditPart;
import bigkel.diagram.edit.parts.FolderEditPart;
import bigkel.diagram.edit.parts.FolderNameEditPart;
import bigkel.diagram.edit.parts.FolderRequestFilesEditPart;
import bigkel.diagram.edit.parts.FolderRequestFloderEditPart;
import bigkel.diagram.part.MyDiagramEditorPlugin;
import bigkel.diagram.part.MyVisualIDRegistry;
import bigkel.diagram.providers.MyElementTypes;
import bigkel.diagram.providers.MyParserProvider;

/**
 * @generated
 */
public class MyNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MyDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		MyDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MyNavigatorItem && !isOwnView(((MyNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MyNavigatorGroup) {
			MyNavigatorGroup group = (MyNavigatorGroup) element;
			return MyDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof MyNavigatorItem) {
			MyNavigatorItem navigatorItem = (MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FilesystemEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?bigkelUri?Filesystem", MyElementTypes.Filesystem_1000); //$NON-NLS-1$
		case FolderEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?bigkelUri?Folder", MyElementTypes.Folder_2001); //$NON-NLS-1$
		case FileEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?bigkelUri?File", MyElementTypes.File_2002); //$NON-NLS-1$
		case FolderRequestFloderEditPart.VISUAL_ID:
			return getImage("Navigator?Link?bigkelUri?Folder?requestFloder", MyElementTypes.FolderRequestFloder_4001); //$NON-NLS-1$
		case FolderRequestFilesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?bigkelUri?Folder?requestFiles", MyElementTypes.FolderRequestFiles_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MyDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && MyElementTypes.isKnownElementType(elementType)) {
			image = MyElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof MyNavigatorGroup) {
			MyNavigatorGroup group = (MyNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MyNavigatorItem) {
			MyNavigatorItem navigatorItem = (MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FilesystemEditPart.VISUAL_ID:
			return getFilesystem_1000Text(view);
		case FolderEditPart.VISUAL_ID:
			return getFolder_2001Text(view);
		case FileEditPart.VISUAL_ID:
			return getFile_2002Text(view);
		case FolderRequestFloderEditPart.VISUAL_ID:
			return getFolderRequestFloder_4001Text(view);
		case FolderRequestFilesEditPart.VISUAL_ID:
			return getFolderRequestFiles_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getFilesystem_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFolder_2001Text(View view) {
		IParser parser = MyParserProvider.getParser(MyElementTypes.Folder_2001,
				view.getElement() != null ? view.getElement() : view,
				MyVisualIDRegistry.getType(FolderNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MyDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFile_2002Text(View view) {
		IParser parser = MyParserProvider.getParser(MyElementTypes.File_2002,
				view.getElement() != null ? view.getElement() : view,
				MyVisualIDRegistry.getType(FileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MyDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFolderRequestFloder_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getFolderRequestFiles_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return FilesystemEditPart.MODEL_ID.equals(MyVisualIDRegistry.getModelID(view));
	}

}
