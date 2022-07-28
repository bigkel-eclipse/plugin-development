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
import bigkel.diagram.edit.parts.FileEditPart;
import bigkel.diagram.edit.parts.FilesystemEditPart;
import bigkel.diagram.edit.parts.FolderEditPart;
import bigkel.diagram.edit.parts.FolderRequestFilesEditPart;
import bigkel.diagram.edit.parts.FolderRequestFloderEditPart;
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
	public static final IElementType Filesystem_1000 = getElementType("Filesystem.diagram.Filesystem_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Folder_2001 = getElementType("Filesystem.diagram.Folder_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType File_2002 = getElementType("Filesystem.diagram.File_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FolderRequestFloder_4001 = getElementType(
			"Filesystem.diagram.FolderRequestFloder_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FolderRequestFiles_4002 = getElementType(
			"Filesystem.diagram.FolderRequestFiles_4002"); //$NON-NLS-1$

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

			elements.put(Filesystem_1000, BigkelPackage.eINSTANCE.getFilesystem());

			elements.put(Folder_2001, BigkelPackage.eINSTANCE.getFolder());

			elements.put(File_2002, BigkelPackage.eINSTANCE.getFile());

			elements.put(FolderRequestFloder_4001, BigkelPackage.eINSTANCE.getFolder_RequestFloder());

			elements.put(FolderRequestFiles_4002, BigkelPackage.eINSTANCE.getFolder_RequestFiles());
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
			KNOWN_ELEMENT_TYPES.add(Filesystem_1000);
			KNOWN_ELEMENT_TYPES.add(Folder_2001);
			KNOWN_ELEMENT_TYPES.add(File_2002);
			KNOWN_ELEMENT_TYPES.add(FolderRequestFloder_4001);
			KNOWN_ELEMENT_TYPES.add(FolderRequestFiles_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FilesystemEditPart.VISUAL_ID:
			return Filesystem_1000;
		case FolderEditPart.VISUAL_ID:
			return Folder_2001;
		case FileEditPart.VISUAL_ID:
			return File_2002;
		case FolderRequestFloderEditPart.VISUAL_ID:
			return FolderRequestFloder_4001;
		case FolderRequestFilesEditPart.VISUAL_ID:
			return FolderRequestFiles_4002;
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
