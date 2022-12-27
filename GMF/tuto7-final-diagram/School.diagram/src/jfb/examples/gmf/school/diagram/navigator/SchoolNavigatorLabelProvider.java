package jfb.examples.gmf.school.diagram.navigator;

import jfb.examples.gmf.school.diagram.edit.parts.ClassroomEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.ClassroomNameEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.DiagramEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.SchoolNameEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentFriendsEditPart;
import jfb.examples.gmf.school.diagram.edit.parts.StudentNameEditPart;
import jfb.examples.gmf.school.diagram.part.SchoolDiagramEditorPlugin;
import jfb.examples.gmf.school.diagram.part.SchoolVisualIDRegistry;
import jfb.examples.gmf.school.diagram.providers.SchoolElementTypes;
import jfb.examples.gmf.school.diagram.providers.SchoolParserProvider;

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

/**
 * @generated
 */
public class SchoolNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SchoolDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SchoolDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SchoolNavigatorItem
				&& !isOwnView(((SchoolNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SchoolNavigatorGroup) {
			SchoolNavigatorGroup group = (SchoolNavigatorGroup) element;
			return SchoolDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SchoolNavigatorItem) {
			SchoolNavigatorItem navigatorItem = (SchoolNavigatorItem) element;
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
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///jfb/examples/gmf/school.ecore?Diagram", SchoolElementTypes.Diagram_1000); //$NON-NLS-1$
		case SchoolEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///jfb/examples/gmf/school.ecore?School", SchoolElementTypes.School_2001); //$NON-NLS-1$
		case ClassroomEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///jfb/examples/gmf/school.ecore?Classroom", SchoolElementTypes.Classroom_3001); //$NON-NLS-1$
		case StudentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///jfb/examples/gmf/school.ecore?Student", SchoolElementTypes.Student_3002); //$NON-NLS-1$
		case StudentFriendsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///jfb/examples/gmf/school.ecore?Student?friends", SchoolElementTypes.StudentFriends_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SchoolDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SchoolElementTypes.isKnownElementType(elementType)) {
			image = SchoolElementTypes.getImage(elementType);
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
		if (element instanceof SchoolNavigatorGroup) {
			SchoolNavigatorGroup group = (SchoolNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SchoolNavigatorItem) {
			SchoolNavigatorItem navigatorItem = (SchoolNavigatorItem) element;
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
		switch (SchoolVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000Text(view);
		case SchoolEditPart.VISUAL_ID:
			return getSchool_2001Text(view);
		case ClassroomEditPart.VISUAL_ID:
			return getClassroom_3001Text(view);
		case StudentEditPart.VISUAL_ID:
			return getStudent_3002Text(view);
		case StudentFriendsEditPart.VISUAL_ID:
			return getStudentFriends_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSchool_2001Text(View view) {
		IParser parser = SchoolParserProvider.getParser(
				SchoolElementTypes.School_2001,
				view.getElement() != null ? view.getElement() : view,
				SchoolVisualIDRegistry.getType(SchoolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SchoolDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClassroom_3001Text(View view) {
		IParser parser = SchoolParserProvider
				.getParser(SchoolElementTypes.Classroom_3001,
						view.getElement() != null ? view.getElement() : view,
						SchoolVisualIDRegistry
								.getType(ClassroomNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SchoolDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStudent_3002Text(View view) {
		IParser parser = SchoolParserProvider.getParser(
				SchoolElementTypes.Student_3002,
				view.getElement() != null ? view.getElement() : view,
				SchoolVisualIDRegistry.getType(StudentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SchoolDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStudentFriends_4001Text(View view) {
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
		return DiagramEditPart.MODEL_ID.equals(SchoolVisualIDRegistry
				.getModelID(view));
	}

}
