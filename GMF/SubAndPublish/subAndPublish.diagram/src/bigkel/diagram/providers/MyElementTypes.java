package bigkel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import bigkel.BigkelPackage;
import bigkel.diagram.edit.parts.DataModelEditPart;
import bigkel.diagram.edit.parts.DataModelRequestNextEditPart;
import bigkel.diagram.edit.parts.NextModelEditPart;
import bigkel.diagram.edit.parts.NextModelRequestNextEditPart;
import bigkel.diagram.edit.parts.NodeModelEditPart;
import bigkel.diagram.edit.parts.RootEditPart;
import bigkel.diagram.part.MyDiagramEditorPlugin;

/**
 * @generated
 */
public class MyElementTypes {

	/**
	* @generated
	*/
	private MyElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MyDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Root_1000 = getElementType("subAndPublish.diagram.Root_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NodeModel_2001 = getElementType("subAndPublish.diagram.NodeModel_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NextModel_2002 = getElementType("subAndPublish.diagram.NextModel_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataModel_3001 = getElementType("subAndPublish.diagram.DataModel_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataModelRequestNext_4001 = getElementType(
			"subAndPublish.diagram.DataModelRequestNext_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NextModelRequestNext_4002 = getElementType(
			"subAndPublish.diagram.NextModelRequestNext_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Root_1000, BigkelPackage.eINSTANCE.getRoot());

			elements.put(NodeModel_2001, BigkelPackage.eINSTANCE.getNodeModel());

			elements.put(NextModel_2002, BigkelPackage.eINSTANCE.getNextModel());

			elements.put(DataModel_3001, BigkelPackage.eINSTANCE.getDataModel());

			elements.put(DataModelRequestNext_4001, BigkelPackage.eINSTANCE.getDataModel_RequestNext());

			elements.put(NextModelRequestNext_4002, BigkelPackage.eINSTANCE.getNextModel_RequestNext());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Root_1000);
			KNOWN_ELEMENT_TYPES.add(NodeModel_2001);
			KNOWN_ELEMENT_TYPES.add(NextModel_2002);
			KNOWN_ELEMENT_TYPES.add(DataModel_3001);
			KNOWN_ELEMENT_TYPES.add(DataModelRequestNext_4001);
			KNOWN_ELEMENT_TYPES.add(NextModelRequestNext_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RootEditPart.VISUAL_ID:
			return Root_1000;
		case NodeModelEditPart.VISUAL_ID:
			return NodeModel_2001;
		case NextModelEditPart.VISUAL_ID:
			return NextModel_2002;
		case DataModelEditPart.VISUAL_ID:
			return DataModel_3001;
		case DataModelRequestNextEditPart.VISUAL_ID:
			return DataModelRequestNext_4001;
		case NextModelRequestNextEditPart.VISUAL_ID:
			return NextModelRequestNext_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return bigkel.diagram.providers.MyElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return bigkel.diagram.providers.MyElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return bigkel.diagram.providers.MyElementTypes.getElement(elementTypeAdapter);
		}
	};

}
