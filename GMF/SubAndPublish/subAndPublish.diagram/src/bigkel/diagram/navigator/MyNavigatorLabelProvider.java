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

import bigkel.diagram.edit.parts.DataModelEditPart;
import bigkel.diagram.edit.parts.DataModelNameEditPart;
import bigkel.diagram.edit.parts.DataModelRequestNextEditPart;
import bigkel.diagram.edit.parts.NextModelEditPart;
import bigkel.diagram.edit.parts.NextModelNameEditPart;
import bigkel.diagram.edit.parts.NextModelRequestNextEditPart;
import bigkel.diagram.edit.parts.NodeModelEditPart;
import bigkel.diagram.edit.parts.NodeModelNameEditPart;
import bigkel.diagram.edit.parts.RootEditPart;
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
		case RootEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?bigkel?Root", MyElementTypes.Root_1000); //$NON-NLS-1$
		case NodeModelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?bigkel?NodeModel", MyElementTypes.NodeModel_2001); //$NON-NLS-1$
		case NextModelEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?bigkel?NextModel", MyElementTypes.NextModel_2002); //$NON-NLS-1$
		case DataModelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?bigkel?DataModel", MyElementTypes.DataModel_3001); //$NON-NLS-1$
		case DataModelRequestNextEditPart.VISUAL_ID:
			return getImage("Navigator?Link?bigkel?DataModel?requestNext", MyElementTypes.DataModelRequestNext_4001); //$NON-NLS-1$
		case NextModelRequestNextEditPart.VISUAL_ID:
			return getImage("Navigator?Link?bigkel?NextModel?requestNext", MyElementTypes.NextModelRequestNext_4002); //$NON-NLS-1$
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
		case RootEditPart.VISUAL_ID:
			return getRoot_1000Text(view);
		case NodeModelEditPart.VISUAL_ID:
			return getNodeModel_2001Text(view);
		case NextModelEditPart.VISUAL_ID:
			return getNextModel_2002Text(view);
		case DataModelEditPart.VISUAL_ID:
			return getDataModel_3001Text(view);
		case DataModelRequestNextEditPart.VISUAL_ID:
			return getDataModelRequestNext_4001Text(view);
		case NextModelRequestNextEditPart.VISUAL_ID:
			return getNextModelRequestNext_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getRoot_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getNodeModel_2001Text(View view) {
		IParser parser = MyParserProvider.getParser(MyElementTypes.NodeModel_2001,
				view.getElement() != null ? view.getElement() : view,
				MyVisualIDRegistry.getType(NodeModelNameEditPart.VISUAL_ID));
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
	private String getNextModel_2002Text(View view) {
		IParser parser = MyParserProvider.getParser(MyElementTypes.NextModel_2002,
				view.getElement() != null ? view.getElement() : view,
				MyVisualIDRegistry.getType(NextModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MyDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataModel_3001Text(View view) {
		IParser parser = MyParserProvider.getParser(MyElementTypes.DataModel_3001,
				view.getElement() != null ? view.getElement() : view,
				MyVisualIDRegistry.getType(DataModelNameEditPart.VISUAL_ID));
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
	private String getDataModelRequestNext_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getNextModelRequestNext_4002Text(View view) {
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
		return RootEditPart.MODEL_ID.equals(MyVisualIDRegistry.getModelID(view));
	}

}
